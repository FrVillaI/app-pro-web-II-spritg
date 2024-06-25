package com.example.tiendaweb.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoID;
    private String codigo;
    private String nombre;
    private Double precio;
    private String descripcion;
    private String categoria;// Corregido a boolean
    private String url;
}

