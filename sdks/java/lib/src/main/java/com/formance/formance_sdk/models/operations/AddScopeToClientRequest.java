/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class AddScopeToClientRequest {
    /**
     * Client ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=clientId")
    public String clientId;

    public AddScopeToClientRequest withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    
    /**
     * Scope ID
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=scopeId")
    public String scopeId;

    public AddScopeToClientRequest withScopeId(String scopeId) {
        this.scopeId = scopeId;
        return this;
    }
    
    public AddScopeToClientRequest(@JsonProperty("clientId") String clientId, @JsonProperty("scopeId") String scopeId) {
        this.clientId = clientId;
        this.scopeId = scopeId;
  }
}
