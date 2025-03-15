package com.ec3.pulcerojas.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "clases")
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descripcion;
    private LocalDateTime fecha;
    private String entrenador;
}