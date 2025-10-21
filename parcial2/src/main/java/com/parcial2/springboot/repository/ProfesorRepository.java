package com.parcial2.springboot.repository;

import com.parcial2.springboot.entity.Profesor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfesorRepository extends BaseRepository<Profesor> {

}
