package com.poo2.siteStreaming.Repository;

import com.poo2.siteStreaming.Entidades.Visualizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualizacaoRepository extends JpaRepository<Visualizacao,Integer> {
}
