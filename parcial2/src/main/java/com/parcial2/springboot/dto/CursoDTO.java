package com.parcial2.springboot.dto;

import java.util.List;
import lombok.Data;

@Data
public class CursoDTO {

    private Long id;
    private String nombre;

    private String nombreProfesor;

    private List<String> nombreEstudiantes;
}
