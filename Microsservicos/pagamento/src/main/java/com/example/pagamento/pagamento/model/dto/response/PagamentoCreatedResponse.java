package com.example.pagamento.pagamento.model.dto.response;

import java.math.BigDecimal;

public class PagamentoCreatedResponse {

    private Long id;

    private Long cartao_id;

    private String descricao;

    private BigDecimal valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCartao_id() {
        return cartao_id;
    }

    public void setCartao_id(Long cartao_id) {
        this.cartao_id = cartao_id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
}
