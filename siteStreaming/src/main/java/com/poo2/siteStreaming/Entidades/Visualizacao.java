package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Visualizacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_visualizacao", nullable = false)
    private Long idVisualizacao;

    @Column(name = "data_hora", nullable = false)
    private LocalDateTime dataHora;
    @Column(name = "progresso", nullable = false)
    private int progresso;

    @ManyToOne
    @JoinColumn(name = "id_perfil", nullable = false)
    private Perfil perfil;

    @ManyToOne
    @JoinColumn(name = "id_video", nullable = false)
    private Video video;


    public Visualizacao() {
    }
    public Visualizacao(Long idVisualizacao, Perfil perfil, Video video, LocalDateTime dataHora, int progresso) {
        this.idVisualizacao = idVisualizacao;
        this.perfil = perfil;
        this.video = video;
        this.dataHora = dataHora;
        this.progresso = progresso;
    }

    public Long getIdVisualizacao() {
        return idVisualizacao;
    }
    public void setIdVisualizacao(Long idVisualizacao) {
        this.idVisualizacao = idVisualizacao;
    }
    public Perfil getPerfil() {
        return perfil;
    }
    public void setPerfil(Perfil idPerfil) {
        this.perfil = idPerfil;
    }
    public Video getVideo() {
        return video;
    }
    public void setVideo(Video idVideo) {
        this.video = idVideo;
    }
    public LocalDateTime getDataHora() {
        return dataHora;
    }
    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
    public int getProgresso() {
        return progresso;
    }
    public void setProgresso(int progreso) {
        this.progresso = progreso;
    }

}
