// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

import (
	"time"
)

type WalletsTransaction struct {
	Ledger *string `json:"ledger,omitempty"`
	// Metadata associated with the wallet.
	Metadata          map[string]string                   `json:"metadata"`
	PostCommitVolumes map[string]map[string]WalletsVolume `json:"postCommitVolumes,omitempty"`
	Postings          []Posting                           `json:"postings"`
	PreCommitVolumes  map[string]map[string]WalletsVolume `json:"preCommitVolumes,omitempty"`
	Reference         *string                             `json:"reference,omitempty"`
	Timestamp         time.Time                           `json:"timestamp"`
	Txid              int64                               `json:"txid"`
}

func (o *WalletsTransaction) GetLedger() *string {
	if o == nil {
		return nil
	}
	return o.Ledger
}

func (o *WalletsTransaction) GetMetadata() map[string]string {
	if o == nil {
		return map[string]string{}
	}
	return o.Metadata
}

func (o *WalletsTransaction) GetPostCommitVolumes() map[string]map[string]WalletsVolume {
	if o == nil {
		return nil
	}
	return o.PostCommitVolumes
}

func (o *WalletsTransaction) GetPostings() []Posting {
	if o == nil {
		return []Posting{}
	}
	return o.Postings
}

func (o *WalletsTransaction) GetPreCommitVolumes() map[string]map[string]WalletsVolume {
	if o == nil {
		return nil
	}
	return o.PreCommitVolumes
}

func (o *WalletsTransaction) GetReference() *string {
	if o == nil {
		return nil
	}
	return o.Reference
}

func (o *WalletsTransaction) GetTimestamp() time.Time {
	if o == nil {
		return time.Time{}
	}
	return o.Timestamp
}

func (o *WalletsTransaction) GetTxid() int64 {
	if o == nil {
		return 0
	}
	return o.Txid
}
