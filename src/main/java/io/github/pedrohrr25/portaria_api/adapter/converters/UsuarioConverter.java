package io.github.pedrohrr25.portaria_api.adapter.converters;

import io.github.pedrohrr25.portaria_api.adapter.dto.UsuarioDto;
import io.github.pedrohrr25.portaria_api.core.domain.Pessoa;
import io.github.pedrohrr25.portaria_api.core.domain.Usuario;
import org.springframework.stereotype.Component;

@Component
public class UsuarioConverter {

    public Usuario toDomain(UsuarioDto dto) {
        Usuario usuario = new Usuario();
        usuario.setId(dto.getId());
        usuario.setSenha(dto.getSenha());
        usuario.setEmail(dto.getEmail());
        usuario.setAdministrador(dto.getAdministrador());
        usuario.setPessoa(new Pessoa(null, dto.getNome()));
        return usuario;
    }

    public UsuarioDto toDto(Usuario usuario) {
        UsuarioDto dto = new UsuarioDto();
        dto.setId(usuario.getId());
        dto.setSenha(usuario.getSenha());
        dto.setEmail(usuario.getEmail());
        dto.setAdministrador(usuario.getAdministrador());
        dto.setNome(usuario.getPessoa().getNome()); // Nome não está disponível no domínio Usuario
        return dto;
    }
}
