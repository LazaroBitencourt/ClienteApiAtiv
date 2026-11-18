package br.com.mrt.clienteapiativ.application.api;

import br.com.mrt.clienteapiativ.domain.Cliente;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RequestMapping("/cliente")
public interface ClienteApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ClienteIdResponse postCadastraNovoCliente(@RequestBody ClienteResquest clienteResquest);

    @GetMapping("/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    public ClienteDetalhadoResponse getBuscaClientePorId(@PathVariable("idCliente") UUID idCliente);

    @GetMapping
    @ResponseStatus(code = HttpStatus.OK)
    public List<ClienteListResponse> getListaTodosClientes();

    @PatchMapping("/{idCliente}")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void patchAlteraClientePorId(@PathVariable("idCliente") UUID idCliente, @Valid @RequestBody ClienteAlteradoRequest clienteAlteradoRequest);
}
