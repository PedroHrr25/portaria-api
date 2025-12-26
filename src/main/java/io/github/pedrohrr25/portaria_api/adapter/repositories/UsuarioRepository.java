package io.github.pedrohrr25.portaria_api.adapter.repositories;

import io.github.pedrohrr25.portaria_api.adapter.entities.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {
}
