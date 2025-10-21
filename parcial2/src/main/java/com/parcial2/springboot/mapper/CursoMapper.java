package com.parcial2.springboot.mapper;

import com.parcial2.springboot.dto.CursoDTO;
import com.parcial2.springboot.entity.Curso;
import com.parcial2.springboot.entity.Estudiante;

import java.util.stream.Collectors;

public class CursoMapper {

    public static CursoDTO toDTO(Curso curso) {

        CursoDTO dto = new CursoDTO();

        dto.setId(curso.getId());
        dto.setNombre(curso.getNombre());

        // Traduce las relaciones

        if (curso.getProfesor() != null) {
            dto.setNombreProfesor(curso.getProfesor().getNombre());
        } else {
            dto.setNombreProfesor("Sin asignar");
        }

        // Traduce la lista de Estudiantes

        dto.setNombreEstudiantes(
                curso.getEstudiantes()
                        .stream()
                        .map(Estudiante::getNombre)
                        .collect(Collectors.toList())
        );

        return dto;
    }
}
