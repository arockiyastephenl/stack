/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;


public class GetBalancesAggregatedResponse {
    /**
     * OK
     */
    
    public com.formance.formance_sdk.models.shared.AggregateBalancesResponse aggregateBalancesResponse;

    public GetBalancesAggregatedResponse withAggregateBalancesResponse(com.formance.formance_sdk.models.shared.AggregateBalancesResponse aggregateBalancesResponse) {
        this.aggregateBalancesResponse = aggregateBalancesResponse;
        return this;
    }
    
    
    public String contentType;

    public GetBalancesAggregatedResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Error
     */
    
    public com.formance.formance_sdk.models.shared.ErrorResponse errorResponse;

    public GetBalancesAggregatedResponse withErrorResponse(com.formance.formance_sdk.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetBalancesAggregatedResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetBalancesAggregatedResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetBalancesAggregatedResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
