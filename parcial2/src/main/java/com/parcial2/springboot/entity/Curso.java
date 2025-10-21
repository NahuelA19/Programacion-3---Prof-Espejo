package com.parcial2.springboot.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Curso extends Base {

    @Column(nullable = false)
    private String nombre;


// Relacion entre profesor y cursos:

    //Un Profesor puede tener varios Cursos (relación @ManyToOne desde Curso).
    @ManyToOne
    @JoinColumn(name = "profesor_id")
    Profesor profesor;

// Relacion entre curso y estudiante:

    //Un Curso puede tener varios Estudiantes, y un Estudiante puede pertenecer a varios Cursos (relación @ManyToMany).
    @ManyToMany
    @JoinTable(name = "curso_estudiante",
            joinColumns = @JoinColumn(name = "curso_id"),
            inverseJoinColumns = @JoinColumn(name = "estudiante_id")
    )
    private List<Estudiante> estudiantes;



}
