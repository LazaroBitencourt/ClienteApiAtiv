package br.com.mrt.clienteapiativ.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("/cliente")
public interface ClienteApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ClienteIdResponse postCadastraNovoCliente(@RequestBody ClienteResquest clienteResquest);

    @GetMapping("/{idCliente}")
    @ResponseStatus(code = HttpStatus.OK)
    public ClienteDetalhadoResponse getBuscaClientePorId(@PathVariable("idCliente") UUID idCliente);


}
