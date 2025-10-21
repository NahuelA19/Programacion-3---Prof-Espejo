package com.parcial2.springboot.service;

import com.parcial2.springboot.entity.Base;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BaseService <E extends Base> {

    public List<E> findAll() throws Exception;

    public E findById(Long id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(Long id, E entity) throws Exception;

    public boolean delete(Long id) throws Exception;


}
