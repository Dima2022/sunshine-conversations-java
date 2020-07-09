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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * MailgunUpdateAllOf
 */
@JsonPropertyOrder({
  MailgunUpdateAllOf.JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK,
  MailgunUpdateAllOf.JSON_PROPERTY_FROM_ADDRESS
})

public class MailgunUpdateAllOf {
  public static final String JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK = "hideUnsubscribeLink";
  private Boolean hideUnsubscribeLink;

  public static final String JSON_PROPERTY_FROM_ADDRESS = "fromAddress";
  private JsonNullable<String> fromAddress = JsonNullable.<String>undefined();


  public MailgunUpdateAllOf hideUnsubscribeLink(Boolean hideUnsubscribeLink) {
    
    this.hideUnsubscribeLink = hideUnsubscribeLink;
    return this;
  }

   /**
   * A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.
   * @return hideUnsubscribeLink
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean value indicating whether the unsubscribe link should be omitted from outgoing emails. When enabled, it is expected that the business is providing the user a way to unsubscribe by some other means. By default, the unsubscribe link will be included in all outgoing emails.")
  @JsonProperty(JSON_PROPERTY_HIDE_UNSUBSCRIBE_LINK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getHideUnsubscribeLink() {
    return hideUnsubscribeLink;
  }


  public void setHideUnsubscribeLink(Boolean hideUnsubscribeLink) {
    this.hideUnsubscribeLink = hideUnsubscribeLink;
  }


  public MailgunUpdateAllOf fromAddress(String fromAddress) {
    this.fromAddress = JsonNullable.<String>of(fromAddress);
    
    return this;
  }

   /**
   * Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null.
   * @return fromAddress
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email address to use as the From and Reply-To address if it must be different from incomingAddress. Only use this option if the address that you supply is configured to forward emails to the incomingAddress, otherwise user replies will be lost. You must also make sure that the domain is properly configured as a mail provider so as to not be flagged as spam by the user’s email client. May be unset with null.")
  @JsonIgnore

  public String getFromAddress() {
        return fromAddress.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getFromAddress_JsonNullable() {
    return fromAddress;
  }
  
  @JsonProperty(JSON_PROPERTY_FROM_ADDRESS)
  public void setFromAddress_JsonNullable(JsonNullable<String> fromAddress) {
    this.fromAddress = fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = JsonNullable.<String>of(fromAddress);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MailgunUpdateAllOf mailgunUpdateAllOf = (MailgunUpdateAllOf) o;
    return Objects.equals(this.hideUnsubscribeLink, mailgunUpdateAllOf.hideUnsubscribeLink) &&
        Objects.equals(this.fromAddress, mailgunUpdateAllOf.fromAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hideUnsubscribeLink, fromAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MailgunUpdateAllOf {\n");
    sb.append("    hideUnsubscribeLink: ").append(toIndentedString(hideUnsubscribeLink)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
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

