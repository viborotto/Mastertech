package br.com.itau.cartoes.pagamento.dtos;

import javax.validation.constraints.NotBlank;

public class CreatePagamentoRequest 
{
	@NotBlank
	private Long cartao_id;
	private String descricao;
	private Double valor;

	public Long getCartao_id() {
		return cartao_id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getValor() {
		return valor;
	}

	public void setCartao_id(Long cartao_id) {
		this.cartao_id = cartao_id;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}
}
