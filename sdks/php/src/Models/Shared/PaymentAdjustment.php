<?php

/**
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

declare(strict_types=1);

namespace formance\stack\Models\Shared;


class PaymentAdjustment
{
	#[\JMS\Serializer\Annotation\SerializedName('absolute')]
    #[\JMS\Serializer\Annotation\Type('bool')]
    public bool $absolute;
    
	#[\JMS\Serializer\Annotation\SerializedName('amount')]
    #[\JMS\Serializer\Annotation\Type('int')]
    public int $amount;
    
	#[\JMS\Serializer\Annotation\SerializedName('date')]
    #[\JMS\Serializer\Annotation\Type("DateTime<'Y-m-d\TH:i:s.up'>")]
    public \DateTime $date;
    
	#[\JMS\Serializer\Annotation\SerializedName('raw')]
    #[\JMS\Serializer\Annotation\Type('formance\stack\Models\Shared\PaymentAdjustmentRaw')]
    public PaymentAdjustmentRaw $raw;
    
	#[\JMS\Serializer\Annotation\SerializedName('status')]
    #[\JMS\Serializer\Annotation\Type('enum<formance\stack\Models\Shared\PaymentStatus>')]
    public PaymentStatus $status;
    
	public function __construct()
	{
		$this->absolute = false;
		$this->amount = 0;
		$this->date = new \DateTime();
		$this->raw = new \formance\stack\Models\Shared\PaymentAdjustmentRaw();
		$this->status = \formance\stack\Models\Shared\PaymentStatus::Pending;
	}
}
