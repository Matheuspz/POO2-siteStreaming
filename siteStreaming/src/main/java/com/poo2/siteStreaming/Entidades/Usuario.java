package com.poo2.siteStreaming.Entidades;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario", nullable = false)
    private Long idUsuario;

    @Column(name = "nome", unique = true, nullable = false)
    private String nome;
    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "senha", nullable = false)
    private String senha;
    @Column(name = "data_cadastro", nullable = false)
    private LocalDateTime dataCadastro;

    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Perfil> perfis = new ArrayList<>();

    public Usuario() {
    }
    public Usuario(Long idUsuario, String nome, String email, String senha, LocalDateTime dataCadastro) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
    }

    public Long getIdUsuario() {
        return idUsuario;
    }
    public void setIdUsuario(Long idUsuario) {
        this.idUsuario = idUsuario;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    public List<Perfil> getPerfis() {
        return perfis;
    }
    public void setPerfis(List<Perfil> perfis) {
        this.perfis = perfis;
    }
}
