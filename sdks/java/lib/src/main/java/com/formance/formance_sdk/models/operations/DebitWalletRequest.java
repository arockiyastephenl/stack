/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class DebitWalletRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.formance.formance_sdk.models.shared.DebitWalletRequest debitWalletRequest;

    public DebitWalletRequest withDebitWalletRequest(com.formance.formance_sdk.models.shared.DebitWalletRequest debitWalletRequest) {
        this.debitWalletRequest = debitWalletRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public DebitWalletRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public DebitWalletRequest(@JsonProperty("id") String id) {
        this.id = id;
  }
}
