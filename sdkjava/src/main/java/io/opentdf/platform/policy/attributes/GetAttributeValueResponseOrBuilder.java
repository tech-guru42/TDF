// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/attributes/attributes.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.policy.attributes;

public interface GetAttributeValueResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:policy.attributes.GetAttributeValueResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.policy.attributes.Value value = 1 [json_name = "value"];</code>
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   * <code>.policy.attributes.Value value = 1 [json_name = "value"];</code>
   * @return The value.
   */
  io.opentdf.platform.policy.attributes.Value getValue();
  /**
   * <code>.policy.attributes.Value value = 1 [json_name = "value"];</code>
   */
  io.opentdf.platform.policy.attributes.ValueOrBuilder getValueOrBuilder();
}