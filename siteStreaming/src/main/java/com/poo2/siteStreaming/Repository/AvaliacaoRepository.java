package com.poo2.siteStreaming.Repository;

import com.poo2.siteStreaming.Entidades.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AvaliacaoRepository extends JpaRepository<Avaliacao,Integer> {

}
