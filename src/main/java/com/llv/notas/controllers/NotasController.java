package com.llv.notas.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.llv.notas.models.Nota;
import com.llv.notas.services.NotasService;

@RestController
public class NotasController {

    @Autowired
    NotasService service;

    @GetMapping("/notas")
    List<Nota> all(){
        return service.findAll();
    }

    @GetMapping("/notas/criteria")
    List<Nota> criteria(@RequestParam String titulo, 
            @RequestParam @DateTimeFormat(pattern="dd/MM/yyyy") Date fechaDesde){
        return service.findCriteria(titulo, fechaDesde);
    }

    @GetMapping("/notas/{id}")
    Nota findNota(@PathVariable int id){
        return service.findById(id);
    }

    @DeleteMapping("/notas/{id}")
    void deleteNota(@PathVariable int id){
        service.deleteById(id);
    }

    @PostMapping("/notas")
    Nota guardar(@RequestBody Nota nota){
        return service.save(nota);
    }

    @PutMapping("/notas/{id}")
    Nota actualizar(@PathVariable int id, @RequestBody Nota nota){
        return service.update(id, nota);
    }
    
}
