/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ReadScopeResponse - Retrieved scope
 */

public class ReadScopeResponse {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public Scope data;

    public ReadScopeResponse withData(Scope data) {
        this.data = data;
        return this;
    }
    
    public ReadScopeResponse(){}
}
