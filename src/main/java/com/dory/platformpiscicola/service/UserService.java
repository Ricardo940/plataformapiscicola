package com.dory.platformpiscicola.service;

import com.dory.platformpiscicola.persistence.entity.Usuario;
import com.dory.platformpiscicola.persistence.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UsuarioRepository repository;

    public Usuario save(Usuario usuario){
        return repository.save(usuario);
    }

    public Optional<Usuario> findUsuarioById(int id){
        return repository.findById(id);
    }

    public Optional<Usuario> findUsuarioByEmail(String email){
        return repository.findOneByEmail(email);
    }
}
