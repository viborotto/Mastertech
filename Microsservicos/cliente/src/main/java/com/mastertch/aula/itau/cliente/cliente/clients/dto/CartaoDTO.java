package com.mastertch.aula.itau.cliente.cliente.clients.dto;

public class CartaoDTO {

    private String numero;

    private Boolean ativo;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
