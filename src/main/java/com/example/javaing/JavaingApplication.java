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

  private static final String GET_URL = "https://www.google.com/search?q=javaguides";

  public static void main(String[] args) throws IOException {
    SpringApplication.run(JavaingApplication.class, args);
    sendHttpGETRequest();
  }

  private static void sendHttpGETRequest() throws IOException {
    URL obj = new URL(GET_URL);
    HttpURLConnection httpURLConnection = (HttpURLConnection) obj.openConnection();
    httpURLConnection.setRequestMethod("GET");
    httpURLConnection.setRequestProperty("User-Agent", USER_AGENT);
    int responseCode = httpURLConnection.getResponseCode();
    System.out.println("GET Response Code :: " + responseCode);
    if (responseCode == HttpURLConnection.HTTP_OK) { // success
      BufferedReader in = new BufferedReader(
          new InputStreamReader(httpURLConnection.getInputStream()));
      String inputLine;
      StringBuffer response = new StringBuffer();

      while ((inputLine = in.readLine()) != null) {
        response.append(inputLine);
      }
      in.close();

      // print result
      System.out.println(response.toString());
    } else {
      System.out.println("GET request not worked");
    }

    for (int i = 1; i <= 8; i++) {
      System.out.println(
          httpURLConnection.getHeaderFieldKey(i) + " = " + httpURLConnection.getHeaderField(i));
    }

  }
}
