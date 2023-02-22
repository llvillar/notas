package com.llv.notas.services;

import java.util.List;

import com.llv.notas.models.Nota;

public interface NotasService {

    public List<Nota> findAll();

    public List<Nota> findByTitulo(String titulo);

    public Nota findById(int codigo);

    public Nota save(Nota nota);

    public Nota update(int codigo, Nota nota);

    public void deleteById(int id);
}
