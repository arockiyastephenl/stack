/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * ListRunsResponse - List of workflow instances
 */

public class ListRunsResponse {
    @JsonProperty("data")
    public WorkflowInstance[] data;

    public ListRunsResponse withData(WorkflowInstance[] data) {
        this.data = data;
        return this;
    }
    
    public ListRunsResponse(@JsonProperty("data") WorkflowInstance[] data) {
        this.data = data;
  }
}
