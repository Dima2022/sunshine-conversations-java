/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.zendesk.sunshine_conversations_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.SwitchboardIntegration;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * SwitchboardIntegrationResponse
 */
@JsonPropertyOrder({
  SwitchboardIntegrationResponse.JSON_PROPERTY_SWITCHBOARD_INTEGRATION
})

public class SwitchboardIntegrationResponse {
  public static final String JSON_PROPERTY_SWITCHBOARD_INTEGRATION = "switchboardIntegration";
  private SwitchboardIntegration switchboardIntegration = null;


  public SwitchboardIntegrationResponse switchboardIntegration(SwitchboardIntegration switchboardIntegration) {
    
    this.switchboardIntegration = switchboardIntegration;
    return this;
  }

   /**
   * The switchboard integration.
   * @return switchboardIntegration
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The switchboard integration.")
  @JsonProperty(JSON_PROPERTY_SWITCHBOARD_INTEGRATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SwitchboardIntegration getSwitchboardIntegration() {
    return switchboardIntegration;
  }


  public void setSwitchboardIntegration(SwitchboardIntegration switchboardIntegration) {
    this.switchboardIntegration = switchboardIntegration;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SwitchboardIntegrationResponse switchboardIntegrationResponse = (SwitchboardIntegrationResponse) o;
    return Objects.equals(this.switchboardIntegration, switchboardIntegrationResponse.switchboardIntegration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(switchboardIntegration);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SwitchboardIntegrationResponse {\n");
    sb.append("    switchboardIntegration: ").append(toIndentedString(switchboardIntegration)).append("\n");
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

