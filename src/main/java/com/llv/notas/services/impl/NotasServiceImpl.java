package com.llv.notas.services.impl;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.llv.notas.models.Nota;
import com.llv.notas.repositories.NotasRepository;
import com.llv.notas.services.NotasService;

@Service
public class NotasServiceImpl implements NotasService {

    @Autowired
    NotasRepository repository;

    @Override
    public List<Nota> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Nota> findCriteria(String titulo, Date fecha) {
        return repository.findByTituloContainingIgnoreCaseAndFechaGreaterThanEqual(titulo, fecha);
    }

    @Override
    public Nota findById(int codigo) {
        Optional<Nota> findById = repository.findById(codigo);
        if(findById != null){
            return findById.get();
        }
        return null;
    }

    @Override
    public Nota save(Nota nota) {
        return repository.save(nota);
    }

    @Override
    public Nota update(int codigo, Nota nota) {

        Nota findById = this.findById(codigo);
        if(findById != null){

            nota.setCodigo(findById.getCodigo());

            return repository.save(nota);
            
        }
        return null;
    }

    @Override
    public void deleteById(int id) {
        repository.deleteById(id);
    }
    
}
