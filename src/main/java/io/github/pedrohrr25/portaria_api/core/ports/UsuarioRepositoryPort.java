package io.github.pedrohrr25.portaria_api.core.ports;

import io.github.pedrohrr25.portaria_api.core.domain.Usuario;

public interface UsuarioRepositoryPort {

    Usuario create(Usuario usuario);
}
