// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: KeyTimestampValue.proto

package io.confluent.kafka.serializers.protobuf.test;

public final class KeyTimestampValueOuterClass {
  private KeyTimestampValueOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface KeyTimestampValueOrBuilder extends
      // @@protoc_insertion_point(interface_extends:KeyTimestampValue)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 key = 1;</code>
     * @return The key.
     */
    int getKey();

    /**
     * <code>.TimestampValue value = 2;</code>
     * @return Whether the value field is set.
     */
    boolean hasValue();
    /**
     * <code>.TimestampValue value = 2;</code>
     * @return The value.
     */
    io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue getValue();
    /**
     * <code>.TimestampValue value = 2;</code>
     */
    io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValueOrBuilder getValueOrBuilder();

    /**
     * <code>.google.protobuf.Timestamp value2 = 3;</code>
     * @return Whether the value2 field is set.
     */
    boolean hasValue2();
    /**
     * <code>.google.protobuf.Timestamp value2 = 3;</code>
     * @return The value2.
     */
    com.google.protobuf.Timestamp getValue2();
    /**
     * <code>.google.protobuf.Timestamp value2 = 3;</code>
     */
    com.google.protobuf.TimestampOrBuilder getValue2OrBuilder();
  }
  /**
   * <pre>
   * Wrapper message for `Timestamp`.
   * </pre>
   *
   * Protobuf type {@code KeyTimestampValue}
   */
  public static final class KeyTimestampValue extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:KeyTimestampValue)
      KeyTimestampValueOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use KeyTimestampValue.newBuilder() to construct.
    private KeyTimestampValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private KeyTimestampValue() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new KeyTimestampValue();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private KeyTimestampValue(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8: {

              key_ = input.readInt32();
              break;
            }
            case 18: {
              io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.Builder subBuilder = null;
              if (value_ != null) {
                subBuilder = value_.toBuilder();
              }
              value_ = input.readMessage(io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value_);
                value_ = subBuilder.buildPartial();
              }

              break;
            }
            case 26: {
              com.google.protobuf.Timestamp.Builder subBuilder = null;
              if (value2_ != null) {
                subBuilder = value2_.toBuilder();
              }
              value2_ = input.readMessage(com.google.protobuf.Timestamp.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(value2_);
                value2_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.internal_static_KeyTimestampValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.internal_static_KeyTimestampValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue.class, io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue.Builder.class);
    }

    public static final int KEY_FIELD_NUMBER = 1;
    private int key_;
    /**
     * <code>int32 key = 1;</code>
     * @return The key.
     */
    @java.lang.Override
    public int getKey() {
      return key_;
    }

    public static final int VALUE_FIELD_NUMBER = 2;
    private io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue value_;
    /**
     * <code>.TimestampValue value = 2;</code>
     * @return Whether the value field is set.
     */
    @java.lang.Override
    public boolean hasValue() {
      return value_ != null;
    }
    /**
     * <code>.TimestampValue value = 2;</code>
     * @return The value.
     */
    @java.lang.Override
    public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue getValue() {
      return value_ == null ? io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.getDefaultInstance() : value_;
    }
    /**
     * <code>.TimestampValue value = 2;</code>
     */
    @java.lang.Override
    public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValueOrBuilder getValueOrBuilder() {
      return getValue();
    }

    public static final int VALUE2_FIELD_NUMBER = 3;
    private com.google.protobuf.Timestamp value2_;
    /**
     * <code>.google.protobuf.Timestamp value2 = 3;</code>
     * @return Whether the value2 field is set.
     */
    @java.lang.Override
    public boolean hasValue2() {
      return value2_ != null;
    }
    /**
     * <code>.google.protobuf.Timestamp value2 = 3;</code>
     * @return The value2.
     */
    @java.lang.Override
    public com.google.protobuf.Timestamp getValue2() {
      return value2_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : value2_;
    }
    /**
     * <code>.google.protobuf.Timestamp value2 = 3;</code>
     */
    @java.lang.Override
    public com.google.protobuf.TimestampOrBuilder getValue2OrBuilder() {
      return getValue2();
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (key_ != 0) {
        output.writeInt32(1, key_);
      }
      if (value_ != null) {
        output.writeMessage(2, getValue());
      }
      if (value2_ != null) {
        output.writeMessage(3, getValue2());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (key_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, key_);
      }
      if (value_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getValue());
      }
      if (value2_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, getValue2());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue)) {
        return super.equals(obj);
      }
      io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue other = (io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue) obj;

      if (getKey()
          != other.getKey()) return false;
      if (hasValue() != other.hasValue()) return false;
      if (hasValue()) {
        if (!getValue()
            .equals(other.getValue())) return false;
      }
      if (hasValue2() != other.hasValue2()) return false;
      if (hasValue2()) {
        if (!getValue2()
            .equals(other.getValue2())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + KEY_FIELD_NUMBER;
      hash = (53 * hash) + getKey();
      if (hasValue()) {
        hash = (37 * hash) + VALUE_FIELD_NUMBER;
        hash = (53 * hash) + getValue().hashCode();
      }
      if (hasValue2()) {
        hash = (37 * hash) + VALUE2_FIELD_NUMBER;
        hash = (53 * hash) + getValue2().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Wrapper message for `Timestamp`.
     * </pre>
     *
     * Protobuf type {@code KeyTimestampValue}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:KeyTimestampValue)
        io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValueOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.internal_static_KeyTimestampValue_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.internal_static_KeyTimestampValue_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue.class, io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue.Builder.class);
      }

      // Construct using io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        key_ = 0;

        if (valueBuilder_ == null) {
          value_ = null;
        } else {
          value_ = null;
          valueBuilder_ = null;
        }
        if (value2Builder_ == null) {
          value2_ = null;
        } else {
          value2_ = null;
          value2Builder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.internal_static_KeyTimestampValue_descriptor;
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue getDefaultInstanceForType() {
        return io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue.getDefaultInstance();
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue build() {
        io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue buildPartial() {
        io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue result = new io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue(this);
        result.key_ = key_;
        if (valueBuilder_ == null) {
          result.value_ = value_;
        } else {
          result.value_ = valueBuilder_.build();
        }
        if (value2Builder_ == null) {
          result.value2_ = value2_;
        } else {
          result.value2_ = value2Builder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue) {
          return mergeFrom((io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue other) {
        if (other == io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue.getDefaultInstance()) return this;
        if (other.getKey() != 0) {
          setKey(other.getKey());
        }
        if (other.hasValue()) {
          mergeValue(other.getValue());
        }
        if (other.hasValue2()) {
          mergeValue2(other.getValue2());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int key_ ;
      /**
       * <code>int32 key = 1;</code>
       * @return The key.
       */
      @java.lang.Override
      public int getKey() {
        return key_;
      }
      /**
       * <code>int32 key = 1;</code>
       * @param value The key to set.
       * @return This builder for chaining.
       */
      public Builder setKey(int value) {
        
        key_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 key = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearKey() {
        
        key_ = 0;
        onChanged();
        return this;
      }

      private io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue value_;
      private com.google.protobuf.SingleFieldBuilderV3<
          io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue, io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.Builder, io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValueOrBuilder> valueBuilder_;
      /**
       * <code>.TimestampValue value = 2;</code>
       * @return Whether the value field is set.
       */
      public boolean hasValue() {
        return valueBuilder_ != null || value_ != null;
      }
      /**
       * <code>.TimestampValue value = 2;</code>
       * @return The value.
       */
      public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue getValue() {
        if (valueBuilder_ == null) {
          return value_ == null ? io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.getDefaultInstance() : value_;
        } else {
          return valueBuilder_.getMessage();
        }
      }
      /**
       * <code>.TimestampValue value = 2;</code>
       */
      public Builder setValue(io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue value) {
        if (valueBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value_ = value;
          onChanged();
        } else {
          valueBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.TimestampValue value = 2;</code>
       */
      public Builder setValue(
          io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.Builder builderForValue) {
        if (valueBuilder_ == null) {
          value_ = builderForValue.build();
          onChanged();
        } else {
          valueBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.TimestampValue value = 2;</code>
       */
      public Builder mergeValue(io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue value) {
        if (valueBuilder_ == null) {
          if (value_ != null) {
            value_ =
              io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.newBuilder(value_).mergeFrom(value).buildPartial();
          } else {
            value_ = value;
          }
          onChanged();
        } else {
          valueBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.TimestampValue value = 2;</code>
       */
      public Builder clearValue() {
        if (valueBuilder_ == null) {
          value_ = null;
          onChanged();
        } else {
          value_ = null;
          valueBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.TimestampValue value = 2;</code>
       */
      public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.Builder getValueBuilder() {
        
        onChanged();
        return getValueFieldBuilder().getBuilder();
      }
      /**
       * <code>.TimestampValue value = 2;</code>
       */
      public io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValueOrBuilder getValueOrBuilder() {
        if (valueBuilder_ != null) {
          return valueBuilder_.getMessageOrBuilder();
        } else {
          return value_ == null ?
              io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.getDefaultInstance() : value_;
        }
      }
      /**
       * <code>.TimestampValue value = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue, io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.Builder, io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValueOrBuilder> 
          getValueFieldBuilder() {
        if (valueBuilder_ == null) {
          valueBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue, io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValue.Builder, io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.TimestampValueOrBuilder>(
                  getValue(),
                  getParentForChildren(),
                  isClean());
          value_ = null;
        }
        return valueBuilder_;
      }

      private com.google.protobuf.Timestamp value2_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> value2Builder_;
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       * @return Whether the value2 field is set.
       */
      public boolean hasValue2() {
        return value2Builder_ != null || value2_ != null;
      }
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       * @return The value2.
       */
      public com.google.protobuf.Timestamp getValue2() {
        if (value2Builder_ == null) {
          return value2_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : value2_;
        } else {
          return value2Builder_.getMessage();
        }
      }
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       */
      public Builder setValue2(com.google.protobuf.Timestamp value) {
        if (value2Builder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          value2_ = value;
          onChanged();
        } else {
          value2Builder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       */
      public Builder setValue2(
          com.google.protobuf.Timestamp.Builder builderForValue) {
        if (value2Builder_ == null) {
          value2_ = builderForValue.build();
          onChanged();
        } else {
          value2Builder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       */
      public Builder mergeValue2(com.google.protobuf.Timestamp value) {
        if (value2Builder_ == null) {
          if (value2_ != null) {
            value2_ =
              com.google.protobuf.Timestamp.newBuilder(value2_).mergeFrom(value).buildPartial();
          } else {
            value2_ = value;
          }
          onChanged();
        } else {
          value2Builder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       */
      public Builder clearValue2() {
        if (value2Builder_ == null) {
          value2_ = null;
          onChanged();
        } else {
          value2_ = null;
          value2Builder_ = null;
        }

        return this;
      }
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       */
      public com.google.protobuf.Timestamp.Builder getValue2Builder() {
        
        onChanged();
        return getValue2FieldBuilder().getBuilder();
      }
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       */
      public com.google.protobuf.TimestampOrBuilder getValue2OrBuilder() {
        if (value2Builder_ != null) {
          return value2Builder_.getMessageOrBuilder();
        } else {
          return value2_ == null ?
              com.google.protobuf.Timestamp.getDefaultInstance() : value2_;
        }
      }
      /**
       * <code>.google.protobuf.Timestamp value2 = 3;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder> 
          getValue2FieldBuilder() {
        if (value2Builder_ == null) {
          value2Builder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.google.protobuf.Timestamp, com.google.protobuf.Timestamp.Builder, com.google.protobuf.TimestampOrBuilder>(
                  getValue2(),
                  getParentForChildren(),
                  isClean());
          value2_ = null;
        }
        return value2Builder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:KeyTimestampValue)
    }

    // @@protoc_insertion_point(class_scope:KeyTimestampValue)
    private static final io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue();
    }

    public static io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<KeyTimestampValue>
        PARSER = new com.google.protobuf.AbstractParser<KeyTimestampValue>() {
      @java.lang.Override
      public KeyTimestampValue parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new KeyTimestampValue(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<KeyTimestampValue> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<KeyTimestampValue> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.confluent.kafka.serializers.protobuf.test.KeyTimestampValueOuterClass.KeyTimestampValue getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_KeyTimestampValue_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_KeyTimestampValue_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027KeyTimestampValue.proto\032\037google/protob" +
      "uf/timestamp.proto\032\024TimestampValue.proto" +
      "\"l\n\021KeyTimestampValue\022\013\n\003key\030\001 \001(\005\022\036\n\005va" +
      "lue\030\002 \001(\0132\017.TimestampValue\022*\n\006value2\030\003 \001" +
      "(\0132\032.google.protobuf.TimestampB.\n,io.con" +
      "fluent.kafka.serializers.protobuf.testb\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.TimestampProto.getDescriptor(),
          io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.getDescriptor(),
        });
    internal_static_KeyTimestampValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_KeyTimestampValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_KeyTimestampValue_descriptor,
        new java.lang.String[] { "Key", "Value", "Value2", });
    com.google.protobuf.TimestampProto.getDescriptor();
    io.confluent.kafka.serializers.protobuf.test.TimestampValueOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
