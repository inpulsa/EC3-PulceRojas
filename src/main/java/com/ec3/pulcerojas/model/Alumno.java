package com.ec3.pulcerojas.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String dni;
    private String telefono;
}
