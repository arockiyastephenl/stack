"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import aggregatebalancesresponse as shared_aggregatebalancesresponse
from ..shared import errorresponse as shared_errorresponse
from typing import Optional



@dataclasses.dataclass
class GetBalancesAggregatedRequest:
    ledger: str = dataclasses.field(metadata={'path_param': { 'field_name': 'ledger', 'style': 'simple', 'explode': False }})
    r"""Name of the ledger."""
    address: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'address', 'style': 'form', 'explode': True }})
    r"""Filter balances involving given account, either as source or destination."""
    




@dataclasses.dataclass
class GetBalancesAggregatedResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    aggregate_balances_response: Optional[shared_aggregatebalancesresponse.AggregateBalancesResponse] = dataclasses.field(default=None)
    r"""OK"""
    error_response: Optional[shared_errorresponse.ErrorResponse] = dataclasses.field(default=None)
    r"""Error"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    

