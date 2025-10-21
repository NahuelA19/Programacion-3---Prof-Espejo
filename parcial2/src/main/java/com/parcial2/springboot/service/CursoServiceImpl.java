package com.parcial2.springboot.service;

import com.parcial2.springboot.entity.Curso;
import com.parcial2.springboot.entity.Estudiante;
import com.parcial2.springboot.repository.CursoRepository;
import com.parcial2.springboot.repository.EstudianteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CursoServiceImpl extends BaseServiceImpl<Curso, CursoRepository> implements CursoService {

    @Autowired

    private EstudianteRepository estudianteRepository;

    @Override
    @Transactional
    public Curso asignarEstudiante(Long cursoId, Long estudianteId) throws Exception {
        try {
            // Buscamos el curso

            Curso curso = this.findById(cursoId);

            // Buscamos el estudiante
            Estudiante estudiante = estudianteRepository.findById(estudianteId)
                    .orElseThrow(() -> new Exception("Estudiante no encontrado con id: " + estudianteId));

            // Añadimos el estudiante a la lista del curso
            curso.getEstudiantes().add(estudiante);

            // Guardamos el curso actualizado
            return repository.save(curso);

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public List<Curso> findCursosByEstudiante(Long estudianteId) throws Exception {
        try {
            // Usamos del metodo creado en CursoRepository
            return repository.findByEstudiantes_Id(estudianteId);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}
