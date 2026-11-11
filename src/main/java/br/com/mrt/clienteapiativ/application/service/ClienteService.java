package br.com.mrt.clienteapiativ.application.service;

import br.com.mrt.clienteapiativ.application.api.ClienteIdResponse;
import br.com.mrt.clienteapiativ.application.api.ClienteResquest;

public interface ClienteService {

    ClienteIdResponse cadastraNovoCliente(ClienteResquest clienteResquest);
}
