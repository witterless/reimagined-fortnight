package com.example.javaing.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class GetResponse {
  private String type;
  private String id;
  private Attribute attributes;
}