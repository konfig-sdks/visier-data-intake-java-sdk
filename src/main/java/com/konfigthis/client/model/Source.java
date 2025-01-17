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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

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
 * Source
 */@javax.annotation.Generated(value = "Generated by https://konfigthis.com")
public class Source {
  public static final String SERIALIZED_NAME_SOURCE_ID = "sourceId";
  @SerializedName(SERIALIZED_NAME_SOURCE_ID)
  private String sourceId;

  public static final String SERIALIZED_NAME_SOURCE_NAME = "sourceName";
  @SerializedName(SERIALIZED_NAME_SOURCE_NAME)
  private String sourceName;

  public static final String SERIALIZED_NAME_DATA_SIZE = "dataSize";
  @SerializedName(SERIALIZED_NAME_DATA_SIZE)
  private String dataSize;

  public static final String SERIALIZED_NAME_ROWS = "rows";
  @SerializedName(SERIALIZED_NAME_ROWS)
  private String rows;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public Source() {
  }

  public Source sourceId(String sourceId) {
    
    
    
    
    this.sourceId = sourceId;
    return this;
  }

   /**
   * The unique identifier associated with the source that data was transferred to.
   * @return sourceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The unique identifier associated with the source that data was transferred to.")

  public String getSourceId() {
    return sourceId;
  }


  public void setSourceId(String sourceId) {
    
    
    
    this.sourceId = sourceId;
  }


  public Source sourceName(String sourceName) {
    
    
    
    
    this.sourceName = sourceName;
    return this;
  }

   /**
   * The object name of the source.
   * @return sourceName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The object name of the source.")

  public String getSourceName() {
    return sourceName;
  }


  public void setSourceName(String sourceName) {
    
    
    
    this.sourceName = sourceName;
  }


  public Source dataSize(String dataSize) {
    
    
    
    
    this.dataSize = dataSize;
    return this;
  }

   /**
   * The size of the data transfer in bytes.
   * @return dataSize
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The size of the data transfer in bytes.")

  public String getDataSize() {
    return dataSize;
  }


  public void setDataSize(String dataSize) {
    
    
    
    this.dataSize = dataSize;
  }


  public Source rows(String rows) {
    
    
    
    
    this.rows = rows;
    return this;
  }

   /**
   * The number of rows in the data transfer.
   * @return rows
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The number of rows in the data transfer.")

  public String getRows() {
    return rows;
  }


  public void setRows(String rows) {
    
    
    
    this.rows = rows;
  }


  public Source status(String status) {
    
    
    
    
    this.status = status;
    return this;
  }

   /**
   * The status of the data transfer for this source.
   * @return status
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The status of the data transfer for this source.")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    
    
    
    this.status = status;
  }


  public Source message(String message) {
    
    
    
    
    this.message = message;
    return this;
  }

   /**
   * A meaningful message about the data transfer.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A meaningful message about the data transfer.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    
    
    
    this.message = message;
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
   * @return the Source instance itself
   */
  public Source putAdditionalProperty(String key, Object value) {
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
    Source source = (Source) o;
    return Objects.equals(this.sourceId, source.sourceId) &&
        Objects.equals(this.sourceName, source.sourceName) &&
        Objects.equals(this.dataSize, source.dataSize) &&
        Objects.equals(this.rows, source.rows) &&
        Objects.equals(this.status, source.status) &&
        Objects.equals(this.message, source.message)&&
        Objects.equals(this.additionalProperties, source.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sourceId, sourceName, dataSize, rows, status, message, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Source {\n");
    sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
    sb.append("    sourceName: ").append(toIndentedString(sourceName)).append("\n");
    sb.append("    dataSize: ").append(toIndentedString(dataSize)).append("\n");
    sb.append("    rows: ").append(toIndentedString(rows)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
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
    openapiFields.add("sourceId");
    openapiFields.add("sourceName");
    openapiFields.add("dataSize");
    openapiFields.add("rows");
    openapiFields.add("status");
    openapiFields.add("message");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Source
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!Source.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Source is not found in the empty JSON string", Source.openapiRequiredFields.toString()));
        }
      }
      if ((jsonObj.get("sourceId") != null && !jsonObj.get("sourceId").isJsonNull()) && !jsonObj.get("sourceId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceId").toString()));
      }
      if ((jsonObj.get("sourceName") != null && !jsonObj.get("sourceName").isJsonNull()) && !jsonObj.get("sourceName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `sourceName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("sourceName").toString()));
      }
      if ((jsonObj.get("dataSize") != null && !jsonObj.get("dataSize").isJsonNull()) && !jsonObj.get("dataSize").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `dataSize` to be a primitive type in the JSON string but got `%s`", jsonObj.get("dataSize").toString()));
      }
      if ((jsonObj.get("rows") != null && !jsonObj.get("rows").isJsonNull()) && !jsonObj.get("rows").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `rows` to be a primitive type in the JSON string but got `%s`", jsonObj.get("rows").toString()));
      }
      if ((jsonObj.get("status") != null && !jsonObj.get("status").isJsonNull()) && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if ((jsonObj.get("message") != null && !jsonObj.get("message").isJsonNull()) && !jsonObj.get("message").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `message` to be a primitive type in the JSON string but got `%s`", jsonObj.get("message").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Source.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Source' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Source> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Source.class));

       return (TypeAdapter<T>) new TypeAdapter<Source>() {
           @Override
           public void write(JsonWriter out, Source value) throws IOException {
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
           public Source read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             // store additional fields in the deserialized instance
             Source instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of Source given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Source
  * @throws IOException if the JSON string is invalid with respect to Source
  */
  public static Source fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Source.class);
  }

 /**
  * Convert an instance of Source to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

