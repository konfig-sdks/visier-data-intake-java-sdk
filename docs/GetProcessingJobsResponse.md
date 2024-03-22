

# GetProcessingJobsResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**parentJobId** | **String** | The job ID of the receiving job that spawned this job. |  [optional] |
|**parentTenantCode** | **String** | The tenant code of the receiving job that spawned this job. |  [optional] |
|**limit** | **Integer** | The limit of processing jobs to retrieve per page. |  [optional] |
|**start** | **Integer** | The index to start retrieving results from, also known as offset. The index begins at 0. |  [optional] |
|**processingJobs** | [**List&lt;ProcessingJob&gt;**](ProcessingJob.md) | A list of objects representing the processing jobs to retrieve. |  [optional] |



