package com.example.tiendaweb.entidades;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class FacturaDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long detalleId;
    @ManyToOne
    @JoinColumn(name = "factura_id")
    private Factura factura;
    @ManyToOne
    @JoinColumn(name = "producto_id")
    private Producto producto;
    private Integer cantidad;
    private Double subtotal;
}
