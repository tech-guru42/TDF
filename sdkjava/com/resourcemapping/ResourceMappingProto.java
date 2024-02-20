// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: resourcemapping/resource_mapping.proto

// Protobuf Java Version: 3.25.3
package com.resourcemapping;

public final class ResourceMappingProto {
  private ResourceMappingProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_ResourceMapping_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_ResourceMapping_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_ResourceMappingCreateUpdate_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_ResourceMappingCreateUpdate_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_ListResourceMappingsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_ListResourceMappingsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_ListResourceMappingsResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_ListResourceMappingsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_GetResourceMappingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_GetResourceMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_GetResourceMappingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_GetResourceMappingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_CreateResourceMappingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_CreateResourceMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_CreateResourceMappingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_CreateResourceMappingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_UpdateResourceMappingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_UpdateResourceMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_UpdateResourceMappingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_UpdateResourceMappingResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_DeleteResourceMappingRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_DeleteResourceMappingRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_resourcemapping_DeleteResourceMappingResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_resourcemapping_DeleteResourceMappingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&resourcemapping/resource_mapping.proto" +
      "\022\017resourcemapping\032\033attributes/attributes" +
      ".proto\032\033buf/validate/validate.proto\032\023com" +
      "mon/common.proto\032\034google/api/annotations" +
      ".proto\"\251\001\n\017ResourceMapping\022\016\n\002id\030\001 \001(\tR\002" +
      "id\022,\n\010metadata\030\002 \001(\0132\020.common.MetadataR\010" +
      "metadata\022B\n\017attribute_value\030\003 \001(\0132\021.attr" +
      "ibutes.ValueB\006\272H\003\310\001\001R\016attributeValue\022\024\n\005" +
      "terms\030\004 \003(\tR\005terms\"\226\001\n\033ResourceMappingCr" +
      "eateUpdate\0223\n\010metadata\030\001 \001(\0132\027.common.Me" +
      "tadataMutableR\010metadata\022,\n\022attribute_val" +
      "ue_id\030\002 \001(\tR\020attributeValueId\022\024\n\005terms\030\003" +
      " \003(\tR\005terms\"\035\n\033ListResourceMappingsReque" +
      "st\"m\n\034ListResourceMappingsResponse\022M\n\021re" +
      "source_mappings\030\001 \003(\0132 .resourcemapping." +
      "ResourceMappingR\020resourceMappings\"3\n\031Get" +
      "ResourceMappingRequest\022\026\n\002id\030\001 \001(\tB\006\272H\003\310" +
      "\001\001R\002id\"i\n\032GetResourceMappingResponse\022K\n\020" +
      "resource_mapping\030\001 \001(\0132 .resourcemapping" +
      ".ResourceMappingR\017resourceMapping\"\177\n\034Cre" +
      "ateResourceMappingRequest\022_\n\020resource_ma" +
      "pping\030\001 \001(\0132,.resourcemapping.ResourceMa" +
      "ppingCreateUpdateB\006\272H\003\310\001\001R\017resourceMappi" +
      "ng\"l\n\035CreateResourceMappingResponse\022K\n\020r" +
      "esource_mapping\030\001 \001(\0132 .resourcemapping." +
      "ResourceMappingR\017resourceMapping\"\227\001\n\034Upd" +
      "ateResourceMappingRequest\022\026\n\002id\030\001 \001(\tB\006\272" +
      "H\003\310\001\001R\002id\022_\n\020resource_mapping\030\002 \001(\0132,.re" +
      "sourcemapping.ResourceMappingCreateUpdat" +
      "eB\006\272H\003\310\001\001R\017resourceMapping\"l\n\035UpdateReso" +
      "urceMappingResponse\022K\n\020resource_mapping\030" +
      "\001 \001(\0132 .resourcemapping.ResourceMappingR" +
      "\017resourceMapping\"6\n\034DeleteResourceMappin" +
      "gRequest\022\026\n\002id\030\001 \001(\tB\006\272H\003\310\001\001R\002id\"l\n\035Dele" +
      "teResourceMappingResponse\022K\n\020resource_ma" +
      "pping\030\001 \001(\0132 .resourcemapping.ResourceMa" +
      "ppingR\017resourceMapping2\250\006\n\026ResourceMappi" +
      "ngService\022\217\001\n\024ListResourceMappings\022,.res" +
      "ourcemapping.ListResourceMappingsRequest" +
      "\032-.resourcemapping.ListResourceMappingsR" +
      "esponse\"\032\202\323\344\223\002\024\022\022/resource-mappings\022\216\001\n\022" +
      "GetResourceMapping\022*.resourcemapping.Get" +
      "ResourceMappingRequest\032+.resourcemapping" +
      ".GetResourceMappingResponse\"\037\202\323\344\223\002\031\022\027/re" +
      "source-mappings/{id}\022\244\001\n\025CreateResourceM" +
      "apping\022-.resourcemapping.CreateResourceM" +
      "appingRequest\032..resourcemapping.CreateRe" +
      "sourceMappingResponse\",\202\323\344\223\002&\"\022/resource" +
      "-mappings:\020resource_mapping\022\251\001\n\025UpdateRe" +
      "sourceMapping\022-.resourcemapping.UpdateRe" +
      "sourceMappingRequest\032..resourcemapping.U" +
      "pdateResourceMappingResponse\"1\202\323\344\223\002+\"\027/r" +
      "esource-mappings/{id}:\020resource_mapping\022" +
      "\227\001\n\025DeleteResourceMapping\022-.resourcemapp" +
      "ing.DeleteResourceMappingRequest\032..resou" +
      "rcemapping.DeleteResourceMappingResponse" +
      "\"\037\202\323\344\223\002\031*\027/resource-mappings/{id}B\270\001\n\023co" +
      "m.resourcemappingB\024ResourceMappingProtoP" +
      "\001Z/github.com/opentdf/platform/sdk/resou" +
      "rcemapping\242\002\003RXX\252\002\017Resourcemapping\312\002\017Res" +
      "ourcemapping\342\002\033Resourcemapping\\GPBMetada" +
      "ta\352\002\017Resourcemappingb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.attributes.AttributesProto.getDescriptor(),
          com.buf.validate.ValidateProto.getDescriptor(),
          com.common.CommonProto.getDescriptor(),
          com.google.api.AnnotationsProto.getDescriptor(),
        });
    internal_static_resourcemapping_ResourceMapping_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_resourcemapping_ResourceMapping_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_ResourceMapping_descriptor,
        new java.lang.String[] { "Id", "Metadata", "AttributeValue", "Terms", });
    internal_static_resourcemapping_ResourceMappingCreateUpdate_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_resourcemapping_ResourceMappingCreateUpdate_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_ResourceMappingCreateUpdate_descriptor,
        new java.lang.String[] { "Metadata", "AttributeValueId", "Terms", });
    internal_static_resourcemapping_ListResourceMappingsRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_resourcemapping_ListResourceMappingsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_ListResourceMappingsRequest_descriptor,
        new java.lang.String[] { });
    internal_static_resourcemapping_ListResourceMappingsResponse_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_resourcemapping_ListResourceMappingsResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_ListResourceMappingsResponse_descriptor,
        new java.lang.String[] { "ResourceMappings", });
    internal_static_resourcemapping_GetResourceMappingRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_resourcemapping_GetResourceMappingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_GetResourceMappingRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_resourcemapping_GetResourceMappingResponse_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_resourcemapping_GetResourceMappingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_GetResourceMappingResponse_descriptor,
        new java.lang.String[] { "ResourceMapping", });
    internal_static_resourcemapping_CreateResourceMappingRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_resourcemapping_CreateResourceMappingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_CreateResourceMappingRequest_descriptor,
        new java.lang.String[] { "ResourceMapping", });
    internal_static_resourcemapping_CreateResourceMappingResponse_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_resourcemapping_CreateResourceMappingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_CreateResourceMappingResponse_descriptor,
        new java.lang.String[] { "ResourceMapping", });
    internal_static_resourcemapping_UpdateResourceMappingRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_resourcemapping_UpdateResourceMappingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_UpdateResourceMappingRequest_descriptor,
        new java.lang.String[] { "Id", "ResourceMapping", });
    internal_static_resourcemapping_UpdateResourceMappingResponse_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_resourcemapping_UpdateResourceMappingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_UpdateResourceMappingResponse_descriptor,
        new java.lang.String[] { "ResourceMapping", });
    internal_static_resourcemapping_DeleteResourceMappingRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_resourcemapping_DeleteResourceMappingRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_DeleteResourceMappingRequest_descriptor,
        new java.lang.String[] { "Id", });
    internal_static_resourcemapping_DeleteResourceMappingResponse_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_resourcemapping_DeleteResourceMappingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_resourcemapping_DeleteResourceMappingResponse_descriptor,
        new java.lang.String[] { "ResourceMapping", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.buf.validate.ValidateProto.field);
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.attributes.AttributesProto.getDescriptor();
    com.buf.validate.ValidateProto.getDescriptor();
    com.common.CommonProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
