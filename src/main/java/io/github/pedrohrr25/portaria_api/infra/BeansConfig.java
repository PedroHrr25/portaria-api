package io.github.pedrohrr25.portaria_api.infra;

import io.github.pedrohrr25.portaria_api.core.ports.UsuarioRepositoryPort;
import io.github.pedrohrr25.portaria_api.core.ports.UsuarioServicePort;
import io.github.pedrohrr25.portaria_api.core.services.UsuarioService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig  {

    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }

    @Bean
    public UsuarioServicePort usuarioServicePortimpl(UsuarioRepositoryPort usuarioRepositoryPort) {
        return new UsuarioService(usuarioRepositoryPort);
    }
}
