// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

type UpdateScopeRequest struct {
	Label    string                 `json:"label"`
	Metadata map[string]interface{} `json:"metadata,omitempty"`
}

func (o *UpdateScopeRequest) GetLabel() string {
	if o == nil {
		return ""
	}
	return o.Label
}

func (o *UpdateScopeRequest) GetMetadata() map[string]interface{} {
	if o == nil {
		return nil
	}
	return o.Metadata
}
