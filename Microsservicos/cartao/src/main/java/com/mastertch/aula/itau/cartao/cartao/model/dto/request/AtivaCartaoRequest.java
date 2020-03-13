package com.mastertch.aula.itau.cartao.cartao.model.dto.request;

import javax.validation.constraints.NotBlank;

public class AtivaCartaoRequest {
    @NotBlank
    private Boolean ativo;

    public Boolean isAtivo() {
        return ativo;
    }
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
