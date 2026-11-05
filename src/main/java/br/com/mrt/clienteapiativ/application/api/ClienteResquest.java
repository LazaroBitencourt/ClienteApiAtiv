package br.com.mrt.clienteapiativ.application.api;

import br.com.mrt.clienteapiativ.domain.Sexo;
import lombok.Value;
import java.time.LocalDate;

@Value
public class ClienteResquest {

    private String nome;
    private String celular;
    private String telefone;
    private String email;
    private String cpf;
    private Sexo sexo;
    private LocalDate dataNascimento;
}
