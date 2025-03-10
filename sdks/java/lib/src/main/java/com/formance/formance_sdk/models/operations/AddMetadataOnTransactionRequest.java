/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class AddMetadataOnTransactionRequest {
    /**
     * Use an idempotency key
     */
    @SpeakeasyMetadata("header:style=simple,explode=false,name=Idempotency-Key")
    public String idempotencyKey;

    public AddMetadataOnTransactionRequest withIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
        return this;
    }
    
    /**
     * metadata
     */
    @SpeakeasyMetadata("request:mediaType=application/json")
    public java.util.Map<String, String> requestBody;

    public AddMetadataOnTransactionRequest withRequestBody(java.util.Map<String, String> requestBody) {
        this.requestBody = requestBody;
        return this;
    }
    
    /**
     * Set async mode.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=async")
    public Boolean async;

    public AddMetadataOnTransactionRequest withAsync(Boolean async) {
        this.async = async;
        return this;
    }
    
    /**
     * Set the dryRun mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker.
     */
    @SpeakeasyMetadata("queryParam:style=form,explode=true,name=dryRun")
    public Boolean dryRun;

    public AddMetadataOnTransactionRequest withDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    
    /**
     * Name of the ledger.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=ledger")
    public String ledger;

    public AddMetadataOnTransactionRequest withLedger(String ledger) {
        this.ledger = ledger;
        return this;
    }
    
    /**
     * Transaction ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=txid")
    public Long txid;

    public AddMetadataOnTransactionRequest withTxid(Long txid) {
        this.txid = txid;
        return this;
    }
    
    public AddMetadataOnTransactionRequest(@JsonProperty("ledger") String ledger, @JsonProperty("txid") Long txid) {
        this.ledger = ledger;
        this.txid = txid;
  }
}
