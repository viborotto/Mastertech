package br.com.mastertech.aula.itau.cartoes.cliente.controller;

import br.com.mastertech.aula.itau.cartoes.cliente.model.Cliente;
import br.com.mastertech.aula.itau.cartoes.cliente.model.ClienteMapper;
import br.com.mastertech.aula.itau.cartoes.cliente.model.dto.request.CreateClienteRequest;
import br.com.mastertech.aula.itau.cartoes.cliente.model.dto.response.ClienteCreatedResponse;
import br.com.mastertech.aula.itau.cartoes.cliente.model.dto.response.ClienteDetailsResponse;
import br.com.mastertech.aula.itau.cartoes.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteMapper clienteMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ClienteCreatedResponse criarCliente(@Valid @RequestBody CreateClienteRequest createClienteRequest) {
        Cliente cliente = clienteMapper.toCliente(createClienteRequest);

        cliente = clienteService.create(cliente);

        return clienteMapper.toClienteCreatedResponse(cliente);
    }

    @GetMapping("/{id}")
    public ClienteDetailsResponse getById(@PathVariable Long id) {
        Cliente byId = clienteService.getById(id);
        return clienteMapper.toClienteDetailsResponse(byId);
    }

}
