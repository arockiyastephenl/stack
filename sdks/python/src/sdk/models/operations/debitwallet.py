"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
import requests as requests_http
from ..shared import debitwalletrequest as shared_debitwalletrequest
from ..shared import debitwalletresponse as shared_debitwalletresponse
from ..shared import walletserrorresponse as shared_walletserrorresponse
from typing import Optional



@dataclasses.dataclass
class DebitWalletRequest:
    id: str = dataclasses.field(metadata={'path_param': { 'field_name': 'id', 'style': 'simple', 'explode': False }})
    debit_wallet_request: Optional[shared_debitwalletrequest.DebitWalletRequest] = dataclasses.field(default=None, metadata={'request': { 'media_type': 'application/json' }})
    




@dataclasses.dataclass
class DebitWalletResponse:
    content_type: str = dataclasses.field()
    status_code: int = dataclasses.field()
    debit_wallet_response: Optional[shared_debitwalletresponse.DebitWalletResponse] = dataclasses.field(default=None)
    r"""Wallet successfully debited as a pending hold"""
    raw_response: Optional[requests_http.Response] = dataclasses.field(default=None)
    wallets_error_response: Optional[shared_walletserrorresponse.WalletsErrorResponse] = dataclasses.field(default=None)
    r"""Error"""
    

