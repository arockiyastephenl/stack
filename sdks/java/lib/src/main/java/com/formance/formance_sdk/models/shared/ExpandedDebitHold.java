/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ExpandedDebitHold {
    @JsonProperty("description")
    public String description;

    public ExpandedDebitHold withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("destination")
    public Object destination;

    public ExpandedDebitHold withDestination(Object destination) {
        this.destination = destination;
        return this;
    }
    
    /**
     * The unique ID of the hold.
     */
    @JsonProperty("id")
    public String id;

    public ExpandedDebitHold withId(String id) {
        this.id = id;
        return this;
    }
    
    /**
     * Metadata associated with the hold.
     */
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public ExpandedDebitHold withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    /**
     * Original amount on hold
     */
    @JsonProperty("originalAmount")
    public Long originalAmount;

    public ExpandedDebitHold withOriginalAmount(Long originalAmount) {
        this.originalAmount = originalAmount;
        return this;
    }
    
    /**
     * Remaining amount on hold
     */
    @JsonProperty("remaining")
    public Long remaining;

    public ExpandedDebitHold withRemaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }
    
    /**
     * The ID of the wallet the hold is associated with.
     */
    @JsonProperty("walletID")
    public String walletID;

    public ExpandedDebitHold withWalletID(String walletID) {
        this.walletID = walletID;
        return this;
    }
    
    public ExpandedDebitHold(@JsonProperty("description") String description, @JsonProperty("id") String id, @JsonProperty("metadata") java.util.Map<String, String> metadata, @JsonProperty("originalAmount") Long originalAmount, @JsonProperty("remaining") Long remaining, @JsonProperty("walletID") String walletID) {
        this.description = description;
        this.id = id;
        this.metadata = metadata;
        this.originalAmount = originalAmount;
        this.remaining = remaining;
        this.walletID = walletID;
  }
}
