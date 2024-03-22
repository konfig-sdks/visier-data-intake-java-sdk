

# PushDataResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transferSessionId** | **String** | The unique identifier associated with the transfer session. |  [optional] |
|**sequence** | **Integer** | The unique sequence number associated with a batch of records. |  [optional] |
|**status** | **String** | The status of the data transfer. |  [optional] |
|**message** | **String** | Any additional information about the data transfer. |  [optional] |
|**tenants** | [**List&lt;Tenant&gt;**](Tenant.md) | A list of strings representing the tenants that data was pushed to and their data transfer results. |  [optional] |



