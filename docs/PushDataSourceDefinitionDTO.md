

# PushDataSourceDefinitionDTO

Details of each existing source.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**sourceId** | **String** | The unique identifier associated with the source. |  [optional] |
|**name** | **String** | The object name of the source. |  [optional] |
|**columns** | [**List&lt;PushDataColumnDefinitionDTO&gt;**](PushDataColumnDefinitionDTO.md) | A list of objects representing the source columns. |  [optional] |
|**isInherited** | **Boolean** | If true, the source is inherited by all analytic tenants. |  [optional] |



