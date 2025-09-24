package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_video", nullable = false)
    private Long idVideo;

    @Column(name = "titulo", unique = true, nullable = false)
    private String titulo;
    @Column(name = "descricao")
    private String descricao;
    @Column(name = "duracao", nullable = false)
    private int duracao;

    @ManyToOne
    @JoinColumn(name = "id_categoria", nullable = false)
    private Categoria categoria;

    @OneToMany(mappedBy = "video", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Visualizacao> visualizacoes;
    @OneToMany(mappedBy = "video", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Avaliacao> avaliacoes;

    public Video() {
    }
    public Video(Long idVideo, String titulo, String descricao, int duracao, Categoria categoria, List<Visualizacao> visualizacoes, List<Avaliacao> avaliacoes) {
        this.idVideo = idVideo;
        this.titulo = titulo;
        this.descricao = descricao;
        this.duracao = duracao;
        this.categoria = categoria;
        this.visualizacoes = visualizacoes;
        this.avaliacoes = avaliacoes;
    }

    public Long getIdVideo() {
        return idVideo;
    }
    public void setIdVideo(Long idVideo) {
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
    public Categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(Categoria idCategoria) {
        this.categoria = idCategoria;
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
