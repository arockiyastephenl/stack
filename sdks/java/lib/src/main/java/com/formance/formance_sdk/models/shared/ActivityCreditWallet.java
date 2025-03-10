/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class ActivityCreditWallet {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("data")
    public CreditWalletRequest data;

    public ActivityCreditWallet withData(CreditWalletRequest data) {
        this.data = data;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("id")
    public String id;

    public ActivityCreditWallet withId(String id) {
        this.id = id;
        return this;
    }
    
    public ActivityCreditWallet(){}
}
