// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

type ConnectorsResponseData struct {
	Enabled  *bool      `json:"enabled,omitempty"`
	Provider *Connector `json:"provider,omitempty"`
}

func (o *ConnectorsResponseData) GetEnabled() *bool {
	if o == nil {
		return nil
	}
	return o.Enabled
}

func (o *ConnectorsResponseData) GetProvider() *Connector {
	if o == nil {
		return nil
	}
	return o.Provider
}

// ConnectorsResponse - OK
type ConnectorsResponse struct {
	Data []ConnectorsResponseData `json:"data"`
}

func (o *ConnectorsResponse) GetData() []ConnectorsResponseData {
	if o == nil {
		return []ConnectorsResponseData{}
	}
	return o.Data
}
