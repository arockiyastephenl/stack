/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Account {
    @JsonProperty("address")
    public String address;

    public Account withAddress(String address) {
        this.address = address;
        return this;
    }
    
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public Account withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    public Account(@JsonProperty("address") String address, @JsonProperty("metadata") java.util.Map<String, String> metadata) {
        this.address = address;
        this.metadata = metadata;
  }
}
