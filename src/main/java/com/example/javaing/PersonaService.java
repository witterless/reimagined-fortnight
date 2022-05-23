package com.example.javaing;

import com.example.javaing.response.GetResponse;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class PersonaService {

  public List<GetResponse> getPersona(){ Client client = ClientBuilder.newClient();
    ObjectMapper objectMapper = new ObjectMapper();

    WebTarget webTarget = client.target("https://withpersona.com/api/v1/accounts").path("/act_adery8xRe18bPP6LrcKuaZWT");

    Response response = webTarget.request(MediaType.APPLICATION_JSON).get();

    try {
      return objectMapper.readValue(response.readEntity(String.class), new TypeReference<>() {});
    } catch (JsonProcessingException ex) {
      System.out.println(ex);
    }
    return null;}
}
