# DataIntakeApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getProcessingJobsByParentReceivingJobId**](DataIntakeApi.md#getProcessingJobsByParentReceivingJobId) | **GET** /v1/op/jobs/processing-jobs/{receivingJobId} | Retrieve processing job statuses by receiving job ID |
| [**getSources**](DataIntakeApi.md#getSources) | **GET** /v1/op/data-sources | Retrieve a list of sources |
| [**pushData**](DataIntakeApi.md#pushData) | **PUT** /v1/op/data-transfer-sessions/{transferSessionId}/add | Transfer data to sources via JSON |
| [**pushDataCancel**](DataIntakeApi.md#pushDataCancel) | **PUT** /v1/op/data-transfer-sessions/{transferSessionId}/cancel | Cancel a transfer session |
| [**pushDataComplete**](DataIntakeApi.md#pushDataComplete) | **POST** /v1/op/jobs/receiving-jobs | Complete a transfer session |
| [**receivingJobStatus**](DataIntakeApi.md#receivingJobStatus) | **GET** /v1/op/jobs/receiving-jobs/{receivingJobId} | Retrieve a receiving job’s status |
| [**startTransfer**](DataIntakeApi.md#startTransfer) | **POST** /v1/op/data-transfer-sessions | Start a transfer session |
| [**uploadData**](DataIntakeApi.md#uploadData) | **PUT** /v1/op/data-transfer-sessions/{transferSessionId}/upload | Transfer data to sources via file upload |


<a name="getProcessingJobsByParentReceivingJobId"></a>
# **getProcessingJobsByParentReceivingJobId**
> GetProcessingJobsResponse getProcessingJobsByParentReceivingJobId(receivingJobId).tenantCode(tenantCode).limit(limit).start(start).execute();

Retrieve processing job statuses by receiving job ID

Use this API to retrieve a list of statuses for all processing jobs associated with the given receiving job ID.   Processing jobs deal with an individual analytic tenant&#39;s data load. A processing job is either triggered through  the UI or is one of many processing jobs spawned from a receiving job. When a processing job is triggered as part  of a set from an receiving job, it is associated to the receiving job through a Parent ID.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataIntakeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataIntake client = new VisierDataIntake(configuration);
    String receivingJobId = "receivingJobId_example"; // The receiving job ID.
    String tenantCode = "tenantCode_example"; // The tenant code of the tenant you want to retrieve the processing jobs for. Use this if you are only interested in the results for one analytic tenant.
    Integer limit = 56; // The limit of processing jobs to retrieve per page.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    try {
      GetProcessingJobsResponse result = client
              .dataIntake
              .getProcessingJobsByParentReceivingJobId(receivingJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .execute();
      System.out.println(result);
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getLimit());
      System.out.println(result.getStart());
      System.out.println(result.getProcessingJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#getProcessingJobsByParentReceivingJobId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<GetProcessingJobsResponse> response = client
              .dataIntake
              .getProcessingJobsByParentReceivingJobId(receivingJobId)
              .tenantCode(tenantCode)
              .limit(limit)
              .start(start)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#getProcessingJobsByParentReceivingJobId");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **receivingJobId** | **String**| The receiving job ID. | |
| **tenantCode** | **String**| The tenant code of the tenant you want to retrieve the processing jobs for. Use this if you are only interested in the results for one analytic tenant. | [optional] |
| **limit** | **Integer**| The limit of processing jobs to retrieve per page. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |

### Return type

[**GetProcessingJobsResponse**](GetProcessingJobsResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="getSources"></a>
# **getSources**
> PushDataSourceDefinitionsDTO getSources().execute();

Retrieve a list of sources

Prior to transferring data to Visier, you must identify the sources you want to target. Sources store data for  the solution and are used to map data to Visier&#39;s data model.   Note: To set up sources in your tenant, contact Visier Customer Success.  This API allows you to query the list of available sources, and identify the source schema and required fields.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataIntakeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataIntake client = new VisierDataIntake(configuration);
    try {
      PushDataSourceDefinitionsDTO result = client
              .dataIntake
              .getSources()
              .execute();
      System.out.println(result);
      System.out.println(result.getSources());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#getSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PushDataSourceDefinitionsDTO> response = client
              .dataIntake
              .getSources()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#getSources");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PushDataSourceDefinitionsDTO**](PushDataSourceDefinitionsDTO.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="pushData"></a>
# **pushData**
> PushDataResponse pushData(transferSessionId, body).sourceId(sourceId).sequence(sequence).tenantCode(tenantCode).execute();

Transfer data to sources via JSON

This API allows you to transfer data to Visier in batches of records. Each request includes a batch of records  formatted as a comma separated array with the first row containing the column headers in the request body. Each  subsequent request should also include the first row as a header.   Each request transfers a batch of records to a single source. Transfer sessions may include one or more batches before completion.   Each batch is identified by a sequence number. Sequence numbers help identify any batches  that were delivered incorrectly.   Each batch is limited to the following request size:  - Batch size limit: 10 MB  - Record count limit: 300,000 rows

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataIntakeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataIntake client = new VisierDataIntake(configuration);
    String transferSessionId = "transferSessionId_example"; // The transfer session ID returned after the data transfer session starts.
    String sourceId = "sourceId_example"; // The unique identifier associated with the source you want to transfer data to.
    Integer sequence = 56; // The unique sequence number associated with a batch of records.
    String tenantCode = "tenantCode_example"; // The code of the tenant you want to transfer data to. For example, WFF_j1r or WFF_j1r~c7o.
    try {
      PushDataResponse result = client
              .dataIntake
              .pushData(transferSessionId)
              .sourceId(sourceId)
              .sequence(sequence)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransferSessionId());
      System.out.println(result.getSequence());
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#pushData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PushDataResponse> response = client
              .dataIntake
              .pushData(transferSessionId)
              .sourceId(sourceId)
              .sequence(sequence)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#pushData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferSessionId** | **String**| The transfer session ID returned after the data transfer session starts. | |
| **body** | **String**|  | |
| **sourceId** | **String**| The unique identifier associated with the source you want to transfer data to. | [optional] |
| **sequence** | **Integer**| The unique sequence number associated with a batch of records. | [optional] |
| **tenantCode** | **String**| The code of the tenant you want to transfer data to. For example, WFF_j1r or WFF_j1r~c7o. | [optional] |

### Return type

[**PushDataResponse**](PushDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="pushDataCancel"></a>
# **pushDataCancel**
> PushDataCancelResponse pushDataCancel(transferSessionId).execute();

Cancel a transfer session

This API allows you to cancel a transfer session after starting it. If a transfer session is cancelled, all  records within the transfer session do not persist in Visier’s data store.   If you cancel a transfer session, please start a new transfer session and resend the complete data set.   You might cancel a transfer session if:  - A request to send a batch of records failed.  - The original set of records is incomplete.  - An infrastructure error occurs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataIntakeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataIntake client = new VisierDataIntake(configuration);
    String transferSessionId = "transferSessionId_example"; // The transfer session ID to cancel.
    try {
      PushDataCancelResponse result = client
              .dataIntake
              .pushDataCancel(transferSessionId)
              .execute();
      System.out.println(result);
      System.out.println(result.getMessage());
      System.out.println(result.getTransferSessionId());
      System.out.println(result.getDataTransferResultDetails());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#pushDataCancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PushDataCancelResponse> response = client
              .dataIntake
              .pushDataCancel(transferSessionId)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#pushDataCancel");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferSessionId** | **String**| The transfer session ID to cancel. | |

### Return type

[**PushDataCancelResponse**](PushDataCancelResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="pushDataComplete"></a>
# **pushDataComplete**
> PushDataCompleteResponse pushDataComplete(pushDataCompleteRequest).execute();

Complete a transfer session

This API allows you to complete the specified transfer session by triggering a receiving job. A receiving job  validates the transferred data and adds the transferred data to Visier’s data store.   You can set an optional parameter to generate a data version through a processing job immediately after the receiving job completes.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataIntakeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataIntake client = new VisierDataIntake(configuration);
    String transferSessionId = "transferSessionId_example"; // The unique identifier associated with the transfer session.
    Boolean processingData = true; // If true, a processing job will be triggered after the receiving job successfully completes. This generates a new data version.
    try {
      PushDataCompleteResponse result = client
              .dataIntake
              .pushDataComplete()
              .transferSessionId(transferSessionId)
              .processingData(processingData)
              .execute();
      System.out.println(result);
      System.out.println(result.getDataReceivingJobId());
      System.out.println(result.getMessage());
      System.out.println(result.getTransferSessionId());
      System.out.println(result.getDataTransferResultDetails());
      System.out.println(result.getStatus());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#pushDataComplete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PushDataCompleteResponse> response = client
              .dataIntake
              .pushDataComplete()
              .transferSessionId(transferSessionId)
              .processingData(processingData)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#pushDataComplete");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **pushDataCompleteRequest** | [**PushDataCompleteRequest**](PushDataCompleteRequest.md)|  | |

### Return type

[**PushDataCompleteResponse**](PushDataCompleteResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="receivingJobStatus"></a>
# **receivingJobStatus**
> ReceivingJobStatusResponse receivingJobStatus(receivingJobId).jobs(jobs).tenantCode(tenantCode).start(start).limit(limit).execute();

Retrieve a receiving job’s status

After completing a transfer session, you may want to know the status of the receiving job and the associated tenant  receiving jobs. A receiving job validates the transferred data and adds the transferred data to Visier’s data store.   Use this API to retrieve the receiving job status and summary of analytic tenant receiving jobs.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataIntakeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataIntake client = new VisierDataIntake(configuration);
    String receivingJobId = "receivingJobId_example"; // The **dataReceivingJobId** provided after a data transfer session completes. See **`/v1/op/jobs/receiving-jobs`**.
    Boolean jobs = true; // If true, returns the status of receiving jobs spawned by the receiving job specified by receivingJobId.
    String tenantCode = "tenantCode_example"; // The tenant code of the tenant you want to retrieve the receiving jobs for. Use this if you are only interested in the results for one analytic tenant.
    Integer start = 56; // The index to start retrieving results from, also known as offset. The index begins at 0.
    Integer limit = 56; // The number of job statuses to return per page.
    try {
      ReceivingJobStatusResponse result = client
              .dataIntake
              .receivingJobStatus(receivingJobId)
              .jobs(jobs)
              .tenantCode(tenantCode)
              .start(start)
              .limit(limit)
              .execute();
      System.out.println(result);
      System.out.println(result.getJobId());
      System.out.println(result.getStatus());
      System.out.println(result.getParentJobId());
      System.out.println(result.getParentTenantCode());
      System.out.println(result.getReceivingJobs());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#receivingJobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<ReceivingJobStatusResponse> response = client
              .dataIntake
              .receivingJobStatus(receivingJobId)
              .jobs(jobs)
              .tenantCode(tenantCode)
              .start(start)
              .limit(limit)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#receivingJobStatus");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **receivingJobId** | **String**| The **dataReceivingJobId** provided after a data transfer session completes. See **&#x60;/v1/op/jobs/receiving-jobs&#x60;**. | |
| **jobs** | **Boolean**| If true, returns the status of receiving jobs spawned by the receiving job specified by receivingJobId. | [optional] |
| **tenantCode** | **String**| The tenant code of the tenant you want to retrieve the receiving jobs for. Use this if you are only interested in the results for one analytic tenant. | [optional] |
| **start** | **Integer**| The index to start retrieving results from, also known as offset. The index begins at 0. | [optional] |
| **limit** | **Integer**| The number of job statuses to return per page. | [optional] |

### Return type

[**ReceivingJobStatusResponse**](ReceivingJobStatusResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="startTransfer"></a>
# **startTransfer**
> StartTransferResponse startTransfer().execute();

Start a transfer session

Use this API to start a new transfer session. A transfer session can include one or more batches of records to be  sent to Visier. Batches of records may be transferred as JSON or file payloads.   Recommended: For optimal performance, please include all batches of records in a single transfer session.

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataIntakeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataIntake client = new VisierDataIntake(configuration);
    try {
      StartTransferResponse result = client
              .dataIntake
              .startTransfer()
              .execute();
      System.out.println(result);
      System.out.println(result.getTransferSessionId());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#startTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<StartTransferResponse> response = client
              .dataIntake
              .startTransfer()
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#startTransfer");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters
This endpoint does not need any parameter.

### Return type

[**StartTransferResponse**](StartTransferResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

<a name="uploadData"></a>
# **uploadData**
> PushDataResponse uploadData(transferSessionId, body).sourceId(sourceId).sequence(sequence).tenantCode(tenantCode).execute();

Transfer data to sources via file upload

This API allows you to upload data to Visier as CSV or ZIP files. Each request transfers a single file. If the  data intended for Visier is stored in multiple files, you may compress them into a single ZIP file or make  multiple requests within the same transfer session.   File size limit: 3 GB   Each file is identified by a sequence number. Sequence numbers help identify any batches that were delivered incorrectly.   If you define a specific source in the request, all files within the request will target the declared source. If  a source is not defined, the filenames are matched against the source regex to correctly assign each file to a  source. To find out the source regex, please contact Visier Customer Success.   Note: If you include files that should target multiple sources in one ZIP file, do not define a source in the request.   Analytic tenants: For optimal transfer speed, provide one ZIP file per source.  Administrating tenants: For optimal transfer speed, provide one ZIP file containing all the required data files for your analytic tenants.  In the ZIP file, use one folder per analytic tenant. The ZIP file must adhere to the following file structure:   File1.zip  - Folder1: WFF_tenantCode1     - Filename1.csv     - Filename2.csv  - Folder2: WFF_tenantCode2     - Filename3.csv     - Filename4.csv

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataIntakeApi;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    Configuration configuration = new Configuration();
    configuration.host = "https://vanity.api.visier.io";
    
    configuration.apiKeyAuth  = "YOUR API KEY";
    
    // Configure HTTP bearer authorization: BearerAuth
    configuration.token = "BEARER TOKEN";
    
    configuration.cookieAuth  = "YOUR API KEY";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    
    // Configure OAuth2 access token for authorization: OAuth2Auth
    configuration.accessToken = "YOUR ACCESS TOKEN";
    VisierDataIntake client = new VisierDataIntake(configuration);
    String transferSessionId = "transferSessionId_example"; // The transfer session ID returned after the data transfer session starts.
    String sourceId = "sourceId_example"; // The unique identifier associated with the source you want to transfer data to.
    String sequence = "sequence_example"; // The unique sequence number associated with a batch of records.
    String tenantCode = "tenantCode_example"; // The code of the tenant you want to transfer data to. For example, WFF_j1r or WFF_j1r~c7o.
    try {
      PushDataResponse result = client
              .dataIntake
              .uploadData(transferSessionId)
              .sourceId(sourceId)
              .sequence(sequence)
              .tenantCode(tenantCode)
              .execute();
      System.out.println(result);
      System.out.println(result.getTransferSessionId());
      System.out.println(result.getSequence());
      System.out.println(result.getStatus());
      System.out.println(result.getMessage());
      System.out.println(result.getTenants());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#uploadData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<PushDataResponse> response = client
              .dataIntake
              .uploadData(transferSessionId)
              .sourceId(sourceId)
              .sequence(sequence)
              .tenantCode(tenantCode)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataIntakeApi#uploadData");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transferSessionId** | **String**| The transfer session ID returned after the data transfer session starts. | |
| **body** | **Object**|  | |
| **sourceId** | **String**| The unique identifier associated with the source you want to transfer data to. | [optional] |
| **sequence** | **String**| The unique sequence number associated with a batch of records. | [optional] |
| **tenantCode** | **String**| The code of the tenant you want to transfer data to. For example, WFF_j1r or WFF_j1r~c7o. | [optional] |

### Return type

[**PushDataResponse**](PushDataResponse.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **0** | Default error response |  -  |

