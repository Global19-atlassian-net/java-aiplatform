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
package com.google.cloud.aiplatform.v1alpha1.stub;

import static com.google.cloud.aiplatform.v1alpha1.PipelineServiceClient.ListTrainingPipelinesPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1alpha1.CancelTrainingPipelineRequest;
import com.google.cloud.aiplatform.v1alpha1.CreateTrainingPipelineRequest;
import com.google.cloud.aiplatform.v1alpha1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1alpha1.DeleteTrainingPipelineRequest;
import com.google.cloud.aiplatform.v1alpha1.GetTrainingPipelineRequest;
import com.google.cloud.aiplatform.v1alpha1.ListTrainingPipelinesRequest;
import com.google.cloud.aiplatform.v1alpha1.ListTrainingPipelinesResponse;
import com.google.cloud.aiplatform.v1alpha1.TrainingPipeline;
import com.google.longrunning.Operation;
import com.google.longrunning.stub.OperationsStub;
import com.google.protobuf.Empty;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Base stub class for Cloud AI Platform API.
 *
 * <p>This class is for advanced usage and reflects the underlying API directly.
 */
@Generated("by gapic-generator")
@BetaApi("A restructuring of stub classes is planned, so this may break in the future")
public abstract class PipelineServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  public UnaryCallable<CreateTrainingPipelineRequest, TrainingPipeline>
      createTrainingPipelineCallable() {
    throw new UnsupportedOperationException("Not implemented: createTrainingPipelineCallable()");
  }

  public UnaryCallable<GetTrainingPipelineRequest, TrainingPipeline> getTrainingPipelineCallable() {
    throw new UnsupportedOperationException("Not implemented: getTrainingPipelineCallable()");
  }

  public UnaryCallable<ListTrainingPipelinesRequest, ListTrainingPipelinesPagedResponse>
      listTrainingPipelinesPagedCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: listTrainingPipelinesPagedCallable()");
  }

  public UnaryCallable<ListTrainingPipelinesRequest, ListTrainingPipelinesResponse>
      listTrainingPipelinesCallable() {
    throw new UnsupportedOperationException("Not implemented: listTrainingPipelinesCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteTrainingPipelineRequest, Empty, DeleteOperationMetadata>
      deleteTrainingPipelineOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteTrainingPipelineOperationCallable()");
  }

  public UnaryCallable<DeleteTrainingPipelineRequest, Operation> deleteTrainingPipelineCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteTrainingPipelineCallable()");
  }

  public UnaryCallable<CancelTrainingPipelineRequest, Empty> cancelTrainingPipelineCallable() {
    throw new UnsupportedOperationException("Not implemented: cancelTrainingPipelineCallable()");
  }

  @Override
  public abstract void close();
}
