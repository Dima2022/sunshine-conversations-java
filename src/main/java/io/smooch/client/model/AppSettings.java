/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.15
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

/**
 * Customizable app settings.
 */
@ApiModel(description = "Customizable app settings.")

public class AppSettings {
  @SerializedName("maskCreditCardNumbers")
  private Boolean maskCreditCardNumbers = null;

  @SerializedName("useAnimalNames")
  private Boolean useAnimalNames = null;

  @SerializedName("conversationRetentionSeconds")
  private Integer conversationRetentionSeconds = null;

  @SerializedName("echoPostback")
  private Boolean echoPostback = null;

  public AppSettings maskCreditCardNumbers(Boolean maskCreditCardNumbers) {
    this.maskCreditCardNumbers = maskCreditCardNumbers;
    return this;
  }

   /**
   * Flag specifying whether credit card numbers will be automatically masked if sent through Smooch.
   * @return maskCreditCardNumbers
  **/
  @ApiModelProperty(value = "Flag specifying whether credit card numbers will be automatically masked if sent through Smooch.")
  public Boolean getMaskCreditCardNumbers() {
    return maskCreditCardNumbers;
  }

  public void setMaskCreditCardNumbers(Boolean maskCreditCardNumbers) {
    this.maskCreditCardNumbers = maskCreditCardNumbers;
  }

  public AppSettings useAnimalNames(Boolean useAnimalNames) {
    this.useAnimalNames = useAnimalNames;
    return this;
  }

   /**
   * Flag specifying whether animal names should be used for anonymous users.
   * @return useAnimalNames
  **/
  @ApiModelProperty(value = "Flag specifying whether animal names should be used for anonymous users.")
  public Boolean getUseAnimalNames() {
    return useAnimalNames;
  }

  public void setUseAnimalNames(Boolean useAnimalNames) {
    this.useAnimalNames = useAnimalNames;
  }

  public AppSettings conversationRetentionSeconds(Integer conversationRetentionSeconds) {
    this.conversationRetentionSeconds = conversationRetentionSeconds;
    return this;
  }

   /**
   * Number of seconds of inactivity before a conversation’s messages will be automatically deleted.
   * @return conversationRetentionSeconds
  **/
  @ApiModelProperty(value = "Number of seconds of inactivity before a conversation’s messages will be automatically deleted.")
  public Integer getConversationRetentionSeconds() {
    return conversationRetentionSeconds;
  }

  public void setConversationRetentionSeconds(Integer conversationRetentionSeconds) {
    this.conversationRetentionSeconds = conversationRetentionSeconds;
  }

  public AppSettings echoPostback(Boolean echoPostback) {
    this.echoPostback = echoPostback;
    return this;
  }

   /**
   * A boolean specifying whether a message should be added to the conversation history when a postback button is clicked.
   * @return echoPostback
  **/
  @ApiModelProperty(value = "A boolean specifying whether a message should be added to the conversation history when a postback button is clicked.")
  public Boolean getEchoPostback() {
    return echoPostback;
  }

  public void setEchoPostback(Boolean echoPostback) {
    this.echoPostback = echoPostback;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppSettings appSettings = (AppSettings) o;
    return Objects.equals(this.maskCreditCardNumbers, appSettings.maskCreditCardNumbers) &&
        Objects.equals(this.useAnimalNames, appSettings.useAnimalNames) &&
        Objects.equals(this.conversationRetentionSeconds, appSettings.conversationRetentionSeconds) &&
        Objects.equals(this.echoPostback, appSettings.echoPostback);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maskCreditCardNumbers, useAnimalNames, conversationRetentionSeconds, echoPostback);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppSettings {\n");
    
    sb.append("    maskCreditCardNumbers: ").append(toIndentedString(maskCreditCardNumbers)).append("\n");
    sb.append("    useAnimalNames: ").append(toIndentedString(useAnimalNames)).append("\n");
    sb.append("    conversationRetentionSeconds: ").append(toIndentedString(conversationRetentionSeconds)).append("\n");
    sb.append("    echoPostback: ").append(toIndentedString(echoPostback)).append("\n");
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

