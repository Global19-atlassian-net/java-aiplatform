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

import static com.google.cloud.aiplatform.v1alpha1.SpecialistPoolServiceClient.ListSpecialistPoolsPagedResponse;

import com.google.api.core.BetaApi;
import com.google.api.gax.core.BackgroundResource;
import com.google.api.gax.rpc.OperationCallable;
import com.google.api.gax.rpc.UnaryCallable;
import com.google.cloud.aiplatform.v1alpha1.CreateSpecialistPoolOperationMetadata;
import com.google.cloud.aiplatform.v1alpha1.CreateSpecialistPoolRequest;
import com.google.cloud.aiplatform.v1alpha1.DeleteOperationMetadata;
import com.google.cloud.aiplatform.v1alpha1.DeleteSpecialistPoolRequest;
import com.google.cloud.aiplatform.v1alpha1.GetSpecialistPoolRequest;
import com.google.cloud.aiplatform.v1alpha1.ListSpecialistPoolsRequest;
import com.google.cloud.aiplatform.v1alpha1.ListSpecialistPoolsResponse;
import com.google.cloud.aiplatform.v1alpha1.SpecialistPool;
import com.google.cloud.aiplatform.v1alpha1.UpdateSpecialistPoolOperationMetadata;
import com.google.cloud.aiplatform.v1alpha1.UpdateSpecialistPoolRequest;
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
public abstract class SpecialistPoolServiceStub implements BackgroundResource {

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationsStub getOperationsStub() {
    throw new UnsupportedOperationException("Not implemented: getOperationsStub()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          CreateSpecialistPoolRequest, SpecialistPool, CreateSpecialistPoolOperationMetadata>
      createSpecialistPoolOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: createSpecialistPoolOperationCallable()");
  }

  public UnaryCallable<CreateSpecialistPoolRequest, Operation> createSpecialistPoolCallable() {
    throw new UnsupportedOperationException("Not implemented: createSpecialistPoolCallable()");
  }

  public UnaryCallable<GetSpecialistPoolRequest, SpecialistPool> getSpecialistPoolCallable() {
    throw new UnsupportedOperationException("Not implemented: getSpecialistPoolCallable()");
  }

  public UnaryCallable<ListSpecialistPoolsRequest, ListSpecialistPoolsPagedResponse>
      listSpecialistPoolsPagedCallable() {
    throw new UnsupportedOperationException("Not implemented: listSpecialistPoolsPagedCallable()");
  }

  public UnaryCallable<ListSpecialistPoolsRequest, ListSpecialistPoolsResponse>
      listSpecialistPoolsCallable() {
    throw new UnsupportedOperationException("Not implemented: listSpecialistPoolsCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<DeleteSpecialistPoolRequest, Empty, DeleteOperationMetadata>
      deleteSpecialistPoolOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: deleteSpecialistPoolOperationCallable()");
  }

  public UnaryCallable<DeleteSpecialistPoolRequest, Operation> deleteSpecialistPoolCallable() {
    throw new UnsupportedOperationException("Not implemented: deleteSpecialistPoolCallable()");
  }

  @BetaApi("The surface for use by generated code is not stable yet and may change in the future.")
  public OperationCallable<
          UpdateSpecialistPoolRequest, SpecialistPool, UpdateSpecialistPoolOperationMetadata>
      updateSpecialistPoolOperationCallable() {
    throw new UnsupportedOperationException(
        "Not implemented: updateSpecialistPoolOperationCallable()");
  }

  public UnaryCallable<UpdateSpecialistPoolRequest, Operation> updateSpecialistPoolCallable() {
    throw new UnsupportedOperationException("Not implemented: updateSpecialistPoolCallable()");
  }

  @Override
  public abstract void close();
}
