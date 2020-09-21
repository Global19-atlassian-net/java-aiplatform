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
package com.google.cloud.aiplatform.v1beta1;

import static com.google.cloud.aiplatform.v1beta1.EndpointServiceClient.ListEndpointsPagedResponse;

import com.google.api.core.ApiFunction;
import com.google.api.core.BetaApi;
import com.google.api.gax.core.GoogleCredentialsProvider;
import com.google.api.gax.core.InstantiatingExecutorProvider;
import com.google.api.gax.grpc.InstantiatingGrpcChannelProvider;
import com.google.api.gax.rpc.ApiClientHeaderProvider;
import com.google.api.gax.rpc.ClientContext;
import com.google.api.gax.rpc.ClientSettings;
import com.google.api.gax.rpc.OperationCallSettings;
import com.google.api.gax.rpc.PagedCallSettings;
import com.google.api.gax.rpc.TransportChannelProvider;
import com.google.api.gax.rpc.UnaryCallSettings;
import com.google.cloud.aiplatform.v1beta1.stub.EndpointServiceStubSettings;
import com.google.longrunning.Operation;
import com.google.protobuf.Empty;
import java.io.IOException;
import java.util.List;
import javax.annotation.Generated;

// AUTO-GENERATED DOCUMENTATION AND CLASS
/**
 * Settings class to configure an instance of {@link EndpointServiceClient}.
 *
 * <p>The default instance has everything set to sensible defaults:
 *
 * <ul>
 *   <li>The default service address (aiplatform.googleapis.com) and default port (443) are used.
 *   <li>Credentials are acquired automatically through Application Default Credentials.
 *   <li>Retries are configured for idempotent methods but not for non-idempotent methods.
 * </ul>
 *
 * <p>The builder of this class is recursive, so contained classes are themselves builders. When
 * build() is called, the tree of builders is called to create the complete settings object.
 *
 * <p>For example, to set the total timeout of getEndpoint to 30 seconds:
 *
 * <pre>
 * <code>
 * EndpointServiceSettings.Builder endpointServiceSettingsBuilder =
 *     EndpointServiceSettings.newBuilder();
 * endpointServiceSettingsBuilder
 *     .getEndpointSettings()
 *     .setRetrySettings(
 *         endpointServiceSettingsBuilder.getEndpointSettings().getRetrySettings().toBuilder()
 *             .setTotalTimeout(Duration.ofSeconds(30))
 *             .build());
 * EndpointServiceSettings endpointServiceSettings = endpointServiceSettingsBuilder.build();
 * </code>
 * </pre>
 */
