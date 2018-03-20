/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * IntegrationCreate
 */

public class IntegrationCreate {
  @SerializedName("type")
  private String type = null;

  @SerializedName("pageAccessToken")
  private String pageAccessToken = null;

  @SerializedName("appId")
  private String appId = null;

  @SerializedName("appSecret")
  private String appSecret = null;

  @SerializedName("accountSid")
  private String accountSid = null;

  @SerializedName("authToken")
  private String authToken = null;

  @SerializedName("phoneNumberSid")
  private String phoneNumberSid = null;

  @SerializedName("token")
  private String token = null;

  @SerializedName("channelId")
  private String channelId = null;

  @SerializedName("channelSecret")
  private String channelSecret = null;

  @SerializedName("channelAccessToken")
  private String channelAccessToken = null;

  @SerializedName("encodingAesKey")
  private String encodingAesKey = null;

  @SerializedName("fromAddress")
  private String fromAddress = null;

  @SerializedName("certificate")
  private String certificate = null;

  @SerializedName("password")
  private String password = null;

  @SerializedName("autoUpdateBadge")
  private Boolean autoUpdateBadge = null;

  @SerializedName("serverKey")
  private String serverKey = null;

  @SerializedName("senderId")
  private String senderId = null;

  @SerializedName("consumerKey")
  private String consumerKey = null;

  @SerializedName("consumerSecret")
  private String consumerSecret = null;

  @SerializedName("accessTokenKey")
  private String accessTokenKey = null;

  @SerializedName("accessTokenSecret")
  private String accessTokenSecret = null;

  @SerializedName("accessKey")
  private String accessKey = null;

  @SerializedName("originator")
  private String originator = null;

  @SerializedName("brandColor")
  private String brandColor = null;

  @SerializedName("conversationColor")
  private String conversationColor = null;

  @SerializedName("actionColor")
  private String actionColor = null;

  @SerializedName("displayStyle")
  private String displayStyle = null;

  @SerializedName("buttonIconUrl")
  private String buttonIconUrl = null;

  @SerializedName("buttonWidth")
  private String buttonWidth = null;

  @SerializedName("buttonHeight")
  private String buttonHeight = null;

  @SerializedName("integrationOrder")
  private List<String> integrationOrder = null;

  @SerializedName("businessName")
  private String businessName = null;

  @SerializedName("businessIconUrl")
  private String businessIconUrl = null;

  @SerializedName("backgroundImageUrl")
  private String backgroundImageUrl = null;

