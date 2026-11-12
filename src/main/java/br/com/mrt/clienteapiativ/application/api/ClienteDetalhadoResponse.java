package br.com.mrt.clienteapiativ.application.api;

import br.com.mrt.clienteapiativ.domain.Sexo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.hibernate.validator.constraints.br.CPF;

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
}
