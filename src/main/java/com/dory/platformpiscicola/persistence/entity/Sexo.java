package com.dory.platformpiscicola.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sexos")
public class Sexo {

    @Id
    private int id;
    private String nombre;
}
