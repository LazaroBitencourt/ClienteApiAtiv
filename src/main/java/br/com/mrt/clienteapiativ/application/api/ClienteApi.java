package br.com.mrt.clienteapiativ.application.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/cliente")
public interface ClienteApi {

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public ClienteIdResponse postCadastraNovoCliente(@RequestBody ClienteResquest clienteResquest);
}
