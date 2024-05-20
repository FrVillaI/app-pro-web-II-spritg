package com.example.tiendaweb.entidades;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.w3c.dom.Text;

@Data
@Entity
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoID;
    private String nombre;
    private String codigo;
    private String descripcion;
    private String categoria;
    private Double precio;
    private String url;

}
