package com.example.javaing;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {

  @GetMapping("/run")
  public String index() {
    return "Greetings from Spring Boot!";
  }

}
