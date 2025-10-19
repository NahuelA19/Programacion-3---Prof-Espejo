package com.parcial2.springboot.entidades;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String email;





    //Relaciones:

    @OneToMany(mappedBy = "profesor")
    @JsonIgnoreProperties("profesor")
    private List<Curso> cursos;

}
