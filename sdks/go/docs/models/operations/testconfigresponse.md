# TestConfigResponse


## Fields

| Field                                                             | Type                                                              | Required                                                          | Description                                                       |
| ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- | ----------------------------------------------------------------- |
| `AttemptResponse`                                                 | [*shared.AttemptResponse](../../models/shared/attemptresponse.md) | :heavy_minus_sign:                                                | OK                                                                |
| `ContentType`                                                     | *string*                                                          | :heavy_check_mark:                                                | N/A                                                               |
| `ErrorResponse`                                                   | [*shared.ErrorResponse](../../models/shared/errorresponse.md)     | :heavy_minus_sign:                                                | Error                                                             |
| `StatusCode`                                                      | *int*                                                             | :heavy_check_mark:                                                | N/A                                                               |
| `RawResponse`                                                     | [*http.Response](https://pkg.go.dev/net/http#Response)            | :heavy_minus_sign:                                                | N/A                                                               |