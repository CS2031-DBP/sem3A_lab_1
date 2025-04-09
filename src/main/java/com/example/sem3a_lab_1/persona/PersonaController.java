package com.example.sem3a_lab_1.persona;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persona")
public class PersonaController {

    @Autowired
    PersonaRepository personaRepository;

    @PostMapping
    ResponseEntity<Persona> createPersona(@RequestBody Persona persona){
        return ResponseEntity.ok(personaRepository.save(persona));
    }

    @GetMapping
    ResponseEntity<List<Persona>> getPersonas(){
        return ResponseEntity.ok(personaRepository.findAll());
    }

    @GetMapping("/{id}")
    ResponseEntity<Persona> getPersona(@PathVariable Long id){
        Optional<Persona> persona = personaRepository.findById(id);

        if(persona.isEmpty()){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(persona.get());
    }

}
