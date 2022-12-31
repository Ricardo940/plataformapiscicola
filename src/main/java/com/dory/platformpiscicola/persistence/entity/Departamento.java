package com.dory.platformpiscicola.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "departamentos")
public class Departamento {

    @Id
    @Column(name = "id_departamento")
    private int id;
    @Column(name = "nombre_departamento")
    private String nombre;
    private String descripcion;
}
