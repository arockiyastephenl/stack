"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import attemptresponse as shared_attemptresponse
from ..shared import errorresponse as shared_errorresponse
from typing import Optional



@dataclasses.dataclass
class TestConfigRequest:
    id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    r"""Config ID"""
    




@dataclasses.dataclass
class TestConfigResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    attempt_response: Optional[shared_attemptresponse.AttemptResponse] = dataclasses.field(default=None)
    r"""OK"""
    error_response: Optional[shared_errorresponse.ErrorResponse] = dataclasses.field(default=None)
    r"""Error"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    

