package com.mastertch.aula.itau.cartao.cartao.clients.dto;

import com.mastertch.aula.itau.cartao.cartao.model.Cartao;

import java.util.List;

public class ClienteDTO {

    private Long id;

    private String name;

    private List<Cartao> cartaoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
