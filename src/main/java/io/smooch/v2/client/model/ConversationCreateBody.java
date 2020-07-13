/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha.2
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
import io.smooch.v2.client.model.ParticipantSubSchema;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ConversationCreateBody
 */
@JsonPropertyOrder({
  ConversationCreateBody.JSON_PROPERTY_TYPE,
  ConversationCreateBody.JSON_PROPERTY_PARTICIPANTS,
  ConversationCreateBody.JSON_PROPERTY_DISPLAY_NAME,
  ConversationCreateBody.JSON_PROPERTY_METADATA
})

public class ConversationCreateBody {
  public static final String JSON_PROPERTY_TYPE = "type";
  private ConversationType type;

  public static final String JSON_PROPERTY_PARTICIPANTS = "participants";
  private List<ParticipantSubSchema> participants = null;

  public static final String JSON_PROPERTY_DISPLAY_NAME = "displayName";
  private String displayName = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();


  public ConversationCreateBody type(ConversationType type) {
    
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(required = true, value = "")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public ConversationType getType() {
    return type;
  }


  public void setType(ConversationType type) {
    this.type = type;
  }


  public ConversationCreateBody participants(List<ParticipantSubSchema> participants) {
    
    this.participants = participants;
    return this;
  }

  public ConversationCreateBody addParticipantsItem(ParticipantSubSchema participantsItem) {
    if (this.participants == null) {
      this.participants = new ArrayList<ParticipantSubSchema>();
    }
    this.participants.add(participantsItem);
    return this;
  }

   /**
   * The users participating in the conversation. See participant sub-schema below. For &#x60;personal&#x60; conversations, this field is required with a length of exactly 1. For &#x60;sdkGroup&#x60; conversations, must have a length less than or equal to 10. Can be omitted to have a conversation with no participants if the type is &#x60;sdkGroup&#x60;. 
   * @return participants
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The users participating in the conversation. See participant sub-schema below. For `personal` conversations, this field is required with a length of exactly 1. For `sdkGroup` conversations, must have a length less than or equal to 10. Can be omitted to have a conversation with no participants if the type is `sdkGroup`. ")
  @JsonProperty(JSON_PROPERTY_PARTICIPANTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<ParticipantSubSchema> getParticipants() {
    return participants;
  }


  public void setParticipants(List<ParticipantSubSchema> participants) {
    this.participants = participants;
  }


  public ConversationCreateBody displayName(String displayName) {
    
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


  public ConversationCreateBody metadata(Object metadata) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConversationCreateBody conversationCreateBody = (ConversationCreateBody) o;
    return Objects.equals(this.type, conversationCreateBody.type) &&
        Objects.equals(this.participants, conversationCreateBody.participants) &&
        Objects.equals(this.displayName, conversationCreateBody.displayName) &&
        Objects.equals(this.metadata, conversationCreateBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, participants, displayName, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConversationCreateBody {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    participants: ").append(toIndentedString(participants)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

