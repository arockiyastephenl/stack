/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class ListConfigsAvailableConnectorsResponse {
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.ConnectorsConfigsResponse connectorsConfigsResponse;

    public ListConfigsAvailableConnectorsResponse withConnectorsConfigsResponse(com.formance.formance_sdk.models.shared.ConnectorsConfigsResponse connectorsConfigsResponse) {
        this.connectorsConfigsResponse = connectorsConfigsResponse;
        return this;
    }
    
    
    public String contentType;

    public ListConfigsAvailableConnectorsResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    
    public Integer statusCode;

    public ListConfigsAvailableConnectorsResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public ListConfigsAvailableConnectorsResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public ListConfigsAvailableConnectorsResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
