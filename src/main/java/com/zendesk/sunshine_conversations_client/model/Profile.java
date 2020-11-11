/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.1.0
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
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Object hosting user profile information.
 */
@ApiModel(description = "Object hosting user profile information.")
@JsonPropertyOrder({
  Profile.JSON_PROPERTY_GIVEN_NAME,
  Profile.JSON_PROPERTY_SURNAME,
  Profile.JSON_PROPERTY_EMAIL,
  Profile.JSON_PROPERTY_AVATAR_URL
})

public class Profile {
  public static final String JSON_PROPERTY_GIVEN_NAME = "givenName";
  private JsonNullable<String> givenName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SURNAME = "surname";
  private JsonNullable<String> surname = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EMAIL = "email";
  private JsonNullable<String> email = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_AVATAR_URL = "avatarUrl";
  private JsonNullable<URI> avatarUrl = JsonNullable.<URI>undefined();


  public Profile givenName(String givenName) {
    this.givenName = JsonNullable.<String>of(givenName);
    
    return this;
  }

   /**
   * The user&#39;s given name (first name).
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Jane", value = "The user's given name (first name).")
  @JsonIgnore

  public String getGivenName() {
        return givenName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getGivenName_JsonNullable() {
    return givenName;
  }
  
  @JsonProperty(JSON_PROPERTY_GIVEN_NAME)
  public void setGivenName_JsonNullable(JsonNullable<String> givenName) {
    this.givenName = givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = JsonNullable.<String>of(givenName);
  }


  public Profile surname(String surname) {
    this.surname = JsonNullable.<String>of(surname);
    
    return this;
  }

   /**
   * The user&#39;s surname (last name).
   * @return surname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Doe", value = "The user's surname (last name).")
  @JsonIgnore

  public String getSurname() {
        return surname.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SURNAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getSurname_JsonNullable() {
    return surname;
  }
  
  @JsonProperty(JSON_PROPERTY_SURNAME)
  public void setSurname_JsonNullable(JsonNullable<String> surname) {
    this.surname = surname;
  }

  public void setSurname(String surname) {
    this.surname = JsonNullable.<String>of(surname);
  }


  public Profile email(String email) {
    this.email = JsonNullable.<String>of(email);
    
    return this;
  }

   /**
   * The user&#39;s email address.
   * @return email
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "jane.doe@gmail.com", value = "The user's email address.")
  @JsonIgnore

  public String getEmail() {
        return email.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_EMAIL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getEmail_JsonNullable() {
    return email;
  }
  
  @JsonProperty(JSON_PROPERTY_EMAIL)
  public void setEmail_JsonNullable(JsonNullable<String> email) {
    this.email = email;
  }

  public void setEmail(String email) {
    this.email = JsonNullable.<String>of(email);
  }


  public Profile avatarUrl(URI avatarUrl) {
    this.avatarUrl = JsonNullable.<URI>of(avatarUrl);
    
    return this;
  }

   /**
   * The user&#39;s avatar.
   * @return avatarUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://s3.amazonaws.com/avatar.jpg", value = "The user's avatar.")
  @JsonIgnore

  public URI getAvatarUrl() {
        return avatarUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<URI> getAvatarUrl_JsonNullable() {
    return avatarUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_AVATAR_URL)
  public void setAvatarUrl_JsonNullable(JsonNullable<URI> avatarUrl) {
    this.avatarUrl = avatarUrl;
  }

  public void setAvatarUrl(URI avatarUrl) {
    this.avatarUrl = JsonNullable.<URI>of(avatarUrl);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.givenName, profile.givenName) &&
        Objects.equals(this.surname, profile.surname) &&
        Objects.equals(this.email, profile.email) &&
        Objects.equals(this.avatarUrl, profile.avatarUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(givenName, surname, email, avatarUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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

