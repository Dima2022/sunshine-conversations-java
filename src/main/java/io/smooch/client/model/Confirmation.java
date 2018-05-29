/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 3.7
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Message;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Confirmation
 */

public class Confirmation {
  @SerializedName("type")
  private String type = null;

  @SerializedName("message")
  private Message message = null;

  public Confirmation type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The confirmation type.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The confirmation type.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Confirmation message(Message message) {
    this.message = message;
    return this;
  }

   /**
   * The message used to reach out to the user. Must be a valid message object as per the post message API.
   * @return message
  **/
  @ApiModelProperty(value = "The message used to reach out to the user. Must be a valid message object as per the post message API.")
  public Message getMessage() {
    return message;
  }

  public void setMessage(Message message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Confirmation confirmation = (Confirmation) o;
    return Objects.equals(this.type, confirmation.type) &&
        Objects.equals(this.message, confirmation.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Confirmation {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

