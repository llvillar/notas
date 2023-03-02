package com.llv.notas.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.llv.notas.models.Permiso;
import com.llv.notas.models.Usuario;
import com.llv.notas.repositories.UsuarioRepository;



@Service
public class UserService implements UserDetailsService {

    @Autowired
    UsuarioRepository repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario user = repo.findByName(username);

        List<GrantedAuthority> roles = new ArrayList<>();

        List<Permiso> permisos = user.getPermisos();

        for (Permiso p : permisos) {
            roles.add(new SimpleGrantedAuthority(p.getNombre()));
        }

        // UserDetails userDetails = new User(user.getName(), user.getPassword(),
        // roles);
        UserDetails userDetails = User.builder()
                .username(user.getName())
                .password(user.getPassword())
                .authorities(roles)
                .build();
        return userDetails;
    }

}
