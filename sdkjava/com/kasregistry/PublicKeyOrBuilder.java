// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kasregistry/key_access_server_registry.proto

// Protobuf Java Version: 3.25.3
package com.kasregistry;

public interface PublicKeyOrBuilder extends
    // @@protoc_insertion_point(interface_extends:kasregistry.PublicKey)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * kas public key url - optional since can also be retrieved via public key
   * </pre>
   *
   * <code>string remote = 1 [json_name = "remote", (.buf.validate.field) = { ... }</code>
   * @return Whether the remote field is set.
   */
  boolean hasRemote();
  /**
   * <pre>
   * kas public key url - optional since can also be retrieved via public key
   * </pre>
   *
   * <code>string remote = 1 [json_name = "remote", (.buf.validate.field) = { ... }</code>
   * @return The remote.
   */
  java.lang.String getRemote();
  /**
   * <pre>
   * kas public key url - optional since can also be retrieved via public key
   * </pre>
   *
   * <code>string remote = 1 [json_name = "remote", (.buf.validate.field) = { ... }</code>
   * @return The bytes for remote.
   */
  com.google.protobuf.ByteString
      getRemoteBytes();

  /**
   * <pre>
   * public key - optional since can also be retrieved via url
   * </pre>
   *
   * <code>string local = 2 [json_name = "local"];</code>
   * @return Whether the local field is set.
   */
  boolean hasLocal();
  /**
   * <pre>
   * public key - optional since can also be retrieved via url
   * </pre>
   *
   * <code>string local = 2 [json_name = "local"];</code>
   * @return The local.
   */
  java.lang.String getLocal();
  /**
   * <pre>
   * public key - optional since can also be retrieved via url
   * </pre>
   *
   * <code>string local = 2 [json_name = "local"];</code>
   * @return The bytes for local.
   */
  com.google.protobuf.ByteString
      getLocalBytes();

  com.kasregistry.PublicKey.PublicKeyCase getPublicKeyCase();
}
