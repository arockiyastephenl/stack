// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"math/big"
)

type Volume struct {
	Balance *big.Int `json:"balance,omitempty"`
	Input   *big.Int `json:"input"`
	Output  *big.Int `json:"output"`
}

func (o *Volume) GetBalance() *big.Int {
	if o == nil {
		return nil
	}
	return o.Balance
}

func (o *Volume) GetInput() *big.Int {
	if o == nil {
		return big.NewInt(0)
	}
	return o.Input
}

func (o *Volume) GetOutput() *big.Int {
	if o == nil {
		return big.NewInt(0)
	}
	return o.Output
}
