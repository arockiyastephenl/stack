"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import balancescursor as shared_balancescursor
from datetime import datetime
from typing import Optional



@dataclasses.dataclass
class GetAccountBalancesRequest:
    account_id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'accountId', 'style': 'simple', 'explode': False }})
    r"""The account ID."""
    asset: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'asset', 'style': 'form', 'explode': True }})
    r"""Filter balances by currency.
    If not specified, all account's balances will be returned.
    """
    cursor: Optional[str] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'cursor', 'style': 'form', 'explode': True }})
    r"""Parameter used in pagination requests. Maximum page size is set to 15.
    Set to the value of next for the next page of results.
    Set to the value of previous for the previous page of results.
    No other parameters can be set when this parameter is set.
    """
    from_: Optional[datetime] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'from', 'style': 'form', 'explode': True }})
    r"""Filter balances by date.
    If not specified, all account's balances will be returned.
    """
    limit: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'limit', 'style': 'form', 'explode': True }})
    r"""The maximum number of results to return per page."""
    page_size: Optional[int] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'pageSize', 'style': 'form', 'explode': True }})
    r"""The maximum number of results to return per page."""
    sort: Optional[list[str]] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'sort', 'style': 'form', 'explode': True }})
    r"""Fields used to sort payments (default is date:desc)."""
    to: Optional[datetime] = dataclasses.field(default=None, metadata={'query_param': { 'field_name': 'to', 'style': 'form', 'explode': True }})
    r"""Filter balances by date.
    If not specified, default will be set to now.
    """
    




@dataclasses.dataclass
class GetAccountBalancesResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    balances_cursor: Optional[shared_balancescursor.BalancesCursor] = dataclasses.field(default=None)
    r"""OK"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    

