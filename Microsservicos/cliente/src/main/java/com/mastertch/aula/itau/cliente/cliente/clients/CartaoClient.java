package com.mastertch.aula.itau.cliente.cliente.clients;

import com.mastertch.aula.itau.cliente.cliente.clients.dto.CartaoDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//ja sabe que é o microsservico do cartao,  isso pode usar tambem no consumo de API, p.e governo
@FeignClient(name = "cartao")
public interface CartaoClient {

    //rota tem que ta igual, parametros tbm, requestbody
    @GetMapping("/cartoes/{numero}")
    CartaoDTO getCartaoByNumero(@PathVariable String numero);

}
