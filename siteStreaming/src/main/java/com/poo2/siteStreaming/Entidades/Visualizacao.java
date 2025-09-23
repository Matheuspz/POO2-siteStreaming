package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Visualizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVisualizacao;

    @Column(nullable = false)
    private LocalDateTime dataHora;
    @Column(nullable = false)
    private int progreso;

    @ManyToOne
    @JoinColumn(name = "idPerfil", nullable = false)
    private Perfil idPerfil;

    @ManyToOne
    @JoinColumn(name = "idVideo", nullable = false)
    private Video idVideo;


    public Visualizacao() {
    }
    public Visualizacao(Long idVisualizacao, Perfil idPerfil, Video idVideo, LocalDateTime dataHora, int progreso) {
        this.idVisualizacao = idVisualizacao;
        this.idPerfil = idPerfil;
        this.idVideo = idVideo;
        this.dataHora = dataHora;
        this.progreso = progreso;
    }

    public Long getIdVisualizacao() {
        return idVisualizacao;
    }
    public void setIdVisualizacao(Long idVisualizacao) {
        this.idVisualizacao = idVisualizacao;
    }
    public Perfil getIdPerfil() {
        return idPerfil;
    }
    public void setIdPerfil(Perfil idPerfil) {
        this.idPerfil = idPerfil;
    }
    public Video getIdVideo() {
        return idVideo;
    }
    public void setIdVideo(Video idVideo) {
        this.idVideo = idVideo;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public int getProgreso() {
        return progreso;
    }
    public void setProgreso(int progreso) {
        this.progreso = progreso;
    }

}
