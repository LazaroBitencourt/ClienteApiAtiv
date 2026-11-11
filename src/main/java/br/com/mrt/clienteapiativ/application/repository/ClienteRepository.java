package br.com.mrt.clienteapiativ.application.repository;

import br.com.mrt.clienteapiativ.domain.Cliente;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);
}
