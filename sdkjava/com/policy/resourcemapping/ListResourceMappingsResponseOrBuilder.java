// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: policy/resourcemapping/resource_mapping.proto

// Protobuf Java Version: 3.25.3
package com.policy.resourcemapping;

public interface ListResourceMappingsResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:policy.resourcemapping.ListResourceMappingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .policy.resourcemapping.ResourceMapping resource_mappings = 1 [json_name = "resourceMappings"];</code>
   */
  java.util.List<com.policy.resourcemapping.ResourceMapping> 
      getResourceMappingsList();
  /**
   * <code>repeated .policy.resourcemapping.ResourceMapping resource_mappings = 1 [json_name = "resourceMappings"];</code>
   */
  com.policy.resourcemapping.ResourceMapping getResourceMappings(int index);
  /**
   * <code>repeated .policy.resourcemapping.ResourceMapping resource_mappings = 1 [json_name = "resourceMappings"];</code>
   */
  int getResourceMappingsCount();
  /**
   * <code>repeated .policy.resourcemapping.ResourceMapping resource_mappings = 1 [json_name = "resourceMappings"];</code>
   */
  java.util.List<? extends com.policy.resourcemapping.ResourceMappingOrBuilder> 
      getResourceMappingsOrBuilderList();
  /**
   * <code>repeated .policy.resourcemapping.ResourceMapping resource_mappings = 1 [json_name = "resourceMappings"];</code>
   */
  com.policy.resourcemapping.ResourceMappingOrBuilder getResourceMappingsOrBuilder(
      int index);
}
