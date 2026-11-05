package br.com.mrt.clienteapiativ.infra;

import br.com.mrt.clienteapiativ.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ClienteSpringDataJpaRepository extends JpaRepository<Cliente, UUID> {
}
