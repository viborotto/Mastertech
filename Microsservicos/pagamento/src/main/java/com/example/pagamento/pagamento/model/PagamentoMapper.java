package com.example.pagamento.pagamento.model;

import com.example.pagamento.pagamento.clients.dto.CartaoDTO;
import com.example.pagamento.pagamento.model.dto.request.CreatePagamentoRequest;
import com.example.pagamento.pagamento.model.dto.response.PagamentoCreatedResponse;
import com.example.pagamento.pagamento.model.dto.response.PagamentoSummaryInListResponse;
import org.springframework.stereotype.Component;

@Component
public class PagamentoMapper {

    public Pagamento toPagamento(CreatePagamentoRequest createPagamentoRequest) {
        Pagamento pagamento = new Pagamento();
        pagamento.setDescricao(createPagamentoRequest.getDescricao());
        pagamento.setValor(createPagamentoRequest.getValor());

        //editado
        CartaoDTO cartao = new CartaoDTO();
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
