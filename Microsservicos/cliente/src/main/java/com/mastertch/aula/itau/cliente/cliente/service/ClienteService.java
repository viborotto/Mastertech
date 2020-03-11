package com.mastertch.aula.itau.cliente.cliente.service;


import com.mastertch.aula.itau.cliente.cliente.exceptions.ClienteNotFoundException;
import com.mastertch.aula.itau.cliente.cliente.model.Cliente;
import com.mastertch.aula.itau.cliente.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    //Normalmente um Serviço se comunica com um Repositório
    @Autowired
    private ClienteRepository clienteRepository;

    //Aqui vamos criar um Cliente, mas só utilizamos as anotacoes Rest no Controller
    //Controller -> Services -> Repository
    public Cliente create(Cliente cliente) {

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
