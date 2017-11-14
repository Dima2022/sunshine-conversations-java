/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 2.5
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Action;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MessageItem
 */

public class MessageItem {
  @SerializedName("title")
  private String title = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("mediaUrl")
  private String mediaUrl = null;

  @SerializedName("size")
  private String size = null;

  @SerializedName("mediaType")
  private String mediaType = null;

  @SerializedName("actions")
  private List<Action> actions = new ArrayList<Action>();

  public MessageItem title(String title) {
    this.title = title;
    return this;
  }

   /**
   * The title of the message item.
   * @return title
  **/
  @ApiModelProperty(required = true, value = "The title of the message item.")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MessageItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * The text description, or subtitle.
   * @return description
  **/
  @ApiModelProperty(value = "The text description, or subtitle.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public MessageItem mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The image URL to be shown in the carousel/list item.
   * @return mediaUrl
  **/
  @ApiModelProperty(value = "The image URL to be shown in the carousel/list item.")
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public MessageItem size(String size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the image to be shown in the carousel/list item. Only top item of Facebook Messenger carousel supported. Choose from *compact* and *large*. 
   * @return size
  **/
  @ApiModelProperty(value = "The size of the image to be shown in the carousel/list item. Only top item of Facebook Messenger carousel supported. Choose from *compact* and *large*. ")
  public String getSize() {
    return size;
  }

  public void setSize(String size) {
    this.size = size;
  }

  public MessageItem mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * If a *mediaUrl* was specified, the media type is defined here, for example *image/jpeg*.
   * @return mediaType
  **/
  @ApiModelProperty(value = "If a *mediaUrl* was specified, the media type is defined here, for example *image/jpeg*.")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public MessageItem actions(List<Action> actions) {
    this.actions = actions;
    return this;
  }

  public MessageItem addActionsItem(Action actionsItem) {
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * Array of [action buttons](https://docs.smooch.io/rest/#action-buttons). At least 1 is required, a maximum of 3 are allowed.
   * @return actions
  **/
  @ApiModelProperty(required = true, value = "Array of [action buttons](https://docs.smooch.io/rest/#action-buttons). At least 1 is required, a maximum of 3 are allowed.")
  public List<Action> getActions() {
    return actions;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageItem messageItem = (MessageItem) o;
    return Objects.equals(this.title, messageItem.title) &&
        Objects.equals(this.description, messageItem.description) &&
        Objects.equals(this.mediaUrl, messageItem.mediaUrl) &&
        Objects.equals(this.size, messageItem.size) &&
        Objects.equals(this.mediaType, messageItem.mediaType) &&
        Objects.equals(this.actions, messageItem.actions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, description, mediaUrl, size, mediaType, actions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageItem {\n");
    
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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

