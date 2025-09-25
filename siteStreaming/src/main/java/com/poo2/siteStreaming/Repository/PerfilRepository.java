package com.poo2.siteStreaming.Repository;

import com.poo2.siteStreaming.Entidades.Perfil;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends JpaRepository<Perfil,Integer> {
}
