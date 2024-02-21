// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package com.attributes;

/**
 * Protobuf type {@code attributes.AssignKeyAccessServerToValueRequest}
 */
public final class AssignKeyAccessServerToValueRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:attributes.AssignKeyAccessServerToValueRequest)
    AssignKeyAccessServerToValueRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AssignKeyAccessServerToValueRequest.newBuilder() to construct.
  private AssignKeyAccessServerToValueRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AssignKeyAccessServerToValueRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AssignKeyAccessServerToValueRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.attributes.AttributesProto.internal_static_attributes_AssignKeyAccessServerToValueRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.attributes.AttributesProto.internal_static_attributes_AssignKeyAccessServerToValueRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.attributes.AssignKeyAccessServerToValueRequest.class, com.attributes.AssignKeyAccessServerToValueRequest.Builder.class);
  }

  private int bitField0_;
  public static final int VALUE_KEY_ACCESS_SERVER_FIELD_NUMBER = 1;
  private com.attributes.ValueKeyAccessServer valueKeyAccessServer_;
  /**
   * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
   * @return Whether the valueKeyAccessServer field is set.
   */
  @java.lang.Override
  public boolean hasValueKeyAccessServer() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
   * @return The valueKeyAccessServer.
   */
  @java.lang.Override
  public com.attributes.ValueKeyAccessServer getValueKeyAccessServer() {
    return valueKeyAccessServer_ == null ? com.attributes.ValueKeyAccessServer.getDefaultInstance() : valueKeyAccessServer_;
  }
  /**
   * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
   */
  @java.lang.Override
  public com.attributes.ValueKeyAccessServerOrBuilder getValueKeyAccessServerOrBuilder() {
    return valueKeyAccessServer_ == null ? com.attributes.ValueKeyAccessServer.getDefaultInstance() : valueKeyAccessServer_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getValueKeyAccessServer());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getValueKeyAccessServer());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.attributes.AssignKeyAccessServerToValueRequest)) {
      return super.equals(obj);
    }
    com.attributes.AssignKeyAccessServerToValueRequest other = (com.attributes.AssignKeyAccessServerToValueRequest) obj;

    if (hasValueKeyAccessServer() != other.hasValueKeyAccessServer()) return false;
    if (hasValueKeyAccessServer()) {
      if (!getValueKeyAccessServer()
          .equals(other.getValueKeyAccessServer())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasValueKeyAccessServer()) {
      hash = (37 * hash) + VALUE_KEY_ACCESS_SERVER_FIELD_NUMBER;
      hash = (53 * hash) + getValueKeyAccessServer().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.attributes.AssignKeyAccessServerToValueRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.attributes.AssignKeyAccessServerToValueRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.attributes.AssignKeyAccessServerToValueRequest parseFrom(
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
  public static Builder newBuilder(com.attributes.AssignKeyAccessServerToValueRequest prototype) {
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
   * Protobuf type {@code attributes.AssignKeyAccessServerToValueRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:attributes.AssignKeyAccessServerToValueRequest)
      com.attributes.AssignKeyAccessServerToValueRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.attributes.AttributesProto.internal_static_attributes_AssignKeyAccessServerToValueRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.attributes.AttributesProto.internal_static_attributes_AssignKeyAccessServerToValueRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.attributes.AssignKeyAccessServerToValueRequest.class, com.attributes.AssignKeyAccessServerToValueRequest.Builder.class);
    }

    // Construct using com.attributes.AssignKeyAccessServerToValueRequest.newBuilder()
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
        getValueKeyAccessServerFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      valueKeyAccessServer_ = null;
      if (valueKeyAccessServerBuilder_ != null) {
        valueKeyAccessServerBuilder_.dispose();
        valueKeyAccessServerBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.attributes.AttributesProto.internal_static_attributes_AssignKeyAccessServerToValueRequest_descriptor;
    }

    @java.lang.Override
    public com.attributes.AssignKeyAccessServerToValueRequest getDefaultInstanceForType() {
      return com.attributes.AssignKeyAccessServerToValueRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.attributes.AssignKeyAccessServerToValueRequest build() {
      com.attributes.AssignKeyAccessServerToValueRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.attributes.AssignKeyAccessServerToValueRequest buildPartial() {
      com.attributes.AssignKeyAccessServerToValueRequest result = new com.attributes.AssignKeyAccessServerToValueRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.attributes.AssignKeyAccessServerToValueRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.valueKeyAccessServer_ = valueKeyAccessServerBuilder_ == null
            ? valueKeyAccessServer_
            : valueKeyAccessServerBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.attributes.AssignKeyAccessServerToValueRequest) {
        return mergeFrom((com.attributes.AssignKeyAccessServerToValueRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.attributes.AssignKeyAccessServerToValueRequest other) {
      if (other == com.attributes.AssignKeyAccessServerToValueRequest.getDefaultInstance()) return this;
      if (other.hasValueKeyAccessServer()) {
        mergeValueKeyAccessServer(other.getValueKeyAccessServer());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getValueKeyAccessServerFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.attributes.ValueKeyAccessServer valueKeyAccessServer_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.attributes.ValueKeyAccessServer, com.attributes.ValueKeyAccessServer.Builder, com.attributes.ValueKeyAccessServerOrBuilder> valueKeyAccessServerBuilder_;
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     * @return Whether the valueKeyAccessServer field is set.
     */
    public boolean hasValueKeyAccessServer() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     * @return The valueKeyAccessServer.
     */
    public com.attributes.ValueKeyAccessServer getValueKeyAccessServer() {
      if (valueKeyAccessServerBuilder_ == null) {
        return valueKeyAccessServer_ == null ? com.attributes.ValueKeyAccessServer.getDefaultInstance() : valueKeyAccessServer_;
      } else {
        return valueKeyAccessServerBuilder_.getMessage();
      }
    }
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     */
    public Builder setValueKeyAccessServer(com.attributes.ValueKeyAccessServer value) {
      if (valueKeyAccessServerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        valueKeyAccessServer_ = value;
      } else {
        valueKeyAccessServerBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     */
    public Builder setValueKeyAccessServer(
        com.attributes.ValueKeyAccessServer.Builder builderForValue) {
      if (valueKeyAccessServerBuilder_ == null) {
        valueKeyAccessServer_ = builderForValue.build();
      } else {
        valueKeyAccessServerBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     */
    public Builder mergeValueKeyAccessServer(com.attributes.ValueKeyAccessServer value) {
      if (valueKeyAccessServerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          valueKeyAccessServer_ != null &&
          valueKeyAccessServer_ != com.attributes.ValueKeyAccessServer.getDefaultInstance()) {
          getValueKeyAccessServerBuilder().mergeFrom(value);
        } else {
          valueKeyAccessServer_ = value;
        }
      } else {
        valueKeyAccessServerBuilder_.mergeFrom(value);
      }
      if (valueKeyAccessServer_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     */
    public Builder clearValueKeyAccessServer() {
      bitField0_ = (bitField0_ & ~0x00000001);
      valueKeyAccessServer_ = null;
      if (valueKeyAccessServerBuilder_ != null) {
        valueKeyAccessServerBuilder_.dispose();
        valueKeyAccessServerBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     */
    public com.attributes.ValueKeyAccessServer.Builder getValueKeyAccessServerBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getValueKeyAccessServerFieldBuilder().getBuilder();
    }
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     */
    public com.attributes.ValueKeyAccessServerOrBuilder getValueKeyAccessServerOrBuilder() {
      if (valueKeyAccessServerBuilder_ != null) {
        return valueKeyAccessServerBuilder_.getMessageOrBuilder();
      } else {
        return valueKeyAccessServer_ == null ?
            com.attributes.ValueKeyAccessServer.getDefaultInstance() : valueKeyAccessServer_;
      }
    }
    /**
     * <code>.attributes.ValueKeyAccessServer value_key_access_server = 1 [json_name = "valueKeyAccessServer"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.attributes.ValueKeyAccessServer, com.attributes.ValueKeyAccessServer.Builder, com.attributes.ValueKeyAccessServerOrBuilder> 
        getValueKeyAccessServerFieldBuilder() {
      if (valueKeyAccessServerBuilder_ == null) {
        valueKeyAccessServerBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.attributes.ValueKeyAccessServer, com.attributes.ValueKeyAccessServer.Builder, com.attributes.ValueKeyAccessServerOrBuilder>(
                getValueKeyAccessServer(),
                getParentForChildren(),
                isClean());
        valueKeyAccessServer_ = null;
      }
      return valueKeyAccessServerBuilder_;
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


    // @@protoc_insertion_point(builder_scope:attributes.AssignKeyAccessServerToValueRequest)
  }

  // @@protoc_insertion_point(class_scope:attributes.AssignKeyAccessServerToValueRequest)
  private static final com.attributes.AssignKeyAccessServerToValueRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.attributes.AssignKeyAccessServerToValueRequest();
  }

  public static com.attributes.AssignKeyAccessServerToValueRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssignKeyAccessServerToValueRequest>
      PARSER = new com.google.protobuf.AbstractParser<AssignKeyAccessServerToValueRequest>() {
    @java.lang.Override
    public AssignKeyAccessServerToValueRequest parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<AssignKeyAccessServerToValueRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssignKeyAccessServerToValueRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.attributes.AssignKeyAccessServerToValueRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

