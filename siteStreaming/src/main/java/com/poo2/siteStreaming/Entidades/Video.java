package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idVideo;

    @Column(unique = true, nullable = false)
    private String titulo;
    private String descricao;
    @Column(nullable = false)
    private int duracao;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Categoria idCategoria;

    @OneToMany(mappedBy = "Video", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Visualizacao> visualizacoes;
    @OneToMany(mappedBy = "Video", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Avaliacao> avaliacoes;

    public Video() {
    }
    public Video(int idVideo, String titulo, String descricao, int duracao, Categoria idCategoria, List<Visualizacao> visualizacoes, List<Avaliacao> avaliacoes) {
        this.idVideo = idVideo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
        this.idCategoria = idCategoria;
        this.visualizacoes = visualizacoes;
        this.avaliacoes = avaliacoes;
    }

    public int getIdVideo() {
        return idVideo;
    }
    public void setIdVideo(int idVideo) {
        this.idVideo = idVideo;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public int getDuracao() {
        return duracao;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
    public Categoria getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(Categoria idCategoria) {
        this.idCategoria = idCategoria;
    }
    public List<Visualizacao> getVisualizacoes() {
        return visualizacoes;
    }
    public void setVisualizacoes(List<Visualizacao> visualizacoes) {
        this.visualizacoes = visualizacoes;
    }
    public List<Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
    public void setAvaliacoes(List<Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
}
