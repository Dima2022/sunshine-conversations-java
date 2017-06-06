/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1.5
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
import io.smooch.client.model.Destination;
import io.smooch.client.model.MessageItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * MessagePost
 */

public class MessagePost {
  @SerializedName("role")
  private String role = null;

  /**
   * The message type.
   */
  public enum TypeEnum {
    @SerializedName("text")
    TEXT("text"),
    
    @SerializedName("image")
    IMAGE("image"),
    
    @SerializedName("carousel")
    CAROUSEL("carousel"),
    
    @SerializedName("list")
    LIST("list");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("avatarUrl")
  private String avatarUrl = null;

  @SerializedName("metadata")
  private Object metadata = null;

  @SerializedName("payload")
  private String payload = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("mediaUrl")
  private String mediaUrl = null;

  @SerializedName("mediaType")
  private String mediaType = null;

  @SerializedName("items")
  private List<MessageItem> items = null;

  @SerializedName("actions")
  private List<Action> actions = null;

  @SerializedName("destination")
  private Destination destination = null;

  public MessagePost role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the individual posting the message. Can be either *appUser* or *appMaker*.
   * @return role
  **/
  @ApiModelProperty(required = true, value = "The role of the individual posting the message. Can be either *appUser* or *appMaker*.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public MessagePost type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * The message type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The message type.")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public MessagePost name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name of the message author.
   * @return name
  **/
  @ApiModelProperty(value = "The display name of the message author.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public MessagePost email(String email) {
    this.email = email;
    return this;
  }

   /**
   * The email address of the message author.
   * @return email
  **/
  @ApiModelProperty(value = "The email address of the message author.")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public MessagePost avatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
    return this;
  }

   /**
   * The URL of the desired message avatar image.
   * @return avatarUrl
  **/
  @ApiModelProperty(value = "The URL of the desired message avatar image.")
  public String getAvatarUrl() {
    return avatarUrl;
  }

  public void setAvatarUrl(String avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public MessagePost metadata(Object metadata) {
    this.metadata = metadata;
    return this;
  }

   /**
   * Flat JSON object containing any custom properties associated with the message.
   * @return metadata
  **/
  @ApiModelProperty(value = "Flat JSON object containing any custom properties associated with the message.")
  public Object getMetadata() {
    return metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }

  public MessagePost payload(String payload) {
    this.payload = payload;
    return this;
  }

   /**
   * The payload of a reply action, if applicable.
   * @return payload
  **/
  @ApiModelProperty(value = "The payload of a reply action, if applicable.")
  public String getPayload() {
    return payload;
  }

  public void setPayload(String payload) {
    this.payload = payload;
  }

  public MessagePost text(String text) {
    this.text = text;
    return this;
  }

   /**
   * The message text. Required for text messages. 
   * @return text
  **/
  @ApiModelProperty(value = "The message text. Required for text messages. ")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MessagePost mediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
    return this;
  }

   /**
   * The mediaUrl for the image. Required for image messages. 
   * @return mediaUrl
  **/
  @ApiModelProperty(value = "The mediaUrl for the image. Required for image messages. ")
  public String getMediaUrl() {
    return mediaUrl;
  }

  public void setMediaUrl(String mediaUrl) {
    this.mediaUrl = mediaUrl;
  }

  public MessagePost mediaType(String mediaType) {
    this.mediaType = mediaType;
    return this;
  }

   /**
   * The mediaType for the image. Required for image messages. 
   * @return mediaType
  **/
  @ApiModelProperty(value = "The mediaType for the image. Required for image messages. ")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public MessagePost items(List<MessageItem> items) {
    this.items = items;
    return this;
  }

  public MessagePost addItemsItem(MessageItem itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<MessageItem>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * The items in the message list. Required for carousel and list messages. 
   * @return items
  **/
  @ApiModelProperty(value = "The items in the message list. Required for carousel and list messages. ")
  public List<MessageItem> getItems() {
    return items;
  }

  public void setItems(List<MessageItem> items) {
    this.items = items;
  }

  public MessagePost actions(List<Action> actions) {
    this.actions = actions;
    return this;
  }

  public MessagePost addActionsItem(Action actionsItem) {
    if (this.actions == null) {
      this.actions = new ArrayList<Action>();
    }
    this.actions.add(actionsItem);
    return this;
  }

   /**
   * The actions in the message.
   * @return actions
  **/
  @ApiModelProperty(value = "The actions in the message.")
  public List<Action> getActions() {
    return actions;
  }

  public void setActions(List<Action> actions) {
    this.actions = actions;
  }

  public MessagePost destination(Destination destination) {
    this.destination = destination;
    return this;
  }

   /**
   * Specifies which channel to deliver a message to. See [list integrations](https://docs.smooch.io/rest/#list-integrations) to get integration ID and type.
   * @return destination
  **/
  @ApiModelProperty(value = "Specifies which channel to deliver a message to. See [list integrations](https://docs.smooch.io/rest/#list-integrations) to get integration ID and type.")
  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessagePost messagePost = (MessagePost) o;
    return Objects.equals(this.role, messagePost.role) &&
        Objects.equals(this.type, messagePost.type) &&
        Objects.equals(this.name, messagePost.name) &&
        Objects.equals(this.email, messagePost.email) &&
        Objects.equals(this.avatarUrl, messagePost.avatarUrl) &&
        Objects.equals(this.metadata, messagePost.metadata) &&
        Objects.equals(this.payload, messagePost.payload) &&
        Objects.equals(this.text, messagePost.text) &&
        Objects.equals(this.mediaUrl, messagePost.mediaUrl) &&
        Objects.equals(this.mediaType, messagePost.mediaType) &&
        Objects.equals(this.items, messagePost.items) &&
        Objects.equals(this.actions, messagePost.actions) &&
        Objects.equals(this.destination, messagePost.destination);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, type, name, email, avatarUrl, metadata, payload, text, mediaUrl, mediaType, items, actions, destination);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessagePost {\n");
    
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    mediaUrl: ").append(toIndentedString(mediaUrl)).append("\n");
    sb.append("    mediaType: ").append(toIndentedString(mediaType)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
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

