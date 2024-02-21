// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package com.policy.attributes;

/**
 * Protobuf type {@code policy.attributes.GetAttributeResponse}
 */
public final class GetAttributeResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:policy.attributes.GetAttributeResponse)
    GetAttributeResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GetAttributeResponse.newBuilder() to construct.
  private GetAttributeResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GetAttributeResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GetAttributeResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.policy.attributes.AttributesProto.internal_static_policy_attributes_GetAttributeResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.policy.attributes.AttributesProto.internal_static_policy_attributes_GetAttributeResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.policy.attributes.GetAttributeResponse.class, com.policy.attributes.GetAttributeResponse.Builder.class);
  }

  private int bitField0_;
  public static final int ATTRIBUTE_FIELD_NUMBER = 1;
  private com.policy.attributes.Attribute attribute_;
  /**
   * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
   * @return Whether the attribute field is set.
   */
  @java.lang.Override
  public boolean hasAttribute() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
   * @return The attribute.
   */
  @java.lang.Override
  public com.policy.attributes.Attribute getAttribute() {
    return attribute_ == null ? com.policy.attributes.Attribute.getDefaultInstance() : attribute_;
  }
  /**
   * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
   */
  @java.lang.Override
  public com.policy.attributes.AttributeOrBuilder getAttributeOrBuilder() {
    return attribute_ == null ? com.policy.attributes.Attribute.getDefaultInstance() : attribute_;
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
      output.writeMessage(1, getAttribute());
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
        .computeMessageSize(1, getAttribute());
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
    if (!(obj instanceof com.policy.attributes.GetAttributeResponse)) {
      return super.equals(obj);
    }
    com.policy.attributes.GetAttributeResponse other = (com.policy.attributes.GetAttributeResponse) obj;

    if (hasAttribute() != other.hasAttribute()) return false;
    if (hasAttribute()) {
      if (!getAttribute()
          .equals(other.getAttribute())) return false;
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
    if (hasAttribute()) {
      hash = (37 * hash) + ATTRIBUTE_FIELD_NUMBER;
      hash = (53 * hash) + getAttribute().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.policy.attributes.GetAttributeResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.policy.attributes.GetAttributeResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.policy.attributes.GetAttributeResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.policy.attributes.GetAttributeResponse parseFrom(
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
  public static Builder newBuilder(com.policy.attributes.GetAttributeResponse prototype) {
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
   * Protobuf type {@code policy.attributes.GetAttributeResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:policy.attributes.GetAttributeResponse)
      com.policy.attributes.GetAttributeResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.policy.attributes.AttributesProto.internal_static_policy_attributes_GetAttributeResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.policy.attributes.AttributesProto.internal_static_policy_attributes_GetAttributeResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.policy.attributes.GetAttributeResponse.class, com.policy.attributes.GetAttributeResponse.Builder.class);
    }

    // Construct using com.policy.attributes.GetAttributeResponse.newBuilder()
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
        getAttributeFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      attribute_ = null;
      if (attributeBuilder_ != null) {
        attributeBuilder_.dispose();
        attributeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.policy.attributes.AttributesProto.internal_static_policy_attributes_GetAttributeResponse_descriptor;
    }

    @java.lang.Override
    public com.policy.attributes.GetAttributeResponse getDefaultInstanceForType() {
      return com.policy.attributes.GetAttributeResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.policy.attributes.GetAttributeResponse build() {
      com.policy.attributes.GetAttributeResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.policy.attributes.GetAttributeResponse buildPartial() {
      com.policy.attributes.GetAttributeResponse result = new com.policy.attributes.GetAttributeResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.policy.attributes.GetAttributeResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.attribute_ = attributeBuilder_ == null
            ? attribute_
            : attributeBuilder_.build();
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
      if (other instanceof com.policy.attributes.GetAttributeResponse) {
        return mergeFrom((com.policy.attributes.GetAttributeResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.policy.attributes.GetAttributeResponse other) {
      if (other == com.policy.attributes.GetAttributeResponse.getDefaultInstance()) return this;
      if (other.hasAttribute()) {
        mergeAttribute(other.getAttribute());
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
                  getAttributeFieldBuilder().getBuilder(),
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

    private com.policy.attributes.Attribute attribute_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.policy.attributes.Attribute, com.policy.attributes.Attribute.Builder, com.policy.attributes.AttributeOrBuilder> attributeBuilder_;
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     * @return Whether the attribute field is set.
     */
    public boolean hasAttribute() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     * @return The attribute.
     */
    public com.policy.attributes.Attribute getAttribute() {
      if (attributeBuilder_ == null) {
        return attribute_ == null ? com.policy.attributes.Attribute.getDefaultInstance() : attribute_;
      } else {
        return attributeBuilder_.getMessage();
      }
    }
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     */
    public Builder setAttribute(com.policy.attributes.Attribute value) {
      if (attributeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        attribute_ = value;
      } else {
        attributeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     */
    public Builder setAttribute(
        com.policy.attributes.Attribute.Builder builderForValue) {
      if (attributeBuilder_ == null) {
        attribute_ = builderForValue.build();
      } else {
        attributeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     */
    public Builder mergeAttribute(com.policy.attributes.Attribute value) {
      if (attributeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          attribute_ != null &&
          attribute_ != com.policy.attributes.Attribute.getDefaultInstance()) {
          getAttributeBuilder().mergeFrom(value);
        } else {
          attribute_ = value;
        }
      } else {
        attributeBuilder_.mergeFrom(value);
      }
      if (attribute_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     */
    public Builder clearAttribute() {
      bitField0_ = (bitField0_ & ~0x00000001);
      attribute_ = null;
      if (attributeBuilder_ != null) {
        attributeBuilder_.dispose();
        attributeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     */
    public com.policy.attributes.Attribute.Builder getAttributeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAttributeFieldBuilder().getBuilder();
    }
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     */
    public com.policy.attributes.AttributeOrBuilder getAttributeOrBuilder() {
      if (attributeBuilder_ != null) {
        return attributeBuilder_.getMessageOrBuilder();
      } else {
        return attribute_ == null ?
            com.policy.attributes.Attribute.getDefaultInstance() : attribute_;
      }
    }
    /**
     * <code>.policy.attributes.Attribute attribute = 1 [json_name = "attribute"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.policy.attributes.Attribute, com.policy.attributes.Attribute.Builder, com.policy.attributes.AttributeOrBuilder> 
        getAttributeFieldBuilder() {
      if (attributeBuilder_ == null) {
        attributeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.policy.attributes.Attribute, com.policy.attributes.Attribute.Builder, com.policy.attributes.AttributeOrBuilder>(
                getAttribute(),
                getParentForChildren(),
                isClean());
        attribute_ = null;
      }
      return attributeBuilder_;
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


    // @@protoc_insertion_point(builder_scope:policy.attributes.GetAttributeResponse)
  }

  // @@protoc_insertion_point(class_scope:policy.attributes.GetAttributeResponse)
  private static final com.policy.attributes.GetAttributeResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.policy.attributes.GetAttributeResponse();
  }

  public static com.policy.attributes.GetAttributeResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetAttributeResponse>
      PARSER = new com.google.protobuf.AbstractParser<GetAttributeResponse>() {
    @java.lang.Override
    public GetAttributeResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetAttributeResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetAttributeResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.policy.attributes.GetAttributeResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

