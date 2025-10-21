package com.parcial2.springboot.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)

public class Estudiante extends Base {

    @Column (nullable = false)
    private String nombre;

    @Column (nullable = false, unique = true)
    private String matricula;
}
