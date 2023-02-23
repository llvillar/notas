package com.llv.notas.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llv.notas.models.Nota;

@Repository
public interface NotasRepository extends JpaRepository<Nota, Integer>{

    List<Nota> findByTituloContainingIgnoreCaseAndFechaGreaterThanEqual(String titulo, Date fecha);
    
}
