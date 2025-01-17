/*
 * Visier Data Intake APIs
 * Visier APIs for sending raw or untransformed source data to Visier
 *
 * The version of the OpenAPI document: 22222222.99201.1200
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import java.io.File;
import com.konfigthis.client.model.Status;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataUploadApi
 */
@Disabled
public class DataUploadApiTest {

    private static DataUploadApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new DataUploadApi(apiClient);
    }

    /**
     * Upload a data file to Visier
     *
     * Use this API to upload data files to Visier. You can upload ZIP, CSV, XLS, and XLSX filetypes in plaintext or encrypted with Visier&#39;s PGP key. The maximum file upload size is 5 GB.   Use of this API requires client redirect. This API redirects requests directly to Visier&#39;s upload infrastructure to support long-running uploads.   To ensure efficient uploading, we recommend that you use an HTTP client that supports the 100 Continue status code.   &lt;br&gt;**Note:** &lt;em&gt;This API is in **alpha**. While in alpha, APIs may change in a breaking way without notice; functionality may be removed, and no deprecation notices will be issued.  If you are interested in using this API, please contact your Customer Success Manager (CSM).&lt;/em&gt;
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void fileToVisierTest() throws ApiException {
        String filename = null;
        Status response = api.fileToVisier(filename)
                .execute();
        // TODO: test validations
    }

}
