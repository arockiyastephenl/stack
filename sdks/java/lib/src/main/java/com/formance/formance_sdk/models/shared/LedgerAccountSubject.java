/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class LedgerAccountSubject {
    @JsonProperty("identifier")
    public String identifier;

    public LedgerAccountSubject withIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    
    @JsonProperty("type")
    public String type;

    public LedgerAccountSubject withType(String type) {
        this.type = type;
        return this;
    }
    
    public LedgerAccountSubject(@JsonProperty("identifier") String identifier, @JsonProperty("type") String type) {
        this.identifier = identifier;
        this.type = type;
  }
}
