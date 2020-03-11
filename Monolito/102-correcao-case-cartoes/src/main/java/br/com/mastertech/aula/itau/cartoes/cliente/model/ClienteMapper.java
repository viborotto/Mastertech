package br.com.mastertech.aula.itau.cartoes.cliente.model;

import br.com.mastertech.aula.itau.cartoes.cliente.model.dto.request.CreateClienteRequest;
import br.com.mastertech.aula.itau.cartoes.cliente.model.dto.response.ClienteCreatedResponse;
import br.com.mastertech.aula.itau.cartoes.cliente.model.dto.response.ClienteDetailsResponse;
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

    public ClienteDetailsResponse toClienteDetailsResponse(Cliente cliente) {
        ClienteDetailsResponse clienteDetailsResponse = new ClienteDetailsResponse();
        clienteDetailsResponse.setId(cliente.getId());
        clienteDetailsResponse.setName(cliente.getName());
        return clienteDetailsResponse;
    }

}
