"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import errorresponse as shared_errorresponse
from typing import Optional



@dataclasses.dataclass
class AddMetadataToAccountRequest:
    address: str = dataclasses.field(metadata={'path_param': { 'field_name': 'address', 'style': 'simple', 'explode': False }})
    r"""Exact address of the account. It must match the following regular expressions pattern:
    ```
    ^\w+(:\w+)*$
    ```
    """
    ledger: str = dataclasses.field(metadata={'path_param': { 'field_name': 'ledger', 'style': 'simple', 'explode': False }})
    r"""Name of the ledger."""
    request_body: dict[str, str] = dataclasses.field(metadata={'request': { 'media_type': 'application/json' }})
    r"""metadata"""
    async_: Optional[bool] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'async', 'style': 'form', 'explode': True }})
    r"""Set async mode."""
    dry_run: Optional[bool] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'dryRun', 'style': 'form', 'explode': True }})
    r"""Set the dry run mode. Dry run mode doesn't add the logs to the database or publish a message to the message broker."""
    idempotency_key: Optional[str] = dataclasses.field(default=None, metadata={'header': { 'field_name': 'Idempotency-Key', 'style': 'simple', 'explode': False }})
    r"""Use an idempotency key"""
    




@dataclasses.dataclass
class AddMetadataToAccountResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    error_response: Optional[shared_errorresponse.ErrorResponse] = dataclasses.field(default=None)
    r"""Error"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    

