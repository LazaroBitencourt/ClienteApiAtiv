package br.com.mrt.clienteapiativ.application.service;

import br.com.mrt.clienteapiativ.application.api.*;
import br.com.mrt.clienteapiativ.application.repository.ClienteRepository;
import br.com.mrt.clienteapiativ.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@Log4j2
@AllArgsConstructor
public class ClienteApplicationService implements ClienteService {

    ClienteRepository clienteRepository;

    @Override
    public ClienteIdResponse cadastraNovoCliente(ClienteResquest clienteResquest) {
        log.info("[inicia] ClienteApplicationService - cadastraNovoCliente");
        Cliente cliente = clienteRepository.salva(new Cliente(clienteResquest));
        log.info("[finaliza] ClienteApplicationService - cadastraNovoCliente");
        return ClienteIdResponse.builder().IdCliente(cliente.getIdCliente()).build();
    }

    @Override
    public ClienteDetalhadoResponse buscarClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - buscarClientePorId");
        Cliente cliente = clienteRepository.buscaClientePorId(idCliente);
        log.info("[finaliza ] ClienteApplicationService - buscarClientePorId");
        return new ClienteDetalhadoResponse(cliente);
    }

    @Override
    public List<ClienteListResponse> listaTodosClientes() {
        log.info("[inicia] ClienteApplicationService - listaTodosClientes");
        List<Cliente> clientes = clienteRepository.buscaTodosClientes();
        log.info("[finaliza] ClienteApplicationService - listaTodosClientes");
        return ClienteListResponse.converte(clientes);
    }

    @Override
    public void alteraClientePorId(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest) {
        log.info("[inicia] ClienteApplicationService - alteraClientePorId");
        Cliente cliente = clienteRepository.buscaClientePorId(idCliente);
        cliente.atualizaDadosCliente(clienteAlteradoRequest);
        clienteRepository.salva(cliente);
        log.info("[finaliza] ClienteApplicationService - alteraClientePorId");
    }

    @Override
    public void deletaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteApplicationService - deletaClientePorId");
        clienteRepository.deletaClientePorId(idCliente);
        log.info("[finaliza] ClienteApplicationService - deletaClientePorId");
    }

    @Override
    public List<ClienteListPaginaResponse> listaClientesPaginados(int pagina, int itens) {
        log.info("[inicia] ClienteApplicationService - listaClientesPaginados");
        Page<Cliente> paginaClientes = clienteRepository.buscaClientesPaginados(PageRequest.of(pagina,itens));
        log.info("[finaliza] ClienteApplicationService - listaClientesPaginados");
        return ClienteListPaginaResponse.converte(paginaClientes);
    }
}
