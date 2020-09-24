/*
 * Copyright 2020 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/aiplatform/v1beta1/study.proto

package com.google.cloud.aiplatform.v1beta1;

public final class StudyProto {
  private StudyProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Trial_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Measurement_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Measurement_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/aiplatform/v1beta1/study."
          + "proto\022\037google.cloud.aiplatform.v1beta1\032\037"
          + "google/api/field_behavior.proto\032\031google/"
          + "api/resource.proto\032\036google/protobuf/dura"
          + "tion.proto\032\034google/protobuf/struct.proto"
          + "\032\037google/protobuf/timestamp.proto\032\034googl"
          + "e/api/annotations.proto\"\330\004\n\005Trial\022\017\n\002id\030"
          + "\002 \001(\tB\003\340A\003\022@\n\005state\030\003 \001(\0162,.google.cloud"
          + ".aiplatform.v1beta1.Trial.StateB\003\340A\003\022I\n\n"
          + "parameters\030\004 \003(\01320.google.cloud.aiplatfo"
          + "rm.v1beta1.Trial.ParameterB\003\340A\003\022L\n\021final"
          + "_measurement\030\005 \001(\0132,.google.cloud.aiplat"
          + "form.v1beta1.MeasurementB\003\340A\003\0223\n\nstart_t"
          + "ime\030\007 \001(\0132\032.google.protobuf.TimestampB\003\340"
          + "A\003\0221\n\010end_time\030\010 \001(\0132\032.google.protobuf.T"
          + "imestampB\003\340A\003\022?\n\ncustom_job\030\013 \001(\tB+\340A\003\372A"
          + "%\n#aiplatform.googleapis.com/CustomJob\032R"
          + "\n\tParameter\022\031\n\014parameter_id\030\001 \001(\tB\003\340A\003\022*"
          + "\n\005value\030\002 \001(\0132\026.google.protobuf.ValueB\003\340"
          + "A\003\"f\n\005State\022\025\n\021STATE_UNSPECIFIED\020\000\022\r\n\tRE"
          + "QUESTED\020\001\022\n\n\006ACTIVE\020\002\022\014\n\010STOPPING\020\003\022\r\n\tS"
          + "UCCEEDED\020\004\022\016\n\nINFEASIBLE\020\005\"\224\013\n\tStudySpec"
          + "\022K\n\007metrics\030\001 \003(\01325.google.cloud.aiplatf"
          + "orm.v1beta1.StudySpec.MetricSpecB\003\340A\002\022Q\n"
          + "\nparameters\030\002 \003(\01328.google.cloud.aiplatf"
          + "orm.v1beta1.StudySpec.ParameterSpecB\003\340A\002"
          + "\022G\n\talgorithm\030\003 \001(\01624.google.cloud.aipla"
          + "tform.v1beta1.StudySpec.Algorithm\032\272\001\n\nMe"
          + "tricSpec\022\026\n\tmetric_id\030\001 \001(\tB\003\340A\002\022Q\n\004goal"
          + "\030\002 \001(\0162>.google.cloud.aiplatform.v1beta1"
          + ".StudySpec.MetricSpec.GoalTypeB\003\340A\002\"A\n\010G"
          + "oalType\022\031\n\025GOAL_TYPE_UNSPECIFIED\020\000\022\014\n\010MA"
          + "XIMIZE\020\001\022\014\n\010MINIMIZE\020\002\032\224\007\n\rParameterSpec"
          + "\022e\n\021double_value_spec\030\002 \001(\0132H.google.clo"
          + "ud.aiplatform.v1beta1.StudySpec.Paramete"
          + "rSpec.DoubleValueSpecH\000\022g\n\022integer_value"
          + "_spec\030\003 \001(\0132I.google.cloud.aiplatform.v1"
          + "beta1.StudySpec.ParameterSpec.IntegerVal"
          + "ueSpecH\000\022o\n\026categorical_value_spec\030\004 \001(\013"
          + "2M.google.cloud.aiplatform.v1beta1.Study"
          + "Spec.ParameterSpec.CategoricalValueSpecH"
          + "\000\022i\n\023discrete_value_spec\030\005 \001(\0132J.google."
          + "cloud.aiplatform.v1beta1.StudySpec.Param"
          + "eterSpec.DiscreteValueSpecH\000\022\031\n\014paramete"
          + "r_id\030\001 \001(\tB\003\340A\002\022V\n\nscale_type\030\006 \001(\0162B.go"
          + "ogle.cloud.aiplatform.v1beta1.StudySpec."
          + "ParameterSpec.ScaleType\032A\n\017DoubleValueSp"
          + "ec\022\026\n\tmin_value\030\001 \001(\001B\003\340A\002\022\026\n\tmax_value\030"
          + "\002 \001(\001B\003\340A\002\032B\n\020IntegerValueSpec\022\026\n\tmin_va"
          + "lue\030\001 \001(\003B\003\340A\002\022\026\n\tmax_value\030\002 \001(\003B\003\340A\002\032+"
          + "\n\024CategoricalValueSpec\022\023\n\006values\030\001 \003(\tB\003"
          + "\340A\002\032(\n\021DiscreteValueSpec\022\023\n\006values\030\001 \003(\001"
          + "B\003\340A\002\"n\n\tScaleType\022\032\n\026SCALE_TYPE_UNSPECI"
          + "FIED\020\000\022\025\n\021UNIT_LINEAR_SCALE\020\001\022\022\n\016UNIT_LO"
          + "G_SCALE\020\002\022\032\n\026UNIT_REVERSE_LOG_SCALE\020\003B\026\n"
          + "\024parameter_value_spec\"J\n\tAlgorithm\022\031\n\025AL"
          + "GORITHM_UNSPECIFIED\020\000\022\017\n\013GRID_SEARCH\020\002\022\021"
          + "\n\rRANDOM_SEARCH\020\003\"\247\001\n\013Measurement\022\027\n\nste"
          + "p_count\030\002 \001(\003B\003\340A\003\022I\n\007metrics\030\003 \003(\01323.go"
          + "ogle.cloud.aiplatform.v1beta1.Measuremen"
          + "t.MetricB\003\340A\003\0324\n\006Metric\022\026\n\tmetric_id\030\001 \001"
          + "(\tB\003\340A\003\022\022\n\005value\030\002 \001(\001B\003\340A\003B~\n#com.googl"
          + "e.cloud.aiplatform.v1beta1B\nStudyProtoP\001"
          + "ZIgoogle.golang.org/genproto/googleapis/"
          + "cloud/aiplatform/v1beta1;aiplatformb\006pro"
          + "to3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Trial_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor,
            new java.lang.String[] {
              "Id", "State", "Parameters", "FinalMeasurement", "StartTime", "EndTime", "CustomJob",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Trial_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Trial_Parameter_descriptor,
            new java.lang.String[] {
              "ParameterId", "Value",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor,
            new java.lang.String[] {
              "Metrics", "Parameters", "Algorithm",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_MetricSpec_descriptor,
            new java.lang.String[] {
              "MetricId", "Goal",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor,
            new java.lang.String[] {
              "DoubleValueSpec",
              "IntegerValueSpec",
              "CategoricalValueSpec",
              "DiscreteValueSpec",
              "ParameterId",
              "ScaleType",
              "ParameterValueSpec",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DoubleValueSpec_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_IntegerValueSpec_descriptor,
            new java.lang.String[] {
              "MinValue", "MaxValue",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_CategoricalValueSpec_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_descriptor
            .getNestedTypes()
            .get(3);
    internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_StudySpec_ParameterSpec_DiscreteValueSpec_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Measurement_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1beta1_Measurement_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Measurement_descriptor,
            new java.lang.String[] {
              "StepCount", "Metrics",
            });
    internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_Measurement_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_Measurement_Metric_descriptor,
            new java.lang.String[] {
              "MetricId", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}