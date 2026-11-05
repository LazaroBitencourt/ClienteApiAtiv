package br.com.mrt.clienteapiativ.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name = "tb_cliente")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    @NonNull
    @NotBlank
    private String nome;
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID idCliente;
    @NonNull
    @NotBlank
    private String celular;
    private String telefone;
    @Email(message = "Padrão @gmail.com")
    private String email;
    @CPF
    @NonNull
    private String cpf;
    @NonNull
    @Enumerated(EnumType.STRING)
    private Sexo sexo;
    @NonNull
    private LocalDate dataNascimento;
    private LocalDateTime dataCasdastro;
    private LocalDateTime dataHoraAtualizacao;
}

