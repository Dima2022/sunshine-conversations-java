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
import com.zendesk.sunshine_conversations_client.model.Participant;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * The created participant.
 */
@ApiModel(description = "The created participant.")
@JsonPropertyOrder({
  ParticipantResponse.JSON_PROPERTY_PARTICIPANT
})

public class ParticipantResponse {
  public static final String JSON_PROPERTY_PARTICIPANT = "participant";
  private Participant participant;


  public ParticipantResponse participant(Participant participant) {
    
    this.participant = participant;
    return this;
  }

   /**
   * Get participant
   * @return participant
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_PARTICIPANT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Participant getParticipant() {
    return participant;
  }


  public void setParticipant(Participant participant) {
    this.participant = participant;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantResponse participantResponse = (ParticipantResponse) o;
    return Objects.equals(this.participant, participantResponse.participant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(participant);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantResponse {\n");
    sb.append("    participant: ").append(toIndentedString(participant)).append("\n");
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

