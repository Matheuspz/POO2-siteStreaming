package com.poo2.siteStreaming.Repository;

import com.poo2.siteStreaming.Entidades.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria,Integer> {

    Categoria findByNomeIgnoreCase(String nome);
}
