/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.formance.formance_sdk.utils.DateTimeDeserializer;
import com.formance.formance_sdk.utils.DateTimeSerializer;
import java.time.OffsetDateTime;


public class Log {
    @JsonProperty("data")
    public java.util.Map<String, Object> data;

    public Log withData(java.util.Map<String, Object> data) {
        this.data = data;
        return this;
    }
    
    @JsonSerialize(using = DateTimeSerializer.class)
    @JsonDeserialize(using = DateTimeDeserializer.class)
    @JsonProperty("date")
    public OffsetDateTime date;

    public Log withDate(OffsetDateTime date) {
        this.date = date;
        return this;
    }
    
    @JsonProperty("hash")
    public String hash;

    public Log withHash(String hash) {
        this.hash = hash;
        return this;
    }
    
    @JsonProperty("id")
    public Long id;

    public Log withId(Long id) {
        this.id = id;
        return this;
    }
    
    @JsonProperty("type")
    public LogType type;

    public Log withType(LogType type) {
        this.type = type;
        return this;
    }
    
    public Log(@JsonProperty("data") java.util.Map<String, Object> data, @JsonProperty("date") OffsetDateTime date, @JsonProperty("hash") String hash, @JsonProperty("id") Long id, @JsonProperty("type") LogType type) {
        this.data = data;
        this.date = date;
        this.hash = hash;
        this.id = id;
        this.type = type;
  }
}
