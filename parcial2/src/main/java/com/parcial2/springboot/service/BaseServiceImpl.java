package com.parcial2.springboot.service;

import java.util.List;
import java.util.Optional;

import com.parcial2.springboot.entity.Base;
import com.parcial2.springboot.repository.BaseRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;


public abstract class BaseServiceImpl<E extends Base, R extends BaseRepository<E>> implements BaseService<E> {


    @Autowired
    protected R repository;

    @Override
    @Transactional // Indica a Spring que esto es una transacción de BBDD
    public List<E> findAll() throws Exception {
        try {
            return repository.findAll();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E findById(Long id) throws Exception {
        try {
            Optional<E> opt = repository.findById(id);
            if (opt.isEmpty()) {
                throw new Exception("No se encontró el registro con el id: " + id);
            }
            return opt.get();
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E save(E entity) throws Exception {
        try {
            return repository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public E update(Long id, E entity) throws Exception {
        try {
            E entityDB = findById(id);
            return repository.save(entity);
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }

    @Override
    @Transactional
    public boolean delete(Long id) throws Exception {
        try {
            // Buscamos si existe
            E entityDB = findById(id);
            // Si existe, la borramos
            repository.delete(entityDB);
            return true;
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }
    }
}