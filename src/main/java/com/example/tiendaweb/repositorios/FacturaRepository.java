package com.example.tiendaweb.repositorios;

import com.example.tiendaweb.entidades.Factura;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaRepository extends JpaRepository <Factura,Long> {
}
