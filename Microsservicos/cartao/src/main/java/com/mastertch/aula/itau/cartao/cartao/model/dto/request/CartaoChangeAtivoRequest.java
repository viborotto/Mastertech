package com.mastertch.aula.itau.cartao.cartao.model.dto.request;

import javax.validation.constraints.NotNull;

public class CartaoChangeAtivoRequest {


    private Boolean ativo;

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }
}
