/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class StageSendDestinationAccount {
    @JsonProperty("id")
    public String id;

    public StageSendDestinationAccount withId(String id) {
        this.id = id;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("ledger")
    public String ledger;

    public StageSendDestinationAccount withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    public StageSendDestinationAccount(@JsonProperty("id") String id) {
        this.id = id;
  }
}
