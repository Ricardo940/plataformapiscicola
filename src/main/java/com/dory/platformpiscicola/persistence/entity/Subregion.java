package com.dory.platformpiscicola.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "subregiones")
public class Subregion {

    @Id
    @Column(name = "id_subregion")
    private int id;
    private String nombre;
    @Column(name = "id_departamento_fk")
    private int idDepartamento;
}
