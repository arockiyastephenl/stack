package v1beta3

import (
	"time"
)

type LockingStrategyRedisConfig struct {
	// +optional
	Uri string `json:"uri,omitempty"`
	// +optional
	TLS bool `json:"tls"`
	// +optional
	InsecureTLS bool `json:"insecure,omitempty"`
	// +optional
	Duration time.Duration `json:"duration,omitempty"`
	// +optional
	Retry time.Duration `json:"retry,omitempty"`
}

type LockingStrategy struct {
	// +kubebuilder:Enum:={memory,redis}
	// +kubebuilder:default:=memory
	// +optional
	Strategy string `json:"strategy,omitempty"`
	// +optional
	Redis LockingStrategyRedisConfig `json:"redis"`
}

// +kubebuilder:object:generate=true
type LedgerSpec struct {
	Postgres PostgresConfig `json:"postgres"`
	// +optional
	Locking LockingStrategy `json:"locking"`
	// +optional
	AllowPastTimestamps bool `json:"allowPastTimestamps"`
	// +optional
	DevProperties `json:",inline"`
	Annotations   AnnotationsServicesSpec `json:"annotations,omitempty"`
}

type ServiceSpec struct {
	// +optional
	Annotations map[string]string `json:"annotations,omitempty"`
}
