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

package com.insa.kafka.streams.serdes.yangjson;


import com.insa.kafka.serializers.yang.json.KafkaYangJsonSchemaDeserializer;
import com.insa.kafka.serializers.yang.json.KafkaYangJsonSchemaDeserializerConfig;
import com.insa.kafka.serializers.yang.json.KafkaYangJsonSchemaSerializer;
import org.apache.kafka.common.serialization.Deserializer;
import org.apache.kafka.common.serialization.Serde;
import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.common.serialization.Serializer;

import java.util.HashMap;
import java.util.Map;

/**
 * A schema-registry aware serde (serializer/deserializer) for Apache Kafka's Streams API that can
 * be used for reading and writing data in YANG-JSON format.
 */
public class KafkaYangJsonSerde<T> implements Serde<T> {

  private Class<T> specificClass;
  private final Serde<T> inner;

  public KafkaYangJsonSerde() {
    inner = Serdes.serdeFrom(new KafkaYangJsonSchemaSerializer<>(),
        new KafkaYangJsonSchemaDeserializer<>());
  }

  public KafkaYangJsonSerde(Class<T> specificClass) {
    this.specificClass = specificClass;
    inner = Serdes.serdeFrom(new KafkaYangJsonSchemaSerializer<>(),
        new KafkaYangJsonSchemaDeserializer<>());
  }

  @Override
  public Serializer<T> serializer() {
    return inner.serializer();
  }

  @Override
  public Deserializer<T> deserializer() {
    return inner.deserializer();
  }

  @Override
  public void configure(Map<String, ?> serdeConfig, final boolean isSerdeForRecordKeys) {
    inner.serializer().configure(serdeConfig, isSerdeForRecordKeys);
    inner.deserializer().configure(withSpecificClass(serdeConfig, isSerdeForRecordKeys),
        isSerdeForRecordKeys);
  }

  @Override
  public void close() {
    inner.serializer().close();
    inner.deserializer().close();
  }

  private Map<String, Object> withSpecificClass(final Map<String, ?> config, boolean isKey) {
    if (specificClass == null) {
      return (Map<String, Object>) config;
    }
    Map<String, Object> newConfig =
        config == null ? new HashMap<String, Object>() : new HashMap<>(config);
    if (isKey) {
      newConfig.put(
          KafkaYangJsonSchemaDeserializerConfig.YANG_JSON_KEY_TYPE,
          specificClass
      );
    } else {
      newConfig.put(
          KafkaYangJsonSchemaDeserializerConfig.YANG_JSON_VALUE_TYPE,
          specificClass
      );
    }
    return newConfig;
  }
}
