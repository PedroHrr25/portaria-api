package io.github.pedrohrr25.portaria_api.core.services;

import io.github.pedrohrr25.portaria_api.core.domain.Usuario;
import io.github.pedrohrr25.portaria_api.core.ports.UsuarioRepositoryPort;
import io.github.pedrohrr25.portaria_api.core.ports.UsuarioServicePort;
import org.springframework.stereotype.Service;

public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioRepositoryPort;


    public UsuarioService(UsuarioRepositoryPort usuarioRepositoryPort) {
        this.usuarioRepositoryPort = usuarioRepositoryPort;
    }

    @Override
    public Usuario create(Usuario usuario) {
        Usuario usuarioExistente = usuarioRepositoryPort.obtainByEmail(usuario.getEmail());
        if (usuarioExistente != null) {
            throw new IllegalArgumentException("Usuário com esse email já existe.");
        }
        return usuarioRepositoryPort.create(usuario);
    }
}
