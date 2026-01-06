package io.github.pedrohrr25.portaria_api.core.domain;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {
    private Long id;
    private String senha;
    private String email;
    private Boolean administrador;
    private Pessoa Pessoa;
}
