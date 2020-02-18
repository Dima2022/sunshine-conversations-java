/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.22
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.ClientInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Client
 */

public class Client {
  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("externalId")
  private String externalId = null;

  @SerializedName("active")
  private Boolean active = null;

  @SerializedName("lastSeen")
  private String lastSeen = null;

  @SerializedName("platform")
  private String platform = null;

  @SerializedName("integrationId")
  private String integrationId = null;

  @SerializedName("pushNotificationToken")
  private String pushNotificationToken = null;

  @SerializedName("appVersion")
  private String appVersion = null;

  @SerializedName("displayName")
  private String displayName = null;

  @SerializedName("info")
  private ClientInfo info = null;

  @SerializedName("raw")
  private Object raw = null;

  public Client id(String id) {
    this.id = id;
    return this;
  }

   /**
   * An identifier for the client. Must be globally unique.
   * @return id
  **/
  @ApiModelProperty(required = true, value = "An identifier for the client. Must be globally unique.")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Client status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The client status. Indicates if the client is able to receive messages or not. See [**ClientStatusEnum**](Enums.md#ClientStatusEnum) for available values.
   * @return status
  **/
  @ApiModelProperty(value = "The client status. Indicates if the client is able to receive messages or not. See [**ClientStatusEnum**](Enums.md#ClientStatusEnum) for available values.")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public Client externalId(String externalId) {
    this.externalId = externalId;
    return this;
  }

   /**
   * The ID of the user on an external channel. For example, the user's phone number for Twilio, or their page-scoped user ID for Facebook Messenger. Applies only to non-SDK clients.
   * @return externalId
  **/
  @ApiModelProperty(value = "The ID of the user on an external channel. For example, the user's phone number for Twilio, or their page-scoped user ID for Facebook Messenger. Applies only to non-SDK clients.")
  public String getExternalId() {
    return externalId;
  }

  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }

  public Client active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Deprecated - use the status property instead.
   * @return active
  **/
  @ApiModelProperty(value = "Deprecated - use the status property instead.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }

  public Client lastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
    return this;
  }

   /**
   * The date time the client was last seen.
   * @return lastSeen
  **/
  @ApiModelProperty(value = "The date time the client was last seen.")
  public String getLastSeen() {
    return lastSeen;
  }

  public void setLastSeen(String lastSeen) {
    this.lastSeen = lastSeen;
  }

  public Client platform(String platform) {
    this.platform = platform;
    return this;
  }

   /**
   * The client's platform. See [**IntegrationTypeEnum**](Enums.md#IntegrationTypeEnum) for available values.
   * @return platform
  **/
  @ApiModelProperty(required = true, value = "The client's platform. See [**IntegrationTypeEnum**](Enums.md#IntegrationTypeEnum) for available values.")
  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public Client integrationId(String integrationId) {
    this.integrationId = integrationId;
    return this;
  }

   /**
   * The ID of the integration that the client was created for.
   * @return integrationId
  **/
  @ApiModelProperty(value = "The ID of the integration that the client was created for.")
  public String getIntegrationId() {
    return integrationId;
  }

  public void setIntegrationId(String integrationId) {
    this.integrationId = integrationId;
  }

  public Client pushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = pushNotificationToken;
    return this;
  }

   /**
   * The GCM or APN token to be used for sending push notifications to the device. Applies to only *android* and *ios* clients. 
   * @return pushNotificationToken
  **/
  @ApiModelProperty(value = "The GCM or APN token to be used for sending push notifications to the device. Applies to only *android* and *ios* clients. ")
  public String getPushNotificationToken() {
    return pushNotificationToken;
  }

  public void setPushNotificationToken(String pushNotificationToken) {
    this.pushNotificationToken = pushNotificationToken;
  }

  public Client appVersion(String appVersion) {
    this.appVersion = appVersion;
    return this;
  }

   /**
   * A reserved string field for reporting the app version running on the device.
   * @return appVersion
  **/
  @ApiModelProperty(value = "A reserved string field for reporting the app version running on the device.")
  public String getAppVersion() {
    return appVersion;
  }

  public void setAppVersion(String appVersion) {
    this.appVersion = appVersion;
  }

  public Client displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * The client's display name.
   * @return displayName
  **/
  @ApiModelProperty(value = "The client's display name.")
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public Client info(ClientInfo info) {
    this.info = info;
    return this;
  }

   /**
   * Get info
   * @return info
  **/
  @ApiModelProperty(value = "")
  public ClientInfo getInfo() {
    return info;
  }

  public void setInfo(ClientInfo info) {
    this.info = info;
  }

  public Client raw(Object raw) {
    this.raw = raw;
    return this;
  }

   /**
   * An Object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.
   * @return raw
  **/
  @ApiModelProperty(value = "An Object with raw properties that vary for each client platform. All keys are optional and not guaranteed to be available.")
  public Object getRaw() {
    return raw;
  }

  public void setRaw(Object raw) {
    this.raw = raw;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Client client = (Client) o;
    return Objects.equals(this.id, client.id) &&
        Objects.equals(this.status, client.status) &&
        Objects.equals(this.externalId, client.externalId) &&
        Objects.equals(this.active, client.active) &&
        Objects.equals(this.lastSeen, client.lastSeen) &&
        Objects.equals(this.platform, client.platform) &&
        Objects.equals(this.integrationId, client.integrationId) &&
        Objects.equals(this.pushNotificationToken, client.pushNotificationToken) &&
        Objects.equals(this.appVersion, client.appVersion) &&
        Objects.equals(this.displayName, client.displayName) &&
        Objects.equals(this.info, client.info) &&
        Objects.equals(this.raw, client.raw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, externalId, active, lastSeen, platform, integrationId, pushNotificationToken, appVersion, displayName, info, raw);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Client {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastSeen: ").append(toIndentedString(lastSeen)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
    sb.append("    pushNotificationToken: ").append(toIndentedString(pushNotificationToken)).append("\n");
    sb.append("    appVersion: ").append(toIndentedString(appVersion)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    raw: ").append(toIndentedString(raw)).append("\n");
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

