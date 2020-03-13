package com.mastertch.aula.itau.cliente.cliente.controller;


import com.mastertch.aula.itau.cliente.cliente.model.Cliente;
import com.mastertch.aula.itau.cliente.cliente.model.ClienteMapper;
import com.mastertch.aula.itau.cliente.cliente.model.dto.request.CreateClienteRequest;
import com.mastertch.aula.itau.cliente.cliente.model.dto.response.ClienteCreatedResponse;
import com.mastertch.aula.itau.cliente.cliente.model.dto.response.ConsultaClienteResponse;
import com.mastertch.aula.itau.cliente.cliente.service.ClienteService;
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
    public ConsultaClienteResponse getById(@PathVariable Long id) {
        Cliente byId = clienteService.getById(id);
        return clienteMapper.toConsultaClienteResponse(byId);
    }

}
