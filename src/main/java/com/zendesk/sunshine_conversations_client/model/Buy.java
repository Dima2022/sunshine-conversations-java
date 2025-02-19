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
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.zendesk.sunshine_conversations_client.model.Action;
import com.zendesk.sunshine_conversations_client.model.ActionSubset;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import java.net.URI;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * Buy
 */
@JsonPropertyOrder({
  Buy.JSON_PROPERTY_TYPE,
  Buy.JSON_PROPERTY_TEXT,
  Buy.JSON_PROPERTY_AMOUNT,
  Buy.JSON_PROPERTY_CURRENCY,
  Buy.JSON_PROPERTY_METADATA
})

public class Buy implements Action, ActionSubset {
  public static final String JSON_PROPERTY_TYPE = "type";
  private String type = "buy";

  public static final String JSON_PROPERTY_TEXT = "text";
  private String text;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Integer amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Object> metadata = JsonNullable.<Object>undefined();


  public Buy type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of action.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The type of action.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public Buy text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * The button text.
   * @return text
  **/
  @ApiModelProperty(example = "Buy vinegar", required = true, value = "The button text.")
  @JsonProperty(JSON_PROPERTY_TEXT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public Buy amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * The amount being charged. It needs to be specified in cents and is an integer (9.99$ -&gt; 999).
   * @return amount
  **/
  @ApiModelProperty(example = "8000", required = true, value = "The amount being charged. It needs to be specified in cents and is an integer (9.99$ -> 999).")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public Buy currency(String currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * An ISO 4217 standard currency code in lowercase. Used for actions of type buy.
   * @return currency
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "CAD", value = "An ISO 4217 standard currency code in lowercase. Used for actions of type buy.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrency() {
    return currency;
  }


  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public Buy metadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
    
    return this;
  }

   /**
   * Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. 
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"lang\":\"en-ca\"}", value = "Flat object containing custom properties. Strings, numbers and booleans  are the only supported format that can be passed to metadata. The metadata is limited to 4KB in size. ")
  @JsonIgnore

  public Object getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Object> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Object> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Object metadata) {
    this.metadata = JsonNullable.<Object>of(metadata);
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Buy buy = (Buy) o;
    return Objects.equals(this.type, buy.type) &&
        Objects.equals(this.text, buy.text) &&
        Objects.equals(this.amount, buy.amount) &&
        Objects.equals(this.currency, buy.currency) &&
        Objects.equals(this.metadata, buy.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, text, amount, currency, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Buy {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

