package com.dory.platformpiscicola.persistence.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String cedula;
    private String nombres;
    private String apellidos;
    private String celular;
    private String direccion;
    @Column(name = "id_tipo_usuario")
    private Integer idTipoUsuario;
    @Column(unique = true)
    private String email;
    private String password;
    @Column(name = "id_area_experticia")
    private Integer idAreaExperticia;
    @Column(name = "nombre_negocio")
    private String nombreNegocio;
    private String foto;
    @Column(name = "fecha_registro")
    private LocalDateTime fechaRegistro;
    @Column(name = "fecha_nacimiento")
    private LocalDateTime fechaNacimiento;
    @Column(name = "id_departamento")
    private Integer idDepartamento;
    @Column(name = "id_municipio")
    private Integer idMunicipio;
    @Column(name = "id_corregimiento")
    private Integer idCorregimiento;
    @Column(name = "id_vereda")
    private Integer idVereda;
    private double latitud;
    private double longitud;
    @Column(name = "nombre_corregimiento")
    private String nombreCorregimiento;
    @Column(name = "nombre_vereda")
    private String nombreVereda;
    @Column(name = "esta_verificado")
    private Integer estaVerificado;
    @Column(name = "otra_area_experticia")
    private String otraAreaExperticia;
    @Column(name = "otra_area_experticia_descripcion")
    private String otraAreaExperticiaDescripxion;
    @Column(name = ("sobre_mi"))
    private String sobreMi;
    @Column(name = "informacion_adicional_direccion")
    private String informacionAdicionalDireccion;
    @Column(name = "creado_con")
    private String creadoCon;
    @Column(name = "take_tour")
    private Integer takeTour;
    @Column(name = "id_sexo")
    private Integer idSexo;
    @Column(name = "id_etnia")
    private Integer idEtnia;
    @Column(name = "url_sisben")
    private String urlSisben;
    @Column(name = "url_imagen_cedula")
    private String urlCedula;
    @Column(name = "carnet")
    private String urlCarnet;

    @ManyToOne
    @JoinColumn(name = "id_tipo_usuario", insertable = false, updatable = false)
    private TipoUsuario tipoUsuario;

    @ManyToOne()
    @JoinColumn(name = "id_municipio", insertable = false, updatable = false)
    private Municipio municipio;

    @ManyToOne
    @JoinColumn(name = "id_sexo", insertable = false, updatable = false)
    private Sexo sexo;

    @ManyToOne
    @JoinColumn(name = "id_etnia", insertable = false, updatable = false)
    private Etnia etnia;










}
