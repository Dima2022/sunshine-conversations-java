/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.LinkRequestResponseLinkRequests;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * LinkRequestResponse
 */

public class LinkRequestResponse {
  @SerializedName("linkRequests")
  private List<LinkRequestResponseLinkRequests> linkRequests = null;

  public LinkRequestResponse linkRequests(List<LinkRequestResponseLinkRequests> linkRequests) {
    this.linkRequests = linkRequests;
    return this;
  }

  public LinkRequestResponse addLinkRequestsItem(LinkRequestResponseLinkRequests linkRequestsItem) {
    if (this.linkRequests == null) {
      this.linkRequests = new ArrayList<LinkRequestResponseLinkRequests>();
    }
    this.linkRequests.add(linkRequestsItem);
    return this;
  }

   /**
   * The list of link requests.
   * @return linkRequests
  **/
  @ApiModelProperty(value = "The list of link requests.")
  public List<LinkRequestResponseLinkRequests> getLinkRequests() {
    return linkRequests;
  }

  public void setLinkRequests(List<LinkRequestResponseLinkRequests> linkRequests) {
    this.linkRequests = linkRequests;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinkRequestResponse linkRequestResponse = (LinkRequestResponse) o;
    return Objects.equals(this.linkRequests, linkRequestResponse.linkRequests);
  }

  @Override
  public int hashCode() {
    return Objects.hash(linkRequests);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinkRequestResponse {\n");
    
    sb.append("    linkRequests: ").append(toIndentedString(linkRequests)).append("\n");
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

