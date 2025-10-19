package com.parcial2.springboot.entidades;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Estudiante {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String matricula;



    //Relaciones:

    @ManyToMany(mappedBy = "estudiantes")
    @JsonIgnoreProperties("estudiantes")
    private List<Curso> cursos;
}
