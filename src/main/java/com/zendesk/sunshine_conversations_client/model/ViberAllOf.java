/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.4.5
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ViberAllOf
 */
@JsonPropertyOrder({
  ViberAllOf.JSON_PROPERTY_TYPE,
  ViberAllOf.JSON_PROPERTY_TOKEN,
  ViberAllOf.JSON_PROPERTY_URI,
  ViberAllOf.JSON_PROPERTY_ACCOUNT_ID
})

public class ViberAllOf {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "viber";

  public static final String JSON_PROPERTY_TOKEN = "token";
  private String token;

  public static final String JSON_PROPERTY_URI = "uri";
  private String uri;

  public static final String JSON_PROPERTY_ACCOUNT_ID = "accountId";
  private String accountId;


  public ViberAllOf type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a Viber integration, acquire the Viber Public Account token from the user and call the Create Integration endpoint. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To configure a Viber integration, acquire the Viber Public Account token from the user and call the Create Integration endpoint. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public ViberAllOf token(String token) {
    
    this.token = token;
    return this;
  }

   /**
   * Viber Public Account token.
   * @return token
  **/
  @ApiModelProperty(example = "445da6az1s345z78-dazcczb2542zv51a-e0vc5fva17480im9", required = true, value = "Viber Public Account token.")
  @JsonProperty(JSON_PROPERTY_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getToken() {
    return token;
  }


  public void setToken(String token) {
    this.token = token;
  }


   /**
   * Unique URI of the Viber account.
   * @return uri
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique URI of the Viber account.")
  @JsonProperty(JSON_PROPERTY_URI)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUri() {
    return uri;
  }




   /**
   * Unique ID of the Viber account.
   * @return accountId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Unique ID of the Viber account.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAccountId() {
    return accountId;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ViberAllOf viberAllOf = (ViberAllOf) o;
    return Objects.equals(this.type, viberAllOf.type) &&
        Objects.equals(this.token, viberAllOf.token) &&
        Objects.equals(this.uri, viberAllOf.uri) &&
        Objects.equals(this.accountId, viberAllOf.accountId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, token, uri, accountId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ViberAllOf {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
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

