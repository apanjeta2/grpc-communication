// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: registration.proto

package io.grpc.examples.helloworld;

public final class RegistrationProto {
  private RegistrationProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_LoginUser_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_LoginUser_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_ReplyMessage_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_ReplyMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\022registration.proto\022\nhelloworld\"/\n\004User" +
      "\022\014\n\004name\030\001 \001(\t\022\r\n\005email\030\002 \001(\t\022\n\n\002id\030\003 \001(" +
      "\t\"/\n\tLoginUser\022\020\n\010username\030\001 \001(\t\022\020\n\010pass" +
      "word\030\002 \001(\t\"\037\n\014ReplyMessage\022\017\n\007message\030\001 " +
      "\001(\t2\211\001\n\017RegisterService\0227\n\007newUser\022\020.hel" +
      "loworld.User\032\030.helloworld.ReplyMessage\"\000" +
      "\022=\n\010findUser\022\025.helloworld.LoginUser\032\030.he" +
      "lloworld.ReplyMessage\"\000B8\n\033io.grpc.examp" +
      "les.helloworldB\021RegistrationProtoP\001\242\002\003HL" +
      "Wb\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_helloworld_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_User_descriptor,
        new java.lang.String[] { "Name", "Email", "Id", });
    internal_static_helloworld_LoginUser_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_LoginUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_LoginUser_descriptor,
        new java.lang.String[] { "Username", "Password", });
    internal_static_helloworld_ReplyMessage_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_helloworld_ReplyMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_ReplyMessage_descriptor,
        new java.lang.String[] { "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
