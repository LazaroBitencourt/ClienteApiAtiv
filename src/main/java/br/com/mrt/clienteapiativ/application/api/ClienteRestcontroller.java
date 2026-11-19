package br.com.mrt.clienteapiativ.application.api;

import br.com.mrt.clienteapiativ.application.service.ClienteService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@Log4j2
@AllArgsConstructor
public class ClienteRestcontroller implements ClienteApi{

    ClienteService clienteService;

    @Override
    public ClienteIdResponse postCadastraNovoCliente(ClienteResquest clienteResquest) {
        log.info("[inicia] ClienteRestcontroller - postCadastraNovoCliente");
        ClienteIdResponse idCliente = clienteService.cadastraNovoCliente(clienteResquest);
        log.info("[finaliza] ClienteRestcontroller - postCadastraNovoCliente");
        return idCliente;
    }

    @Override
    public ClienteDetalhadoResponse getBuscaClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteRestcontroller - getBuscaClientePorId");
        ClienteDetalhadoResponse cliente = clienteService.buscarClientePorId(idCliente);
        log.info("[finaliza] ClienteRestcontroller - getBuscaClientePorId");
        return cliente;
    }

    @Override
    public List<ClienteListResponse> getListaTodosClientes() {
        log.info("[inicia] ClienteRestcontroller - getListaTodosClientes");
        List<ClienteListResponse> clientes = clienteService.listaTodosClientes();
        log.info("[finaliza] ClienteRestcontroller - getListaTodosClientes");
        return clientes;
    }

    @Override
    public void patchAlteraClientePorId(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest) {
        log.info("[inicia] ClienteRestcontroller - patchAlteraClientePorId");
        clienteService.alteraClientePorId(idCliente, clienteAlteradoRequest);
        log.info("[finaliza] ClienteRestcontroller - patchAlteraClientePorId");
    }

    @Override
    public void deleteClientePorId(UUID idCliente) {
        log.info("[inicia] ClienteRestcontroller - deleteClientePorId");
        clienteService.deletaClientePorId(idCliente);
        log.info("[finaliza] ClienteRestcontroller - deleteClientePorId");
    }

}
