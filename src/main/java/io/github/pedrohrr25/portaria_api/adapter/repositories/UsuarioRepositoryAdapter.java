package io.github.pedrohrr25.portaria_api.adapter.repositories;

import io.github.pedrohrr25.portaria_api.adapter.entities.UsuarioEntity;
import io.github.pedrohrr25.portaria_api.core.domain.Usuario;
import io.github.pedrohrr25.portaria_api.core.ports.UsuarioRepositoryPort;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public UsuarioRepositoryAdapter(UsuarioRepository usuarioRepository, ModelMapper modelMapper) {
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public Usuario create(Usuario usuario) {

         UsuarioEntity usuarioEntity = usuarioRepository.save(modelMapper.map(usuario, UsuarioEntity.class));
        return modelMapper.map(usuarioEntity, Usuario.class);
    }

}
