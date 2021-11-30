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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Webhook
 */
@JsonPropertyOrder({
  Webhook.JSON_PROPERTY_ID,
  Webhook.JSON_PROPERTY_VERSION,
  Webhook.JSON_PROPERTY_TARGET,
  Webhook.JSON_PROPERTY_TRIGGERS,
  Webhook.JSON_PROPERTY_SECRET,
  Webhook.JSON_PROPERTY_INCLUDE_FULL_USER,
  Webhook.JSON_PROPERTY_INCLUDE_FULL_SOURCE
})

public class Webhook {
  public static final String JSON_PROPERTY_ID = "id";
  private String id;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_TARGET = "target";
  private String target;

  public static final String JSON_PROPERTY_TRIGGERS = "triggers";
  private List<String> triggers = new ArrayList<>();

  public static final String JSON_PROPERTY_SECRET = "secret";
  private String secret;

  public static final String JSON_PROPERTY_INCLUDE_FULL_USER = "includeFullUser";
  private Boolean includeFullUser = false;

  public static final String JSON_PROPERTY_INCLUDE_FULL_SOURCE = "includeFullSource";
  private Boolean includeFullSource = false;


   /**
   * A unique identifier for the webhook.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "5e554d2cac66fb73a3c01871", value = "A unique identifier for the webhook.")
  @JsonProperty(JSON_PROPERTY_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getId() {
    return id;
  }




   /**
   * Schema version of the payload delivered to this webhook. Can be &#x60;v1&#x60;, &#x60;v1.1&#x60; or &#x60;v2&#x60;.
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "v2", value = "Schema version of the payload delivered to this webhook. Can be `v1`, `v1.1` or `v2`.")
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getVersion() {
    return version;
  }




  public Webhook target(String target) {
    
    this.target = target;
    return this;
  }

   /**
   * URL to be called when the webhook is triggered.
   * @return target
  **/
  @ApiModelProperty(example = "https://example.com/callback", required = true, value = "URL to be called when the webhook is triggered.")
  @JsonProperty(JSON_PROPERTY_TARGET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTarget() {
    return target;
  }


  public void setTarget(String target) {
    this.target = target;
  }


  public Webhook triggers(List<String> triggers) {
    
    this.triggers = triggers;
    return this;
  }

  public Webhook addTriggersItem(String triggersItem) {
    this.triggers.add(triggersItem);
    return this;
  }

   /**
   * An array of triggers the integration is subscribed to. This property is case sensitive. [More details](https://docs.smooch.io/rest/#section/Webhook-Triggers).
   * @return triggers
  **/
  @ApiModelProperty(example = "[\"conversation:read\",\"conversation:message\"]", required = true, value = "An array of triggers the integration is subscribed to. This property is case sensitive. [More details](https://docs.smooch.io/rest/#section/Webhook-Triggers).")
  @JsonProperty(JSON_PROPERTY_TRIGGERS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<String> getTriggers() {
    return triggers;
  }


  public void setTriggers(List<String> triggers) {
    this.triggers = triggers;
  }


  public Webhook secret(String secret) {
    
    this.secret = secret;
    return this;
  }

   /**
   * Webhook secret, used to verify the origin of incoming requests.
   * @return secret
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "8564b3e6a8b20a4bdb68b05ce9bc5936", value = "Webhook secret, used to verify the origin of incoming requests.")
  @JsonProperty(JSON_PROPERTY_SECRET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSecret() {
    return secret;
  }


  public void setSecret(String secret) {
    this.secret = secret;
  }


  public Webhook includeFullUser(Boolean includeFullUser) {
    
    this.includeFullUser = includeFullUser;
    return this;
  }

   /**
   * A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user.
   * @return includeFullUser
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether webhook payloads should include the complete user schema for events involving a specific user.")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FULL_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFullUser() {
    return includeFullUser;
  }


  public void setIncludeFullUser(Boolean includeFullUser) {
    this.includeFullUser = includeFullUser;
  }


  public Webhook includeFullSource(Boolean includeFullSource) {
    
    this.includeFullSource = includeFullSource;
    return this;
  }

   /**
   * A boolean specifying whether webhook payloads should include the client and device object (when applicable).
   * @return includeFullSource
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A boolean specifying whether webhook payloads should include the client and device object (when applicable).")
  @JsonProperty(JSON_PROPERTY_INCLUDE_FULL_SOURCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIncludeFullSource() {
    return includeFullSource;
  }


  public void setIncludeFullSource(Boolean includeFullSource) {
    this.includeFullSource = includeFullSource;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.id, webhook.id) &&
        Objects.equals(this.version, webhook.version) &&
        Objects.equals(this.target, webhook.target) &&
        Objects.equals(this.triggers, webhook.triggers) &&
        Objects.equals(this.secret, webhook.secret) &&
        Objects.equals(this.includeFullUser, webhook.includeFullUser) &&
        Objects.equals(this.includeFullSource, webhook.includeFullSource);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, version, target, triggers, secret, includeFullUser, includeFullSource);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    triggers: ").append(toIndentedString(triggers)).append("\n");
    sb.append("    secret: ").append(toIndentedString(secret)).append("\n");
    sb.append("    includeFullUser: ").append(toIndentedString(includeFullUser)).append("\n");
    sb.append("    includeFullSource: ").append(toIndentedString(includeFullSource)).append("\n");
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

