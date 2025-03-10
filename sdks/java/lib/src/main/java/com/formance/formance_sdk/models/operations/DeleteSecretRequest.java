/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class DeleteSecretRequest {
    /**
     * Client ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    public String clientId;

    public DeleteSecretRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Secret ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=secretId")
    public String secretId;

    public DeleteSecretRequest withSecretId(String secretId) {
        this.secretId = secretId;
        return this;
    }
    
    public DeleteSecretRequest(@JsonProperty("clientId") String clientId, @JsonProperty("secretId") String secretId) {
        this.clientId = clientId;
        this.secretId = secretId;
  }
}
