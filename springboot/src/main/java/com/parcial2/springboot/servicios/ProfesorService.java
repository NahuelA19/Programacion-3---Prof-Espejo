package com.parcial2.springboot.servicios;


import com.parcial2.springboot.entidades.Profesor;
import com.parcial2.springboot.repositorios.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfesorService {

    @Autowired
    private ProfesorRepository ProfesorRepository;

    public List<Profesor> obtenerTodosLosProfesores() {
        return ProfesorRepository.findAll();
    }

    public Profesor obtenerProfesorPorId(Long id) {
        return ProfesorRepository.findById(id).orElse(null);

    }

    public Profesor guardarCambiosProfesor(Profesor profesor) {
        return ProfesorRepository.save(profesor);
    }



}