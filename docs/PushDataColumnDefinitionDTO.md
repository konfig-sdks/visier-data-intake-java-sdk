

# PushDataColumnDefinitionDTO

Definition of the source column.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**columnName** | **String** | The name of the column. |  [optional] |
|**dataType** | **String** | The data type associated with the column. |  [optional] |
|**dataFormats** | **List&lt;String&gt;** | The expected format for datetime data types. |  [optional] |
|**isMandatory** | **Boolean** | If true, the column value is required. If a column is mandatory, and the file is missing this column, the request will fail. |  [optional] |
|**allowEmpty** | **Boolean** | If true, the column allows an empty value for the record. |  [optional] |
|**defaultValue** | **String** | The default value of the column. |  [optional] |



