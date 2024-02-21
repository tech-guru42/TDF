// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package com.policy.attributes;

/**
 * Protobuf type {@code policy.attributes.CreateAttributeRequest}
 */
public final class CreateAttributeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:policy.attributes.CreateAttributeRequest)
    CreateAttributeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use CreateAttributeRequest.newBuilder() to construct.
  private CreateAttributeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private CreateAttributeRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new CreateAttributeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.policy.attributes.AttributesProto.internal_static_policy_attributes_CreateAttributeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.policy.attributes.AttributesProto.internal_static_policy_attributes_CreateAttributeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.policy.attributes.CreateAttributeRequest.class, com.policy.attributes.CreateAttributeRequest.Builder.class);
  }

  private int bitField0_;
  public static final int ATTRIBUTE_FIELD_NUMBER = 1;
  private com.policy.attributes.AttributeCreateUpdate attribute_;
  /**
   * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
   * @return Whether the attribute field is set.
   */
  @java.lang.Override
  public boolean hasAttribute() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
   * @return The attribute.
   */
  @java.lang.Override
  public com.policy.attributes.AttributeCreateUpdate getAttribute() {
    return attribute_ == null ? com.policy.attributes.AttributeCreateUpdate.getDefaultInstance() : attribute_;
  }
  /**
   * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.policy.attributes.AttributeCreateUpdateOrBuilder getAttributeOrBuilder() {
    return attribute_ == null ? com.policy.attributes.AttributeCreateUpdate.getDefaultInstance() : attribute_;
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
    if (!(obj instanceof com.policy.attributes.CreateAttributeRequest)) {
      return super.equals(obj);
    }
    com.policy.attributes.CreateAttributeRequest other = (com.policy.attributes.CreateAttributeRequest) obj;

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

  public static com.policy.attributes.CreateAttributeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.policy.attributes.CreateAttributeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.policy.attributes.CreateAttributeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.policy.attributes.CreateAttributeRequest parseFrom(
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
  public static Builder newBuilder(com.policy.attributes.CreateAttributeRequest prototype) {
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
   * Protobuf type {@code policy.attributes.CreateAttributeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:policy.attributes.CreateAttributeRequest)
      com.policy.attributes.CreateAttributeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.policy.attributes.AttributesProto.internal_static_policy_attributes_CreateAttributeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.policy.attributes.AttributesProto.internal_static_policy_attributes_CreateAttributeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.policy.attributes.CreateAttributeRequest.class, com.policy.attributes.CreateAttributeRequest.Builder.class);
    }

    // Construct using com.policy.attributes.CreateAttributeRequest.newBuilder()
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
      return com.policy.attributes.AttributesProto.internal_static_policy_attributes_CreateAttributeRequest_descriptor;
    }

    @java.lang.Override
    public com.policy.attributes.CreateAttributeRequest getDefaultInstanceForType() {
      return com.policy.attributes.CreateAttributeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.policy.attributes.CreateAttributeRequest build() {
      com.policy.attributes.CreateAttributeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.policy.attributes.CreateAttributeRequest buildPartial() {
      com.policy.attributes.CreateAttributeRequest result = new com.policy.attributes.CreateAttributeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.policy.attributes.CreateAttributeRequest result) {
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
      if (other instanceof com.policy.attributes.CreateAttributeRequest) {
        return mergeFrom((com.policy.attributes.CreateAttributeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.policy.attributes.CreateAttributeRequest other) {
      if (other == com.policy.attributes.CreateAttributeRequest.getDefaultInstance()) return this;
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

    private com.policy.attributes.AttributeCreateUpdate attribute_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.policy.attributes.AttributeCreateUpdate, com.policy.attributes.AttributeCreateUpdate.Builder, com.policy.attributes.AttributeCreateUpdateOrBuilder> attributeBuilder_;
    /**
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
     * @return Whether the attribute field is set.
     */
    public boolean hasAttribute() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
     * @return The attribute.
     */
    public com.policy.attributes.AttributeCreateUpdate getAttribute() {
      if (attributeBuilder_ == null) {
        return attribute_ == null ? com.policy.attributes.AttributeCreateUpdate.getDefaultInstance() : attribute_;
      } else {
        return attributeBuilder_.getMessage();
      }
    }
    /**
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
     */
    public Builder setAttribute(com.policy.attributes.AttributeCreateUpdate value) {
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
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
     */
    public Builder setAttribute(
        com.policy.attributes.AttributeCreateUpdate.Builder builderForValue) {
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
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeAttribute(com.policy.attributes.AttributeCreateUpdate value) {
      if (attributeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          attribute_ != null &&
          attribute_ != com.policy.attributes.AttributeCreateUpdate.getDefaultInstance()) {
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
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
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
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
     */
    public com.policy.attributes.AttributeCreateUpdate.Builder getAttributeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAttributeFieldBuilder().getBuilder();
    }
    /**
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
     */
    public com.policy.attributes.AttributeCreateUpdateOrBuilder getAttributeOrBuilder() {
      if (attributeBuilder_ != null) {
        return attributeBuilder_.getMessageOrBuilder();
      } else {
        return attribute_ == null ?
            com.policy.attributes.AttributeCreateUpdate.getDefaultInstance() : attribute_;
      }
    }
    /**
     * <code>.policy.attributes.AttributeCreateUpdate attribute = 1 [json_name = "attribute", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.policy.attributes.AttributeCreateUpdate, com.policy.attributes.AttributeCreateUpdate.Builder, com.policy.attributes.AttributeCreateUpdateOrBuilder> 
        getAttributeFieldBuilder() {
      if (attributeBuilder_ == null) {
        attributeBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.policy.attributes.AttributeCreateUpdate, com.policy.attributes.AttributeCreateUpdate.Builder, com.policy.attributes.AttributeCreateUpdateOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:policy.attributes.CreateAttributeRequest)
  }

  // @@protoc_insertion_point(class_scope:policy.attributes.CreateAttributeRequest)
  private static final com.policy.attributes.CreateAttributeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.policy.attributes.CreateAttributeRequest();
  }

  public static com.policy.attributes.CreateAttributeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAttributeRequest>
      PARSER = new com.google.protobuf.AbstractParser<CreateAttributeRequest>() {
    @java.lang.Override
    public CreateAttributeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAttributeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAttributeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.policy.attributes.CreateAttributeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

