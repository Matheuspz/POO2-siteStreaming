package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAvaliacao;

    @Column(nullable = false)
    private int nota;
    private String comentario;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Perfil idPerfil;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Video idVideo;
}
