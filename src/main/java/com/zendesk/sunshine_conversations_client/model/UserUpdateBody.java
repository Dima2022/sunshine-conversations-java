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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * UserUpdateBody
 */
@JsonPropertyOrder({
  UserUpdateBody.JSON_PROPERTY_SIGNED_UP_AT,
  UserUpdateBody.JSON_PROPERTY_PROFILE,
  UserUpdateBody.JSON_PROPERTY_METADATA
})

public class UserUpdateBody {
  public static final String JSON_PROPERTY_SIGNED_UP_AT = "signedUpAt";
  private String signedUpAt = null;

  public static final String JSON_PROPERTY_PROFILE = "profile";
  private Profile profile = null;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();


  public UserUpdateBody signedUpAt(String signedUpAt) {
    
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


  public UserUpdateBody profile(Profile profile) {
    
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


  public UserUpdateBody metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
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
    UserUpdateBody userUpdateBody = (UserUpdateBody) o;
    return Objects.equals(this.signedUpAt, userUpdateBody.signedUpAt) &&
        Objects.equals(this.profile, userUpdateBody.profile) &&
        Objects.equals(this.metadata, userUpdateBody.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signedUpAt, profile, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserUpdateBody {\n");
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

