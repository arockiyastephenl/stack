/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class ActivityGetPayment {
    @JsonProperty("id")
    public String id;

    public ActivityGetPayment withId(String id) {
        this.id = id;
        return this;
    }
    
    public ActivityGetPayment(@JsonProperty("id") String id) {
        this.id = id;
  }
}
