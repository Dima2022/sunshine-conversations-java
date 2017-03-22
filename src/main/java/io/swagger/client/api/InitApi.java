/*
 * Smooch
 * The Smooch API is a unified interface for powering messaging in your customer experiences across every channel. Our API speeds access to new markets, reduces time to ship, eliminates complexity, and helps you build the best experiences for your customers. For more information, visit our [official documentation](https://docs.smooch.io).
 *
 * OpenAPI spec version: 1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.api;

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


import io.swagger.client.model.Init;
import io.swagger.client.model.InitResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InitApi {
    private ApiClient apiClient;

    public InitApi() {
        this(Configuration.getDefaultApiClient());
    }

    public InitApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /* Build call for init */
    private com.squareup.okhttp.Call initCall(Init initBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = initBody;
        
        // create path and map variables
        String localVarPath = "/init";

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
    private com.squareup.okhttp.Call initValidateBeforeCall(Init initBody, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'initBody' is set
        if (initBody == null) {
            throw new ApiException("Missing the required parameter 'initBody' when calling init(Async)");
        }
        
        
        com.squareup.okhttp.Call call = initCall(initBody, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * 
     * This API is called by an iOS, Android, or browser client when the app is first loaded. It serves a number of purposes. 1. Initializes a new *appUser* and *client* if they don’t yet exist. 2. Updates an existing app user’s profile and client information. 3. Authenticates the *appUser* if *jwt* credentials are provided. 
     * @param initBody Body for an init request. (required)
     * @return InitResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InitResponse init(Init initBody) throws ApiException {
        ApiResponse<InitResponse> resp = initWithHttpInfo(initBody);
        return resp.getData();
    }

    /**
     * 
     * This API is called by an iOS, Android, or browser client when the app is first loaded. It serves a number of purposes. 1. Initializes a new *appUser* and *client* if they don’t yet exist. 2. Updates an existing app user’s profile and client information. 3. Authenticates the *appUser* if *jwt* credentials are provided. 
     * @param initBody Body for an init request. (required)
     * @return ApiResponse&lt;InitResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InitResponse> initWithHttpInfo(Init initBody) throws ApiException {
        com.squareup.okhttp.Call call = initValidateBeforeCall(initBody, null, null);
        Type localVarReturnType = new TypeToken<InitResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * This API is called by an iOS, Android, or browser client when the app is first loaded. It serves a number of purposes. 1. Initializes a new *appUser* and *client* if they don’t yet exist. 2. Updates an existing app user’s profile and client information. 3. Authenticates the *appUser* if *jwt* credentials are provided. 
     * @param initBody Body for an init request. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call initAsync(Init initBody, final ApiCallback<InitResponse> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = initValidateBeforeCall(initBody, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InitResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
