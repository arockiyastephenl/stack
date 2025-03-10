/*
 * Code generated by Speakeasy (https://speakeasyapi.dev). DO NOT EDIT.
 */

import { SpeakeasyBase, SpeakeasyMetadata } from "../../../internal/utils";
import { Expose, Transform } from "class-transformer";

export class AccountBalance extends SpeakeasyBase {
    @SpeakeasyMetadata()
    @Expose({ name: "accountId" })
    accountId: string;

    @SpeakeasyMetadata()
    @Expose({ name: "asset" })
    asset: string;

    @SpeakeasyMetadata()
    @Expose({ name: "balance" })
    balance: number;

    @SpeakeasyMetadata()
    @Expose({ name: "createdAt" })
    @Transform(({ value }) => new Date(value), { toClassOnly: true })
    createdAt: Date;

    /**
     * @deprecated field: This will be removed in a future release, please migrate away from it as soon as possible.
     */
    @SpeakeasyMetadata()
    @Expose({ name: "currency" })
    currency: string;

    @SpeakeasyMetadata()
    @Expose({ name: "lastUpdatedAt" })
    @Transform(({ value }) => new Date(value), { toClassOnly: true })
    lastUpdatedAt: Date;
}
