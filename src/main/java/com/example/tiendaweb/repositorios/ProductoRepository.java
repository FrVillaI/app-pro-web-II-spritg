package com.example.tiendaweb.repositorios;

import com.example.tiendaweb.entidades.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
