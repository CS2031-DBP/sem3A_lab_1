package com.example.sem3a_lab_1.persona;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "persona")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre", unique = false)
    private String nombre;

    @Column(name = "apellido", unique = false)
    private String apellido;

}
