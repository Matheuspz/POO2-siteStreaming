package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

@Entity
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_avaliacao",  nullable = false)
    private Long idAvaliacao;

    @Column(name = "nota", nullable = false)
    private int nota;
    @Column(name = "comentario")
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "id_perfil", nullable = false)
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "id_video", nullable = false)
    private Video video;


    public Avaliacao() {
    }
    public Avaliacao(Long idAvaliacao, int nota, String comentario, Perfil perfil, Video video) {
        this.idAvaliacao = idAvaliacao;
        this.nota = nota;
        this.comentario = comentario;
        this.perfil = perfil;
        this.video = video;
    }

    public Long getIdAvaliacao() {
        return idAvaliacao;
    }
    public void setIdAvaliacao(Long idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }
    public int getNota() {
        return nota;
    }
    public void setNota(int nota) {
        this.nota = nota;
    }
    public String getComentario() {
        return comentario;
    }
    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    public Perfil getPerfil() {
        return perfil;
    }
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }
    public Video getVideo() {
        return video;
    }
    public void setVideo(Video video) {
        this.video = video;
    }
}
