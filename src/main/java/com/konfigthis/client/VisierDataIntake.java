package com.konfigthis.client;

import com.konfigthis.client.api.DataIntakeApi;
import com.konfigthis.client.api.DataUploadApi;

public class VisierDataIntake {
    private ApiClient apiClient;
    public final DataIntakeApi dataIntake;
    public final DataUploadApi dataUpload;

    public VisierDataIntake() {
        this(null);
    }

    public VisierDataIntake(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.dataIntake = new DataIntakeApi(this.apiClient);
        this.dataUpload = new DataUploadApi(this.apiClient);
    }

}
