package br.com.mrt.clienteapiativ.infra;

import br.com.mrt.clienteapiativ.application.repository.ClienteRepository;
import br.com.mrt.clienteapiativ.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
@Log4j2
@AllArgsConstructor
public class ClienteInfraRepository implements ClienteRepository  {

    ClienteSpringDataJpaRepository jpaRepository;

    @Override
    public Cliente salva(Cliente cliente) {
        log.info("[inicia] ClienteInfraRepository - salva");
        Cliente salvaCliente = jpaRepository.save(cliente);
        log.info("[finaliza] ClienteInfraRepository - salva");
        return salvaCliente;
    }

    @Override
    public Cliente buscaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteInfraRepository - buscaClientePorId");
        Cliente cliente = jpaRepository.findById(idCliente).orElseThrow();
        log.info("[finaliza] ClienteInfraRepository - buscaClientePorId");
        return cliente;
    }

    @Override
    public List<Cliente> buscaTodosClientes() {
        log.info("[inicia] ClienteInfraRepository - buscaTodosClientes");
        List<Cliente> clientes = jpaRepository.findAll();
        log.info("[finaliza] ClienteInfraRepository - buscaTodosClientes");
        return clientes;
    }

    @Override
    public void deletaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteInfraRepository - deletaClientePorId");
        jpaRepository.deleteById(idCliente);
        log.info("[finaliza] ClienteInfraRepository - deletaClientePorId");
    }
}
