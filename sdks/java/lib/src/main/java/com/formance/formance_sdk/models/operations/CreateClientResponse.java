/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class CreateClientResponse {
    
    public String contentType;

    public CreateClientResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Client created
     */
    
    public com.formance.formance_sdk.models.shared.CreateClientResponse createClientResponse;

    public CreateClientResponse withCreateClientResponse(com.formance.formance_sdk.models.shared.CreateClientResponse createClientResponse) {
        this.createClientResponse = createClientResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public CreateClientResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public CreateClientResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public CreateClientResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
