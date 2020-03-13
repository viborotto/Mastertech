package com.mastertch.aula.itau.cliente.cliente.model;


import com.mastertch.aula.itau.cliente.cliente.model.dto.request.CreateClienteRequest;
import com.mastertch.aula.itau.cliente.cliente.model.dto.response.ClienteCreatedResponse;
import com.mastertch.aula.itau.cliente.cliente.model.dto.response.ConsultaClienteResponse;
import org.springframework.stereotype.Component;

//Função:
@Component
public class ClienteMapper {

    public Cliente toCliente(CreateClienteRequest createClienteRequest) {
        Cliente cliente = new Cliente();
        cliente.setName(createClienteRequest.getName());
        return cliente;
    }

    public ClienteCreatedResponse toClienteCreatedResponse(Cliente cliente) {
        ClienteCreatedResponse clienteCreatedResponse = new ClienteCreatedResponse();
        clienteCreatedResponse.setId(cliente.getId());
        clienteCreatedResponse.setName(cliente.getName());
        return clienteCreatedResponse;
    }

    //toConsultaClienteResponse
    public ConsultaClienteResponse toConsultaClienteResponse(Cliente cliente) {
        ConsultaClienteResponse consultaClienteResponse = new ConsultaClienteResponse();
        consultaClienteResponse.setId(cliente.getId());
        consultaClienteResponse.setName(cliente.getName());
        return consultaClienteResponse;
    }

}
