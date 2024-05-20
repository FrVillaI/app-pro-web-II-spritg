package com.example.tiendaweb.repositorios;

import com.example.tiendaweb.entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
}
