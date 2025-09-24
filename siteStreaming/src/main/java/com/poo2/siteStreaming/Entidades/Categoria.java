package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idCategoria;
    @Column(unique = true, nullable = false)
    private String nome;

    @OneToMany(mappedBy = "categoria")
    private List<Video> videos;

    public Categoria() {
    }
    public Categoria(long idCategoria, String nome, List<Video> videos) {
        this.idCategoria = idCategoria;
        this.nome = nome;
        this.videos = videos;
    }

    public long getIdCategoria() {
        return idCategoria;
    }
    public void setIdCategoria(long idCategoria) {
        this.idCategoria = idCategoria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public List<Video> getVideos() {
        return videos;
    }
    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }
}
