/*
 * Sunshine Conversations API
 *
 * The version of the OpenAPI document: 9.1.0
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
import com.zendesk.sunshine_conversations_client.model.Client;
import com.zendesk.sunshine_conversations_client.model.Links;
import com.zendesk.sunshine_conversations_client.model.Meta;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * ClientListResponse
 */
@JsonPropertyOrder({
  ClientListResponse.JSON_PROPERTY_CLIENTS,
  ClientListResponse.JSON_PROPERTY_META,
  ClientListResponse.JSON_PROPERTY_LINKS
})

public class ClientListResponse {
  public static final String JSON_PROPERTY_CLIENTS = "clients";
  private List<Client> clients = null;

  public static final String JSON_PROPERTY_META = "meta";
  private Meta meta;

  public static final String JSON_PROPERTY_LINKS = "links";
  private Links links;


  public ClientListResponse clients(List<Client> clients) {
    
    this.clients = clients;
    return this;
  }

  public ClientListResponse addClientsItem(Client clientsItem) {
    if (this.clients == null) {
      this.clients = new ArrayList<Client>();
    }
    this.clients.add(clientsItem);
    return this;
  }

   /**
   * List of returned clients.
   * @return clients
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "List of returned clients.")
  @JsonProperty(JSON_PROPERTY_CLIENTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<Client> getClients() {
    return clients;
  }


  public void setClients(List<Client> clients) {
    this.clients = clients;
  }


  public ClientListResponse meta(Meta meta) {
    
    this.meta = meta;
    return this;
  }

   /**
   * Get meta
   * @return meta
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_META)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Meta getMeta() {
    return meta;
  }


  public void setMeta(Meta meta) {
    this.meta = meta;
  }


  public ClientListResponse links(Links links) {
    
    this.links = links;
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Links getLinks() {
    return links;
  }


  public void setLinks(Links links) {
    this.links = links;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClientListResponse clientListResponse = (ClientListResponse) o;
    return Objects.equals(this.clients, clientListResponse.clients) &&
        Objects.equals(this.meta, clientListResponse.meta) &&
        Objects.equals(this.links, clientListResponse.links);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clients, meta, links);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClientListResponse {\n");
    sb.append("    clients: ").append(toIndentedString(clients)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
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

