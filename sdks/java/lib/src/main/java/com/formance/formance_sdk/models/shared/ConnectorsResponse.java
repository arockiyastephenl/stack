/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ConnectorsResponse - OK
 */

public class ConnectorsResponse {
    @JsonProperty("data")
    public ConnectorsResponseData[] data;

    public ConnectorsResponse withData(ConnectorsResponseData[] data) {
        this.data = data;
        return this;
    }
    
    public ConnectorsResponse(@JsonProperty("data") ConnectorsResponseData[] data) {
        this.data = data;
  }
}
