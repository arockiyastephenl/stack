// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

// CreateBalanceResponse - Created balance
type CreateBalanceResponse struct {
	Data Balance `json:"data"`
}

func (o *CreateBalanceResponse) GetData() Balance {
	if o == nil {
		return Balance{}
	}
	return o.Data
}
