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

package aiplatform;

import static com.google.common.truth.Truth.assertThat;
import static junit.framework.TestCase.assertNotNull;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GetModelEvaluationSampleTest {

  private static final String PROJECT = System.getenv("CAIP_PROJECT_ID");
  private static final String MODEL_ID = System.getenv("MODEL_EVALUATION_SAMPLE_MODEL_ID");
  private static final String EVALUATION_ID =
      System.getenv("MODEL_EVALUATION_SAMPLE_EVALUATION_ID");
  private ByteArrayOutputStream bout;
  private PrintStream out;
  private PrintStream originalPrintStream;

  private static void requireEnvVar(String varName) {
    String errorMessage =
        String.format("Environment variable '%s' is required to perform these tests.", varName);
    assertNotNull(errorMessage, System.getenv(varName));
  }

  @BeforeClass
  public static void checkRequirements() {
    requireEnvVar("GOOGLE_APPLICATION_CREDENTIALS");
    requireEnvVar("CAIP_PROJECT_ID");
    requireEnvVar("MODEL_EVALUATION_SAMPLE_MODEL_ID");
    requireEnvVar("MODEL_EVALUATION_SAMPLE_EVALUATION_ID");
  }

  @Before
  public void setUp() {
    bout = new ByteArrayOutputStream();
    out = new PrintStream(bout);
    originalPrintStream = System.out;
    System.setOut(out);
  }

  @After
  public void tearDown() {
    System.out.flush();
    System.setOut(originalPrintStream);
  }

  @Test
  public void testGetModelEvaluationSample() throws IOException {
    // Act
    GetModelEvaluationSample.getModelEvaluationSample(PROJECT, MODEL_ID, EVALUATION_ID);

    // Assert
    String got = bout.toString();
    assertThat(got).contains(MODEL_ID);
    assertThat(got).contains("Get Model Evaluation Response");
  }
}
