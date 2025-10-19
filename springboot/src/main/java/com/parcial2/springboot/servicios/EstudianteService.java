package com.parcial2.springboot.servicios;

import com.parcial2.springboot.entidades.Estudiante;
import com.parcial2.springboot.repositorios.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> obtenerTodosLosEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante obtenerEstudiantePorId(Long id) {
        return estudianteRepository.findById(id).orElse(null);

    }

    public Estudiante guardarCambiosEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }



}
