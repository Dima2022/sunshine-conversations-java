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
import com.zendesk.sunshine_conversations_client.model.Profile;
import com.zendesk.sunshine_conversations_client.model.UserAllOf;
import com.zendesk.sunshine_conversations_client.model.UserTruncated;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * User
 */
@JsonPropertyOrder({
  User.JSON_PROPERTY_ID,
  User.JSON_PROPERTY_EXTERNAL_ID,
  User.JSON_PROPERTY_SIGNED_UP_AT,
  User.JSON_PROPERTY_PROFILE,
  User.JSON_PROPERTY_METADATA
})

public class User {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private JsonNullable<String> externalId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SIGNED_UP_AT = "signedUpAt";
  private String signedUpAt = null;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private Profile profile = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private Object metadata = null;


  public User id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * The unique ID of the user.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "7494535bff5cef41a15be74d", value = "The unique ID of the user.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public User externalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
    
    return this;
  }

   /**
   * An optional ID that can also be used to retrieve the user. 
   * @return externalId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "your-own-id", value = "An optional ID that can also be used to retrieve the user. ")
  @JsonIgnore

  public String getExternalId() {
        return externalId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getExternalId_JsonNullable() {
    return externalId;
  }
  
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  public void setExternalId_JsonNullable(JsonNullable<String> externalId) {
    this.externalId = externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = JsonNullable.<String>of(externalId);
  }


  public User signedUpAt(String signedUpAt) {
    
    this.signedUpAt = signedUpAt;
    return this;
  }

   /**
   * Get signedUpAt
   * @return signedUpAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_SIGNED_UP_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSignedUpAt() {
    return signedUpAt;
  }


  public void setSignedUpAt(String signedUpAt) {
    this.signedUpAt = signedUpAt;
  }


  public User profile(Profile profile) {
    
    this.profile = profile;
    return this;
  }

   /**
   * Get profile
   * @return profile
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Profile getProfile() {
    return profile;
  }


  public void setProfile(Profile profile) {
    this.profile = profile;
  }


  public User metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.externalId, user.externalId) &&
        Objects.equals(this.signedUpAt, user.signedUpAt) &&
        Objects.equals(this.profile, user.profile) &&
        Objects.equals(this.metadata, user.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, externalId, signedUpAt, profile, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    signedUpAt: ").append(toIndentedString(signedUpAt)).append("\n");
    sb.append("    profile: ").append(toIndentedString(profile)).append("\n");
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

