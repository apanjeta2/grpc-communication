// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sendCode.proto

package io.grpc.examples.helloworld;

public final class SendCodeProto {
  private SendCodeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_Email_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_Email_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_helloworld_Code_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_helloworld_Code_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\016sendCode.proto\022\nhelloworld\"\026\n\005Email\022\r\n" +
      "\005email\030\001 \001(\t\"%\n\004Code\022\014\n\004code\030\001 \001(\t\022\017\n\007me" +
      "ssage\030\002 \001(\t2H\n\017SendCodeService\0225\n\014genera" +
      "teCode\022\021.helloworld.Email\032\020.helloworld.C" +
      "ode\"\000B4\n\033io.grpc.examples.helloworldB\rSe" +
      "ndCodeProtoP\001\242\002\003HLWb\006proto3"
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
    internal_static_helloworld_Email_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_helloworld_Email_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_Email_descriptor,
        new java.lang.String[] { "Email", });
    internal_static_helloworld_Code_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_helloworld_Code_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_helloworld_Code_descriptor,
        new java.lang.String[] { "Code", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
