// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: access/access.proto

// Protobuf Java Version: 3.25.3
package io.opentdf.platform.access;

public interface PublicKeyRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:access.PublicKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string algorithm = 1 [json_name = "algorithm"];</code>
   * @return The algorithm.
   */
  java.lang.String getAlgorithm();
  /**
   * <code>string algorithm = 1 [json_name = "algorithm"];</code>
   * @return The bytes for algorithm.
   */
  com.google.protobuf.ByteString
      getAlgorithmBytes();

  /**
   * <code>string fmt = 2 [json_name = "fmt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The fmt.
   */
  java.lang.String getFmt();
  /**
   * <code>string fmt = 2 [json_name = "fmt", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for fmt.
   */
  com.google.protobuf.ByteString
      getFmtBytes();

  /**
   * <code>string v = 3 [json_name = "v", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The v.
   */
  java.lang.String getV();
  /**
   * <code>string v = 3 [json_name = "v", (.grpc.gateway.protoc_gen_openapiv2.options.openapiv2_field) = { ... }</code>
   * @return The bytes for v.
   */
  com.google.protobuf.ByteString
      getVBytes();
}