"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import createwalletresponse as shared_createwalletresponse
from ..shared import walletserrorresponse as shared_walletserrorresponse
from typing import Optional



@dataclasses.dataclass
class CreateWalletResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    create_wallet_response: Optional[shared_createwalletresponse.CreateWalletResponse] = dataclasses.field(default=None)
    r"""Wallet created"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    wallets_error_response: Optional[shared_walletserrorresponse.WalletsErrorResponse] = dataclasses.field(default=None)
    r"""Error"""
    

