/*
 * Copyright 2023 INSA Lyon.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.insa.kafka.serializers.yang.json;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.swisscom.kafka.schemaregistry.yang.YangSchema;
import com.swisscom.kafka.schemaregistry.yang.YangSchemaProvider;
import com.swisscom.kafka.schemaregistry.yang.YangSchemaUtils;
import io.confluent.kafka.schemaregistry.ParsedSchema;
import io.confluent.kafka.schemaregistry.client.rest.entities.RuleMode;
import io.confluent.kafka.schemaregistry.client.rest.exceptions.RestClientException;
import io.confluent.kafka.schemaregistry.json.jackson.Jackson;
import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDe;
import org.apache.kafka.common.config.ConfigException;
import org.apache.kafka.common.errors.InvalidConfigurationException;
import org.apache.kafka.common.errors.SerializationException;
import org.apache.kafka.common.errors.TimeoutException;
import org.apache.kafka.common.header.Headers;
import org.yangcentral.yangkit.model.api.codec.YangCodecException;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public abstract class AbstractKafkaYangJsonSchemaDeserializer<T> extends AbstractKafkaSchemaSerDe {

  protected ObjectMapper objectMapper = Jackson.newObjectMapper();
  protected boolean validate;

  protected void configure(KafkaYangJsonSchemaDeserializerConfig config, Class<T> type) {
    configureClientProperties(config, new YangSchemaProvider());

    boolean failUnknownProperties =
        config.getBoolean(KafkaYangJsonSchemaDeserializerConfig.YANG_JSON_FAIL_UNKNOWN_PROPERTIES);
    this.objectMapper.configure(
        DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES,
        failUnknownProperties
    );
    this.validate =
        config.getBoolean(KafkaYangJsonSchemaDeserializerConfig.YANG_JSON_FAIL_UNKNOWN_PROPERTIES);
  }

  protected KafkaYangJsonSchemaDeserializerConfig deserializerConfig(Map<String, ?> props) {
    try {
      return new KafkaYangJsonSchemaDeserializerConfig(props);
    } catch (ConfigException e) {
      throw new ConfigException(e.getMessage());
    }
  }

  //  protected KafkaYangSchemaDeserializerConfig deserializerConfig(Properties props) {
  //    return new KafkaYangSchemaDeserializerConfig(props);
  //  }

  public ObjectMapper objectMapper() {
    return objectMapper;
  }

  protected T deserialize(byte[] payload) {
    return (T) deserialize(false, null, isKey, payload);
  }

  protected Object deserialize(
      boolean includeSchemaAndVersion, String topic, Boolean isKey, byte[] payload) {
    return deserialize(includeSchemaAndVersion, topic, isKey, null, payload);
  }

  protected Object deserialize(
      boolean includeSchemaAndVersion, String topic, Boolean isKey, Headers headers, byte[] payload
  ) throws SerializationException, InvalidConfigurationException {
    if (schemaRegistry == null) {
      throw new InvalidConfigurationException(
          "SchemaRegistryClient not found. You need to configure the deserializer "
              + "or use deserializer constructor with SchemaRegistryClient.");
    }

    if (payload == null) {
      return null;
    }

    int id = -1;
    try {
      ByteBuffer buffer = getByteBuffer(payload);
      id = buffer.getInt();
      String subject = isKey == null || strategyUsesSchema(isKey)
          ? getContextName(topic) : subjectName(topic, isKey, null);
      System.out.println("Deserialize: SchemaId=" + id);
      YangSchema schema = ((YangSchema) schemaRegistry.getSchemaBySubjectAndId(subject, id));

      ParsedSchema readerSchema = null;
      if (metadata != null) {
        readerSchema = getLatestWithMetadata(subject);
      } else if (useLatestVersion) {
        readerSchema = lookupLatestVersion(subject, schema, false);
      }
      if (readerSchema != null) {
        subject = subjectName(topic, isKey, schema);
        schema = schemaForDeserialize(id, schema, subject, isKey);
        Integer version = schemaVersion(topic, isKey, id, subject, schema, null);
        schema = schema.copy(version);
      }
      List<Migration> migrations = Collections.emptyList();
      if (readerSchema != null) {
        migrations = getMigrations(subject, schema, readerSchema);
      }

      int length = buffer.limit() - 1 - idSize;
      int start = buffer.position() + buffer.arrayOffset();

      JsonNode jsonNode = null;
      if (!migrations.isEmpty()) {
        jsonNode = objectMapper.readValue(buffer.array(), start, length, JsonNode.class);
        jsonNode = (JsonNode) executeMigrations(migrations, subject, topic, headers, jsonNode);
      }

      if (readerSchema != null) {
        schema = (YangSchema) readerSchema;
      }
      if (schema.ruleSet() != null && schema.ruleSet().hasRules(RuleMode.READ)) {
        if (jsonNode == null) {
          jsonNode = objectMapper.readValue(buffer.array(), start, length, JsonNode.class);
        }
        jsonNode = (JsonNode) executeRules(
            subject, topic, headers, payload, RuleMode.READ, null, schema, jsonNode);
      }

      if (validate) {
        System.out.println("Validating at deserialization");
        try {
          if (jsonNode == null) {
            jsonNode = objectMapper.readValue(buffer.array(), start, length, JsonNode.class);
          }
          schema.validate(jsonNode);
        } catch (YangCodecException e) {
          throw new SerializationException("YANG JSON "
              + jsonNode
              + " does not match YANG schema "
              + schema.canonicalString(), e);
        }
      }
      if (jsonNode == null) {
        jsonNode = objectMapper.readValue(buffer.array(), start, length, JsonNode.class);
      }
      return jsonNode;
    } catch (InterruptedIOException e) {
      throw new TimeoutException("Error deserializing YANG-JSON message for id " + id, e);
    } catch (IOException | RuntimeException e) {
      throw new SerializationException("Error deserializing YANG-JSON message for id " + id, e);
    } catch (RestClientException e) {
      throw toKafkaException(e, "Error retrieving YANG schema for id " + id);
    } finally {
      postOp(payload);
    }
  }

  private String subjectName(String topic, boolean isKey, YangSchema schemaFromRegistry) {
    return isDeprecatedSubjectNameStrategy(isKey)
        ? null
        : getSubjectName(topic, isKey, null, schemaFromRegistry);
  }

  private YangSchema schemaForDeserialize(
      int id, YangSchema schemaFromRegistry, String subject, boolean isKey
  ) throws IOException, RestClientException {
    return isDeprecatedSubjectNameStrategy(isKey)
        ? YangSchemaUtils.copyOf(schemaFromRegistry)
        : (YangSchema) schemaRegistry.getSchemaBySubjectAndId(subject, id);
  }

  private Integer schemaVersion(
      String topic, boolean isKey, int id, String subject, YangSchema schema, Object value
  ) throws IOException, RestClientException {
    Integer version;
    if (isDeprecatedSubjectNameStrategy(isKey)) {
      subject = getSubjectName(topic, isKey, value, schema);
    }
    YangSchema subjectSchema = (YangSchema) schemaRegistry.getSchemaBySubjectAndId(subject, id);
    version = schemaRegistry.getVersion(subject, subjectSchema);
    return version;
  }
}