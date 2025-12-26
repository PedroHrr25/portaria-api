package io.github.pedrohrr25.portaria_api.adapter.dto;




public class UsuarioDto {
    private Long id;
    private String senha;
    private String email;
    private Boolean administrador;
    private String nome;

    public UsuarioDto() {
    }

    public UsuarioDto(Long id, String senha, String email, Boolean administrador, String nome) {
        this.id = id;
        this.senha = senha;
        this.email = email;
        this.administrador = administrador;
        this.nome = nome;
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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
