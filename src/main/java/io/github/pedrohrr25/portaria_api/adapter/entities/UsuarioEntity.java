package io.github.pedrohrr25.portaria_api.adapter.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
public class UsuarioEntity {

    @Id
    @GeneratedValue
    private Long id;
    private String senha;
    private String email;
    private Boolean administrador;

    public UsuarioEntity() {
    }

    public UsuarioEntity(Long id, String senha, String email, Boolean administrador) {
        this.id = id;
        this.senha = senha;
        this.email = email;
        this.administrador = administrador;
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
}
