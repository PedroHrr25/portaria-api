package io.github.pedrohrr25.portaria_api.adapter.controller;

import io.github.pedrohrr25.portaria_api.adapter.converters.UsuarioConverter;
import io.github.pedrohrr25.portaria_api.adapter.dto.UsuarioDto;
import io.github.pedrohrr25.portaria_api.core.ports.UsuarioServicePort;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServicePort usuarioServicePort;
    @Autowired
    private  UsuarioConverter usuarioConverter;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UsuarioDto create(@RequestBody UsuarioDto usuarioDto) {

        return usuarioConverter
                   .toDto(usuarioServicePort.create(usuarioConverter.toDomain(usuarioDto)));
    }
}
