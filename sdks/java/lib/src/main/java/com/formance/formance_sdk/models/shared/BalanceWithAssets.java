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


public class BalanceWithAssets {
    @JsonProperty("assets")
    public java.util.Map<String, Long> assets;

    public BalanceWithAssets withAssets(java.util.Map<String, Long> assets) {
        this.assets = assets;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("expiresAt")
    public OffsetDateTime expiresAt;

    public BalanceWithAssets withExpiresAt(OffsetDateTime expiresAt) {
        this.expiresAt = expiresAt;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public BalanceWithAssets withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("priority")
    public Long priority;

    public BalanceWithAssets withPriority(Long priority) {
        this.priority = priority;
        return this;
    }
    
    public BalanceWithAssets(@JsonProperty("assets") java.util.Map<String, Long> assets, @JsonProperty("name") String name) {
        this.assets = assets;
        this.name = name;
  }
}
