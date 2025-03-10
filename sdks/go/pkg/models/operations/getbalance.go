// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"github.com/formancehq/formance-sdk-go/pkg/models/shared"
	"net/http"
)

type GetBalanceRequest struct {
	BalanceName string `pathParam:"style=simple,explode=false,name=balanceName"`
	ID          string `pathParam:"style=simple,explode=false,name=id"`
}

func (o *GetBalanceRequest) GetBalanceName() string {
	if o == nil {
		return ""
	}
	return o.BalanceName
}

func (o *GetBalanceRequest) GetID() string {
	if o == nil {
		return ""
	}
	return o.ID
}

type GetBalanceResponse struct {
	ContentType string
	// Balance summary
	GetBalanceResponse *shared.GetBalanceResponse
	StatusCode         int
	RawResponse        *http.Response
	// Error
	WalletsErrorResponse *shared.WalletsErrorResponse
}

func (o *GetBalanceResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *GetBalanceResponse) GetGetBalanceResponse() *shared.GetBalanceResponse {
	if o == nil {
		return nil
	}
	return o.GetBalanceResponse
}

func (o *GetBalanceResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *GetBalanceResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *GetBalanceResponse) GetWalletsErrorResponse() *shared.WalletsErrorResponse {
	if o == nil {
		return nil
	}
	return o.WalletsErrorResponse
}
