package br.com.mrt.clienteapiativ.application.service;

import br.com.mrt.clienteapiativ.application.api.ClienteDetalhadoResponse;
import br.com.mrt.clienteapiativ.application.api.ClienteIdResponse;
import br.com.mrt.clienteapiativ.application.api.ClienteResquest;

import java.util.UUID;

public interface ClienteService {

    ClienteIdResponse cadastraNovoCliente(ClienteResquest clienteResquest);

    ClienteDetalhadoResponse buscarClientePorId(UUID idCliente);
}
