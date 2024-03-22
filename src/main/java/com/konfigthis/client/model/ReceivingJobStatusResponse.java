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


package com.konfigthis.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.konfigthis.client.model.Job;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.konfigthis.client.JSON;

/**
 * ReceivingJobStatusResponse
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class ReceivingJobStatusResponse {
  public static final String SERIALIZED_NAME_JOB_ID = "jobId";
  @SerializedName(SERIALIZED_NAME_JOB_ID)
  private String jobId;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_PARENT_JOB_ID = "parentJobId";
  @SerializedName(SERIALIZED_NAME_PARENT_JOB_ID)
  private String parentJobId;

  public static final String SERIALIZED_NAME_PARENT_TENANT_CODE = "parentTenantCode";
  @SerializedName(SERIALIZED_NAME_PARENT_TENANT_CODE)
  private String parentTenantCode;

  public static final String SERIALIZED_NAME_RECEIVING_JOBS = "receivingJobs";
  @SerializedName(SERIALIZED_NAME_RECEIVING_JOBS)
  private List<Job> receivingJobs = null;

  public ReceivingJobStatusResponse() {
  }

  public ReceivingJobStatusResponse jobId(String jobId) {
    
    
    
    
    this.jobId = jobId;
    return this;
  }

   /**
   * The unique identifier associated with the receiving job.
   * @return jobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier associated with the receiving job.")

  public String getJobId() {
    return jobId;
  }


  public void setJobId(String jobId) {
    
    
    
    this.jobId = jobId;
  }


  public ReceivingJobStatusResponse status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the receiving job.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the receiving job.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public ReceivingJobStatusResponse parentJobId(String parentJobId) {
    
    
    
    
    this.parentJobId = parentJobId;
    return this;
  }

   /**
   * The job ID of the receiving job that spawned this job.
   * @return parentJobId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The job ID of the receiving job that spawned this job.")

  public String getParentJobId() {
    return parentJobId;
  }


  public void setParentJobId(String parentJobId) {
    
    
    
    this.parentJobId = parentJobId;
  }


  public ReceivingJobStatusResponse parentTenantCode(String parentTenantCode) {
    
    
    
    
    this.parentTenantCode = parentTenantCode;
    return this;
  }

   /**
   * The tenant code of the receiving job that spawned  this job.
   * @return parentTenantCode
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The tenant code of the receiving job that spawned  this job.")

  public String getParentTenantCode() {
    return parentTenantCode;
  }


  public void setParentTenantCode(String parentTenantCode) {
    
    
    
    this.parentTenantCode = parentTenantCode;
  }


  public ReceivingJobStatusResponse receivingJobs(List<Job> receivingJobs) {
    
    
    
    
    this.receivingJobs = receivingJobs;
    return this;
  }

  public ReceivingJobStatusResponse addReceivingJobsItem(Job receivingJobsItem) {
    if (this.receivingJobs == null) {
      this.receivingJobs = new ArrayList<>();
    }
    this.receivingJobs.add(receivingJobsItem);
    return this;
  }

   /**
   * A list of objects representing the receiving jobs to retrieve.
   * @return receivingJobs
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A list of objects representing the receiving jobs to retrieve.")

  public List<Job> getReceivingJobs() {
    return receivingJobs;
  }


  public void setReceivingJobs(List<Job> receivingJobs) {
    
    
    
    this.receivingJobs = receivingJobs;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the ReceivingJobStatusResponse instance itself
   */
  public ReceivingJobStatusResponse putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceivingJobStatusResponse receivingJobStatusResponse = (ReceivingJobStatusResponse) o;
    return Objects.equals(this.jobId, receivingJobStatusResponse.jobId) &&
        Objects.equals(this.status, receivingJobStatusResponse.status) &&
        Objects.equals(this.parentJobId, receivingJobStatusResponse.parentJobId) &&
        Objects.equals(this.parentTenantCode, receivingJobStatusResponse.parentTenantCode) &&
        Objects.equals(this.receivingJobs, receivingJobStatusResponse.receivingJobs)&&
        Objects.equals(this.additionalProperties, receivingJobStatusResponse.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(jobId, status, parentJobId, parentTenantCode, receivingJobs, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceivingJobStatusResponse {\n");
    sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    parentJobId: ").append(toIndentedString(parentJobId)).append("\n");
    sb.append("    parentTenantCode: ").append(toIndentedString(parentTenantCode)).append("\n");
    sb.append("    receivingJobs: ").append(toIndentedString(receivingJobs)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("jobId");
    openapiFields.add("status");
    openapiFields.add("parentJobId");
    openapiFields.add("parentTenantCode");
    openapiFields.add("receivingJobs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ReceivingJobStatusResponse
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ReceivingJobStatusResponse.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReceivingJobStatusResponse is not found in the empty JSON string", ReceivingJobStatusResponse.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("jobId") != null && !jsonObj.get("jobId").isJsonNull()) && !jsonObj.get("jobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `jobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("jobId").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("parentJobId") != null && !jsonObj.get("parentJobId").isJsonNull()) && !jsonObj.get("parentJobId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentJobId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentJobId").toString()));
      }
      if ((jsonObj.get("parentTenantCode") != null && !jsonObj.get("parentTenantCode").isJsonNull()) && !jsonObj.get("parentTenantCode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `parentTenantCode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("parentTenantCode").toString()));
      }
      if (jsonObj.get("receivingJobs") != null && !jsonObj.get("receivingJobs").isJsonNull()) {
        JsonArray jsonArrayreceivingJobs = jsonObj.getAsJsonArray("receivingJobs");
        if (jsonArrayreceivingJobs != null) {
          // ensure the json data is an array
          if (!jsonObj.get("receivingJobs").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `receivingJobs` to be an array in the JSON string but got `%s`", jsonObj.get("receivingJobs").toString()));
          }

          // validate the optional field `receivingJobs` (array)
          for (int i = 0; i < jsonArrayreceivingJobs.size(); i++) {
            Job.validateJsonObject(jsonArrayreceivingJobs.get(i).getAsJsonObject());
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReceivingJobStatusResponse.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReceivingJobStatusResponse' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReceivingJobStatusResponse> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReceivingJobStatusResponse.class));

       return (TypeAdapter<T>) new TypeAdapter<ReceivingJobStatusResponse>() {
           @Override
           public void write(JsonWriter out, ReceivingJobStatusResponse value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additonal properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public ReceivingJobStatusResponse read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             ReceivingJobStatusResponse instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ReceivingJobStatusResponse given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ReceivingJobStatusResponse
  * @throws IOException if the JSON string is invalid with respect to ReceivingJobStatusResponse
  */
  public static ReceivingJobStatusResponse fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReceivingJobStatusResponse.class);
  }

 /**
  * Convert an instance of ReceivingJobStatusResponse to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

