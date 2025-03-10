/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class GetPaymentRequest {
    /**
     * The payment ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=paymentId")
    public String paymentId;

    public GetPaymentRequest withPaymentId(String paymentId) {
        this.paymentId = paymentId;
        return this;
    }
    
    public GetPaymentRequest(@JsonProperty("paymentId") String paymentId) {
        this.paymentId = paymentId;
  }
}
