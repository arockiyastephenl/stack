<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace formance\stack\Models\Operations;

use \formance\stack\Utils\SpeakeasyMetadata;
class GetBalancesAggregatedRequest
{
    /**
     * Filter balances involving given account, either as source or destination.
     * 
     * @var ?string $address
     */
	#[SpeakeasyMetadata('queryParam:style=form,explode=true,name=address')]
    public ?string $address = null;
    
    /**
     * Name of the ledger.
     * 
     * @var string $ledger
     */
	#[SpeakeasyMetadata('pathParam:style=simple,explode=false,name=ledger')]
    public string $ledger;
    
	public function __construct()
	{
		$this->address = null;
		$this->ledger = "";
	}
}
