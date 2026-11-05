package br.com.mrt.clienteapiativ;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class ClienteApiAtivApplication {

    @GetMapping
    public String java_home(){return "<h1> Bem-Vindo a API </h1>";}

    public static void main(String[] args) {
        SpringApplication.run(ClienteApiAtivApplication.class, args);
    }

}
