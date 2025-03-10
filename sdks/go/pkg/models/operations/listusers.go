// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"github.com/formancehq/formance-sdk-go/pkg/models/shared"
	"net/http"
)

type ListUsersResponse struct {
	ContentType string
	// List of users
	ListUsersResponse *shared.ListUsersResponse
	StatusCode        int
	RawResponse       *http.Response
}

func (o *ListUsersResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *ListUsersResponse) GetListUsersResponse() *shared.ListUsersResponse {
	if o == nil {
		return nil
	}
	return o.ListUsersResponse
}

func (o *ListUsersResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *ListUsersResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}
