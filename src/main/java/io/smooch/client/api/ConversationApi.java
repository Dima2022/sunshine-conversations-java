/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 2.3
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.smooch.client.api;

import io.smooch.client.ApiCallback;
import io.smooch.client.ApiClient;
import io.smooch.client.ApiException;
import io.smooch.client.ApiResponse;
import io.smooch.client.Configuration;
import io.smooch.client.Pair;
import io.smooch.client.ProgressRequestBody;
import io.smooch.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.smooch.client.model.GetMessagesResponse;
import io.smooch.client.model.MessagePost;
import io.smooch.client.model.MessageResponse;
import io.smooch.client.model.TypingActivityTrigger;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConversationApi {
    private ApiClient apiClient;

    public ConversationApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ConversationApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for deleteMessages
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteMessagesCall(String appId, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/appusers/{userId}/messages"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteMessagesValidateBeforeCall(String appId, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling deleteMessages(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling deleteMessages(Async)");
        }
        
        
        com.squareup.okhttp.Call call = deleteMessagesCall(appId, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Clears the message history for a user, permanently deleting all messages, but leaving any connections to Messaging Channels and Business Systems intact. These connections allow for the conversation to continue in the future, while still being associated to the same appUser. 
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void deleteMessages(String appId, String userId) throws ApiException {
        deleteMessagesWithHttpInfo(appId, userId);
    }

    /**
     * 
     * Clears the message history for a user, permanently deleting all messages, but leaving any connections to Messaging Channels and Business Systems intact. These connections allow for the conversation to continue in the future, while still being associated to the same appUser. 
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> deleteMessagesWithHttpInfo(String appId, String userId) throws ApiException {
        com.squareup.okhttp.Call call = deleteMessagesValidateBeforeCall(appId, userId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Clears the message history for a user, permanently deleting all messages, but leaving any connections to Messaging Channels and Business Systems intact. These connections allow for the conversation to continue in the future, while still being associated to the same appUser. 
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteMessagesAsync(String appId, String userId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteMessagesValidateBeforeCall(appId, userId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getMessages
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param before Timestamp of message. The API will return 100 messages before the specified timestamp (excluding any messages with the provided timestamp). (optional)
     * @param after Timestamp of message. The API will return 100 messages after the specified timestamp (excluding any messages with the provided timestamp). (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getMessagesCall(String appId, String userId, String before, String after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/appusers/{userId}/messages"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (before != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "before", before));
        if (after != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "after", after));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getMessagesValidateBeforeCall(String appId, String userId, String before, String after, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling getMessages(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling getMessages(Async)");
        }
        
        
        com.squareup.okhttp.Call call = getMessagesCall(appId, userId, before, after, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Get the specified app user&#39;s messages.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param before Timestamp of message. The API will return 100 messages before the specified timestamp (excluding any messages with the provided timestamp). (optional)
     * @param after Timestamp of message. The API will return 100 messages after the specified timestamp (excluding any messages with the provided timestamp). (optional)
     * @return GetMessagesResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetMessagesResponse getMessages(String appId, String userId, String before, String after) throws ApiException {
        ApiResponse<GetMessagesResponse> resp = getMessagesWithHttpInfo(appId, userId, before, after);
        return resp.getData();
    }

    /**
     * 
     * Get the specified app user&#39;s messages.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param before Timestamp of message. The API will return 100 messages before the specified timestamp (excluding any messages with the provided timestamp). (optional)
     * @param after Timestamp of message. The API will return 100 messages after the specified timestamp (excluding any messages with the provided timestamp). (optional)
     * @return ApiResponse&lt;GetMessagesResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetMessagesResponse> getMessagesWithHttpInfo(String appId, String userId, String before, String after) throws ApiException {
        com.squareup.okhttp.Call call = getMessagesValidateBeforeCall(appId, userId, before, after, null, null);
        Type localVarReturnType = new TypeToken<GetMessagesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Get the specified app user&#39;s messages.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param before Timestamp of message. The API will return 100 messages before the specified timestamp (excluding any messages with the provided timestamp). (optional)
     * @param after Timestamp of message. The API will return 100 messages after the specified timestamp (excluding any messages with the provided timestamp). (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getMessagesAsync(String appId, String userId, String before, String after, final ApiCallback<GetMessagesResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getMessagesValidateBeforeCall(appId, userId, before, after, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetMessagesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for postMessage
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param messagePostBody Body for a postMessage request. Additional arguments are necessary based on message type ([text](https://docs.smooch.io/rest#text-message), [image](https://docs.smooch.io/rest#image-message), [carousel](https://docs.smooch.io/rest#carousel-message), [list](https://docs.smooch.io/rest#list-message))  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call postMessageCall(String appId, String userId, MessagePost messagePostBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = messagePostBody;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/appusers/{userId}/messages"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call postMessageValidateBeforeCall(String appId, String userId, MessagePost messagePostBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling postMessage(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling postMessage(Async)");
        }
        
        // verify the required parameter 'messagePostBody' is set
        if (messagePostBody == null) {
            throw new ApiException("Missing the required parameter 'messagePostBody' when calling postMessage(Async)");
        }
        
        
        com.squareup.okhttp.Call call = postMessageCall(appId, userId, messagePostBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Post a message to or from the app user.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param messagePostBody Body for a postMessage request. Additional arguments are necessary based on message type ([text](https://docs.smooch.io/rest#text-message), [image](https://docs.smooch.io/rest#image-message), [carousel](https://docs.smooch.io/rest#carousel-message), [list](https://docs.smooch.io/rest#list-message))  (required)
     * @return MessageResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public MessageResponse postMessage(String appId, String userId, MessagePost messagePostBody) throws ApiException {
        ApiResponse<MessageResponse> resp = postMessageWithHttpInfo(appId, userId, messagePostBody);
        return resp.getData();
    }

    /**
     * 
     * Post a message to or from the app user.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param messagePostBody Body for a postMessage request. Additional arguments are necessary based on message type ([text](https://docs.smooch.io/rest#text-message), [image](https://docs.smooch.io/rest#image-message), [carousel](https://docs.smooch.io/rest#carousel-message), [list](https://docs.smooch.io/rest#list-message))  (required)
     * @return ApiResponse&lt;MessageResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<MessageResponse> postMessageWithHttpInfo(String appId, String userId, MessagePost messagePostBody) throws ApiException {
        com.squareup.okhttp.Call call = postMessageValidateBeforeCall(appId, userId, messagePostBody, null, null);
        Type localVarReturnType = new TypeToken<MessageResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Post a message to or from the app user.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param messagePostBody Body for a postMessage request. Additional arguments are necessary based on message type ([text](https://docs.smooch.io/rest#text-message), [image](https://docs.smooch.io/rest#image-message), [carousel](https://docs.smooch.io/rest#carousel-message), [list](https://docs.smooch.io/rest#list-message))  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call postMessageAsync(String appId, String userId, MessagePost messagePostBody, final ApiCallback<MessageResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = postMessageValidateBeforeCall(appId, userId, messagePostBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<MessageResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for resetUnreadCount
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call resetUnreadCountCall(String appId, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/appusers/{userId}/conversation/read"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call resetUnreadCountValidateBeforeCall(String appId, String userId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling resetUnreadCount(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling resetUnreadCount(Async)");
        }
        
        
        com.squareup.okhttp.Call call = resetUnreadCountCall(appId, userId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Reset the unread count of the conversation to 0.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void resetUnreadCount(String appId, String userId) throws ApiException {
        resetUnreadCountWithHttpInfo(appId, userId);
    }

    /**
     * 
     * Reset the unread count of the conversation to 0.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> resetUnreadCountWithHttpInfo(String appId, String userId) throws ApiException {
        com.squareup.okhttp.Call call = resetUnreadCountValidateBeforeCall(appId, userId, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Reset the unread count of the conversation to 0.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call resetUnreadCountAsync(String appId, String userId, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = resetUnreadCountValidateBeforeCall(appId, userId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for triggerTypingActivity
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param typingActivityTriggerBody Body for a triggerTypingActivity request. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call triggerTypingActivityCall(String appId, String userId, TypingActivityTrigger typingActivityTriggerBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = typingActivityTriggerBody;
        
        // create path and map variables
        String localVarPath = "/apps/{appId}/appusers/{userId}/conversation/activity"
            .replaceAll("\\{" + "appId" + "\\}", apiClient.escapeString(appId.toString()))
            .replaceAll("\\{" + "userId" + "\\}", apiClient.escapeString(userId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "jwt" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call triggerTypingActivityValidateBeforeCall(String appId, String userId, TypingActivityTrigger typingActivityTriggerBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'appId' is set
        if (appId == null) {
            throw new ApiException("Missing the required parameter 'appId' when calling triggerTypingActivity(Async)");
        }
        
        // verify the required parameter 'userId' is set
        if (userId == null) {
            throw new ApiException("Missing the required parameter 'userId' when calling triggerTypingActivity(Async)");
        }
        
        // verify the required parameter 'typingActivityTriggerBody' is set
        if (typingActivityTriggerBody == null) {
            throw new ApiException("Missing the required parameter 'typingActivityTriggerBody' when calling triggerTypingActivity(Async)");
        }
        
        
        com.squareup.okhttp.Call call = triggerTypingActivityCall(appId, userId, typingActivityTriggerBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * Notify Smooch when an app maker starts or stops typing a response.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param typingActivityTriggerBody Body for a triggerTypingActivity request. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void triggerTypingActivity(String appId, String userId, TypingActivityTrigger typingActivityTriggerBody) throws ApiException {
        triggerTypingActivityWithHttpInfo(appId, userId, typingActivityTriggerBody);
    }

    /**
     * 
     * Notify Smooch when an app maker starts or stops typing a response.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param typingActivityTriggerBody Body for a triggerTypingActivity request. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> triggerTypingActivityWithHttpInfo(String appId, String userId, TypingActivityTrigger typingActivityTriggerBody) throws ApiException {
        com.squareup.okhttp.Call call = triggerTypingActivityValidateBeforeCall(appId, userId, typingActivityTriggerBody, null, null);
        return apiClient.execute(call);
    }

    /**
     *  (asynchronously)
     * Notify Smooch when an app maker starts or stops typing a response.
     * @param appId Identifies the app. (required)
     * @param userId Identifies the user. Can be either the smoochId or the userId. (required)
     * @param typingActivityTriggerBody Body for a triggerTypingActivity request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call triggerTypingActivityAsync(String appId, String userId, TypingActivityTrigger typingActivityTriggerBody, final ApiCallback<Void> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = triggerTypingActivityValidateBeforeCall(appId, userId, typingActivityTriggerBody, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
