package io.github.pedrohrr25.portaria_api.adapter.repositories;

import io.github.pedrohrr25.portaria_api.adapter.entities.PessoaEntity;
import io.github.pedrohrr25.portaria_api.adapter.entities.UsuarioEntity;
import io.github.pedrohrr25.portaria_api.core.domain.Pessoa;
import io.github.pedrohrr25.portaria_api.core.domain.Usuario;
import io.github.pedrohrr25.portaria_api.core.ports.UsuarioRepositoryPort;
import jakarta.persistence.Table;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UsuarioRepositoryAdapter implements UsuarioRepositoryPort {

    private final UsuarioRepository usuarioRepository;
    private final ModelMapper modelMapper;
    private final PessoaReposity pessoaReposity;

    @Autowired
    public UsuarioRepositoryAdapter(UsuarioRepository usuarioRepository, ModelMapper modelMapper, PessoaReposity pessoaReposity) {
        this.usuarioRepository = usuarioRepository;
        this.modelMapper = modelMapper;
        this.pessoaReposity = pessoaReposity;
    }

    @Override
    public Usuario create(Usuario usuario) {

        UsuarioEntity usuarioEntity = modelMapper.map(usuario, UsuarioEntity.class);
        usuarioEntity.setPessoa(createPessoa(usuario.getPessoa()));
        UsuarioEntity novoUsuario = usuarioRepository.save(usuarioEntity);
        return modelMapper.map(novoUsuario, Usuario.class);
    }

    @Override
    public Usuario obtainByEmail(String email) {
        UsuarioEntity usuarioByEmail = usuarioRepository.findByEmail(email);
        if (usuarioByEmail == null) {
            return null;
        }
        return modelMapper.map(usuarioByEmail, Usuario.class);
    }

    private PessoaEntity createPessoa(Pessoa pessoa) {
        PessoaEntity pessoaEntity = modelMapper.map(pessoa, PessoaEntity.class);
        return pessoaReposity.save(pessoaEntity);
    }

}
