package com.example.javaing.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {
  public final String type;
  public final String id;

  @Override
  public String toString() {
    return "Account{" +
        "type='" + type + '\'' +
        ", id='" + id + '\'' +
        '}';
  }

  public Account(@JsonProperty("type") String type,
      @JsonProperty("id") String id) {
    this.type = type;
    this.id = id;
  }
}

