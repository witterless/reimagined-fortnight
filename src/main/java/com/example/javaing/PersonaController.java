package com.example.javaing;

import com.example.javaing.response.GetResponse;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class PersonaController {
  private final PersonaService personaService;

  public PersonaController(PersonaService personaService) {
    this.personaService = personaService;
  }


  @GetMapping("/run")
  public String index() {
    return "Greetings from Spring Boot!";
  }

  @GetMapping("/persona")
  public ResponseEntity<List<GetResponse>> getPersona() {
    return ResponseEntity.ok(personaService.getPersona());
  }

}
