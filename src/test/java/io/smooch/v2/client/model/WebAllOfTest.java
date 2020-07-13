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


package io.smooch.v2.client.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.smooch.v2.client.model.PrechatCapture;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;


/**
 * Model tests for WebAllOf
 */
public class WebAllOfTest {
    private final WebAllOf model = new WebAllOf();

    /**
     * Model tests for WebAllOf
     */
    @Test
    public void testWebAllOf() {
        // TODO: test WebAllOf
    }

    /**
     * Test the property 'brandColor'
     */
    @Test
    public void brandColorTest() {
        // TODO: test brandColor
    }

    /**
     * Test the property 'fixedIntroPane'
     */
    @Test
    public void fixedIntroPaneTest() {
        // TODO: test fixedIntroPane
    }

    /**
     * Test the property 'conversationColor'
     */
    @Test
    public void conversationColorTest() {
        // TODO: test conversationColor
    }

    /**
     * Test the property 'actionColor'
     */
    @Test
    public void actionColorTest() {
        // TODO: test actionColor
    }

    /**
     * Test the property 'displayStyle'
     */
    @Test
    public void displayStyleTest() {
        // TODO: test displayStyle
    }

    /**
     * Test the property 'buttonIconUrl'
     */
    @Test
    public void buttonIconUrlTest() {
        // TODO: test buttonIconUrl
    }

    /**
     * Test the property 'buttonWidth'
     */
    @Test
    public void buttonWidthTest() {
        // TODO: test buttonWidth
    }

    /**
     * Test the property 'buttonHeight'
     */
    @Test
    public void buttonHeightTest() {
        // TODO: test buttonHeight
    }

    /**
     * Test the property 'integrationOrder'
     */
    @Test
    public void integrationOrderTest() {
        // TODO: test integrationOrder
    }

    /**
     * Test the property 'businessName'
     */
    @Test
    public void businessNameTest() {
        // TODO: test businessName
    }

    /**
     * Test the property 'businessIconUrl'
     */
    @Test
    public void businessIconUrlTest() {
        // TODO: test businessIconUrl
    }

    /**
     * Test the property 'backgroundImageUrl'
     */
    @Test
    public void backgroundImageUrlTest() {
        // TODO: test backgroundImageUrl
    }

    /**
     * Test the property 'originWhitelist'
     */
    @Test
    public void originWhitelistTest() {
        // TODO: test originWhitelist
    }

    /**
     * Test the property 'prechatCapture'
     */
    @Test
    public void prechatCaptureTest() {
        // TODO: test prechatCapture
    }

    /**
     * Test the property 'canUserCreateConversation'
     */
    @Test
    public void canUserCreateConversationTest() {
        // TODO: test canUserCreateConversation
    }

}
