package com.llv.notas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.llv.notas.models.Nota;

public interface NotasRepository extends JpaRepository<Nota, Integer>{
    
}
