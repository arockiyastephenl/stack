// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"net/http"
)

type DeleteTransientScopeRequest struct {
	// Scope ID
	ScopeID string `pathParam:"style=simple,explode=false,name=scopeId"`
	// Transient scope ID
	TransientScopeID string `pathParam:"style=simple,explode=false,name=transientScopeId"`
}

func (o *DeleteTransientScopeRequest) GetScopeID() string {
	if o == nil {
		return ""
	}
	return o.ScopeID
}

func (o *DeleteTransientScopeRequest) GetTransientScopeID() string {
	if o == nil {
		return ""
	}
	return o.TransientScopeID
}

type DeleteTransientScopeResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
}

func (o *DeleteTransientScopeResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *DeleteTransientScopeResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *DeleteTransientScopeResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}
