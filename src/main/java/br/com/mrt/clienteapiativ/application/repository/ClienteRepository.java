package br.com.mrt.clienteapiativ.application.repository;

import br.com.mrt.clienteapiativ.domain.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface ClienteRepository {
    Cliente salva(Cliente cliente);

    Cliente buscaClientePorId(UUID idCliente);

    List<Cliente> buscaTodosClientes();

    void deletaClientePorId(UUID idCliente);

    Page<Cliente> buscaClientesPaginados(PageRequest pageRequest);
}
