"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import getwalletresponse as shared_getwalletresponse
from ..shared import walletserrorresponse as shared_walletserrorresponse
from typing import Optional



@dataclasses.dataclass
class GetWalletRequest:
    id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    




@dataclasses.dataclass
class GetWalletResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    get_wallet_response: Optional[shared_getwalletresponse.GetWalletResponse] = dataclasses.field(default=None)
    r"""Wallet"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    wallets_error_response: Optional[shared_walletserrorresponse.WalletsErrorResponse] = dataclasses.field(default=None)
    r"""Error"""
    

