package com.parcial2.springboot.entidades;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Curso {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String nombre;


//Relaciones:


    //Entre profesor y curso:
    @ManyToOne
    @JoinColumn(name = "profesor_id")
    @JsonIgnoreProperties("cursos")
    private Profesor profesor;

    //Entre estudiantes y curso:

    @ManyToMany
    @JoinTable(
            name = "curso_estudiante",                               //Crea una tabla intermedia y las dos siguientes lineas apuntan a cada entidad.
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    @JsonIgnoreProperties("cursos")
    private List<Estudiante> estudiantes;

}
