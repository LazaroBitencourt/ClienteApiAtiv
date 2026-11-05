package br.com.mrt.clienteapiativ.application.api;

import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log4j2
@AllArgsConstructor
public class ClienteRestcontroller implements ClienteApi{
    @Override
    public ClienteIdResponse postCadastraNovoCliente(ClienteResquest clienteResquest) {
        log.info("[inicia] postCadastraNovoCliente - ClienteRestcontroller");

        log.info("[finaliza] postCadastraNovoCliente - ClienteRestcontroller");
        return null;
    }
}
