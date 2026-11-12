package br.com.mrt.clienteapiativ.application.api;

import br.com.mrt.clienteapiativ.application.service.ClienteService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

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
}
