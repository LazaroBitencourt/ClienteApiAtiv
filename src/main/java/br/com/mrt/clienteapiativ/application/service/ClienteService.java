package br.com.mrt.clienteapiativ.application.service;

import br.com.mrt.clienteapiativ.application.api.*;

import java.util.List;
import java.util.UUID;

public interface ClienteService {

    ClienteIdResponse cadastraNovoCliente(ClienteResquest clienteResquest);

    ClienteDetalhadoResponse buscarClientePorId(UUID idCliente);

    List<ClienteListResponse> listaTodosClientes();

    void alteraClientePorId(UUID idCliente, ClienteAlteradoRequest clienteAlteradoRequest);

    void deletaClientePorId(UUID idCliente);

    List<ClienteListPaginaResponse> listaClientesPaginados(int pagina, int itens);
}
