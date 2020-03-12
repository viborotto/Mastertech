package com.example.pagamento.pagamento.service;

import com.example.pagamento.pagamento.clients.CartaoClient;
import com.example.pagamento.pagamento.clients.dto.CartaoDTO;
import com.example.pagamento.pagamento.model.Pagamento;
import com.example.pagamento.pagamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private CartaoClient cartaoClient;

    public Pagamento create(Pagamento pagamento) {

        //criar getById no cartao
        CartaoDTO cartao = cartaoClient.findById(pagamento.getCartao());
        pagamento.setCartao(cartao);

        return pagamentoRepository.save(pagamento);
    }

    public List<Pagamento> listPagamentoByCartaoId(Long id) {
        return pagamentoRepository.findAllByCartao_Id(id);
    }

}
