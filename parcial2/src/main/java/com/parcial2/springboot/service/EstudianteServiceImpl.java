package com.parcial2.springboot.service;


import com.parcial2.springboot.entity.Estudiante;
import com.parcial2.springboot.repository.EstudianteRepository;
import org.springframework.stereotype.Service;

@Service
public class EstudianteServiceImpl extends BaseServiceImpl<Estudiante, EstudianteRepository> implements EstudianteService {
}
