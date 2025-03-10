// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"math/big"
	"time"
)

type Balance struct {
	ExpiresAt *time.Time `json:"expiresAt,omitempty"`
	Name      string     `json:"name"`
	Priority  *big.Int   `json:"priority,omitempty"`
}

func (o *Balance) GetExpiresAt() *time.Time {
	if o == nil {
		return nil
	}
	return o.ExpiresAt
}

func (o *Balance) GetName() string {
	if o == nil {
		return ""
	}
	return o.Name
}

func (o *Balance) GetPriority() *big.Int {
	if o == nil {
		return nil
	}
	return o.Priority
}
