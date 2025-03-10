/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class CreateBalanceRequest {
    @SpeakeasyMetadata("request:mediaType=application/json")
    public com.formance.formance_sdk.models.shared.CreateBalanceRequest createBalanceRequest;

    public CreateBalanceRequest withCreateBalanceRequest(com.formance.formance_sdk.models.shared.CreateBalanceRequest createBalanceRequest) {
        this.createBalanceRequest = createBalanceRequest;
        return this;
    }
    
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=id")
    public String id;

    public CreateBalanceRequest withId(String id) {
        this.id = id;
        return this;
    }
    
    public CreateBalanceRequest(@JsonProperty("id") String id) {
        this.id = id;
  }
}
