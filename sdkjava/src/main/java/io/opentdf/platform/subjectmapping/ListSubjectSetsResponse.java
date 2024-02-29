// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.subjectmapping;

/**
 * Protobuf type {@code subjectmapping.ListSubjectSetsResponse}
 */
public final class ListSubjectSetsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:subjectmapping.ListSubjectSetsResponse)
    ListSubjectSetsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ListSubjectSetsResponse.newBuilder() to construct.
  private ListSubjectSetsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ListSubjectSetsResponse() {
    subjectSets_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ListSubjectSetsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_ListSubjectSetsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_ListSubjectSetsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.opentdf.platform.subjectmapping.ListSubjectSetsResponse.class, io.opentdf.platform.subjectmapping.ListSubjectSetsResponse.Builder.class);
  }

  public static final int SUBJECT_SETS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<io.opentdf.platform.subjectmapping.SubjectSet> subjectSets_;
  /**
   * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
   */
  @java.lang.Override
  public java.util.List<io.opentdf.platform.subjectmapping.SubjectSet> getSubjectSetsList() {
    return subjectSets_;
  }
  /**
   * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends io.opentdf.platform.subjectmapping.SubjectSetOrBuilder> 
      getSubjectSetsOrBuilderList() {
    return subjectSets_;
  }
  /**
   * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
   */
  @java.lang.Override
  public int getSubjectSetsCount() {
    return subjectSets_.size();
  }
  /**
   * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
   */
  @java.lang.Override
  public io.opentdf.platform.subjectmapping.SubjectSet getSubjectSets(int index) {
    return subjectSets_.get(index);
  }
  /**
   * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
   */
  @java.lang.Override
  public io.opentdf.platform.subjectmapping.SubjectSetOrBuilder getSubjectSetsOrBuilder(
      int index) {
    return subjectSets_.get(index);
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
    for (int i = 0; i < subjectSets_.size(); i++) {
      output.writeMessage(1, subjectSets_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < subjectSets_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, subjectSets_.get(i));
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
    if (!(obj instanceof io.opentdf.platform.subjectmapping.ListSubjectSetsResponse)) {
      return super.equals(obj);
    }
    io.opentdf.platform.subjectmapping.ListSubjectSetsResponse other = (io.opentdf.platform.subjectmapping.ListSubjectSetsResponse) obj;

    if (!getSubjectSetsList()
        .equals(other.getSubjectSetsList())) return false;
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
    if (getSubjectSetsCount() > 0) {
      hash = (37 * hash) + SUBJECT_SETS_FIELD_NUMBER;
      hash = (53 * hash) + getSubjectSetsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse parseFrom(
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
  public static Builder newBuilder(io.opentdf.platform.subjectmapping.ListSubjectSetsResponse prototype) {
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
   * Protobuf type {@code subjectmapping.ListSubjectSetsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:subjectmapping.ListSubjectSetsResponse)
      io.opentdf.platform.subjectmapping.ListSubjectSetsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_ListSubjectSetsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_ListSubjectSetsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.opentdf.platform.subjectmapping.ListSubjectSetsResponse.class, io.opentdf.platform.subjectmapping.ListSubjectSetsResponse.Builder.class);
    }

    // Construct using io.opentdf.platform.subjectmapping.ListSubjectSetsResponse.newBuilder()
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
      if (subjectSetsBuilder_ == null) {
        subjectSets_ = java.util.Collections.emptyList();
      } else {
        subjectSets_ = null;
        subjectSetsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.opentdf.platform.subjectmapping.SubjectMappingProto.internal_static_subjectmapping_ListSubjectSetsResponse_descriptor;
    }

    @java.lang.Override
    public io.opentdf.platform.subjectmapping.ListSubjectSetsResponse getDefaultInstanceForType() {
      return io.opentdf.platform.subjectmapping.ListSubjectSetsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public io.opentdf.platform.subjectmapping.ListSubjectSetsResponse build() {
      io.opentdf.platform.subjectmapping.ListSubjectSetsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.opentdf.platform.subjectmapping.ListSubjectSetsResponse buildPartial() {
      io.opentdf.platform.subjectmapping.ListSubjectSetsResponse result = new io.opentdf.platform.subjectmapping.ListSubjectSetsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(io.opentdf.platform.subjectmapping.ListSubjectSetsResponse result) {
      if (subjectSetsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          subjectSets_ = java.util.Collections.unmodifiableList(subjectSets_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.subjectSets_ = subjectSets_;
      } else {
        result.subjectSets_ = subjectSetsBuilder_.build();
      }
    }

    private void buildPartial0(io.opentdf.platform.subjectmapping.ListSubjectSetsResponse result) {
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
      if (other instanceof io.opentdf.platform.subjectmapping.ListSubjectSetsResponse) {
        return mergeFrom((io.opentdf.platform.subjectmapping.ListSubjectSetsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.opentdf.platform.subjectmapping.ListSubjectSetsResponse other) {
      if (other == io.opentdf.platform.subjectmapping.ListSubjectSetsResponse.getDefaultInstance()) return this;
      if (subjectSetsBuilder_ == null) {
        if (!other.subjectSets_.isEmpty()) {
          if (subjectSets_.isEmpty()) {
            subjectSets_ = other.subjectSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSubjectSetsIsMutable();
            subjectSets_.addAll(other.subjectSets_);
          }
          onChanged();
        }
      } else {
        if (!other.subjectSets_.isEmpty()) {
          if (subjectSetsBuilder_.isEmpty()) {
            subjectSetsBuilder_.dispose();
            subjectSetsBuilder_ = null;
            subjectSets_ = other.subjectSets_;
            bitField0_ = (bitField0_ & ~0x00000001);
            subjectSetsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getSubjectSetsFieldBuilder() : null;
          } else {
            subjectSetsBuilder_.addAllMessages(other.subjectSets_);
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
              io.opentdf.platform.subjectmapping.SubjectSet m =
                  input.readMessage(
                      io.opentdf.platform.subjectmapping.SubjectSet.parser(),
                      extensionRegistry);
              if (subjectSetsBuilder_ == null) {
                ensureSubjectSetsIsMutable();
                subjectSets_.add(m);
              } else {
                subjectSetsBuilder_.addMessage(m);
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

    private java.util.List<io.opentdf.platform.subjectmapping.SubjectSet> subjectSets_ =
      java.util.Collections.emptyList();
    private void ensureSubjectSetsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        subjectSets_ = new java.util.ArrayList<io.opentdf.platform.subjectmapping.SubjectSet>(subjectSets_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opentdf.platform.subjectmapping.SubjectSet, io.opentdf.platform.subjectmapping.SubjectSet.Builder, io.opentdf.platform.subjectmapping.SubjectSetOrBuilder> subjectSetsBuilder_;

    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public java.util.List<io.opentdf.platform.subjectmapping.SubjectSet> getSubjectSetsList() {
      if (subjectSetsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(subjectSets_);
      } else {
        return subjectSetsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public int getSubjectSetsCount() {
      if (subjectSetsBuilder_ == null) {
        return subjectSets_.size();
      } else {
        return subjectSetsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public io.opentdf.platform.subjectmapping.SubjectSet getSubjectSets(int index) {
      if (subjectSetsBuilder_ == null) {
        return subjectSets_.get(index);
      } else {
        return subjectSetsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder setSubjectSets(
        int index, io.opentdf.platform.subjectmapping.SubjectSet value) {
      if (subjectSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectSetsIsMutable();
        subjectSets_.set(index, value);
        onChanged();
      } else {
        subjectSetsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder setSubjectSets(
        int index, io.opentdf.platform.subjectmapping.SubjectSet.Builder builderForValue) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        subjectSets_.set(index, builderForValue.build());
        onChanged();
      } else {
        subjectSetsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder addSubjectSets(io.opentdf.platform.subjectmapping.SubjectSet value) {
      if (subjectSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectSetsIsMutable();
        subjectSets_.add(value);
        onChanged();
      } else {
        subjectSetsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder addSubjectSets(
        int index, io.opentdf.platform.subjectmapping.SubjectSet value) {
      if (subjectSetsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSubjectSetsIsMutable();
        subjectSets_.add(index, value);
        onChanged();
      } else {
        subjectSetsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder addSubjectSets(
        io.opentdf.platform.subjectmapping.SubjectSet.Builder builderForValue) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        subjectSets_.add(builderForValue.build());
        onChanged();
      } else {
        subjectSetsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder addSubjectSets(
        int index, io.opentdf.platform.subjectmapping.SubjectSet.Builder builderForValue) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        subjectSets_.add(index, builderForValue.build());
        onChanged();
      } else {
        subjectSetsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder addAllSubjectSets(
        java.lang.Iterable<? extends io.opentdf.platform.subjectmapping.SubjectSet> values) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, subjectSets_);
        onChanged();
      } else {
        subjectSetsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder clearSubjectSets() {
      if (subjectSetsBuilder_ == null) {
        subjectSets_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        subjectSetsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public Builder removeSubjectSets(int index) {
      if (subjectSetsBuilder_ == null) {
        ensureSubjectSetsIsMutable();
        subjectSets_.remove(index);
        onChanged();
      } else {
        subjectSetsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public io.opentdf.platform.subjectmapping.SubjectSet.Builder getSubjectSetsBuilder(
        int index) {
      return getSubjectSetsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public io.opentdf.platform.subjectmapping.SubjectSetOrBuilder getSubjectSetsOrBuilder(
        int index) {
      if (subjectSetsBuilder_ == null) {
        return subjectSets_.get(index);  } else {
        return subjectSetsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public java.util.List<? extends io.opentdf.platform.subjectmapping.SubjectSetOrBuilder> 
         getSubjectSetsOrBuilderList() {
      if (subjectSetsBuilder_ != null) {
        return subjectSetsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(subjectSets_);
      }
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public io.opentdf.platform.subjectmapping.SubjectSet.Builder addSubjectSetsBuilder() {
      return getSubjectSetsFieldBuilder().addBuilder(
          io.opentdf.platform.subjectmapping.SubjectSet.getDefaultInstance());
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public io.opentdf.platform.subjectmapping.SubjectSet.Builder addSubjectSetsBuilder(
        int index) {
      return getSubjectSetsFieldBuilder().addBuilder(
          index, io.opentdf.platform.subjectmapping.SubjectSet.getDefaultInstance());
    }
    /**
     * <code>repeated .subjectmapping.SubjectSet subject_sets = 1 [json_name = "subjectSets"];</code>
     */
    public java.util.List<io.opentdf.platform.subjectmapping.SubjectSet.Builder> 
         getSubjectSetsBuilderList() {
      return getSubjectSetsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        io.opentdf.platform.subjectmapping.SubjectSet, io.opentdf.platform.subjectmapping.SubjectSet.Builder, io.opentdf.platform.subjectmapping.SubjectSetOrBuilder> 
        getSubjectSetsFieldBuilder() {
      if (subjectSetsBuilder_ == null) {
        subjectSetsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            io.opentdf.platform.subjectmapping.SubjectSet, io.opentdf.platform.subjectmapping.SubjectSet.Builder, io.opentdf.platform.subjectmapping.SubjectSetOrBuilder>(
                subjectSets_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        subjectSets_ = null;
      }
      return subjectSetsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:subjectmapping.ListSubjectSetsResponse)
  }

  // @@protoc_insertion_point(class_scope:subjectmapping.ListSubjectSetsResponse)
  private static final io.opentdf.platform.subjectmapping.ListSubjectSetsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.opentdf.platform.subjectmapping.ListSubjectSetsResponse();
  }

  public static io.opentdf.platform.subjectmapping.ListSubjectSetsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListSubjectSetsResponse>
      PARSER = new com.google.protobuf.AbstractParser<ListSubjectSetsResponse>() {
    @java.lang.Override
    public ListSubjectSetsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListSubjectSetsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListSubjectSetsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.opentdf.platform.subjectmapping.ListSubjectSetsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

