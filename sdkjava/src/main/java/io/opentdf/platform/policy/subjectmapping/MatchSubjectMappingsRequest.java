// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.policy.subjectmapping;

/**
 * <pre>
 * MatchSubjectMappingsRequest liberally returns a list of SubjectMappings based on the provided SubjectProperties. The SubjectMappings are returned
 * if there is any single condition found among the structures that matches for one of the provided properties:
 * 1. The external field, external value, and an IN operator
 * 2. The external field, _no_ external value, and a NOT_IN operator
 *
 * Without this filtering, if a field was something like 'emailAddress' or 'username', every Subject is probably going to relate to that mapping
 * in some way or another, potentially matching every single attribute in the DB if a policy admin has relied heavily on that field. There is no
 * logic applied beyond a single condition within the query to avoid business logic interpreting the supplied conditions beyond the bare minimum
 * initial filter.
 *
 * NOTE: if you have any issues, debug logs are available within the service to help identify why a mapping was or was not returned.
 * </pre>
 *
 * Protobuf type {@code policy.subjectmapping.MatchSubjectMappingsRequest}
 */
public final class MatchSubjectMappingsRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:policy.subjectmapping.MatchSubjectMappingsRequest)
    MatchSubjectMappingsRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MatchSubjectMappingsRequest.newBuilder() to construct.
  private MatchSubjectMappingsRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MatchSubjectMappingsRequest() {
    subjectProperties_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MatchSubjectMappingsRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_MatchSubjectMappingsRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_MatchSubjectMappingsRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest.class, io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest.Builder.class);
  }

  public static final int SUBJECT_PROPERTIES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<io.opentdf.platform.policy.SubjectProperty> subjectProperties_;
  /**
   * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  @java.lang.Override
  public java.util.List<io.opentdf.platform.policy.SubjectProperty> getSubjectPropertiesList() {
    return subjectProperties_;
  }
  /**
   * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.opentdf.platform.policy.SubjectPropertyOrBuilder> 
      getSubjectPropertiesOrBuilderList() {
    return subjectProperties_;
  }
  /**
   * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  @java.lang.Override
  public int getSubjectPropertiesCount() {
    return subjectProperties_.size();
  }
  /**
   * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  @java.lang.Override
  public io.opentdf.platform.policy.SubjectProperty getSubjectProperties(int index) {
    return subjectProperties_.get(index);
  }
  /**
   * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
   */
  @java.lang.Override
  public io.opentdf.platform.policy.SubjectPropertyOrBuilder getSubjectPropertiesOrBuilder(
      int index) {
    return subjectProperties_.get(index);
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
    for (int i = 0; i < subjectProperties_.size(); i++) {
      output.writeMessage(1, subjectProperties_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < subjectProperties_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subjectProperties_.get(i));
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
    if (!(obj instanceof io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest)) {
      return super.equals(obj);
    }
    io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest other = (io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest) obj;

    if (!getSubjectPropertiesList()
        .equals(other.getSubjectPropertiesList())) return false;
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
    if (getSubjectPropertiesCount() > 0) {
      hash = (37 * hash) + SUBJECT_PROPERTIES_FIELD_NUMBER;
      hash = (53 * hash) + getSubjectPropertiesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest parseFrom(
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
  public static Builder newBuilder(io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest prototype) {
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
   * MatchSubjectMappingsRequest liberally returns a list of SubjectMappings based on the provided SubjectProperties. The SubjectMappings are returned
   * if there is any single condition found among the structures that matches for one of the provided properties:
   * 1. The external field, external value, and an IN operator
   * 2. The external field, _no_ external value, and a NOT_IN operator
   *
   * Without this filtering, if a field was something like 'emailAddress' or 'username', every Subject is probably going to relate to that mapping
   * in some way or another, potentially matching every single attribute in the DB if a policy admin has relied heavily on that field. There is no
   * logic applied beyond a single condition within the query to avoid business logic interpreting the supplied conditions beyond the bare minimum
   * initial filter.
   *
   * NOTE: if you have any issues, debug logs are available within the service to help identify why a mapping was or was not returned.
   * </pre>
   *
   * Protobuf type {@code policy.subjectmapping.MatchSubjectMappingsRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:policy.subjectmapping.MatchSubjectMappingsRequest)
      io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_MatchSubjectMappingsRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_MatchSubjectMappingsRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest.class, io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest.Builder.class);
    }

    // Construct using io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (subjectPropertiesBuilder_ == null) {
        subjectProperties_ = java.util.Collections.emptyList();
      } else {
        subjectProperties_ = null;
        subjectPropertiesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentdf.platform.policy.subjectmapping.SubjectMappingProto.internal_static_policy_subjectmapping_MatchSubjectMappingsRequest_descriptor;
    }

    @java.lang.Override
    public io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest getDefaultInstanceForType() {
      return io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest build() {
      io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest buildPartial() {
      io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest result = new io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest result) {
      if (subjectPropertiesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subjectProperties_ = java.util.Collections.unmodifiableList(subjectProperties_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subjectProperties_ = subjectProperties_;
      } else {
        result.subjectProperties_ = subjectPropertiesBuilder_.build();
      }
    }

    private void buildPartial0(io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest) {
        return mergeFrom((io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest other) {
      if (other == io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest.getDefaultInstance()) return this;
      if (subjectPropertiesBuilder_ == null) {
        if (!other.subjectProperties_.isEmpty()) {
          if (subjectProperties_.isEmpty()) {
            subjectProperties_ = other.subjectProperties_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubjectPropertiesIsMutable();
            subjectProperties_.addAll(other.subjectProperties_);
          }
          onChanged();
        }
      } else {
        if (!other.subjectProperties_.isEmpty()) {
          if (subjectPropertiesBuilder_.isEmpty()) {
            subjectPropertiesBuilder_.dispose();
            subjectPropertiesBuilder_ = null;
            subjectProperties_ = other.subjectProperties_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subjectPropertiesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubjectPropertiesFieldBuilder() : null;
          } else {
            subjectPropertiesBuilder_.addAllMessages(other.subjectProperties_);
          }
        }
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
              io.opentdf.platform.policy.SubjectProperty m =
                  input.readMessage(
                      io.opentdf.platform.policy.SubjectProperty.parser(),
                      extensionRegistry);
              if (subjectPropertiesBuilder_ == null) {
                ensureSubjectPropertiesIsMutable();
                subjectProperties_.add(m);
              } else {
                subjectPropertiesBuilder_.addMessage(m);
              }
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

    private java.util.List<io.opentdf.platform.policy.SubjectProperty> subjectProperties_ =
      java.util.Collections.emptyList();
    private void ensureSubjectPropertiesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subjectProperties_ = new java.util.ArrayList<io.opentdf.platform.policy.SubjectProperty>(subjectProperties_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opentdf.platform.policy.SubjectProperty, io.opentdf.platform.policy.SubjectProperty.Builder, io.opentdf.platform.policy.SubjectPropertyOrBuilder> subjectPropertiesBuilder_;

    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public java.util.List<io.opentdf.platform.policy.SubjectProperty> getSubjectPropertiesList() {
      if (subjectPropertiesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subjectProperties_);
      } else {
        return subjectPropertiesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public int getSubjectPropertiesCount() {
      if (subjectPropertiesBuilder_ == null) {
        return subjectProperties_.size();
      } else {
        return subjectPropertiesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public io.opentdf.platform.policy.SubjectProperty getSubjectProperties(int index) {
      if (subjectPropertiesBuilder_ == null) {
        return subjectProperties_.get(index);
      } else {
        return subjectPropertiesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder setSubjectProperties(
        int index, io.opentdf.platform.policy.SubjectProperty value) {
      if (subjectPropertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectPropertiesIsMutable();
        subjectProperties_.set(index, value);
        onChanged();
      } else {
        subjectPropertiesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder setSubjectProperties(
        int index, io.opentdf.platform.policy.SubjectProperty.Builder builderForValue) {
      if (subjectPropertiesBuilder_ == null) {
        ensureSubjectPropertiesIsMutable();
        subjectProperties_.set(index, builderForValue.build());
        onChanged();
      } else {
        subjectPropertiesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder addSubjectProperties(io.opentdf.platform.policy.SubjectProperty value) {
      if (subjectPropertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectPropertiesIsMutable();
        subjectProperties_.add(value);
        onChanged();
      } else {
        subjectPropertiesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder addSubjectProperties(
        int index, io.opentdf.platform.policy.SubjectProperty value) {
      if (subjectPropertiesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectPropertiesIsMutable();
        subjectProperties_.add(index, value);
        onChanged();
      } else {
        subjectPropertiesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder addSubjectProperties(
        io.opentdf.platform.policy.SubjectProperty.Builder builderForValue) {
      if (subjectPropertiesBuilder_ == null) {
        ensureSubjectPropertiesIsMutable();
        subjectProperties_.add(builderForValue.build());
        onChanged();
      } else {
        subjectPropertiesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder addSubjectProperties(
        int index, io.opentdf.platform.policy.SubjectProperty.Builder builderForValue) {
      if (subjectPropertiesBuilder_ == null) {
        ensureSubjectPropertiesIsMutable();
        subjectProperties_.add(index, builderForValue.build());
        onChanged();
      } else {
        subjectPropertiesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder addAllSubjectProperties(
        java.lang.Iterable<? extends io.opentdf.platform.policy.SubjectProperty> values) {
      if (subjectPropertiesBuilder_ == null) {
        ensureSubjectPropertiesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subjectProperties_);
        onChanged();
      } else {
        subjectPropertiesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder clearSubjectProperties() {
      if (subjectPropertiesBuilder_ == null) {
        subjectProperties_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subjectPropertiesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public Builder removeSubjectProperties(int index) {
      if (subjectPropertiesBuilder_ == null) {
        ensureSubjectPropertiesIsMutable();
        subjectProperties_.remove(index);
        onChanged();
      } else {
        subjectPropertiesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public io.opentdf.platform.policy.SubjectProperty.Builder getSubjectPropertiesBuilder(
        int index) {
      return getSubjectPropertiesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public io.opentdf.platform.policy.SubjectPropertyOrBuilder getSubjectPropertiesOrBuilder(
        int index) {
      if (subjectPropertiesBuilder_ == null) {
        return subjectProperties_.get(index);  } else {
        return subjectPropertiesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public java.util.List<? extends io.opentdf.platform.policy.SubjectPropertyOrBuilder> 
         getSubjectPropertiesOrBuilderList() {
      if (subjectPropertiesBuilder_ != null) {
        return subjectPropertiesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subjectProperties_);
      }
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public io.opentdf.platform.policy.SubjectProperty.Builder addSubjectPropertiesBuilder() {
      return getSubjectPropertiesFieldBuilder().addBuilder(
          io.opentdf.platform.policy.SubjectProperty.getDefaultInstance());
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public io.opentdf.platform.policy.SubjectProperty.Builder addSubjectPropertiesBuilder(
        int index) {
      return getSubjectPropertiesFieldBuilder().addBuilder(
          index, io.opentdf.platform.policy.SubjectProperty.getDefaultInstance());
    }
    /**
     * <code>repeated .policy.SubjectProperty subject_properties = 1 [json_name = "subjectProperties"];</code>
     */
    public java.util.List<io.opentdf.platform.policy.SubjectProperty.Builder> 
         getSubjectPropertiesBuilderList() {
      return getSubjectPropertiesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opentdf.platform.policy.SubjectProperty, io.opentdf.platform.policy.SubjectProperty.Builder, io.opentdf.platform.policy.SubjectPropertyOrBuilder> 
        getSubjectPropertiesFieldBuilder() {
      if (subjectPropertiesBuilder_ == null) {
        subjectPropertiesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.opentdf.platform.policy.SubjectProperty, io.opentdf.platform.policy.SubjectProperty.Builder, io.opentdf.platform.policy.SubjectPropertyOrBuilder>(
                subjectProperties_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subjectProperties_ = null;
      }
      return subjectPropertiesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:policy.subjectmapping.MatchSubjectMappingsRequest)
  }

  // @@protoc_insertion_point(class_scope:policy.subjectmapping.MatchSubjectMappingsRequest)
  private static final io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest();
  }

  public static io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MatchSubjectMappingsRequest>
      PARSER = new com.google.protobuf.AbstractParser<MatchSubjectMappingsRequest>() {
    @java.lang.Override
    public MatchSubjectMappingsRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MatchSubjectMappingsRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MatchSubjectMappingsRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentdf.platform.policy.subjectmapping.MatchSubjectMappingsRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

