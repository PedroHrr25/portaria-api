package io.github.pedrohrr25.portaria_api.core.services;

import io.github.pedrohrr25.portaria_api.core.domain.Usuario;
import io.github.pedrohrr25.portaria_api.core.ports.UsuarioRepositoryPort;
import io.github.pedrohrr25.portaria_api.core.ports.UsuarioServicePort;
import org.springframework.stereotype.Service;

public class UsuarioService implements UsuarioServicePort {

    private final UsuarioRepositoryPort usuarioServicePort;


    public UsuarioService(UsuarioRepositoryPort usuarioServicePort) {
        this.usuarioServicePort = usuarioServicePort;
    }


    @Override
    public Usuario create(Usuario usuario) {
        return usuarioServicePort.create(usuario);
    }
}
