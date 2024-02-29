// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/subjectmapping/subject_mapping.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.subjectmapping;

public interface SubjectMappingCreateUpdateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:subjectmapping.SubjectMappingCreateUpdate)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.common.MetadataMutable metadata = 1 [json_name = "metadata"];</code>
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   * <code>.common.MetadataMutable metadata = 1 [json_name = "metadata"];</code>
   * @return The metadata.
   */
  io.opentdf.platform.common.MetadataMutable getMetadata();
  /**
   * <code>.common.MetadataMutable metadata = 1 [json_name = "metadata"];</code>
   */
  io.opentdf.platform.common.MetadataMutableOrBuilder getMetadataOrBuilder();

  /**
   * <pre>
   * Attribute Value to be mapped to
   * </pre>
   *
   * <code>string attribute_value_id = 2 [json_name = "attributeValueId"];</code>
   * @return The attributeValueId.
   */
  java.lang.String getAttributeValueId();
  /**
   * <pre>
   * Attribute Value to be mapped to
   * </pre>
   *
   * <code>string attribute_value_id = 2 [json_name = "attributeValueId"];</code>
   * @return The bytes for attributeValueId.
   */
  com.google.protobuf.ByteString
      getAttributeValueIdBytes();

  /**
   * <pre>
   * the subjects sets in this mapping
   * </pre>
   *
   * <code>repeated string subject_set_ids = 3 [json_name = "subjectSetIds"];</code>
   * @return A list containing the subjectSetIds.
   */
  java.util.List<java.lang.String>
      getSubjectSetIdsList();
  /**
   * <pre>
   * the subjects sets in this mapping
   * </pre>
   *
   * <code>repeated string subject_set_ids = 3 [json_name = "subjectSetIds"];</code>
   * @return The count of subjectSetIds.
   */
  int getSubjectSetIdsCount();
  /**
   * <pre>
   * the subjects sets in this mapping
   * </pre>
   *
   * <code>repeated string subject_set_ids = 3 [json_name = "subjectSetIds"];</code>
   * @param index The index of the element to return.
   * @return The subjectSetIds at the given index.
   */
  java.lang.String getSubjectSetIds(int index);
  /**
   * <pre>
   * the subjects sets in this mapping
   * </pre>
   *
   * <code>repeated string subject_set_ids = 3 [json_name = "subjectSetIds"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the subjectSetIds at the given index.
   */
  com.google.protobuf.ByteString
      getSubjectSetIdsBytes(int index);

  /**
   * <pre>
   * The actions permitted by subjects in this mapping
   * </pre>
   *
   * <code>repeated .authorization.Action actions = 4 [json_name = "actions"];</code>
   */
  java.util.List<io.opentdf.platform.authorization.Action> 
      getActionsList();
  /**
   * <pre>
   * The actions permitted by subjects in this mapping
   * </pre>
   *
   * <code>repeated .authorization.Action actions = 4 [json_name = "actions"];</code>
   */
  io.opentdf.platform.authorization.Action getActions(int index);
  /**
   * <pre>
   * The actions permitted by subjects in this mapping
   * </pre>
   *
   * <code>repeated .authorization.Action actions = 4 [json_name = "actions"];</code>
   */
  int getActionsCount();
  /**
   * <pre>
   * The actions permitted by subjects in this mapping
   * </pre>
   *
   * <code>repeated .authorization.Action actions = 4 [json_name = "actions"];</code>
   */
  java.util.List<? extends io.opentdf.platform.authorization.ActionOrBuilder> 
      getActionsOrBuilderList();
  /**
   * <pre>
   * The actions permitted by subjects in this mapping
   * </pre>
   *
   * <code>repeated .authorization.Action actions = 4 [json_name = "actions"];</code>
   */
  io.opentdf.platform.authorization.ActionOrBuilder getActionsOrBuilder(
      int index);
}
