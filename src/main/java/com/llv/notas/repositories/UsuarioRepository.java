package com.llv.notas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.llv.notas.models.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, String>{
    Usuario findByName(String name);
}
