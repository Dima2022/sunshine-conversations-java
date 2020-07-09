/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha.1
 * Contact: hello@smooch.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.smooch.v2.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.smooch.v2.client.model.ConversationType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Conversation
 */
@JsonPropertyOrder({
  Conversation.JSON_PROPERTY_ID,
  Conversation.JSON_PROPERTY_TYPE,
  Conversation.JSON_PROPERTY_IS_DEFAULT,
  Conversation.JSON_PROPERTY_DISPLAY_NAME,
  Conversation.JSON_PROPERTY_METADATA,
  Conversation.JSON_PROPERTY_APP_MAKER_LAST_READ,
  Conversation.JSON_PROPERTY_LAST_UPDATED_AT
})

public class Conversation {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_TYPE = "type";
  private ConversationType type;

  public static final String JSON_PROPERTY_IS_DEFAULT = "isDefault";
  private Boolean isDefault;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();

  public static final String JSON_PROPERTY_APP_MAKER_LAST_READ = "appMakerLastRead";
  private JsonNullable<String> appMakerLastRead = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_LAST_UPDATED_AT = "lastUpdatedAt";
  private JsonNullable<String> lastUpdatedAt = JsonNullable.<String>undefined();


  public Conversation id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the conversation.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "c93bb9c14dde8ffb94564eae", value = "The unique ID of the conversation.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Conversation type(ConversationType type) {
    
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

  public ConversationType getType() {
    return type;
  }


  public void setType(ConversationType type) {
    this.type = type;
  }


  public Conversation isDefault(Boolean isDefault) {
    
    this.isDefault = isDefault;
    return this;
  }

   /**
   * Whether the conversation is the default conversation for the user. Will be rue for the first personal conversation created for the user, and false in all other cases. 
   * @return isDefault
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Whether the conversation is the default conversation for the user. Will be rue for the first personal conversation created for the user, and false in all other cases. ")
  @JsonProperty(JSON_PROPERTY_IS_DEFAULT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsDefault() {
    return isDefault;
  }


  public void setIsDefault(Boolean isDefault) {
    this.isDefault = isDefault;
  }


  public Conversation displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * A friendly name for the conversation, may be displayed to the business or the user. 
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A friendly name for the conversation, may be displayed to the business or the user. ")
  @JsonProperty(JSON_PROPERTY_DISPLAY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public Conversation metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"ref\":4213572}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  public Conversation appMakerLastRead(String appMakerLastRead) {
    this.appMakerLastRead = JsonNullable.<String>of(appMakerLastRead);
    
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the conversation was last marked as read with role appMaker. 
   * @return appMakerLastRead
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the conversation was last marked as read with role appMaker. ")
  @JsonIgnore

  public String getAppMakerLastRead() {
        return appMakerLastRead.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_APP_MAKER_LAST_READ)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getAppMakerLastRead_JsonNullable() {
    return appMakerLastRead;
  }
  
  @JsonProperty(JSON_PROPERTY_APP_MAKER_LAST_READ)
  public void setAppMakerLastRead_JsonNullable(JsonNullable<String> appMakerLastRead) {
    this.appMakerLastRead = appMakerLastRead;
  }

  public void setAppMakerLastRead(String appMakerLastRead) {
    this.appMakerLastRead = JsonNullable.<String>of(appMakerLastRead);
  }


  public Conversation lastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = JsonNullable.<String>of(lastUpdatedAt);
    
    return this;
  }

   /**
   * A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the last message was received in the conversation, or the creation time if no messages have been received yet. 
   * @return lastUpdatedAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A datetime string with the format YYYY-MM-DDThh:mm:ss.SSSZ representing the moment the last message was received in the conversation, or the creation time if no messages have been received yet. ")
  @JsonIgnore

  public String getLastUpdatedAt() {
        return lastUpdatedAt.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getLastUpdatedAt_JsonNullable() {
    return lastUpdatedAt;
  }
  
  @JsonProperty(JSON_PROPERTY_LAST_UPDATED_AT)
  public void setLastUpdatedAt_JsonNullable(JsonNullable<String> lastUpdatedAt) {
    this.lastUpdatedAt = lastUpdatedAt;
  }

  public void setLastUpdatedAt(String lastUpdatedAt) {
    this.lastUpdatedAt = JsonNullable.<String>of(lastUpdatedAt);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Conversation conversation = (Conversation) o;
    return Objects.equals(this.id, conversation.id) &&
        Objects.equals(this.type, conversation.type) &&
        Objects.equals(this.isDefault, conversation.isDefault) &&
        Objects.equals(this.displayName, conversation.displayName) &&
        Objects.equals(this.metadata, conversation.metadata) &&
        Objects.equals(this.appMakerLastRead, conversation.appMakerLastRead) &&
        Objects.equals(this.lastUpdatedAt, conversation.lastUpdatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, type, isDefault, displayName, metadata, appMakerLastRead, lastUpdatedAt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Conversation {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    isDefault: ").append(toIndentedString(isDefault)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    appMakerLastRead: ").append(toIndentedString(appMakerLastRead)).append("\n");
    sb.append("    lastUpdatedAt: ").append(toIndentedString(lastUpdatedAt)).append("\n");
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

