package com.parcial2.springboot.repository;


import com.parcial2.springboot.entity.Curso;
import com.parcial2.springboot.entity.Estudiante;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CursoRepository extends BaseRepository<Curso>{
    List<Curso> findByEstudiantes_Id(Long estudianteId);
}
