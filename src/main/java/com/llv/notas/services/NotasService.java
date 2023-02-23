package com.llv.notas.services;

import java.util.Date;
import java.util.List;

import com.llv.notas.models.Nota;

public interface NotasService {

    public List<Nota> findAll();

    public List<Nota> findCriteria(String titulo, Date fecha);

    public Nota findById(int codigo);

    public Nota save(Nota nota);

    public Nota update(int codigo, Nota nota);

    public void deleteById(int id);
}
