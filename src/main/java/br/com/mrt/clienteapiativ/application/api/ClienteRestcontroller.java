package br.com.mrt.clienteapiativ.application.api;

import br.com.mrt.clienteapiativ.application.service.ClienteService;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@AllArgsConstructor
public class ClienteRestcontroller implements ClienteApi{

    ClienteService clienteService;

    @Override
    public ClienteIdResponse postCadastraNovoCliente(ClienteResquest clienteResquest) {
        log.info("[inicia] postCadastraNovoCliente - ClienteRestcontroller");
        ClienteIdResponse idCliente = clienteService.cadastraNovoCliente(clienteResquest);
        log.info("[finaliza] postCadastraNovoCliente - ClienteRestcontroller");
        return null;
    }
}
