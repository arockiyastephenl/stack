/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.operations;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.formance.formance_sdk.utils.SpeakeasyMetadata;


public class GetConnectorTaskRequest {
    /**
     * The name of the connector.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=connector")
    public com.formance.formance_sdk.models.shared.Connector connector;

    public GetConnectorTaskRequest withConnector(com.formance.formance_sdk.models.shared.Connector connector) {
        this.connector = connector;
        return this;
    }
    
    /**
     * The task ID.
     */
    @SpeakeasyMetadata("pathParam:style=simple,explode=false,name=taskId")
    public String taskId;

    public GetConnectorTaskRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    
    public GetConnectorTaskRequest(@JsonProperty("connector") com.formance.formance_sdk.models.shared.Connector connector, @JsonProperty("taskId") String taskId) {
        this.connector = connector;
        this.taskId = taskId;
  }
}
