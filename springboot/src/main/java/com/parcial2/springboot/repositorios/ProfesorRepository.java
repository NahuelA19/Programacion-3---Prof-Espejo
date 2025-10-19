package com.parcial2.springboot.repositorios;

import com.parcial2.springboot.entidades.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository  extends JpaRepository<Profesor,Long> {




}
