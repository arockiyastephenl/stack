/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * BalancesCursorResponse - OK
 */

public class BalancesCursorResponse {
    @JsonProperty("cursor")
    public BalancesCursorResponseCursor cursor;

    public BalancesCursorResponse withCursor(BalancesCursorResponseCursor cursor) {
        this.cursor = cursor;
        return this;
    }
    
    public BalancesCursorResponse(@JsonProperty("cursor") BalancesCursorResponseCursor cursor) {
        this.cursor = cursor;
  }
}
