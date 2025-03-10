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


public class StageStatus {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("error")
    public String error;

    public StageStatus withError(String error) {
        this.error = error;
        return this;
    }
    
    @JsonProperty("instanceID")
    public String instanceID;

    public StageStatus withInstanceID(String instanceID) {
        this.instanceID = instanceID;
        return this;
    }
    
    @JsonProperty("stage")
    public Double stage;

    public StageStatus withStage(Double stage) {
        this.stage = stage;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("startedAt")
    public OffsetDateTime startedAt;

    public StageStatus withStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("terminatedAt")
    public OffsetDateTime terminatedAt;

    public StageStatus withTerminatedAt(OffsetDateTime terminatedAt) {
        this.terminatedAt = terminatedAt;
        return this;
    }
    
    public StageStatus(@JsonProperty("instanceID") String instanceID, @JsonProperty("stage") Double stage, @JsonProperty("startedAt") OffsetDateTime startedAt) {
        this.instanceID = instanceID;
        this.stage = stage;
        this.startedAt = startedAt;
  }
}
