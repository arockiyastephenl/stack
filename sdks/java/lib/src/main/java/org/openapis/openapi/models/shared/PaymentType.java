/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package org.openapis.openapi.models.shared;

import com.fasterxml.jackson.annotation.JsonValue;

public enum PaymentType {
    PAY_IN("PAY-IN"),
    PAYOUT("PAYOUT"),
    TRANSFER("TRANSFER"),
    OTHER("OTHER");

    @JsonValue
    public final String value;

    private PaymentType(String value) {
        this.value = value;
    }
}
