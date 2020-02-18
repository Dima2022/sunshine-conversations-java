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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * AttachmentResponse
 */

public class AttachmentResponse {
  @SerializedName("mediaUrl")
  private String mediaUrl = null;

  @SerializedName("mediaType")
  private String mediaType = null;

  public AttachmentResponse mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The mediaUrl for the message. Required for image/file messages. 
   * @return mediaUrl
  **/
  @ApiModelProperty(required = true, value = "The mediaUrl for the message. Required for image/file messages. ")
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public AttachmentResponse mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The mediaType for the message. Required for image/file messages. 
   * @return mediaType
  **/
  @ApiModelProperty(required = true, value = "The mediaType for the message. Required for image/file messages. ")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AttachmentResponse attachmentResponse = (AttachmentResponse) o;
    return Objects.equals(this.mediaUrl, attachmentResponse.mediaUrl) &&
        Objects.equals(this.mediaType, attachmentResponse.mediaType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mediaUrl, mediaType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AttachmentResponse {\n");
    
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
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

