package br.com.mrt.clienteapiativ.application.api;

import br.com.mrt.clienteapiativ.domain.Cliente;
import br.com.mrt.clienteapiativ.domain.Sexo;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Getter
public class ClienteDetalhadoResponse {

    private UUID idCliente;
    private String nome;
    private String celular;
    private String telefone;
    private String email;
    private String cpf;
    private Sexo sexo;
    private LocalDate dataNascimento;
    private LocalDateTime dataCasdastro;
    private LocalDateTime dataHoraAtualizacao;

    public ClienteDetalhadoResponse(Cliente cliente) {
        this.idCliente = cliente.getIdCliente();
        this.nome = cliente.getNome();
        this.celular = cliente.getCelular();
        this.telefone = cliente.getTelefone();
        this.email = cliente.getEmail();
        this.cpf = cliente.getCpf();
        this.sexo = cliente.getSexo();
        this.dataNascimento = cliente.getDataNascimento();
        this.dataCasdastro = cliente.getDataCasdastro();
        this.dataHoraAtualizacao = cliente.getDataHoraAtualizacao();
    }
}
