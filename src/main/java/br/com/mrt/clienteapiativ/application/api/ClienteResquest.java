package br.com.mrt.clienteapiativ.application.api;

import br.com.mrt.clienteapiativ.domain.Sexo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NonNull;
import lombok.Value;
import org.hibernate.validator.constraints.br.CPF;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Value
@Builder
@AllArgsConstructor
public class ClienteResquest {

    private String nome;
    private String celular;
    private String telefone;
    private String email;
    private String cpf;
    private Sexo sexo;
    private LocalDate dataNascimento;
}
