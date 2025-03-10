"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import getversionsresponse as shared_getversionsresponse
from typing import Optional



@dataclasses.dataclass
class GetVersionsResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    get_versions_response: Optional[shared_getversionsresponse.GetVersionsResponse] = dataclasses.field(default=None)
    r"""OK"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    

