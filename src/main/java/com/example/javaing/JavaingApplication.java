package com.example.javaing;

import static javax.ws.rs.core.HttpHeaders.USER_AGENT;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaingApplication {

  public static void main(String[] args) throws IOException {
    SpringApplication.run(JavaingApplication.class, args);
  }

}
