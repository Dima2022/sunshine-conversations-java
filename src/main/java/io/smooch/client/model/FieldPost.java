/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 5.19
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.smooch.client.model.Option;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

/**
 * FieldPost
 */

public class FieldPost {
  @SerializedName("type")
  private String type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("placeholder")
  private String placeholder = null;

  @SerializedName("minSize")
  private Integer minSize = null;

  @SerializedName("maxSize")
  private Integer maxSize = null;

  @SerializedName("options")
  private List<Option> options = null;

  public FieldPost type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The field type. See [**FieldTypeEnum**](Enums.md#FieldTypeEnum) for available values.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "The field type. See [**FieldTypeEnum**](Enums.md#FieldTypeEnum) for available values.")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public FieldPost name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The name of the field. Each field name must be unique per form.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "The name of the field. Each field name must be unique per form.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public FieldPost label(String label) {
    this.label = label;
    return this;
  }

   /**
   * The label to be displayed with the field.
   * @return label
  **/
  @ApiModelProperty(required = true, value = "The label to be displayed with the field.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public FieldPost placeholder(String placeholder) {
    this.placeholder = placeholder;
    return this;
  }

   /**
   * The placeholder text of the field that will be rendered. Only for form messages 
   * @return placeholder
  **/
  @ApiModelProperty(value = "The placeholder text of the field that will be rendered. Only for form messages ")
  public String getPlaceholder() {
    return placeholder;
  }

  public void setPlaceholder(String placeholder) {
    this.placeholder = placeholder;
  }

  public FieldPost minSize(Integer minSize) {
    this.minSize = minSize;
    return this;
  }

   /**
   * The minimum possible length of the response. Defaults to 1 if not specified. Only for text fields in form messages. 
   * @return minSize
  **/
  @ApiModelProperty(value = "The minimum possible length of the response. Defaults to 1 if not specified. Only for text fields in form messages. ")
  public Integer getMinSize() {
    return minSize;
  }

  public void setMinSize(Integer minSize) {
    this.minSize = minSize;
  }

  public FieldPost maxSize(Integer maxSize) {
    this.maxSize = maxSize;
    return this;
  }

   /**
   * The maximum possible length of the response. Defaults to 128 if not specified. Only for text fields in form messages. 
   * @return maxSize
  **/
  @ApiModelProperty(value = "The maximum possible length of the response. Defaults to 128 if not specified. Only for text fields in form messages. ")
  public Integer getMaxSize() {
    return maxSize;
  }

  public void setMaxSize(Integer maxSize) {
    this.maxSize = maxSize;
  }

  public FieldPost options(List<Option> options) {
    this.options = options;
    return this;
  }

  public FieldPost addOptionsItem(Option optionsItem) {
    if (this.options == null) {
      this.options = new ArrayList<Option>();
    }
    this.options.add(optionsItem);
    return this;
  }

   /**
   * The field options that can be selected. The array is limited to 20 options. Only for select fields in form messages. 
   * @return options
  **/
  @ApiModelProperty(value = "The field options that can be selected. The array is limited to 20 options. Only for select fields in form messages. ")
  public List<Option> getOptions() {
    return options;
  }

  public void setOptions(List<Option> options) {
    this.options = options;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FieldPost fieldPost = (FieldPost) o;
    return Objects.equals(this.type, fieldPost.type) &&
        Objects.equals(this.name, fieldPost.name) &&
        Objects.equals(this.label, fieldPost.label) &&
        Objects.equals(this.placeholder, fieldPost.placeholder) &&
        Objects.equals(this.minSize, fieldPost.minSize) &&
        Objects.equals(this.maxSize, fieldPost.maxSize) &&
        Objects.equals(this.options, fieldPost.options);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, label, placeholder, minSize, maxSize, options);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FieldPost {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    placeholder: ").append(toIndentedString(placeholder)).append("\n");
    sb.append("    minSize: ").append(toIndentedString(minSize)).append("\n");
    sb.append("    maxSize: ").append(toIndentedString(maxSize)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
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

