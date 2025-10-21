package com.parcial2.springboot.repository;

import com.parcial2.springboot.entity.Base;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface BaseRepository<E extends Base> extends JpaRepository<E, Long> {
}
