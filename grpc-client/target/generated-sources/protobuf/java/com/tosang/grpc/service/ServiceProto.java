// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: service.proto

package com.tosang.grpc.service;

public final class ServiceProto {
  private ServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rservice.proto\022\027com.tosang.grpc.service" +
      "\032\rmessage.proto2\314\001\n\014IndexService\022\\\n\rsimp" +
      "leRequest\022$.com.tosang.grpc.entity.Hello" +
      "Request\032%.com.tosang.grpc.entity.IndexRe" +
      "sponse\022^\n\rstreamRequest\022$.com.tosang.grp" +
      "c.entity.HelloRequest\032%.com.tosang.grpc." +
      "entity.IndexResponse0\001B)\n\027com.tosang.grp" +
      "c.serviceB\014ServiceProtoP\001b\006proto3"
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
          com.tosang.grpc.entity.EntityProto.getDescriptor(),
        }, assigner);
    com.tosang.grpc.entity.EntityProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
