package com.mastertch.aula.itau.cartao.cartao.service;


import com.mastertch.aula.itau.cartao.cartao.clients.ClienteClient;
import com.mastertch.aula.itau.cartao.cartao.clients.dto.ClienteDTO;
import com.mastertch.aula.itau.cartao.cartao.exceptions.CartaoNotFoundException;
import com.mastertch.aula.itau.cartao.cartao.model.Cartao;
import com.mastertch.aula.itau.cartao.cartao.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartaoService {

    @Autowired
    private CartaoRepository cartaoRepository;

    //substitui ClienteService para ClienteClient
    @Autowired
    private ClienteClient clienteClient;

    //Cliente -> ClienteDTO | ClienteService -> ClienteClient
    public Cartao create(Cartao cartao) {
        cartao.setAtivo(false);

        ClienteDTO byId = clienteClient.getById(cartao.getClientId());
//        Cliente byId = clienteService.getById(cartao.getCliente().getId());

        cartao.setId(byId.getClientId());
//        cartao.setCliente(byId);

        return cartaoRepository.save(cartao);
    }

    public Cartao changeAtivo(String numero, Boolean ativo) {
        Cartao cartao = getByNumero(numero);

        cartao.setAtivo(ativo);

        return cartaoRepository.save(cartao);
    }

    public Cartao getById(Long id) {
        Optional<Cartao> cartaoOptional = cartaoRepository.findById(id);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();
    }

    public Cartao getByNumero(String numero) {
        Optional<Cartao> cartaoOptional = cartaoRepository.getByNumero(numero);

        if(!cartaoOptional.isPresent()) {
            throw new CartaoNotFoundException();
        }

        return cartaoOptional.get();
    }
}
