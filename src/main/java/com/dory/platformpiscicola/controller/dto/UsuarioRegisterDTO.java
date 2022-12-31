package com.dory.platformpiscicola.controller.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class UsuarioRegisterDTO {

    private String nombres;
    private String apellidos;
    private String direccion;
    private int idTipoUsuario;
    private String email;
    private String password;
    private String foto;
    private int idDepartamento;
    private int idMunicipio;
    private String creadoCon;
    private int idSexo;
}
