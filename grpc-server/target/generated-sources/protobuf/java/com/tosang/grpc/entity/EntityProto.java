// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: message.proto

package com.tosang.grpc.entity;

public final class EntityProto {
  private EntityProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tosang_grpc_entity_HelloRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tosang_grpc_entity_HelloRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tosang_grpc_entity_Index_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tosang_grpc_entity_Index_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_com_tosang_grpc_entity_IndexResponse_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_com_tosang_grpc_entity_IndexResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rmessage.proto\022\026com.tosang.grpc.entity\"" +
      "\037\n\014HelloRequest\022\017\n\007message\030\001 \001(\t\"\204\003\n\005Ind" +
      "ex\022\n\n\002id\030\001 \001(\t\022\026\n\016securitiesCode\030\002 \001(\t\022\014" +
      "\n\004ISIN\030\003 \001(\t\022!\n\031nameOfSecuritiesInChines" +
      "e\030\004 \001(\t\022\n\n\002ST\030\005 \001(\010\022\016\n\006starST\030\006 \001(\010\022!\n\031n" +
      "ameOfSecuritiesInEnglish\030\007 \001(\t\022\036\n\026underl" +
      "yingSecurityCode\030\010 \001(\t\022\031\n\021typesOfSecurit" +
      "ies\030\t \001(\t\022\033\n\023lastTransactionDate\030\n \001(\t\022\023" +
      "\n\013listingDate\030\013 \001(\t\022\017\n\007exRight\030\014 \001(\t\022\022\n\n" +
      "exDividend\030\r \001(\t\022\022\n\npriceRange\030\016 \001(\t\022\022\n\n",
      "limitTypes\030\017 \001(\t\022\024\n\014ceilingPrice\030\020 \001(\t\022\027" +
      "\n\017lowerLimitPrice\030\021 \001(\t\"X\n\rIndexResponse" +
      "\022\013\n\003msg\030\001 \001(\t\022\014\n\004code\030\002 \001(\005\022,\n\005index\030\003 \003" +
      "(\0132\035.com.tosang.grpc.entity.IndexB\'\n\026com" +
      ".tosang.grpc.entityB\013EntityProtoP\001b\006prot" +
      "o3"
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
    internal_static_com_tosang_grpc_entity_HelloRequest_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_com_tosang_grpc_entity_HelloRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tosang_grpc_entity_HelloRequest_descriptor,
        new java.lang.String[] { "Message", });
    internal_static_com_tosang_grpc_entity_Index_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_com_tosang_grpc_entity_Index_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tosang_grpc_entity_Index_descriptor,
        new java.lang.String[] { "Id", "SecuritiesCode", "ISIN", "NameOfSecuritiesInChinese", "ST", "StarST", "NameOfSecuritiesInEnglish", "UnderlyingSecurityCode", "TypesOfSecurities", "LastTransactionDate", "ListingDate", "ExRight", "ExDividend", "PriceRange", "LimitTypes", "CeilingPrice", "LowerLimitPrice", });
    internal_static_com_tosang_grpc_entity_IndexResponse_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_com_tosang_grpc_entity_IndexResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_com_tosang_grpc_entity_IndexResponse_descriptor,
        new java.lang.String[] { "Msg", "Code", "Index", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
