package com.dory.platformpiscicola.controller;

import com.dory.platformpiscicola.controller.dto.UsuarioRegisterDTO;
import com.dory.platformpiscicola.mapper.UsuarioMapper;
import com.dory.platformpiscicola.persistence.entity.Usuario;
import com.dory.platformpiscicola.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Optional;
import java.util.PrimitiveIterator;

@RestController
@RequestMapping("/users")
public class UsuarioController {

    @Autowired
    private UserService service;
    @Autowired
    private UsuarioRegisterDTO userRegisterDTO;
    @Autowired
    private UsuarioMapper mapper;
    @Autowired
    private PasswordEncoder passwordEncoder;



    @PostMapping("/create")
    public ResponseEntity<Usuario> save(@RequestBody UsuarioRegisterDTO userRegisterDTO){
        if(userRegisterDTO.getPassword().isEmpty()){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        Usuario usuario = mapper.userRegisterDTOToUser(userRegisterDTO);
        String passwordEncryted = passwordEncoder.encode(usuario.getPassword());
        usuario.setPassword(passwordEncryted);
        usuario.setFechaRegistro(LocalDateTime.now());
        return new ResponseEntity<>(service.save(usuario), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> findById(@PathVariable("id") int id){

               return service.findUsuarioById(id)
                .map(usuario -> new ResponseEntity<>(usuario, HttpStatus.OK))
                        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }



}
