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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * To configure a Twilio integration, acquire the required information from the user and call the Create Integration endpoint. 
 */
@ApiModel(description = "To configure a Twilio integration, acquire the required information from the user and call the Create Integration endpoint. ")
@JsonPropertyOrder({
  TwilioAllOf.JSON_PROPERTY_ACCOUNT_SID,
  TwilioAllOf.JSON_PROPERTY_AUTH_TOKEN,
  TwilioAllOf.JSON_PROPERTY_PHONE_NUMBER_SID
})

public class TwilioAllOf {
  public static final String JSON_PROPERTY_ACCOUNT_SID = "accountSid";
  private String accountSid;

  public static final String JSON_PROPERTY_AUTH_TOKEN = "authToken";
  private String authToken;

  public static final String JSON_PROPERTY_PHONE_NUMBER_SID = "phoneNumberSid";
  private String phoneNumberSid;


  public TwilioAllOf accountSid(String accountSid) {
    
    this.accountSid = accountSid;
    return this;
  }

   /**
   * Twilio Account SID.
   * @return accountSid
  **/
  @ApiModelProperty(required = true, value = "Twilio Account SID.")
  @JsonProperty(JSON_PROPERTY_ACCOUNT_SID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccountSid() {
    return accountSid;
  }


  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }


  public TwilioAllOf authToken(String authToken) {
    
    this.authToken = authToken;
    return this;
  }

   /**
   * Twilio Auth Token.
   * @return authToken
  **/
  @ApiModelProperty(required = true, value = "Twilio Auth Token.")
  @JsonProperty(JSON_PROPERTY_AUTH_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAuthToken() {
    return authToken;
  }


  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }


  public TwilioAllOf phoneNumberSid(String phoneNumberSid) {
    
    this.phoneNumberSid = phoneNumberSid;
    return this;
  }

   /**
   * SID for specific phone number.
   * @return phoneNumberSid
  **/
  @ApiModelProperty(required = true, value = "SID for specific phone number.")
  @JsonProperty(JSON_PROPERTY_PHONE_NUMBER_SID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getPhoneNumberSid() {
    return phoneNumberSid;
  }


  public void setPhoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TwilioAllOf twilioAllOf = (TwilioAllOf) o;
    return Objects.equals(this.accountSid, twilioAllOf.accountSid) &&
        Objects.equals(this.authToken, twilioAllOf.authToken) &&
        Objects.equals(this.phoneNumberSid, twilioAllOf.phoneNumberSid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountSid, authToken, phoneNumberSid);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TwilioAllOf {\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    phoneNumberSid: ").append(toIndentedString(phoneNumberSid)).append("\n");
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

