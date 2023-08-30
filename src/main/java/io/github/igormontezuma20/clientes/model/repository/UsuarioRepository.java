package io.github.igormontezuma20.clientes.model.repository;

import io.github.igormontezuma20.clientes.model.entity.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
