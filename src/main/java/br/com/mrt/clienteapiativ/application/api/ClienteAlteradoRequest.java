package br.com.mrt.clienteapiativ.application.api;
import br.com.mrt.clienteapiativ.domain.Sexo;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Value;
import org.hibernate.annotations.BatchSize;

@Value
@Builder
@AllArgsConstructor
public class ClienteAlteradoRequest {

    private String celular;
    private String telefone;
    private String email;
    private Sexo sexo;
}
