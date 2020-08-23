/*
 * WireMock
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.26.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
/**
 * InlineResponse2004Scenarios
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2020-08-02T03:16:43.324Z[GMT]")
public class InlineResponse2004Scenarios {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("possibleStates")
  private List<String> possibleStates = null;

  @SerializedName("state")
  private String state = "Started";

  public InlineResponse2004Scenarios id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The scenario ID
   * @return id
  **/
  @Schema(example = "c8d249ec-d86d-48b1-88a8-a660e6848042", description = "The scenario ID")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InlineResponse2004Scenarios name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The scenario name
   * @return name
  **/
  @Schema(example = "my_scenario", description = "The scenario name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InlineResponse2004Scenarios possibleStates(List<String> possibleStates) {
    this.possibleStates = possibleStates;
    return this;
  }

  public InlineResponse2004Scenarios addPossibleStatesItem(String possibleStatesItem) {
    if (this.possibleStates == null) {
      this.possibleStates = new ArrayList<String>();
    }
    this.possibleStates.add(possibleStatesItem);
    return this;
  }

   /**
   * Get possibleStates
   * @return possibleStates
  **/
  @Schema(example = "[\"Started\",\"state_1\",\"state_2\"]", description = "")
  public List<String> getPossibleStates() {
    return possibleStates;
  }

  public void setPossibleStates(List<String> possibleStates) {
    this.possibleStates = possibleStates;
  }

  public InlineResponse2004Scenarios state(String state) {
    this.state = state;
    return this;
  }

   /**
   * The current state of this scenario
   * @return state
  **/
  @Schema(example = "state_2", description = "The current state of this scenario")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Scenarios inlineResponse2004Scenarios = (InlineResponse2004Scenarios) o;
    return Objects.equals(this.id, inlineResponse2004Scenarios.id) &&
        Objects.equals(this.name, inlineResponse2004Scenarios.name) &&
        Objects.equals(this.possibleStates, inlineResponse2004Scenarios.possibleStates) &&
        Objects.equals(this.state, inlineResponse2004Scenarios.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, possibleStates, state);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Scenarios {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    possibleStates: ").append(toIndentedString(possibleStates)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}