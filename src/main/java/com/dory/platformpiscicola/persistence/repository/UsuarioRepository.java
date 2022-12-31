package com.dory.platformpiscicola.persistence.repository;

import com.dory.platformpiscicola.persistence.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {

    Optional<Usuario> findOneByEmail(String email);
}
