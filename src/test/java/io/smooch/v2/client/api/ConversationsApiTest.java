/*
 * Sunshine Conversations API
 * #  <aside class=\"notice\">As a stepping stone to new and greater things, we’ve released an update to the SunCo API, which is v2. For users wanting to access v1, please proceed <a href=\"https://docs.smooch.io/rest/\">here</a>.  </aside>  # Introduction  Welcome to the Sunshine Conversations API. The API allows you to craft entirely unique messaging experiences for your app and website as well as talk to any backend or external service.  The Sunshine Conversations API is designed according to REST principles. The API accepts JSON in request bodies and requires that the content-type: application/json header be specified for  all such requests. The API will always respond with an object. Depending on context, resources may be returned as single objects or as arrays of objects, nested within the response object.  In some cases, the API will also facilitate cross-origin resource sharing so that it can be called from a web application.  <aside class=\"notice\">Note that for authenticated requests, cross-origin resource sharing is only available to appUser scoped credentials. Attempting to call the API from the browser using  app or account scoped credentials will result in a <a href=\"https://developer.mozilla.org/en-US/docs/Web/Security/Same-origin_policy\">same-origin policy</a> browser error. For more information, refer  to the <a href=\"http://docs.smooch.io/guide/authorization/#handle-credentials-with-caution\">Authorization guide</a>.</aside>  ## API pagination and records limits  Some APIs can be paginated by providing the `offset` query string parameter.  The `offset` is the number of initial records to skip before picking records to return (default 0).  The `limit` query string can also be provided to change the number of records to return (maximum 100, default 25).  All paginated endpoints will eventually support cursor pagination and `offset` based pagination support will be dropped.  ### Cursor Pagination  Some APIs are paginated through cursor pagination. Rather than providing an `offset`, a `page[after]` or `page[before]` query string parameter may be provided. `page[after]` and `page[before]` are cursors pointing to a record id.  The `page[after]` cursor indicates that only records **subsequent** to it should be returned.  The `page[before]` cursor indicates that only records **preceding** it should be returned.  **Only one** of `page[after]` or `page[before]` may be provided in a query, not both.  In cursor pagination, the equivalent to the `limit` query string is the `page[size]` query string parameter.  ## Regions  Sunshine Conversations is available in the following regions. Each Sunshine Conversations region has its own API host.  | Region         | Host                       | | -------------- | -------------------------- | | United States  | https://api.smooch.io      | | European Union | https://api.eu-1.smooch.io |    For more information on regions, visit [the guide](/guide/regions/).    <aside class=\"notice\">When configuring an API host, make sure to always use `https`. Some API clients can have unexpected behaviour when following redirects from `http` to `https`.</aside> 
 *
 * The version of the OpenAPI document: 6.0.0-alpha.2
 * Contact: hello@smooch.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.smooch.v2.client.api;

import io.smooch.v2.client.ApiException;
import io.smooch.v2.client.model.ConversationCreateBody;
import io.smooch.v2.client.model.ConversationListResponse;
import io.smooch.v2.client.model.ConversationResponse;
import io.smooch.v2.client.model.ConversationUpdateBody;
import org.junit.Test;
import org.junit.Ignore;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConversationsApi
 */
public class ConversationsApiTest {

    private final ConversationsApi api = new ConversationsApi();

    /**
     * Create Conversation
     *
     * Create a conversation for the specified user.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createConversationTest() throws ApiException {
        //
        //ConversationCreateBody conversationCreateBody = null;
        //
        //String appId = null;
        //
        //ConversationResponse response = api.createConversation(conversationCreateBody, appId);

        // TODO: test validations
    }
    /**
     * Delete Conversation
     *
     * Delete an entire conversation record, along with its messages and attachments. Note that the default conversation cannot be deleted, but the messages contained [can be](#deleteAllMessages).
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteConversationTest() throws ApiException {
        //
        //String appId = null;
        //
        //String conversationId = null;
        //
        //Object response = api.deleteConversation(appId, conversationId);

        // TODO: test validations
    }
    /**
     * Get Conversation
     *
     * Fetches an individual conversation.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getConversationTest() throws ApiException {
        //
        //String appId = null;
        //
        //String conversationId = null;
        //
        //ConversationResponse response = api.getConversation(appId, conversationId);

        // TODO: test validations
    }
    /**
     * List Conversations
     *
     * Lists all conversations that a user is part of. This API is [paginated](#section/Introduction/API-pagination-and-records-limits). &#x60;&#x60;&#x60;shell    /v2/apps/:appId/conversations?userId&#x3D;42589ad070d43be9b00ff7e5&amp;limit&#x3D;30&amp;offset&#x3D;0 &#x60;&#x60;&#x60; 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listConversationsTest() throws ApiException {
        //
        //String appId = null;
        //
        //String userId = null;
        //
        //String userExternalId = null;
        //
        //Integer limit = null;
        //
        //Integer offset = null;
        //
        //ConversationListResponse response = api.listConversations(appId, userId, userExternalId, limit, offset);

        // TODO: test validations
    }
    /**
     * Update Conversation
     *
     * Updates a conversation record.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateConversationTest() throws ApiException {
        //
        //ConversationUpdateBody conversationUpdateBody = null;
        //
        //String appId = null;
        //
        //String conversationId = null;
        //
        //ConversationResponse response = api.updateConversation(conversationUpdateBody, appId, conversationId);

        // TODO: test validations
    }
}
