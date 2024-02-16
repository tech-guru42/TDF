// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kasregistry/key_access_server_registry.proto

// Protobuf Java Version: 3.25.3
package com.kasregistry;

/**
 * <pre>
 *
 *Descriptor for a KAS
 * </pre>
 *
 * Protobuf type {@code kasregistry.KeyAccessServer}
 */
public final class KeyAccessServer extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kasregistry.KeyAccessServer)
    KeyAccessServerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeyAccessServer.newBuilder() to construct.
  private KeyAccessServer(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeyAccessServer() {
    id_ = "";
    uri_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeyAccessServer();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kasregistry.KeyAccessServerRegistryProto.internal_static_kasregistry_KeyAccessServer_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kasregistry.KeyAccessServerRegistryProto.internal_static_kasregistry_KeyAccessServer_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kasregistry.KeyAccessServer.class, com.kasregistry.KeyAccessServer.Builder.class);
  }

  private int bitField0_;
  public static final int ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METADATA_FIELD_NUMBER = 2;
  private com.common.Metadata metadata_;
  /**
   * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.common.Metadata getMetadata() {
    return metadata_ == null ? com.common.Metadata.getDefaultInstance() : metadata_;
  }
  /**
   * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
   */
  @java.lang.Override
  public com.common.MetadataOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.common.Metadata.getDefaultInstance() : metadata_;
  }

  public static final int URI_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uri_ = "";
  /**
   * <pre>
   * Address of a KAS instance
   * </pre>
   *
   * <code>string uri = 3 [json_name = "uri"];</code>
   * @return The uri.
   */
  @java.lang.Override
  public java.lang.String getUri() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uri_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Address of a KAS instance
   * </pre>
   *
   * <code>string uri = 3 [json_name = "uri"];</code>
   * @return The bytes for uri.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUriBytes() {
    java.lang.Object ref = uri_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uri_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBLIC_KEY_FIELD_NUMBER = 4;
  private com.kasregistry.PublicKey publicKey_;
  /**
   * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
   * @return Whether the publicKey field is set.
   */
  @java.lang.Override
  public boolean hasPublicKey() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
   * @return The publicKey.
   */
  @java.lang.Override
  public com.kasregistry.PublicKey getPublicKey() {
    return publicKey_ == null ? com.kasregistry.PublicKey.getDefaultInstance() : publicKey_;
  }
  /**
   * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
   */
  @java.lang.Override
  public com.kasregistry.PublicKeyOrBuilder getPublicKeyOrBuilder() {
    return publicKey_ == null ? com.kasregistry.PublicKey.getDefaultInstance() : publicKey_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, uri_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(4, getPublicKey());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMetadata());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uri_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, uri_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(4, getPublicKey());
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
    if (!(obj instanceof com.kasregistry.KeyAccessServer)) {
      return super.equals(obj);
    }
    com.kasregistry.KeyAccessServer other = (com.kasregistry.KeyAccessServer) obj;

    if (!getId()
        .equals(other.getId())) return false;
    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
    }
    if (!getUri()
        .equals(other.getUri())) return false;
    if (hasPublicKey() != other.hasPublicKey()) return false;
    if (hasPublicKey()) {
      if (!getPublicKey()
          .equals(other.getPublicKey())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (37 * hash) + URI_FIELD_NUMBER;
    hash = (53 * hash) + getUri().hashCode();
    if (hasPublicKey()) {
      hash = (37 * hash) + PUBLIC_KEY_FIELD_NUMBER;
      hash = (53 * hash) + getPublicKey().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kasregistry.KeyAccessServer parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kasregistry.KeyAccessServer parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kasregistry.KeyAccessServer parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kasregistry.KeyAccessServer parseFrom(
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
  public static Builder newBuilder(com.kasregistry.KeyAccessServer prototype) {
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
   *
   *Descriptor for a KAS
   * </pre>
   *
   * Protobuf type {@code kasregistry.KeyAccessServer}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kasregistry.KeyAccessServer)
      com.kasregistry.KeyAccessServerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kasregistry.KeyAccessServerRegistryProto.internal_static_kasregistry_KeyAccessServer_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kasregistry.KeyAccessServerRegistryProto.internal_static_kasregistry_KeyAccessServer_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kasregistry.KeyAccessServer.class, com.kasregistry.KeyAccessServer.Builder.class);
    }

    // Construct using com.kasregistry.KeyAccessServer.newBuilder()
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
        getMetadataFieldBuilder();
        getPublicKeyFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      uri_ = "";
      publicKey_ = null;
      if (publicKeyBuilder_ != null) {
        publicKeyBuilder_.dispose();
        publicKeyBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kasregistry.KeyAccessServerRegistryProto.internal_static_kasregistry_KeyAccessServer_descriptor;
    }

    @java.lang.Override
    public com.kasregistry.KeyAccessServer getDefaultInstanceForType() {
      return com.kasregistry.KeyAccessServer.getDefaultInstance();
    }

    @java.lang.Override
    public com.kasregistry.KeyAccessServer build() {
      com.kasregistry.KeyAccessServer result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kasregistry.KeyAccessServer buildPartial() {
      com.kasregistry.KeyAccessServer result = new com.kasregistry.KeyAccessServer(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kasregistry.KeyAccessServer result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.uri_ = uri_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.publicKey_ = publicKeyBuilder_ == null
            ? publicKey_
            : publicKeyBuilder_.build();
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.kasregistry.KeyAccessServer) {
        return mergeFrom((com.kasregistry.KeyAccessServer)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kasregistry.KeyAccessServer other) {
      if (other == com.kasregistry.KeyAccessServer.getDefaultInstance()) return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
      }
      if (!other.getUri().isEmpty()) {
        uri_ = other.uri_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.hasPublicKey()) {
        mergePublicKey(other.getPublicKey());
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
              id_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getMetadataFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              uri_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              input.readMessage(
                  getPublicKeyFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000008;
              break;
            } // case 34
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

    private java.lang.Object id_ = "";
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string id = 1 [json_name = "id"];</code>
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.common.Metadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.common.Metadata, com.common.Metadata.Builder, com.common.MetadataOrBuilder> metadataBuilder_;
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     * @return The metadata.
     */
    public com.common.Metadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.common.Metadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(com.common.Metadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder setMetadata(
        com.common.Metadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder mergeMetadata(com.common.Metadata value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          metadata_ != null &&
          metadata_ != com.common.Metadata.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      if (metadata_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000002);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     */
    public com.common.Metadata.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     */
    public com.common.MetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.common.Metadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>.common.Metadata metadata = 2 [json_name = "metadata"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.common.Metadata, com.common.Metadata.Builder, com.common.MetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.common.Metadata, com.common.Metadata.Builder, com.common.MetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
    }

    private java.lang.Object uri_ = "";
    /**
     * <pre>
     * Address of a KAS instance
     * </pre>
     *
     * <code>string uri = 3 [json_name = "uri"];</code>
     * @return The uri.
     */
    public java.lang.String getUri() {
      java.lang.Object ref = uri_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uri_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Address of a KAS instance
     * </pre>
     *
     * <code>string uri = 3 [json_name = "uri"];</code>
     * @return The bytes for uri.
     */
    public com.google.protobuf.ByteString
        getUriBytes() {
      java.lang.Object ref = uri_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uri_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Address of a KAS instance
     * </pre>
     *
     * <code>string uri = 3 [json_name = "uri"];</code>
     * @param value The uri to set.
     * @return This builder for chaining.
     */
    public Builder setUri(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of a KAS instance
     * </pre>
     *
     * <code>string uri = 3 [json_name = "uri"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUri() {
      uri_ = getDefaultInstance().getUri();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Address of a KAS instance
     * </pre>
     *
     * <code>string uri = 3 [json_name = "uri"];</code>
     * @param value The bytes for uri to set.
     * @return This builder for chaining.
     */
    public Builder setUriBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uri_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private com.kasregistry.PublicKey publicKey_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kasregistry.PublicKey, com.kasregistry.PublicKey.Builder, com.kasregistry.PublicKeyOrBuilder> publicKeyBuilder_;
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     * @return Whether the publicKey field is set.
     */
    public boolean hasPublicKey() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     * @return The publicKey.
     */
    public com.kasregistry.PublicKey getPublicKey() {
      if (publicKeyBuilder_ == null) {
        return publicKey_ == null ? com.kasregistry.PublicKey.getDefaultInstance() : publicKey_;
      } else {
        return publicKeyBuilder_.getMessage();
      }
    }
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     */
    public Builder setPublicKey(com.kasregistry.PublicKey value) {
      if (publicKeyBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        publicKey_ = value;
      } else {
        publicKeyBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     */
    public Builder setPublicKey(
        com.kasregistry.PublicKey.Builder builderForValue) {
      if (publicKeyBuilder_ == null) {
        publicKey_ = builderForValue.build();
      } else {
        publicKeyBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     */
    public Builder mergePublicKey(com.kasregistry.PublicKey value) {
      if (publicKeyBuilder_ == null) {
        if (((bitField0_ & 0x00000008) != 0) &&
          publicKey_ != null &&
          publicKey_ != com.kasregistry.PublicKey.getDefaultInstance()) {
          getPublicKeyBuilder().mergeFrom(value);
        } else {
          publicKey_ = value;
        }
      } else {
        publicKeyBuilder_.mergeFrom(value);
      }
      if (publicKey_ != null) {
        bitField0_ |= 0x00000008;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     */
    public Builder clearPublicKey() {
      bitField0_ = (bitField0_ & ~0x00000008);
      publicKey_ = null;
      if (publicKeyBuilder_ != null) {
        publicKeyBuilder_.dispose();
        publicKeyBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     */
    public com.kasregistry.PublicKey.Builder getPublicKeyBuilder() {
      bitField0_ |= 0x00000008;
      onChanged();
      return getPublicKeyFieldBuilder().getBuilder();
    }
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     */
    public com.kasregistry.PublicKeyOrBuilder getPublicKeyOrBuilder() {
      if (publicKeyBuilder_ != null) {
        return publicKeyBuilder_.getMessageOrBuilder();
      } else {
        return publicKey_ == null ?
            com.kasregistry.PublicKey.getDefaultInstance() : publicKey_;
      }
    }
    /**
     * <code>.kasregistry.PublicKey public_key = 4 [json_name = "publicKey"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kasregistry.PublicKey, com.kasregistry.PublicKey.Builder, com.kasregistry.PublicKeyOrBuilder> 
        getPublicKeyFieldBuilder() {
      if (publicKeyBuilder_ == null) {
        publicKeyBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kasregistry.PublicKey, com.kasregistry.PublicKey.Builder, com.kasregistry.PublicKeyOrBuilder>(
                getPublicKey(),
                getParentForChildren(),
                isClean());
        publicKey_ = null;
      }
      return publicKeyBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kasregistry.KeyAccessServer)
  }

  // @@protoc_insertion_point(class_scope:kasregistry.KeyAccessServer)
  private static final com.kasregistry.KeyAccessServer DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kasregistry.KeyAccessServer();
  }

  public static com.kasregistry.KeyAccessServer getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyAccessServer>
      PARSER = new com.google.protobuf.AbstractParser<KeyAccessServer>() {
    @java.lang.Override
    public KeyAccessServer parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeyAccessServer> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyAccessServer> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kasregistry.KeyAccessServer getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

