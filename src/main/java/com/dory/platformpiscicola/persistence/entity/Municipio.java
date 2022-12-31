package com.dory.platformpiscicola.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "municipios")
public class Municipio {
    @Id
    @Column(name = "id_municipio")
    private int id;
    private String nombre;
    private String descripcion;
    @Column(name = "id_departamento_fk")
    private int idDepartamento;
    @Column(name = "id_subregion_fk")
    private int idSubregion;
    private double latitud;
    private double longitud;
}
