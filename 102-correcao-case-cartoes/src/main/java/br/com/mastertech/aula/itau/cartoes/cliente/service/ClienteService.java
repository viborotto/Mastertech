package br.com.mastertech.aula.itau.cartoes.cliente.service;

import br.com.mastertech.aula.itau.cartoes.cliente.exceptions.ClienteNotFoundException;
import br.com.mastertech.aula.itau.cartoes.cliente.model.Cliente;
import br.com.mastertech.aula.itau.cartoes.cliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente create(Cliente cliente) {

        cliente = clienteRepository.save(cliente);

        return cliente;
    }

    public Cliente getById(Long id) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);

        if(!clienteOptional.isPresent()) {
            throw new ClienteNotFoundException();
        }

        return clienteOptional.get();
    }
}
