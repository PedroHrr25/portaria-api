package io.github.pedrohrr25.portaria_api.adapter.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuario")
public class UsuarioEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String senha;
    private String email;
    private Boolean administrador;

    @OneToOne
    @JoinColumn(name = "pessoa_id")
    private PessoaEntity pessoaEntity;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Long id, String senha, String email, Boolean administrador, PessoaEntity pessoa) {
        this.id = id;
        this.senha = senha;
        this.email = email;
        this.administrador = administrador;
        this.pessoaEntity = pessoa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Boolean administrador) {
        this.administrador = administrador;
    }

    public PessoaEntity getPessoa() {
        return pessoaEntity;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoaEntity = pessoa;
    }
}
