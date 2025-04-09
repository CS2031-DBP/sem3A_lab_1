package com.example.sem3a_lab_1.artista;

import com.example.sem3a_lab_1.persona.Persona;
import jakarta.persistence.*;
import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.Data;

@Entity
@Data
public class Artista {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String username;

    @OneToOne
    @JsonBackReference
    Persona persona;
}
