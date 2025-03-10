"""Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT."""

from __future__ import annotations
import dataclasses
from dataclasses_json import Undefined, dataclass_json
from sdk import utils
from typing import Optional



@dataclasses.dataclass
class StripeTransferRequestMetadata:
    r"""A set of key/value pairs that you can attach to a transfer object.
    It can be useful for storing additional information about the transfer in a structured format.
    """
    



@dataclass_json(undefined=Undefined.EXCLUDE)

@dataclasses.dataclass
class StripeTransferRequest:
    amount: Optional[int] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('amount'), 'exclude': lambda f: f is None }})
    asset: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('asset'), 'exclude': lambda f: f is None }})
    destination: Optional[str] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('destination'), 'exclude': lambda f: f is None }})
    metadata: Optional[StripeTransferRequestMetadata] = dataclasses.field(default=None, metadata={'dataclasses_json': { 'letter_case': utils.get_field_name('metadata'), 'exclude': lambda f: f is None }})
    r"""A set of key/value pairs that you can attach to a transfer object.
    It can be useful for storing additional information about the transfer in a structured format.
    """
    

