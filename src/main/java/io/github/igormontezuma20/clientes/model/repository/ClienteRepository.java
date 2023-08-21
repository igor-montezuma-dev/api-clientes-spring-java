package io.github.igormontezuma20.clientes.model.repository;

import io.github.igormontezuma20.clientes.model.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}
