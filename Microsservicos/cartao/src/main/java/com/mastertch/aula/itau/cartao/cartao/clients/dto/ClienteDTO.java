package com.mastertch.aula.itau.cartao.cartao.clients.dto;

import com.mastertch.aula.itau.cartao.cartao.model.Cartao;

import java.util.List;

//todo quando uso DTO?
public class ClienteDTO {

    private Long clientId;

    private String name;

    private List<Cartao> cartaoList;

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cartao> getCartaoList() {
        return cartaoList;
    }

    public void setCartaoList(List<Cartao> cartaoList) {
        this.cartaoList = cartaoList;
    }
}
