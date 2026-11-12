package br.com.mrt.clienteapiativ.application.service;

import br.com.mrt.clienteapiativ.application.api.ClienteDetalhadoResponse;
import br.com.mrt.clienteapiativ.application.api.ClienteIdResponse;
import br.com.mrt.clienteapiativ.application.api.ClienteResquest;
import br.com.mrt.clienteapiativ.application.repository.ClienteRepository;
import br.com.mrt.clienteapiativ.domain.Cliente;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;

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

        log.info("[finaliza ] ClienteApplicationService - buscarClientePorId");
        return null;
    }
}
