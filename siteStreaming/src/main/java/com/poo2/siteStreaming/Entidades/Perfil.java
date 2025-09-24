package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Perfil {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_perfil", nullable = false)
    private Long idPerfil;

    @Column(name = "nome_perfil", unique = true, nullable = false)
    private String nome;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;

    @OneToMany(mappedBy = "perfil", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Visualizacao> visualizacoes = new ArrayList<>();

    @OneToMany(mappedBy = "perfil")
    private List<Avaliacao> avaliacoes = new ArrayList<>();


    public Perfil() {
    }
    public Perfil(Long idPerfil, String nome, Usuario usuario) {
        this.idPerfil = idPerfil;
        this.nome = nome;
        this.usuario = usuario;
    }

    public Long getIdPerfil() {
        return idPerfil;
    }
    public void setIdPerfil(Long idPerfil) {
        this.idPerfil = idPerfil;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Usuario getUsuario() {
        return usuario;
    }
    public void setUsuario(Usuario idUsuario) {
        this.usuario = idUsuario;
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
