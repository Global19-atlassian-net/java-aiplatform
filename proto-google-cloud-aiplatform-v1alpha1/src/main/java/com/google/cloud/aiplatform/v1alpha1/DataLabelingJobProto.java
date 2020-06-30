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
// source: google/cloud/aiplatform/v1alpha1/data_labeling_job.proto

package com.google.cloud.aiplatform.v1alpha1;

public final class DataLabelingJobProto {
  private DataLabelingJobProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/aiplatform/v1alpha1/data_"
          + "labeling_job.proto\022 google.cloud.aiplatf"
          + "orm.v1alpha1\032\037google/api/field_behavior."
          + "proto\032\031google/api/resource.proto\0320google"
          + "/cloud/aiplatform/v1alpha1/job_state.pro"
          + "to\0326google/cloud/aiplatform/v1alpha1/spe"
          + "cialist_pool.proto\032\034google/protobuf/stru"
          + "ct.proto\032\037google/protobuf/timestamp.prot"
          + "o\032\034google/api/annotations.protoB\212\001\n$com."
          + "google.cloud.aiplatform.v1alpha1B\024DataLa"
          + "belingJobProtoP\001ZJgoogle.golang.org/genp"
          + "roto/googleapis/cloud/aiplatform/v1alpha"
          + "1;aiplatformb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1alpha1.JobStateProto.getDescriptor(),
              com.google.cloud.aiplatform.v1alpha1.SpecialistPoolProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.api.AnnotationsProto.getDescriptor(),
            });
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1alpha1.JobStateProto.getDescriptor();
    com.google.cloud.aiplatform.v1alpha1.SpecialistPoolProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.api.AnnotationsProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
