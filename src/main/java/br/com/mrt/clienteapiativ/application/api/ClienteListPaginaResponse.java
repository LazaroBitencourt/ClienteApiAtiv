package br.com.mrt.clienteapiativ.application.api;
import br.com.mrt.clienteapiativ.domain.Cliente;
import lombok.Getter;
import lombok.Value;
import org.springframework.data.domain.Page;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
@Getter
public class ClienteListPaginaResponse {

    private UUID idCliente;
    private String nome;
    private String celular;
    private String cpf;

    public ClienteListPaginaResponse(Cliente cliente){
        this.idCliente = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
    }

    public static List<ClienteListPaginaResponse> converte(Page<Cliente> paginaClientes) {
    return paginaClientes.stream().map(cliente -> new ClienteListPaginaResponse(cliente)).collect(Collectors.toList());
    }
}
