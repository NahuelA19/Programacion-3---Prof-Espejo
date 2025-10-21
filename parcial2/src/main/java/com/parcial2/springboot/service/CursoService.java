package com.parcial2.springboot.service;

import com.parcial2.springboot.entity.Curso;

import java.util.List;

public interface CursoService extends BaseService<Curso> {


    // Asignar estudiantes a un curso.

    public Curso asignarEstudiante(Long cursoId, Long estudianteId) throws Exception;

    //Devolver la lista de cursos en los que esta un estudiante.

    public List<Curso> findCursosByEstudiante(Long estudianteId) throws Exception;
}
