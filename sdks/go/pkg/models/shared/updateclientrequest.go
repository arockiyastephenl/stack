// Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.

package shared

type UpdateClientRequest struct {
	Description            *string                `json:"description,omitempty"`
	Metadata               map[string]interface{} `json:"metadata,omitempty"`
	Name                   string                 `json:"name"`
	PostLogoutRedirectUris []string               `json:"postLogoutRedirectUris,omitempty"`
	Public                 *bool                  `json:"public,omitempty"`
	RedirectUris           []string               `json:"redirectUris,omitempty"`
	Trusted                *bool                  `json:"trusted,omitempty"`
}

func (o *UpdateClientRequest) GetDescription() *string {
	if o == nil {
		return nil
	}
	return o.Description
}

func (o *UpdateClientRequest) GetMetadata() map[string]interface{} {
	if o == nil {
		return nil
	}
	return o.Metadata
}

func (o *UpdateClientRequest) GetName() string {
	if o == nil {
		return ""
	}
	return o.Name
}

func (o *UpdateClientRequest) GetPostLogoutRedirectUris() []string {
	if o == nil {
		return nil
	}
	return o.PostLogoutRedirectUris
}

func (o *UpdateClientRequest) GetPublic() *bool {
	if o == nil {
		return nil
	}
	return o.Public
}

func (o *UpdateClientRequest) GetRedirectUris() []string {
	if o == nil {
		return nil
	}
	return o.RedirectUris
}

func (o *UpdateClientRequest) GetTrusted() *bool {
	if o == nil {
		return nil
	}
	return o.Trusted
}
