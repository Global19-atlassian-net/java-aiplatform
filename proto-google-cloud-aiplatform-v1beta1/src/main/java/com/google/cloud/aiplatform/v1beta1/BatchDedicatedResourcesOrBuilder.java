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
// source: google/cloud/aiplatform/v1beta1/machine_resources.proto

package com.google.cloud.aiplatform.v1beta1;

public interface BatchDedicatedResourcesOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.BatchDedicatedResources)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return Whether the machineSpec field is set.
   */
  boolean hasMachineSpec();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The machineSpec.
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpec getMachineSpec();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The specification of a single machine.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.MachineSpec machine_spec = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.field_behavior) = IMMUTABLE];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.MachineSpecOrBuilder getMachineSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Immutable. The number of machine replicas used at the start of the batch operation.
   * If not set, AI Platform decides starting number, not greater than
   * [max_replica_count][google.cloud.aiplatform.v1beta1.BatchDedicatedResources.max_replica_count]
   * </pre>
   *
   * <code>int32 starting_replica_count = 2 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The startingReplicaCount.
   */
  int getStartingReplicaCount();

  /**
   *
   *
   * <pre>
   * Immutable. The maximum number of machine replicas the batch operation may be scaled
   * to. The default value is 10.
   * </pre>
   *
   * <code>int32 max_replica_count = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The maxReplicaCount.
   */
  int getMaxReplicaCount();
}
