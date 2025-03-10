/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.net.http.HttpResponse;

public class GetLedgerInfoResponse {
    
    public String contentType;

    public GetLedgerInfoResponse withContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }
    
    /**
     * Error
     */
    
    public org.openapis.openapi.models.shared.ErrorResponse errorResponse;

    public GetLedgerInfoResponse withErrorResponse(org.openapis.openapi.models.shared.ErrorResponse errorResponse) {
        this.errorResponse = errorResponse;
        return this;
    }
    
    /**
     * OK
     */
    
    public org.openapis.openapi.models.shared.LedgerInfoResponse ledgerInfoResponse;

    public GetLedgerInfoResponse withLedgerInfoResponse(org.openapis.openapi.models.shared.LedgerInfoResponse ledgerInfoResponse) {
        this.ledgerInfoResponse = ledgerInfoResponse;
        return this;
    }
    
    
    public Integer statusCode;

    public GetLedgerInfoResponse withStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    
    
    public HttpResponse<byte[]> rawResponse;

    public GetLedgerInfoResponse withRawResponse(HttpResponse<byte[]> rawResponse) {
        this.rawResponse = rawResponse;
        return this;
    }
    
    public GetLedgerInfoResponse(@JsonProperty("ContentType") String contentType, @JsonProperty("StatusCode") Integer statusCode) {
        this.contentType = contentType;
        this.statusCode = statusCode;
  }
}
