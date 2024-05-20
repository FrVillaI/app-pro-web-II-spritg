package com.example.tiendaweb.entidades;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
public class Factura {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long facturaId;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    private Date fecha;
    private Double total;
}
