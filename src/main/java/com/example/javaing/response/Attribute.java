package com.example.javaing.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;

public class Attribute {
  public final String referenceId;
  public final String createdAt;
  public final String updatedAt;
  public final String[] tags;
  public final String[] trustedDevices;

  @Override
  public String toString() {
    return "Attribute{" +
        "referenceId='" + referenceId + '\'' +
        ", createdAt='" + createdAt + '\'' +
        ", updatedAt='" + updatedAt + '\'' +
        ", tags=" + Arrays.toString(tags) +
        ", trustedDevices=" + Arrays.toString(trustedDevices) +
        '}';
  }

  public Attribute(@JsonProperty("reference-id") String referenceId,
      @JsonProperty("created-at") String createdAt,
      @JsonProperty("updated-at") String updatedAt,
      @JsonProperty("tags") String[] tags,
      @JsonProperty("trusted-devices") String[] trustedDevices) {
    this.referenceId = referenceId;
    this.createdAt = createdAt;
    this.updatedAt = updatedAt;
    this.tags = tags;
    this.trustedDevices = trustedDevices;
  }
}
