// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

type Account struct {
	Address  string            `json:"address"`
	Metadata map[string]string `json:"metadata"`
}

func (o *Account) GetAddress() string {
	if o == nil {
		return ""
	}
	return o.Address
}

func (o *Account) GetMetadata() map[string]string {
	if o == nil {
		return map[string]string{}
	}
	return o.Metadata
}
