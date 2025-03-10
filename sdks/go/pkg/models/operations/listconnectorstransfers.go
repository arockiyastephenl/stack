// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package operations

import (
	"github.com/formancehq/formance-sdk-go/pkg/models/shared"
	"net/http"
)

type ListConnectorsTransfersRequest struct {
	// The name of the connector.
	Connector shared.Connector `pathParam:"style=simple,explode=false,name=connector"`
}

func (o *ListConnectorsTransfersRequest) GetConnector() shared.Connector {
	if o == nil {
		return shared.Connector("")
	}
	return o.Connector
}

type ListConnectorsTransfersResponse struct {
	ContentType string
	StatusCode  int
	RawResponse *http.Response
	// OK
	TransfersResponse *shared.TransfersResponse
}

func (o *ListConnectorsTransfersResponse) GetContentType() string {
	if o == nil {
		return ""
	}
	return o.ContentType
}

func (o *ListConnectorsTransfersResponse) GetStatusCode() int {
	if o == nil {
		return 0
	}
	return o.StatusCode
}

func (o *ListConnectorsTransfersResponse) GetRawResponse() *http.Response {
	if o == nil {
		return nil
	}
	return o.RawResponse
}

func (o *ListConnectorsTransfersResponse) GetTransfersResponse() *shared.TransfersResponse {
	if o == nil {
		return nil
	}
	return o.TransfersResponse
}
