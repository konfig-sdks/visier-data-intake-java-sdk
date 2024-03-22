<div align="center">

[![Visit Visier](./header.png)](https://visier.com)

# [Visier](https://visier.com)

Visier APIs for sending raw or untransformed source data to Visier

</div>

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

If you are adding this library to an Android Application or Library:

3. Android 8.0+ (API Level 26+)

## Installation<a id="installation"></a>
<div align="center">
  <a href="https://konfigthis.com/sdk-sign-up?company=Visier&serviceName=DataIntake&language=Java">
    <img src="https://raw.githubusercontent.com/konfig-dev/brand-assets/HEAD/cta-images/java-cta.png" width="70%">
  </a>
</div>

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.konfigthis</groupId>
  <artifactId>visier-data-intake-java-sdk</artifactId>
  <version>22222222.99201.1200</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your `build.gradle`:

```groovy
// build.gradle
repositories {
  mavenCentral()
}

dependencies {
   implementation "com.konfigthis:visier-data-intake-java-sdk:22222222.99201.1200"
}
```

### Android users

Make sure your `build.gradle` file as a `minSdk` version of at least 26:
```groovy
// build.gradle
android {
    defaultConfig {
        minSdk 26
    }
}
```

Also make sure your library or application has internet permissions in your `AndroidManifest.xml`:

```xml
<!--AndroidManifest.xml-->
<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools">
    <uses-permission android:name="android.permission.INTERNET"/>
</manifest>
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/visier-data-intake-java-sdk-22222222.99201.1200.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

## Documentation for API Endpoints

All URIs are relative to *https://vanity.api.visier.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DataIntakeApi* | [**getProcessingJobsByParentReceivingJobId**](docs/DataIntakeApi.md#getProcessingJobsByParentReceivingJobId) | **GET** /v1/op/jobs/processing-jobs/{receivingJobId} | Retrieve processing job statuses by receiving job ID
*DataIntakeApi* | [**getSources**](docs/DataIntakeApi.md#getSources) | **GET** /v1/op/data-sources | Retrieve a list of sources
*DataIntakeApi* | [**pushData**](docs/DataIntakeApi.md#pushData) | **PUT** /v1/op/data-transfer-sessions/{transferSessionId}/add | Transfer data to sources via JSON
*DataIntakeApi* | [**pushDataCancel**](docs/DataIntakeApi.md#pushDataCancel) | **PUT** /v1/op/data-transfer-sessions/{transferSessionId}/cancel | Cancel a transfer session
*DataIntakeApi* | [**pushDataComplete**](docs/DataIntakeApi.md#pushDataComplete) | **POST** /v1/op/jobs/receiving-jobs | Complete a transfer session
*DataIntakeApi* | [**receivingJobStatus**](docs/DataIntakeApi.md#receivingJobStatus) | **GET** /v1/op/jobs/receiving-jobs/{receivingJobId} | Retrieve a receiving job’s status
*DataIntakeApi* | [**startTransfer**](docs/DataIntakeApi.md#startTransfer) | **POST** /v1/op/data-transfer-sessions | Start a transfer session
*DataIntakeApi* | [**uploadData**](docs/DataIntakeApi.md#uploadData) | **PUT** /v1/op/data-transfer-sessions/{transferSessionId}/upload | Transfer data to sources via file upload
*DataUploadApi* | [**fileToVisier**](docs/DataUploadApi.md#fileToVisier) | **PUT** /v1alpha/data/upload/files/{filename} | Upload a data file to Visier


## Documentation for Models

 - [DataTransferResultDetail](docs/DataTransferResultDetail.md)
 - [GetProcessingJobsResponse](docs/GetProcessingJobsResponse.md)
 - [GoogleProtobufAny](docs/GoogleProtobufAny.md)
 - [Job](docs/Job.md)
 - [ProcessingJob](docs/ProcessingJob.md)
 - [PushDataCancelResponse](docs/PushDataCancelResponse.md)
 - [PushDataColumnDefinitionDTO](docs/PushDataColumnDefinitionDTO.md)
 - [PushDataCompleteRequest](docs/PushDataCompleteRequest.md)
 - [PushDataCompleteResponse](docs/PushDataCompleteResponse.md)
 - [PushDataResponse](docs/PushDataResponse.md)
 - [PushDataSourceDefinitionDTO](docs/PushDataSourceDefinitionDTO.md)
 - [PushDataSourceDefinitionsDTO](docs/PushDataSourceDefinitionsDTO.md)
 - [ReceivingJobStatusResponse](docs/ReceivingJobStatusResponse.md)
 - [Source](docs/Source.md)
 - [StartTransferResponse](docs/StartTransferResponse.md)
 - [Status](docs/Status.md)
 - [Tenant](docs/Tenant.md)


## Author
This Java package is automatically generated by [Konfig](https://konfigthis.com)
