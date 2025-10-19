package com.parcial2.springboot.repositorios;

import com.parcial2.springboot.entidades.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstudianteRepository  extends JpaRepository<Estudiante,Long> {
}
