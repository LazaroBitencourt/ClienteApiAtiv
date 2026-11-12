package br.com.mrt.clienteapiativ.application.api;


import lombok.Getter;
import lombok.Value;


import java.util.UUID;

@Value
@Getter
public class ClienteListResponse {

    private UUID idCliente;
    private String nome;
    private String celular;
    private String cpf;}
