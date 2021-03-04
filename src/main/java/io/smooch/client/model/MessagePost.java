/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.33
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
import io.smooch.client.model.Coordinates;
import io.smooch.client.model.Destination;
import io.smooch.client.model.DisplaySettings;
import io.smooch.client.model.FieldPost;
import io.smooch.client.model.Location;
import io.smooch.client.model.MessageItem;
import io.smooch.client.model.MessageOverride;
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

  @SerializedName("type")
  private String type = null;

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

  @SerializedName("altText")
  private String altText = null;

  @SerializedName("items")
  private List<MessageItem> items = null;

  @SerializedName("actions")
  private List<Action> actions = null;

  @SerializedName("blockChatInput")
  private Boolean blockChatInput = null;

  @SerializedName("displaySettings")
  private DisplaySettings displaySettings = null;

  @SerializedName("fields")
  private List<FieldPost> fields = null;

  @SerializedName("destination")
  private Destination destination = null;

  @SerializedName("override")
  private MessageOverride override = null;

  @SerializedName("coordinates")
  private Coordinates coordinates = null;

  @SerializedName("location")
  private Location location = null;

  public MessagePost role(String role) {
    this.role = role;
    return this;
  }

   /**
   * The role of the individual posting the message. See [**RoleEnum**](Enums.md#RoleEnum) for available values.
   * @return role
  **/
  @ApiModelProperty(required = true, value = "The role of the individual posting the message. See [**RoleEnum**](Enums.md#RoleEnum) for available values.")
  public String getRole() {
    return role;
  }

  public void setRole(String role) {
    this.role = role;
  }

  public MessagePost type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The message type. See [**MessageTypeEnum**](Enums.md#MessageTypeEnum) for available values.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The message type. See [**MessageTypeEnum**](Enums.md#MessageTypeEnum) for available values.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
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
   * The mediaUrl for the message. Required for image/file messages. 
   * @return mediaUrl
  **/
  @ApiModelProperty(value = "The mediaUrl for the message. Required for image/file messages. ")
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
   * The mediaType for the message. Required for image/file messages. 
   * @return mediaType
  **/
  @ApiModelProperty(value = "The mediaType for the message. Required for image/file messages. ")
  public String getMediaType() {
    return mediaType;
  }

  public void setMediaType(String mediaType) {
    this.mediaType = mediaType;
  }

  public MessagePost altText(String altText) {
    this.altText = altText;
    return this;
  }

   /**
   * An optional description of the image or the file for accessibility purposes. The field will be saved by default with the file name as the value.
   * @return altText
  **/
  @ApiModelProperty(value = "An optional description of the image or the file for accessibility purposes. The field will be saved by default with the file name as the value.")
  public String getAltText() {
    return altText;
  }

  public void setAltText(String altText) {
    this.altText = altText;
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

  public MessagePost blockChatInput(Boolean blockChatInput) {
    this.blockChatInput = blockChatInput;
    return this;
  }

   /**
   * Indicates if the Web SDK chat input should be blocked. Defaults to false. Only for form messages. 
   * @return blockChatInput
  **/
  @ApiModelProperty(value = "Indicates if the Web SDK chat input should be blocked. Defaults to false. Only for form messages. ")
  public Boolean getBlockChatInput() {
    return blockChatInput;
  }

  public void setBlockChatInput(Boolean blockChatInput) {
    this.blockChatInput = blockChatInput;
  }

  public MessagePost displaySettings(DisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
    return this;
  }

   /**
   * Settings to adjust the carousel layout. See [Display Settings](https://docs.smooch.io/rest/#display-settings).
   * @return displaySettings
  **/
  @ApiModelProperty(value = "Settings to adjust the carousel layout. See [Display Settings](https://docs.smooch.io/rest/#display-settings).")
  public DisplaySettings getDisplaySettings() {
    return displaySettings;
  }

  public void setDisplaySettings(DisplaySettings displaySettings) {
    this.displaySettings = displaySettings;
  }

  public MessagePost fields(List<FieldPost> fields) {
    this.fields = fields;
    return this;
  }

  public MessagePost addFieldsItem(FieldPost fieldsItem) {
    if (this.fields == null) {
      this.fields = new ArrayList<FieldPost>();
    }
    this.fields.add(fieldsItem);
    return this;
  }

   /**
   * The fields in the form. Required for form messages. 
   * @return fields
  **/
  @ApiModelProperty(value = "The fields in the form. Required for form messages. ")
  public List<FieldPost> getFields() {
    return fields;
  }

  public void setFields(List<FieldPost> fields) {
    this.fields = fields;
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

  public MessagePost override(MessageOverride override) {
    this.override = override;
    return this;
  }

   /**
   * Specifies channel-specific overrides to use in order to bypass Smooch's message translation logic.
   * @return override
  **/
  @ApiModelProperty(value = "Specifies channel-specific overrides to use in order to bypass Smooch's message translation logic.")
  public MessageOverride getOverride() {
    return override;
  }

  public void setOverride(MessageOverride override) {
    this.override = override;
  }

  public MessagePost coordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
    return this;
  }

   /**
   * Data representing the location being sent in the message.
   * @return coordinates
  **/
  @ApiModelProperty(value = "Data representing the location being sent in the message.")
  public Coordinates getCoordinates() {
    return coordinates;
  }

  public void setCoordinates(Coordinates coordinates) {
    this.coordinates = coordinates;
  }

  public MessagePost location(Location location) {
    this.location = location;
    return this;
  }

   /**
   * Additional information about the location being sent in the message.
   * @return location
  **/
  @ApiModelProperty(value = "Additional information about the location being sent in the message.")
  public Location getLocation() {
    return location;
  }

  public void setLocation(Location location) {
    this.location = location;
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
        Objects.equals(this.altText, messagePost.altText) &&
        Objects.equals(this.items, messagePost.items) &&
        Objects.equals(this.actions, messagePost.actions) &&
        Objects.equals(this.blockChatInput, messagePost.blockChatInput) &&
        Objects.equals(this.displaySettings, messagePost.displaySettings) &&
        Objects.equals(this.fields, messagePost.fields) &&
        Objects.equals(this.destination, messagePost.destination) &&
        Objects.equals(this.override, messagePost.override) &&
        Objects.equals(this.coordinates, messagePost.coordinates) &&
        Objects.equals(this.location, messagePost.location);
  }

  @Override
  public int hashCode() {
    return Objects.hash(role, type, name, email, avatarUrl, metadata, payload, text, mediaUrl, mediaType, altText, items, actions, blockChatInput, displaySettings, fields, destination, override, coordinates, location);
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
    sb.append("    altText: ").append(toIndentedString(altText)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
    sb.append("    blockChatInput: ").append(toIndentedString(blockChatInput)).append("\n");
    sb.append("    displaySettings: ").append(toIndentedString(displaySettings)).append("\n");
    sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    override: ").append(toIndentedString(override)).append("\n");
    sb.append("    coordinates: ").append(toIndentedString(coordinates)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
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

