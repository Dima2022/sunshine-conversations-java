/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.34
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * LinkRequestResponseLinkRequests
 */

public class LinkRequestResponseLinkRequests {
  @SerializedName("integrationId")
  private String integrationId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("url")
  private String url = null;

  public LinkRequestResponseLinkRequests integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The integration ID.
   * @return integrationId
  **/
  @ApiModelProperty(required = true, value = "The integration ID.")
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public LinkRequestResponseLinkRequests type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The integration type. See [**IntegrationTypeEnum**](Enums.md#IntegrationTypeEnum) for available values.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The integration type. See [**IntegrationTypeEnum**](Enums.md#IntegrationTypeEnum) for available values.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LinkRequestResponseLinkRequests code(String code) {
    this.code = code;
    return this;
  }

   /**
   * The link request code.
   * @return code
  **/
  @ApiModelProperty(required = true, value = "The link request code.")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public LinkRequestResponseLinkRequests url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The link request url.
   * @return url
  **/
  @ApiModelProperty(required = true, value = "The link request url.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkRequestResponseLinkRequests linkRequestResponseLinkRequests = (LinkRequestResponseLinkRequests) o;
    return Objects.equals(this.integrationId, linkRequestResponseLinkRequests.integrationId) &&
        Objects.equals(this.type, linkRequestResponseLinkRequests.type) &&
        Objects.equals(this.code, linkRequestResponseLinkRequests.code) &&
        Objects.equals(this.url, linkRequestResponseLinkRequests.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(integrationId, type, code, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkRequestResponseLinkRequests {\n");
    
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

