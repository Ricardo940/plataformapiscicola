package com.dory.platformpiscicola.security;

import com.dory.platformpiscicola.persistence.entity.Usuario;
import com.dory.platformpiscicola.persistence.repository.UsuarioRepository;
import com.dory.platformpiscicola.security.filter.UserDetailsImp;
import com.dory.platformpiscicola.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Usuario usuario = usuarioRepository.findOneByEmail(username)
                .orElseThrow(()->new UsernameNotFoundException("El usuario con email" + username + "no existe"));

        return new UserDetailsImp(usuario);
    }
}
