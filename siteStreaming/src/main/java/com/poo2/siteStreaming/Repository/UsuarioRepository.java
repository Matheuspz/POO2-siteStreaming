package com.poo2.siteStreaming.Repository;

import com.poo2.siteStreaming.Entidades.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
}
