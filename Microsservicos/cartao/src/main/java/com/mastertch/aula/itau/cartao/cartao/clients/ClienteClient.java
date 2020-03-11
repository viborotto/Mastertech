package com.mastertch.aula.itau.cartao.cartao.clients;

import com.mastertch.aula.itau.cartao.cartao.clients.dto.ClienteDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "nome")
public interface ClienteClient {

    @GetMapping("/cliente/{id}")
    ClienteDTO getById(@PathVariable Long id);

    //todo pagamento
}
