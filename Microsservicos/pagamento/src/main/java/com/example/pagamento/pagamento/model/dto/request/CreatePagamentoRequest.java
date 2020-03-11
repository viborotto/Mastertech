package com.example.pagamento.pagamento.model.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

public class CreatePagamentoRequest {

    @NotBlank
    @Size(min = 3)
    private String descricao;

    @NotNull
    private BigDecimal valor;

    @NotNull
    private Long cartao_id;

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

    public Long getCartao_id() {
        return cartao_id;
    }

    public void setCartao_id(Long cartao_id) {
        this.cartao_id = cartao_id;
    }
}
