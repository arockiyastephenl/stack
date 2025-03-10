/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.DateTimeDeserializer;
import com.formance.formance_sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class ExpandedTransaction {
    @JsonProperty("metadata")
    public java.util.Map<String, String> metadata;

    public ExpandedTransaction withMetadata(java.util.Map<String, String> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonProperty("postCommitVolumes")
    public java.util.Map<String, java.util.Map<String, Volume>> postCommitVolumes;

    public ExpandedTransaction withPostCommitVolumes(java.util.Map<String, java.util.Map<String, Volume>> postCommitVolumes) {
        this.postCommitVolumes = postCommitVolumes;
        return this;
    }
    
    @JsonProperty("postings")
    public Posting[] postings;

    public ExpandedTransaction withPostings(Posting[] postings) {
        this.postings = postings;
        return this;
    }
    
    @JsonProperty("preCommitVolumes")
    public java.util.Map<String, java.util.Map<String, Volume>> preCommitVolumes;

    public ExpandedTransaction withPreCommitVolumes(java.util.Map<String, java.util.Map<String, Volume>> preCommitVolumes) {
        this.preCommitVolumes = preCommitVolumes;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("reference")
    public String reference;

    public ExpandedTransaction withReference(String reference) {
        this.reference = reference;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("timestamp")
    public OffsetDateTime timestamp;

    public ExpandedTransaction withTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    
    @JsonProperty("txid")
    public Long txid;

    public ExpandedTransaction withTxid(Long txid) {
        this.txid = txid;
        return this;
    }
    
    public ExpandedTransaction(@JsonProperty("metadata") java.util.Map<String, String> metadata, @JsonProperty("postCommitVolumes") java.util.Map<String, java.util.Map<String, Volume>> postCommitVolumes, @JsonProperty("postings") Posting[] postings, @JsonProperty("preCommitVolumes") java.util.Map<String, java.util.Map<String, Volume>> preCommitVolumes, @JsonProperty("timestamp") OffsetDateTime timestamp, @JsonProperty("txid") Long txid) {
        this.metadata = metadata;
        this.postCommitVolumes = postCommitVolumes;
        this.postings = postings;
        this.preCommitVolumes = preCommitVolumes;
        this.timestamp = timestamp;
        this.txid = txid;
  }
}
