/* 
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

package com.formance.formance_sdk.models.shared;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;


public class CreateClientRequest {
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("description")
    public String description;

    public CreateClientRequest withDescription(String description) {
        this.description = description;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("metadata")
    public java.util.Map<String, Object> metadata;

    public CreateClientRequest withMetadata(java.util.Map<String, Object> metadata) {
        this.metadata = metadata;
        return this;
    }
    
    @JsonProperty("name")
    public String name;

    public CreateClientRequest withName(String name) {
        this.name = name;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("postLogoutRedirectUris")
    public String[] postLogoutRedirectUris;

    public CreateClientRequest withPostLogoutRedirectUris(String[] postLogoutRedirectUris) {
        this.postLogoutRedirectUris = postLogoutRedirectUris;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("public")
    public Boolean public_;

    public CreateClientRequest withPublic(Boolean public_) {
        this.public_ = public_;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("redirectUris")
    public String[] redirectUris;

    public CreateClientRequest withRedirectUris(String[] redirectUris) {
        this.redirectUris = redirectUris;
        return this;
    }
    
    @JsonInclude(Include.NON_ABSENT)
    @JsonProperty("trusted")
    public Boolean trusted;

    public CreateClientRequest withTrusted(Boolean trusted) {
        this.trusted = trusted;
        return this;
    }
    
    public CreateClientRequest(@JsonProperty("name") String name) {
        this.name = name;
  }
}
