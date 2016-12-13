// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/variable.proto

package org.tensorflow.framework;

public final class VariableProtos {
  private VariableProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_VariableDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_VariableDef_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SaveSliceInfoDef_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_SaveSliceInfoDef_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n(tensorflow/core/framework/variable.pro" +
      "to\022\ntensorflow\"\220\001\n\013VariableDef\022\025\n\rvariab" +
      "le_name\030\001 \001(\t\022\030\n\020initializer_name\030\002 \001(\t\022" +
      "\025\n\rsnapshot_name\030\003 \001(\t\0229\n\023save_slice_inf" +
      "o_def\030\004 \001(\0132\034.tensorflow.SaveSliceInfoDe" +
      "f\"`\n\020SaveSliceInfoDef\022\021\n\tfull_name\030\001 \001(\t" +
      "\022\022\n\nfull_shape\030\002 \003(\005\022\022\n\nvar_offset\030\003 \003(\005" +
      "\022\021\n\tvar_shape\030\004 \003(\005B/\n\030org.tensorflow.fr" +
      "ameworkB\016VariableProtosP\001\370\001\001b\006proto3"
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
    internal_static_tensorflow_VariableDef_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_VariableDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_VariableDef_descriptor,
        new java.lang.String[] { "VariableName", "InitializerName", "SnapshotName", "SaveSliceInfoDef", });
    internal_static_tensorflow_SaveSliceInfoDef_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_SaveSliceInfoDef_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_SaveSliceInfoDef_descriptor,
        new java.lang.String[] { "FullName", "FullShape", "VarOffset", "VarShape", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}