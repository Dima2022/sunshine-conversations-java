/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.22
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.BusinessSystemItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AppUserBusinessSystemsResponse
 */

public class AppUserBusinessSystemsResponse {
  @SerializedName("businessSystems")
  private List<BusinessSystemItem> businessSystems = new ArrayList<BusinessSystemItem>();

  public AppUserBusinessSystemsResponse businessSystems(List<BusinessSystemItem> businessSystems) {
    this.businessSystems = businessSystems;
    return this;
  }

  public AppUserBusinessSystemsResponse addBusinessSystemsItem(BusinessSystemItem businessSystemsItem) {
    this.businessSystems.add(businessSystemsItem);
    return this;
  }

   /**
   * An array of objects containing the business system type and the id.
   * @return businessSystems
  **/
  @ApiModelProperty(required = true, value = "An array of objects containing the business system type and the id.")
  public List<BusinessSystemItem> getBusinessSystems() {
    return businessSystems;
  }

  public void setBusinessSystems(List<BusinessSystemItem> businessSystems) {
    this.businessSystems = businessSystems;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUserBusinessSystemsResponse appUserBusinessSystemsResponse = (AppUserBusinessSystemsResponse) o;
    return Objects.equals(this.businessSystems, appUserBusinessSystemsResponse.businessSystems);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessSystems);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserBusinessSystemsResponse {\n");
    
    sb.append("    businessSystems: ").append(toIndentedString(businessSystems)).append("\n");
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

