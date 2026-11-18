package br.com.mrt.clienteapiativ.application.api;


import br.com.mrt.clienteapiativ.domain.Cliente;
import lombok.Getter;
import lombok.Value;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Value
@Getter
public class ClienteListResponse {

    private UUID idCliente;
    private String nome;
    private String celular;
    private String cpf;

    public ClienteListResponse(Cliente cliente){
        this.idCliente = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.celular = cliente.getCelular();
        this.cpf = cliente.getCpf();
    }

    public static List<ClienteListResponse> converte(List<Cliente> clientes) {
        return clientes.stream().map(cliente -> new ClienteListResponse(cliente)).collect(Collectors.toList());
    }
}
