package com.mastertch.aula.itau.cliente.cliente.clients;

import com.mastertch.aula.itau.cliente.cliente.clients.dto.CartaoDTO;
import org.springframework.stereotype.Component;

@Component
public class CartaoClientFallback implements CartaoClient {
    //assim que ele chamade novo a requisição
    @Override
    public CartaoDTO getByNumero(String numero) {
        return new CartaoDTO();
    }
}
