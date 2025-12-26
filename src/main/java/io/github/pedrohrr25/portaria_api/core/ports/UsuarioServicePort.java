package io.github.pedrohrr25.portaria_api.core.ports;

import io.github.pedrohrr25.portaria_api.core.domain.Usuario;

public interface UsuarioServicePort {

    Usuario create(Usuario usuario);
}
