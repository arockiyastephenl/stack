/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonProperty;


public class Version {
    @JsonProperty("health")
    public Boolean health;

    public Version withHealth(Boolean health) {
        this.health = health;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public Version withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonProperty("version")
    public String version;

    public Version withVersion(String version) {
        this.version = version;
        return this;
    }
    
    public Version(@JsonProperty("health") Boolean health, @JsonProperty("name") String name, @JsonProperty("version") String version) {
        this.health = health;
        this.name = name;
        this.version = version;
  }
}