  public IntegrationCreate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The integration type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The integration type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IntegrationCreate pageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
    return this;
  }

   /**
   * Facebook Page Access Token. Required for *messenger* integrations. 
   * @return pageAccessToken
  **/
  @ApiModelProperty(value = "Facebook Page Access Token. Required for *messenger* integrations. ")
  public String getPageAccessToken() {
    return pageAccessToken;
  }

  public void setPageAccessToken(String pageAccessToken) {
    this.pageAccessToken = pageAccessToken;
  }

  public IntegrationCreate appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * Facebook App ID OR WeChat App ID. Required for *messenger* and *wechat* integrations. 
   * @return appId
  **/
  @ApiModelProperty(value = "Facebook App ID OR WeChat App ID. Required for *messenger* and *wechat* integrations. ")
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public IntegrationCreate appSecret(String appSecret) {
    this.appSecret = appSecret;
    return this;
  }

   /**
   * Facebook Page App Secret OR WeChat App Secret. Required for *messenger* and *wechat* integrations. 
   * @return appSecret
  **/
  @ApiModelProperty(value = "Facebook Page App Secret OR WeChat App Secret. Required for *messenger* and *wechat* integrations. ")
  public String getAppSecret() {
    return appSecret;
  }

  public void setAppSecret(String appSecret) {
    this.appSecret = appSecret;
  }

  public IntegrationCreate accountSid(String accountSid) {
    this.accountSid = accountSid;
    return this;
  }

   /**
   * Twilio Account SID. Required for *twilio* integrations. 
   * @return accountSid
  **/
  @ApiModelProperty(value = "Twilio Account SID. Required for *twilio* integrations. ")
  public String getAccountSid() {
    return accountSid;
  }

  public void setAccountSid(String accountSid) {
    this.accountSid = accountSid;
  }

  public IntegrationCreate authToken(String authToken) {
    this.authToken = authToken;
    return this;
  }

   /**
   * Twilio Auth Token. Required for *twilio* integrations. 
   * @return authToken
  **/
  @ApiModelProperty(value = "Twilio Auth Token. Required for *twilio* integrations. ")
  public String getAuthToken() {
    return authToken;
  }

  public void setAuthToken(String authToken) {
    this.authToken = authToken;
  }

  public IntegrationCreate phoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
    return this;
  }

   /**
   * SID for specific phone number. Required for *twilio* integrations. 
   * @return phoneNumberSid
  **/
  @ApiModelProperty(value = "SID for specific phone number. Required for *twilio* integrations. ")
  public String getPhoneNumberSid() {
    return phoneNumberSid;
  }

  public void setPhoneNumberSid(String phoneNumberSid) {
    this.phoneNumberSid = phoneNumberSid;
  }

  public IntegrationCreate token(String token) {
    this.token = token;
    return this;
  }

   /**
   * Telegram Bot Token OR Viber Public Account token. Required for *twilio* and *viber* integrations. 
   * @return token
  **/
  @ApiModelProperty(value = "Telegram Bot Token OR Viber Public Account token. Required for *twilio* and *viber* integrations. ")
  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public IntegrationCreate channelId(String channelId) {
    this.channelId = channelId;
    return this;
  }

   /**
   * LINE Channel ID. Required for *line* integrations. 
   * @return channelId
  **/
  @ApiModelProperty(value = "LINE Channel ID. Required for *line* integrations. ")
  public String getChannelId() {
    return channelId;
  }

  public void setChannelId(String channelId) {
    this.channelId = channelId;
  }

  public IntegrationCreate channelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
    return this;
  }

   /**
   * LINE Channel Secret. Required for *line* integrations. 
   * @return channelSecret
  **/
  @ApiModelProperty(value = "LINE Channel Secret. Required for *line* integrations. ")
  public String getChannelSecret() {
    return channelSecret;
  }

  public void setChannelSecret(String channelSecret) {
    this.channelSecret = channelSecret;
  }

  public IntegrationCreate channelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
    return this;
  }

   /**
   * LINE Channel Access Token. Required for *line* integrations. 
   * @return channelAccessToken
  **/
  @ApiModelProperty(value = "LINE Channel Access Token. Required for *line* integrations. ")
  public String getChannelAccessToken() {
    return channelAccessToken;
  }

  public void setChannelAccessToken(String channelAccessToken) {
    this.channelAccessToken = channelAccessToken;
  }

  public IntegrationCreate encodingAesKey(String encodingAesKey) {
    this.encodingAesKey = encodingAesKey;
    return this;
  }

   /**
   * AES Encoding Key. (Optional) Used for *wechat* integrations. 
   * @return encodingAesKey
  **/
  @ApiModelProperty(value = "AES Encoding Key. (Optional) Used for *wechat* integrations. ")
  public String getEncodingAesKey() {
    return encodingAesKey;
  }

  public void setEncodingAesKey(String encodingAesKey) {
    this.encodingAesKey = encodingAesKey;
  }

  public IntegrationCreate fromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
    return this;
  }

   /**
   * Email will display as coming from this address. (Optional) Used for *frontendEmail* integrations. 
   * @return fromAddress
  **/
  @ApiModelProperty(value = "Email will display as coming from this address. (Optional) Used for *frontendEmail* integrations. ")
  public String getFromAddress() {
    return fromAddress;
  }

  public void setFromAddress(String fromAddress) {
    this.fromAddress = fromAddress;
  }

  public IntegrationCreate certificate(String certificate) {
    this.certificate = certificate;
    return this;
  }

   /**
   * The binary of your APN certificate base64 encoded. Required for *apn* integrations. 
   * @return certificate
  **/
  @ApiModelProperty(value = "The binary of your APN certificate base64 encoded. Required for *apn* integrations. ")
  public String getCertificate() {
    return certificate;
  }

  public void setCertificate(String certificate) {
    this.certificate = certificate;
  }

  public IntegrationCreate password(String password) {
    this.password = password;
    return this;
  }

   /**
   * The password for your APN certificate. (Optional) Used for *apn* integrations. 
   * @return password
  **/
  @ApiModelProperty(value = "The password for your APN certificate. (Optional) Used for *apn* integrations. ")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public IntegrationCreate autoUpdateBadge(Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
    return this;
  }

   /**
   * Use the unread count of the conversation as the application badge. (Optional) Used for *apn* integrations. 
   * @return autoUpdateBadge
  **/
  @ApiModelProperty(value = "Use the unread count of the conversation as the application badge. (Optional) Used for *apn* integrations. ")
  public Boolean getAutoUpdateBadge() {
    return autoUpdateBadge;
  }

  public void setAutoUpdateBadge(Boolean autoUpdateBadge) {
    this.autoUpdateBadge = autoUpdateBadge;
  }

  public IntegrationCreate serverKey(String serverKey) {
    this.serverKey = serverKey;
    return this;
  }

   /**
   * Your server key from the fcm console. Required for *fcm* integrations. 
   * @return serverKey
  **/
  @ApiModelProperty(value = "Your server key from the fcm console. Required for *fcm* integrations. ")
  public String getServerKey() {
    return serverKey;
  }

  public void setServerKey(String serverKey) {
    this.serverKey = serverKey;
  }

  public IntegrationCreate senderId(String senderId) {
    this.senderId = senderId;
    return this;
  }

   /**
   * Your sender id from the fcm console. Required for *fcm* integrations. 
   * @return senderId
  **/
  @ApiModelProperty(value = "Your sender id from the fcm console. Required for *fcm* integrations. ")
  public String getSenderId() {
    return senderId;
  }

  public void setSenderId(String senderId) {
    this.senderId = senderId;
  }

  public IntegrationCreate consumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
    return this;
  }

   /**
   * The consumer key for your Twitter app. Required for *twitter* integrations. 
   * @return consumerKey
  **/
  @ApiModelProperty(value = "The consumer key for your Twitter app. Required for *twitter* integrations. ")
  public String getConsumerKey() {
    return consumerKey;
  }

  public void setConsumerKey(String consumerKey) {
    this.consumerKey = consumerKey;
  }

  public IntegrationCreate consumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
    return this;
  }

   /**
   * The consumer secret for your Twitter app. Required for *twitter* integrations. 
   * @return consumerSecret
  **/
  @ApiModelProperty(value = "The consumer secret for your Twitter app. Required for *twitter* integrations. ")
  public String getConsumerSecret() {
    return consumerSecret;
  }

  public void setConsumerSecret(String consumerSecret) {
    this.consumerSecret = consumerSecret;
  }

  public IntegrationCreate accessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
    return this;
  }

   /**
   * The access token key obtained from your user via oauth. Required for *twitter* integrations. 
   * @return accessTokenKey
  **/
  @ApiModelProperty(value = "The access token key obtained from your user via oauth. Required for *twitter* integrations. ")
  public String getAccessTokenKey() {
    return accessTokenKey;
  }

  public void setAccessTokenKey(String accessTokenKey) {
    this.accessTokenKey = accessTokenKey;
  }

  public IntegrationCreate accessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
    return this;
  }

   /**
   * The access token secret obtained from your user via oauth. Required for *twitter* integrations. 
   * @return accessTokenSecret
  **/
  @ApiModelProperty(value = "The access token secret obtained from your user via oauth. Required for *twitter* integrations. ")
  public String getAccessTokenSecret() {
    return accessTokenSecret;
  }

  public void setAccessTokenSecret(String accessTokenSecret) {
    this.accessTokenSecret = accessTokenSecret;
  }

  public IntegrationCreate accessKey(String accessKey) {
    this.accessKey = accessKey;
    return this;
  }

   /**
   * The public API key of your MessageBird account. Required for *messagebird* integrations. 
   * @return accessKey
  **/
  @ApiModelProperty(value = "The public API key of your MessageBird account. Required for *messagebird* integrations. ")
  public String getAccessKey() {
    return accessKey;
  }

  public void setAccessKey(String accessKey) {
    this.accessKey = accessKey;
  }

  public IntegrationCreate originator(String originator) {
    this.originator = originator;
    return this;
  }

   /**
   * Smooch will receive all messages sent to this phone number. Required for *messagebird* integrations. 
   * @return originator
  **/
  @ApiModelProperty(value = "Smooch will receive all messages sent to this phone number. Required for *messagebird* integrations. ")
  public String getOriginator() {
    return originator;
  }

  public void setOriginator(String originator) {
    this.originator = originator;
  }

  public IntegrationCreate brandColor(String brandColor) {
    this.brandColor = brandColor;
    return this;
  }

   /**
   * This color will be used in the messenger header and the button or tab in idle state. (Optional) Used for *Web Messenger* integrations. 
   * @return brandColor
  **/
  @ApiModelProperty(value = "This color will be used in the messenger header and the button or tab in idle state. (Optional) Used for *Web Messenger* integrations. ")
  public String getBrandColor() {
    return brandColor;
  }

  public void setBrandColor(String brandColor) {
    this.brandColor = brandColor;
  }

  public IntegrationCreate conversationColor(String conversationColor) {
    this.conversationColor = conversationColor;
    return this;
  }

   /**
   * This color will be used for customer messages, quick replies and actions in the footer. (Optional) Used for *Web Messenger* integrations. 
   * @return conversationColor
  **/
  @ApiModelProperty(value = "This color will be used for customer messages, quick replies and actions in the footer. (Optional) Used for *Web Messenger* integrations. ")
  public String getConversationColor() {
    return conversationColor;
  }

  public void setConversationColor(String conversationColor) {
    this.conversationColor = conversationColor;
  }

  public IntegrationCreate actionColor(String actionColor) {
    this.actionColor = actionColor;
    return this;
  }

   /**
   * This color will be used for call-to-actions inside your messages. (Optional) Used for *Web Messenger* integrations. 
   * @return actionColor
  **/
  @ApiModelProperty(value = "This color will be used for call-to-actions inside your messages. (Optional) Used for *Web Messenger* integrations. ")
  public String getActionColor() {
    return actionColor;
  }

  public void setActionColor(String actionColor) {
    this.actionColor = actionColor;
  }

  public IntegrationCreate displayStyle(String displayStyle) {
    this.displayStyle = displayStyle;
    return this;
  }

   /**
   * Choose how the messenger will appear on your website. Must be either button or tab. (Optional) Used for *Web Messenger* integrations. 
   * @return displayStyle
  **/
  @ApiModelProperty(value = "Choose how the messenger will appear on your website. Must be either button or tab. (Optional) Used for *Web Messenger* integrations. ")
  public String getDisplayStyle() {
    return displayStyle;
  }

  public void setDisplayStyle(String displayStyle) {
    this.displayStyle = displayStyle;
  }

  public IntegrationCreate buttonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = buttonIconUrl;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of selecting your own button icon. (Optional) Used for *Web Messenger* integrations. 
   * @return buttonIconUrl
  **/
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of selecting your own button icon. (Optional) Used for *Web Messenger* integrations. ")
  public String getButtonIconUrl() {
    return buttonIconUrl;
  }

  public void setButtonIconUrl(String buttonIconUrl) {
    this.buttonIconUrl = buttonIconUrl;
  }

  public IntegrationCreate buttonWidth(String buttonWidth) {
    this.buttonWidth = buttonWidth;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying its width. (Optional) Used for *Web Messenger* integrations. 
   * @return buttonWidth
  **/
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying its width. (Optional) Used for *Web Messenger* integrations. ")
  public String getButtonWidth() {
    return buttonWidth;
  }

  public void setButtonWidth(String buttonWidth) {
    this.buttonWidth = buttonWidth;
  }

  public IntegrationCreate buttonHeight(String buttonHeight) {
    this.buttonHeight = buttonHeight;
    return this;
  }

   /**
   * With the button style Web Messenger, you have the option of specifying its height. (Optional) Used for *Web Messenger* integrations. 
   * @return buttonHeight
  **/
  @ApiModelProperty(value = "With the button style Web Messenger, you have the option of specifying its height. (Optional) Used for *Web Messenger* integrations. ")
  public String getButtonHeight() {
    return buttonHeight;
  }

  public void setButtonHeight(String buttonHeight) {
    this.buttonHeight = buttonHeight;
  }

  public IntegrationCreate integrationOrder(List<String> integrationOrder) {
    this.integrationOrder = integrationOrder;
    return this;
  }

  public IntegrationCreate addIntegrationOrderItem(String integrationOrderItem) {
    if (this.integrationOrder == null) {
      this.integrationOrder = new ArrayList<String>();
    }
    this.integrationOrder.add(integrationOrderItem);
    return this;
  }

   /**
   * A custom business name for the Web Messenger. (Optional) Used for *Web Messenger* integrations. 
   * @return integrationOrder
  **/
  @ApiModelProperty(value = "A custom business name for the Web Messenger. (Optional) Used for *Web Messenger* integrations. ")
  public List<String> getIntegrationOrder() {
    return integrationOrder;
  }

  public void setIntegrationOrder(List<String> integrationOrder) {
    this.integrationOrder = integrationOrder;
  }

  public IntegrationCreate businessName(String businessName) {
    this.businessName = businessName;
    return this;
  }

   /**
   * A custom business name for the Web Messenger. (Optional) Used for *Web Messenger* integrations. 
   * @return businessName
  **/
  @ApiModelProperty(value = "A custom business name for the Web Messenger. (Optional) Used for *Web Messenger* integrations. ")
  public String getBusinessName() {
    return businessName;
  }

  public void setBusinessName(String businessName) {
    this.businessName = businessName;
  }

  public IntegrationCreate businessIconUrl(String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
    return this;
  }

   /**
   * A custom business icon url for the Web Messenger. (Optional) Used for *Web Messenger* integrations. 
   * @return businessIconUrl
  **/
  @ApiModelProperty(value = "A custom business icon url for the Web Messenger. (Optional) Used for *Web Messenger* integrations. ")
  public String getBusinessIconUrl() {
    return businessIconUrl;
  }

  public void setBusinessIconUrl(String businessIconUrl) {
    this.businessIconUrl = businessIconUrl;
  }

  public IntegrationCreate backgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
    return this;
  }

   /**
   * A custom background url for the Web Messenger. (Optional) Used for *Web Messenger* integrations. 
   * @return backgroundImageUrl
  **/
  @ApiModelProperty(value = "A custom background url for the Web Messenger. (Optional) Used for *Web Messenger* integrations. ")
  public String getBackgroundImageUrl() {
    return backgroundImageUrl;
  }

  public void setBackgroundImageUrl(String backgroundImageUrl) {
    this.backgroundImageUrl = backgroundImageUrl;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IntegrationCreate integrationCreate = (IntegrationCreate) o;
    return Objects.equals(this.type, integrationCreate.type) &&
        Objects.equals(this.pageAccessToken, integrationCreate.pageAccessToken) &&
        Objects.equals(this.appId, integrationCreate.appId) &&
        Objects.equals(this.appSecret, integrationCreate.appSecret) &&
        Objects.equals(this.accountSid, integrationCreate.accountSid) &&
        Objects.equals(this.authToken, integrationCreate.authToken) &&
        Objects.equals(this.phoneNumberSid, integrationCreate.phoneNumberSid) &&
        Objects.equals(this.token, integrationCreate.token) &&
        Objects.equals(this.channelId, integrationCreate.channelId) &&
        Objects.equals(this.channelSecret, integrationCreate.channelSecret) &&
        Objects.equals(this.channelAccessToken, integrationCreate.channelAccessToken) &&
        Objects.equals(this.encodingAesKey, integrationCreate.encodingAesKey) &&
        Objects.equals(this.fromAddress, integrationCreate.fromAddress) &&
        Objects.equals(this.certificate, integrationCreate.certificate) &&
        Objects.equals(this.password, integrationCreate.password) &&
        Objects.equals(this.autoUpdateBadge, integrationCreate.autoUpdateBadge) &&
        Objects.equals(this.serverKey, integrationCreate.serverKey) &&
        Objects.equals(this.senderId, integrationCreate.senderId) &&
        Objects.equals(this.consumerKey, integrationCreate.consumerKey) &&
        Objects.equals(this.consumerSecret, integrationCreate.consumerSecret) &&
        Objects.equals(this.accessTokenKey, integrationCreate.accessTokenKey) &&
        Objects.equals(this.accessTokenSecret, integrationCreate.accessTokenSecret) &&
        Objects.equals(this.accessKey, integrationCreate.accessKey) &&
        Objects.equals(this.originator, integrationCreate.originator) &&
        Objects.equals(this.brandColor, integrationCreate.brandColor) &&
        Objects.equals(this.conversationColor, integrationCreate.conversationColor) &&
        Objects.equals(this.actionColor, integrationCreate.actionColor) &&
        Objects.equals(this.displayStyle, integrationCreate.displayStyle) &&
        Objects.equals(this.buttonIconUrl, integrationCreate.buttonIconUrl) &&
        Objects.equals(this.buttonWidth, integrationCreate.buttonWidth) &&
        Objects.equals(this.buttonHeight, integrationCreate.buttonHeight) &&
        Objects.equals(this.integrationOrder, integrationCreate.integrationOrder) &&
        Objects.equals(this.businessName, integrationCreate.businessName) &&
        Objects.equals(this.businessIconUrl, integrationCreate.businessIconUrl) &&
        Objects.equals(this.backgroundImageUrl, integrationCreate.backgroundImageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, pageAccessToken, appId, appSecret, accountSid, authToken, phoneNumberSid, token, channelId, channelSecret, channelAccessToken, encodingAesKey, fromAddress, certificate, password, autoUpdateBadge, serverKey, senderId, consumerKey, consumerSecret, accessTokenKey, accessTokenSecret, accessKey, originator, brandColor, conversationColor, actionColor, displayStyle, buttonIconUrl, buttonWidth, buttonHeight, integrationOrder, businessName, businessIconUrl, backgroundImageUrl);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IntegrationCreate {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    pageAccessToken: ").append(toIndentedString(pageAccessToken)).append("\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appSecret: ").append(toIndentedString(appSecret)).append("\n");
    sb.append("    accountSid: ").append(toIndentedString(accountSid)).append("\n");
    sb.append("    authToken: ").append(toIndentedString(authToken)).append("\n");
    sb.append("    phoneNumberSid: ").append(toIndentedString(phoneNumberSid)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    channelId: ").append(toIndentedString(channelId)).append("\n");
    sb.append("    channelSecret: ").append(toIndentedString(channelSecret)).append("\n");
    sb.append("    channelAccessToken: ").append(toIndentedString(channelAccessToken)).append("\n");
    sb.append("    encodingAesKey: ").append(toIndentedString(encodingAesKey)).append("\n");
    sb.append("    fromAddress: ").append(toIndentedString(fromAddress)).append("\n");
    sb.append("    certificate: ").append(toIndentedString(certificate)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    autoUpdateBadge: ").append(toIndentedString(autoUpdateBadge)).append("\n");
    sb.append("    serverKey: ").append(toIndentedString(serverKey)).append("\n");
    sb.append("    senderId: ").append(toIndentedString(senderId)).append("\n");
    sb.append("    consumerKey: ").append(toIndentedString(consumerKey)).append("\n");
    sb.append("    consumerSecret: ").append(toIndentedString(consumerSecret)).append("\n");
    sb.append("    accessTokenKey: ").append(toIndentedString(accessTokenKey)).append("\n");
    sb.append("    accessTokenSecret: ").append(toIndentedString(accessTokenSecret)).append("\n");
    sb.append("    accessKey: ").append(toIndentedString(accessKey)).append("\n");
    sb.append("    originator: ").append(toIndentedString(originator)).append("\n");
    sb.append("    brandColor: ").append(toIndentedString(brandColor)).append("\n");
    sb.append("    conversationColor: ").append(toIndentedString(conversationColor)).append("\n");
    sb.append("    actionColor: ").append(toIndentedString(actionColor)).append("\n");
    sb.append("    displayStyle: ").append(toIndentedString(displayStyle)).append("\n");
    sb.append("    buttonIconUrl: ").append(toIndentedString(buttonIconUrl)).append("\n");
    sb.append("    buttonWidth: ").append(toIndentedString(buttonWidth)).append("\n");
    sb.append("    buttonHeight: ").append(toIndentedString(buttonHeight)).append("\n");
    sb.append("    integrationOrder: ").append(toIndentedString(integrationOrder)).append("\n");
    sb.append("    businessName: ").append(toIndentedString(businessName)).append("\n");
    sb.append("    businessIconUrl: ").append(toIndentedString(businessIconUrl)).append("\n");
    sb.append("    backgroundImageUrl: ").append(toIndentedString(backgroundImageUrl)).append("\n");
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

