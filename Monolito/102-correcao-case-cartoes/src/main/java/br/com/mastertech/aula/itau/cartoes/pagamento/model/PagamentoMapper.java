package br.com.mastertech.aula.itau.cartoes.pagamento.model;

import br.com.mastertech.aula.itau.cartoes.cartao.model.Cartao;
import br.com.mastertech.aula.itau.cartoes.pagamento.model.dto.request.CreatePagamentoRequest;
import br.com.mastertech.aula.itau.cartoes.pagamento.model.dto.response.PagamentoCreatedResponse;
import br.com.mastertech.aula.itau.cartoes.pagamento.model.dto.response.PagamentoSummaryInListResponse;
import org.springframework.stereotype.Component;

@Component
public class PagamentoMapper {

    public Pagamento toPagamento(CreatePagamentoRequest createPagamentoRequest) {
        Pagamento pagamento = new Pagamento();
        pagamento.setDescricao(createPagamentoRequest.getDescricao());
        pagamento.setValor(createPagamentoRequest.getValor());

        Cartao cartao = new Cartao();
        cartao.setId(createPagamentoRequest.getCartao_id());

        pagamento.setCartao(cartao);
        return pagamento;
    }

    public PagamentoCreatedResponse toPagamentoCreatedResponse(Pagamento pagamento) {
        PagamentoCreatedResponse pagamentoCreatedResponse = new PagamentoCreatedResponse();
        pagamentoCreatedResponse.setId(pagamento.getId());
        pagamentoCreatedResponse.setDescricao(pagamento.getDescricao());
        pagamentoCreatedResponse.setValor(pagamento.getValor());
        pagamentoCreatedResponse.setCartao_id(pagamento.getCartao().getId());

        return pagamentoCreatedResponse;
    }

    public PagamentoSummaryInListResponse toPagamentoSummaryInListResponse(Pagamento pagamento) {
        PagamentoSummaryInListResponse pagamentoSummaryInListResponse = new PagamentoSummaryInListResponse();
        pagamentoSummaryInListResponse.setId(pagamento.getId());
        pagamentoSummaryInListResponse.setDescricao(pagamento.getDescricao());
        pagamentoSummaryInListResponse.setValor(pagamento.getValor());
        pagamentoSummaryInListResponse.setCartao_id(pagamento.getCartao().getId());

        return pagamentoSummaryInListResponse;
    }

}
