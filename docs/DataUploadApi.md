# DataUploadApi

All URIs are relative to *https://vanity.api.visier.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fileToVisier**](DataUploadApi.md#fileToVisier) | **PUT** /v1alpha/data/upload/files/{filename} | Upload a data file to Visier |


<a name="fileToVisier"></a>
# **fileToVisier**
> Status fileToVisier(filename).body(body).execute();

Upload a data file to Visier

Use this API to upload data files to Visier. You can upload ZIP, CSV, XLS, and XLSX filetypes in plaintext or encrypted with Visier&#39;s PGP key. The maximum file upload size is 5 GB.   Use of this API requires client redirect. This API redirects requests directly to Visier&#39;s upload infrastructure to support long-running uploads.   To ensure efficient uploading, we recommend that you use an HTTP client that supports the 100 Continue status code.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;

### Example
```java
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.VisierDataIntake;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.auth.*;
import com.konfigthis.client.model.*;
import com.konfigthis.client.api.DataUploadApi;
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
    String filename = "filename_example"; // The filename of the data file to upload, including the file extension (such as .zip or .csv).
    try {
      Status result = client
              .dataUpload
              .fileToVisier(filename)
              .execute();
      System.out.println(result);
      System.out.println(result.getCode());
      System.out.println(result.getMessage());
      System.out.println(result.getDetails());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataUploadApi#fileToVisier");
      System.err.println("Status code: " + e.getStatusCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }

    // Use .executeWithHttpInfo() to retrieve HTTP Status Code, Headers and Request
    try {
      ApiResponse<Status> response = client
              .dataUpload
              .fileToVisier(filename)
              .executeWithHttpInfo();
      System.out.println(response.getResponseBody());
      System.out.println(response.getResponseHeaders());
      System.out.println(response.getStatusCode());
      System.out.println(response.getRoundTripTime());
      System.out.println(response.getRequest());
    } catch (ApiException e) {
      System.err.println("Exception when calling DataUploadApi#fileToVisier");
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
| **filename** | **String**| The filename of the data file to upload, including the file extension (such as .zip or .csv). | |
| **body** | **File**|  | [optional] |

### Return type

[**Status**](Status.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth), [BearerAuth](../README.md#BearerAuth), [CookieAuth](../README.md#CookieAuth), [OAuth2Auth](../README.md#OAuth2Auth), [OAuth2Auth](../README.md#OAuth2Auth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **307** | Redirect to Visier&#39;s upload infrastructure. |  -  |
| **0** | Default error response |  -  |

