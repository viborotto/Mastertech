package com.mastertch.aula.itau.cliente.cliente.service;


import com.mastertch.aula.itau.cliente.cliente.clients.CartaoClient;
import com.mastertch.aula.itau.cliente.cliente.clients.CartaoNotFoundException;
import com.mastertch.aula.itau.cliente.cliente.clients.dto.CartaoDTO;
import com.mastertch.aula.itau.cliente.cliente.exceptions.ClienteNotFoundException;
import com.mastertch.aula.itau.cliente.cliente.model.Cliente;
import com.mastertch.aula.itau.cliente.cliente.repository.ClienteRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //aqui comunico o serviço da pessoa sobre o Cartao
    @Autowired
    private CartaoClient cartaoClient;

    //Usando o objeto do Cartao
    public Cliente create(Cliente cliente) {
//        CartaoDTO byNumero = null;
//        try {
//            byNumero = cartaoClient.getByNumero(cliente.getNumero());
//        } catch (FeignException.FeignClientException.NotFound e) {
//            throw new CartaoNotFoundException();
//        }
        cliente = clienteRepository.save(cliente);

        return cliente;
    }

    public Cliente getById(Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if(!clienteOptional.isPresent()) {
            throw new ClienteNotFoundException();
        }

        //retorna o get pelo ID
        return clienteOptional.get();
    }
}
