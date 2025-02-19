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
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * AttachmentMediaTokenBody
 */
@JsonPropertyOrder({
  AttachmentMediaTokenBody.JSON_PROPERTY_PATHS
})

public class AttachmentMediaTokenBody {
  public static final String JSON_PROPERTY_PATHS = "paths";
  private List<String> paths = new ArrayList<>();


  public AttachmentMediaTokenBody paths(List<String> paths) {
    
    this.paths = paths;
    return this;
  }

  public AttachmentMediaTokenBody addPathsItem(String pathsItem) {
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * An array of strings representing the list of attachment paths used to generate the media JWT. One token will be generated for each path. Each token will be valid for 2 hours by default. This value can be modified, see [App Settings](#operation/createApp) for more information.
   * @return paths
  **/
  @ApiModelProperty(required = true, value = "An array of strings representing the list of attachment paths used to generate the media JWT. One token will be generated for each path. Each token will be valid for 2 hours by default. This value can be modified, see [App Settings](#operation/createApp) for more information.")
  @JsonProperty(JSON_PROPERTY_PATHS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getPaths() {
    return paths;
  }


  public void setPaths(List<String> paths) {
    this.paths = paths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentMediaTokenBody attachmentMediaTokenBody = (AttachmentMediaTokenBody) o;
    return Objects.equals(this.paths, attachmentMediaTokenBody.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentMediaTokenBody {\n");
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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

