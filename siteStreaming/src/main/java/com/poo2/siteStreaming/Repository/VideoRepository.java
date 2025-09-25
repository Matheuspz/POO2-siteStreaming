package com.poo2.siteStreaming.Repository;

import com.poo2.siteStreaming.DTO.VideoEstatisticaDTO;
import com.poo2.siteStreaming.Entidades.Categoria;
import com.poo2.siteStreaming.Entidades.Video;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video,Integer> {

    List<Video> findAllByOrderByTituloAsc();

    List<Video> findByCategoriaOrderByTituloAsc(Categoria categoria);

    @Query("""
            SELECT new com.poo2.siteStreaming.DTO.VideoEstatisticaDTO(
               v.titulo,
               v.categoria.nome,
               COUNT(vis),
               AVG(a.nota)
            )
            FROM Video v
            JOIN v.visualizacoes vis JOIN v.avaliacoes a
            GROUP BY v
            ORDER BY AVG(a.nota) DESC\s
            """)
    List<VideoEstatisticaDTO> findTop10MelhorAvaliados(Pageable pageable);

    @Query("""
            SELECT new com.poo2.siteStreaming.DTO.VideoEstatisticaDTO(
               v.titulo,
               v.categoria.nome,
               COUNT(vis),
               AVG(a.nota)
            )
            FROM Video v
            JOIN v.visualizacoes vis JOIN v.avaliacoes a
            GROUP BY v
            ORDER BY COUNT(vis) DESC
            """)
    List<VideoEstatisticaDTO> findTop10MaisAssistidos(Pageable pageable);


}
