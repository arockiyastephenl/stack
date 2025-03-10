/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * GetWalletResponse - Wallet
 */

public class GetWalletResponse {
    @JsonProperty("data")
    public WalletWithBalances data;

    public GetWalletResponse withData(WalletWithBalances data) {
        this.data = data;
        return this;
    }
    
    public GetWalletResponse(@JsonProperty("data") WalletWithBalances data) {
        this.data = data;
  }
}
