package com.example.pagamento.pagamento.clients;

import com.example.pagamento.pagamento.clients.dto.CartaoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "cartao")
public interface CartaoClient {

    @GetMapping("/cartoes/{numero}")
    CartaoDTO getByNumero(@PathVariable String numero);

    @GetMapping("/cartoes/{id}")
    CartaoDTO findById(@PathVariable Long id);

}
