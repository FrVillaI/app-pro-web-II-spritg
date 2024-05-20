package com.example.tiendaweb.repositorios;

import com.example.tiendaweb.entidades.FacturaDetalle;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FacturaDetalleRepository extends JpaRepository <FacturaDetalle,Long> {
}
