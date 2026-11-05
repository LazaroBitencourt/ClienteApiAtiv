package br.com.mrt.clienteapiativ.application.service;

import br.com.mrt.clienteapiativ.application.api.ClienteIdResponse;
import br.com.mrt.clienteapiativ.application.api.ClienteResquest;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

@Service
@Log4j2
@AllArgsConstructor
public class ClienteApplicationService implements ClienteService {
    @Override
    public ClienteIdResponse cadastraNovoCliente(ClienteResquest clienteResquest) {
        log.info("[inicia] cadastraNovoCliente - ClienteApplicationService");

        log.info("[finaliza] cadastraNovoCliente - ClienteApplicationService");
        return null;
    }
}
