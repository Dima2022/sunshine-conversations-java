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
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonValue;
import com.zendesk.sunshine_conversations_client.model.Android;
import com.zendesk.sunshine_conversations_client.model.Apple;
import com.zendesk.sunshine_conversations_client.model.Custom;
import com.zendesk.sunshine_conversations_client.model.Instagram;
import com.zendesk.sunshine_conversations_client.model.Integration;
import com.zendesk.sunshine_conversations_client.model.Ios;
import com.zendesk.sunshine_conversations_client.model.Line;
import com.zendesk.sunshine_conversations_client.model.Mailgun;
import com.zendesk.sunshine_conversations_client.model.Messagebird;
import com.zendesk.sunshine_conversations_client.model.MessagebirdAllOf;
import com.zendesk.sunshine_conversations_client.model.Messenger;
import com.zendesk.sunshine_conversations_client.model.Status;
import com.zendesk.sunshine_conversations_client.model.Telegram;
import com.zendesk.sunshine_conversations_client.model.Twilio;
import com.zendesk.sunshine_conversations_client.model.Twitter;
import com.zendesk.sunshine_conversations_client.model.Viber;
import com.zendesk.sunshine_conversations_client.model.Web;
import com.zendesk.sunshine_conversations_client.model.Whatsapp;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Messagebird
 */
@JsonPropertyOrder({
  Messagebird.JSON_PROPERTY_TYPE,
  Messagebird.JSON_PROPERTY_ACCESS_KEY,
  Messagebird.JSON_PROPERTY_SIGNING_KEY,
  Messagebird.JSON_PROPERTY_ORIGINATOR,
  Messagebird.JSON_PROPERTY_WEBHOOK_SECRET
})

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", visible = true)
@JsonSubTypes({
  @JsonSubTypes.Type(value = Android.class, name = "android"),
  @JsonSubTypes.Type(value = Apple.class, name = "apple"),
  @JsonSubTypes.Type(value = Custom.class, name = "custom"),
  @JsonSubTypes.Type(value = Instagram.class, name = "instagram"),
  @JsonSubTypes.Type(value = Ios.class, name = "ios"),
  @JsonSubTypes.Type(value = Line.class, name = "line"),
  @JsonSubTypes.Type(value = Mailgun.class, name = "mailgun"),
  @JsonSubTypes.Type(value = Messagebird.class, name = "messagebird"),
  @JsonSubTypes.Type(value = Messenger.class, name = "messenger"),
  @JsonSubTypes.Type(value = Telegram.class, name = "telegram"),
  @JsonSubTypes.Type(value = Twilio.class, name = "twilio"),
  @JsonSubTypes.Type(value = Twitter.class, name = "twitter"),
  @JsonSubTypes.Type(value = Viber.class, name = "viber"),
  @JsonSubTypes.Type(value = Web.class, name = "web"),
  @JsonSubTypes.Type(value = Whatsapp.class, name = "whatsapp"),
})

public class Messagebird extends Integration {
  public static final String JSON_PROPERTY_TYPE = "type";
  protected String type = "messagebird";

  public static final String JSON_PROPERTY_ACCESS_KEY = "accessKey";
  private String accessKey;

  public static final String JSON_PROPERTY_SIGNING_KEY = "signingKey";
  private String signingKey;

  public static final String JSON_PROPERTY_ORIGINATOR = "originator";
  private String originator;

  public static final String JSON_PROPERTY_WEBHOOK_SECRET = "webhookSecret";
  private String webhookSecret;


  public Messagebird type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * To configure a MessageBird integration, acquire the accessKey, the signingKey and the MessageBird number you would like to use, then call the Create Integration endpoint. The response will include the integration’s &#x60;_id&#x60; and &#x60;webhookSecret&#x60;, which must be used to configure the webhook in MessageBird. In the Flow Builder for the MessageBird number you’ve used to integrate, add a new step with the following settings: - Create a new Call HTTP endpoint with SMS flow. - Select your desired SMS number for Incoming SMS. - Click on Forward to URL and set its method to POST. - Then, using the integration _id and webhookSecret returned from the create integration call, enter the following into the URL field:  &#x60;https://app.smooch.io/api/messagebird/webhooks/{appId}/{integrationId}/{webhookSecret}&#x60; - Select application/json for the Set Content-Type header field. - Save and publish your changes. 
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "To configure a MessageBird integration, acquire the accessKey, the signingKey and the MessageBird number you would like to use, then call the Create Integration endpoint. The response will include the integration’s `_id` and `webhookSecret`, which must be used to configure the webhook in MessageBird. In the Flow Builder for the MessageBird number you’ve used to integrate, add a new step with the following settings: - Create a new Call HTTP endpoint with SMS flow. - Select your desired SMS number for Incoming SMS. - Click on Forward to URL and set its method to POST. - Then, using the integration _id and webhookSecret returned from the create integration call, enter the following into the URL field:  `https://app.smooch.io/api/messagebird/webhooks/{appId}/{integrationId}/{webhookSecret}` - Select application/json for the Set Content-Type header field. - Save and publish your changes. ")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Messagebird accessKey(String accessKey) {
    
    this.accessKey = accessKey;
    return this;
  }

   /**
   * The public API key of your MessageBird account.
   * @return accessKey
  **/
  @ApiModelProperty(example = "9V2iJmd93kFJ390L9495JCl11", required = true, value = "The public API key of your MessageBird account.")
  @JsonProperty(JSON_PROPERTY_ACCESS_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessKey() {
    return accessKey;
  }


  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }


  public Messagebird signingKey(String signingKey) {
    
    this.signingKey = signingKey;
    return this;
  }

   /**
   * The signing key of your MessageBird account. Used to validate the webhooks&#39; origin.
   * @return signingKey
  **/
  @ApiModelProperty(example = "Uu6N09Lkdji3820DJIO89I39sl9dJ", required = true, value = "The signing key of your MessageBird account. Used to validate the webhooks' origin.")
  @JsonProperty(JSON_PROPERTY_SIGNING_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSigningKey() {
    return signingKey;
  }


  public void setSigningKey(String signingKey) {
    this.signingKey = signingKey;
  }


  public Messagebird originator(String originator) {
    
    this.originator = originator;
    return this;
  }

   /**
   * Sunshine Conversations will receive all messages sent to this phone number.
   * @return originator
  **/
  @ApiModelProperty(example = "12262121021", required = true, value = "Sunshine Conversations will receive all messages sent to this phone number.")
  @JsonProperty(JSON_PROPERTY_ORIGINATOR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getOriginator() {
    return originator;
  }


  public void setOriginator(String originator) {
    this.originator = originator;
  }


   /**
   * The secret that is used to configure webhooks in MessageBird.
   * @return webhookSecret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "72ade38394d1da51566cede33bd1e67e", value = "The secret that is used to configure webhooks in MessageBird.")
  @JsonProperty(JSON_PROPERTY_WEBHOOK_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getWebhookSecret() {
    return webhookSecret;
  }




  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Messagebird messagebird = (Messagebird) o;
    return Objects.equals(this.type, messagebird.type) &&
        Objects.equals(this.accessKey, messagebird.accessKey) &&
        Objects.equals(this.signingKey, messagebird.signingKey) &&
        Objects.equals(this.originator, messagebird.originator) &&
        Objects.equals(this.webhookSecret, messagebird.webhookSecret) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, accessKey, signingKey, originator, webhookSecret, super.hashCode());
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Messagebird {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    signingKey: ").append(toIndentedString(signingKey)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    webhookSecret: ").append(toIndentedString(webhookSecret)).append("\n");
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

