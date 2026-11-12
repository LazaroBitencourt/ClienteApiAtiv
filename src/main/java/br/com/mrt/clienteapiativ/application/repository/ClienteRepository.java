package br.com.mrt.clienteapiativ.application.repository;

import br.com.mrt.clienteapiativ.domain.Cliente;

import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);

    Cliente buscaClientePorId(UUID idCliente);
}
