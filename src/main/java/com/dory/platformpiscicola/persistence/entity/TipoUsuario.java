package com.dory.platformpiscicola.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
@Table(name = "tipos_usuarios")
public class TipoUsuario {

    @Id
    @Column(name = "id_tipo_usuario")
    private int id;
    @Column(name = "nombre_tipo_usuario")
    private String tipoUsuario;


}
