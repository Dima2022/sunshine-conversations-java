/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.4.2
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
import com.zendesk.sunshine_conversations_client.model.ClientType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ClientAssociation
 */
@JsonPropertyOrder({
  ClientAssociation.JSON_PROPERTY_TYPE,
  ClientAssociation.JSON_PROPERTY_CLIENT_ID
})

public class ClientAssociation {
  public static final String JSON_PROPERTY_TYPE = "type";
  private ClientType type;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;


  public ClientAssociation type(ClientType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ClientType getType() {
    return type;
  }


  public void setType(ClientType type) {
    this.type = type;
  }


  public ClientAssociation clientId(String clientId) {
    
    this.clientId = clientId;
    return this;
  }

   /**
   * The id of the client being referenced.
   * @return clientId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "42589ad070d43be9b00ff7e5", value = "The id of the client being referenced.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getClientId() {
    return clientId;
  }


  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientAssociation clientAssociation = (ClientAssociation) o;
    return Objects.equals(this.type, clientAssociation.type) &&
        Objects.equals(this.clientId, clientAssociation.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, clientId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientAssociation {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