@Generated("by gapic-generator")
@BetaApi
public class EndpointServiceSettings extends ClientSettings<EndpointServiceSettings> {
  /** Returns the object with the settings used for calls to createEndpoint. */
  public UnaryCallSettings<CreateEndpointRequest, Operation> createEndpointSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).createEndpointSettings();
  }

  /** Returns the object with the settings used for calls to createEndpoint. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<CreateEndpointRequest, Endpoint, CreateEndpointOperationMetadata>
      createEndpointOperationSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).createEndpointOperationSettings();
  }

  /** Returns the object with the settings used for calls to getEndpoint. */
  public UnaryCallSettings<GetEndpointRequest, Endpoint> getEndpointSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).getEndpointSettings();
  }

  /** Returns the object with the settings used for calls to listEndpoints. */
  public PagedCallSettings<ListEndpointsRequest, ListEndpointsResponse, ListEndpointsPagedResponse>
      listEndpointsSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).listEndpointsSettings();
  }

  /** Returns the object with the settings used for calls to updateEndpoint. */
  public UnaryCallSettings<UpdateEndpointRequest, Endpoint> updateEndpointSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).updateEndpointSettings();
  }

  /** Returns the object with the settings used for calls to deleteEndpoint. */
  public UnaryCallSettings<DeleteEndpointRequest, Operation> deleteEndpointSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).deleteEndpointSettings();
  }

  /** Returns the object with the settings used for calls to deleteEndpoint. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<DeleteEndpointRequest, Empty, DeleteOperationMetadata>
      deleteEndpointOperationSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).deleteEndpointOperationSettings();
  }

  /** Returns the object with the settings used for calls to deployModel. */
  public UnaryCallSettings<DeployModelRequest, Operation> deployModelSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).deployModelSettings();
  }

  /** Returns the object with the settings used for calls to deployModel. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          DeployModelRequest, DeployModelResponse, DeployModelOperationMetadata>
      deployModelOperationSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).deployModelOperationSettings();
  }

  /** Returns the object with the settings used for calls to undeployModel. */
  public UnaryCallSettings<UndeployModelRequest, Operation> undeployModelSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).undeployModelSettings();
  }

  /** Returns the object with the settings used for calls to undeployModel. */
  @BetaApi(
      "The surface for long-running operations is not stable yet and may change in the future.")
  public OperationCallSettings<
          UndeployModelRequest, UndeployModelResponse, UndeployModelOperationMetadata>
      undeployModelOperationSettings() {
    return ((EndpointServiceStubSettings) getStubSettings()).undeployModelOperationSettings();
  }

  public static final EndpointServiceSettings create(EndpointServiceStubSettings stub)
      throws IOException {
    return new EndpointServiceSettings.Builder(stub.toBuilder()).build();
  }

  /** Returns a builder for the default ExecutorProvider for this service. */
  public static InstantiatingExecutorProvider.Builder defaultExecutorProviderBuilder() {
    return EndpointServiceStubSettings.defaultExecutorProviderBuilder();
  }

  /** Returns the default service endpoint. */
  public static String getDefaultEndpoint() {
    return EndpointServiceStubSettings.getDefaultEndpoint();
  }

  /** Returns the default service scopes. */
  public static List<String> getDefaultServiceScopes() {
    return EndpointServiceStubSettings.getDefaultServiceScopes();
  }

  /** Returns a builder for the default credentials for this service. */
  public static GoogleCredentialsProvider.Builder defaultCredentialsProviderBuilder() {
    return EndpointServiceStubSettings.defaultCredentialsProviderBuilder();
  }

  /** Returns a builder for the default ChannelProvider for this service. */
  public static InstantiatingGrpcChannelProvider.Builder defaultGrpcTransportProviderBuilder() {
    return EndpointServiceStubSettings.defaultGrpcTransportProviderBuilder();
  }

  public static TransportChannelProvider defaultTransportChannelProvider() {
    return EndpointServiceStubSettings.defaultTransportChannelProvider();
  }

  @BetaApi("The surface for customizing headers is not stable yet and may change in the future.")
  public static ApiClientHeaderProvider.Builder defaultApiClientHeaderProviderBuilder() {
    return EndpointServiceStubSettings.defaultApiClientHeaderProviderBuilder();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder() {
    return Builder.createDefault();
  }

  /** Returns a new builder for this class. */
  public static Builder newBuilder(ClientContext clientContext) {
    return new Builder(clientContext);
  }

  /** Returns a builder containing all the values of this settings class. */
  public Builder toBuilder() {
    return new Builder(this);
  }

  protected EndpointServiceSettings(Builder settingsBuilder) throws IOException {
    super(settingsBuilder);
  }

  /** Builder for EndpointServiceSettings. */
  public static class Builder extends ClientSettings.Builder<EndpointServiceSettings, Builder> {
    protected Builder() throws IOException {
      this((ClientContext) null);
    }

    protected Builder(ClientContext clientContext) {
      super(EndpointServiceStubSettings.newBuilder(clientContext));
    }

    private static Builder createDefault() {
      return new Builder(EndpointServiceStubSettings.newBuilder());
    }

    protected Builder(EndpointServiceSettings settings) {
      super(settings.getStubSettings().toBuilder());
    }

    protected Builder(EndpointServiceStubSettings.Builder stubSettings) {
      super(stubSettings);
    }

    public EndpointServiceStubSettings.Builder getStubSettingsBuilder() {
      return ((EndpointServiceStubSettings.Builder) getStubSettings());
    }

    // NEXT_MAJOR_VER: remove 'throws Exception'
    /**
     * Applies the given settings updater function to all of the unary API methods in this service.
     *
     * <p>Note: This method does not support applying settings to streaming methods.
     */
    public Builder applyToAllUnaryMethods(
        ApiFunction<UnaryCallSettings.Builder<?, ?>, Void> settingsUpdater) throws Exception {
      super.applyToAllUnaryMethods(
          getStubSettingsBuilder().unaryMethodSettingsBuilders(), settingsUpdater);
      return this;
    }

    /** Returns the builder for the settings used for calls to createEndpoint. */
    public UnaryCallSettings.Builder<CreateEndpointRequest, Operation> createEndpointSettings() {
      return getStubSettingsBuilder().createEndpointSettings();
    }

    /** Returns the builder for the settings used for calls to createEndpoint. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            CreateEndpointRequest, Endpoint, CreateEndpointOperationMetadata>
        createEndpointOperationSettings() {
      return getStubSettingsBuilder().createEndpointOperationSettings();
    }

    /** Returns the builder for the settings used for calls to getEndpoint. */
    public UnaryCallSettings.Builder<GetEndpointRequest, Endpoint> getEndpointSettings() {
      return getStubSettingsBuilder().getEndpointSettings();
    }

    /** Returns the builder for the settings used for calls to listEndpoints. */
    public PagedCallSettings.Builder<
            ListEndpointsRequest, ListEndpointsResponse, ListEndpointsPagedResponse>
        listEndpointsSettings() {
      return getStubSettingsBuilder().listEndpointsSettings();
    }

    /** Returns the builder for the settings used for calls to updateEndpoint. */
    public UnaryCallSettings.Builder<UpdateEndpointRequest, Endpoint> updateEndpointSettings() {
      return getStubSettingsBuilder().updateEndpointSettings();
    }

    /** Returns the builder for the settings used for calls to deleteEndpoint. */
    public UnaryCallSettings.Builder<DeleteEndpointRequest, Operation> deleteEndpointSettings() {
      return getStubSettingsBuilder().deleteEndpointSettings();
    }

    /** Returns the builder for the settings used for calls to deleteEndpoint. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<DeleteEndpointRequest, Empty, DeleteOperationMetadata>
        deleteEndpointOperationSettings() {
      return getStubSettingsBuilder().deleteEndpointOperationSettings();
    }

    /** Returns the builder for the settings used for calls to deployModel. */
    public UnaryCallSettings.Builder<DeployModelRequest, Operation> deployModelSettings() {
      return getStubSettingsBuilder().deployModelSettings();
    }

    /** Returns the builder for the settings used for calls to deployModel. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            DeployModelRequest, DeployModelResponse, DeployModelOperationMetadata>
        deployModelOperationSettings() {
      return getStubSettingsBuilder().deployModelOperationSettings();
    }

    /** Returns the builder for the settings used for calls to undeployModel. */
    public UnaryCallSettings.Builder<UndeployModelRequest, Operation> undeployModelSettings() {
      return getStubSettingsBuilder().undeployModelSettings();
    }

    /** Returns the builder for the settings used for calls to undeployModel. */
    @BetaApi(
        "The surface for long-running operations is not stable yet and may change in the future.")
    public OperationCallSettings.Builder<
            UndeployModelRequest, UndeployModelResponse, UndeployModelOperationMetadata>
        undeployModelOperationSettings() {
      return getStubSettingsBuilder().undeployModelOperationSettings();
    }

    @Override
    public EndpointServiceSettings build() throws IOException {
      return new EndpointServiceSettings(this);
    }
  }
}
