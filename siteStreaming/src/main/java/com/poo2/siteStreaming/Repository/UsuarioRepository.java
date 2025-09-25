package com.poo2.siteStreaming.Repository;

import com.poo2.siteStreaming.DTO.UsuarioEstatisticaDTO;
import com.poo2.siteStreaming.Entidades.Usuario;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {

    @Query("""
        SELECT new com.poo2.siteStreaming.DTO.UsuarioEstatisticaDTO(
            u.nome,
            (SELECT COUNT(vis)
             FROM Visualizacao vis
             WHERE vis.perfil.usuario = u)
        )
        FROM Usuario u
        ORDER BY (SELECT COUNT(vis)
                  FROM Visualizacao vis
                  WHERE vis.perfil.usuario = u) DESC
    """)
    List<UsuarioEstatisticaDTO> findTopUsuariosMaisAtivos(Pageable pageable);


}
