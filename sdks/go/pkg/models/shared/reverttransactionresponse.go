// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

// RevertTransactionResponse - OK
type RevertTransactionResponse struct {
	Data Transaction `json:"data"`
}

func (o *RevertTransactionResponse) GetData() Transaction {
	if o == nil {
		return Transaction{}
	}
	return o.Data
}
