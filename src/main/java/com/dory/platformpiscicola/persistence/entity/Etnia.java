package com.dory.platformpiscicola.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "etnias")
public class Etnia {
    @Id
    private int id;
    private String nombre;
}
