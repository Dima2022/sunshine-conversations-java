/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.33
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.ChannelEntityItem;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * AppUserChannelsResponse
 */

public class AppUserChannelsResponse {
  @SerializedName("channels")
  private List<ChannelEntityItem> channels = new ArrayList<ChannelEntityItem>();

  public AppUserChannelsResponse channels(List<ChannelEntityItem> channels) {
    this.channels = channels;
    return this;
  }

  public AppUserChannelsResponse addChannelsItem(ChannelEntityItem channelsItem) {
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * An array of objects containing the channel type and the entity id.
   * @return channels
  **/
  @ApiModelProperty(required = true, value = "An array of objects containing the channel type and the entity id.")
  public List<ChannelEntityItem> getChannels() {
    return channels;
  }

  public void setChannels(List<ChannelEntityItem> channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AppUserChannelsResponse appUserChannelsResponse = (AppUserChannelsResponse) o;
    return Objects.equals(this.channels, appUserChannelsResponse.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AppUserChannelsResponse {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

