package com.example.pagamento.pagamento.clients.dto;

public class CartaoDTO {

    private Long id;

    private String numero;

    private Boolean ativo;

    public String getNumero() {
        return numero;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
