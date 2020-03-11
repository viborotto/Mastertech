package com.mastertch.aula.itau.cliente.cliente.model.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

//definindo os atributos necessarios para a requisição
public class CreateClienteRequest {

    @NotBlank
    @Size(min = 3)
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
