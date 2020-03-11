package br.com.mastertech.aula.itau.cartoes.pagamento.service;

import br.com.mastertech.aula.itau.cartoes.cartao.model.Cartao;
import br.com.mastertech.aula.itau.cartoes.cartao.service.CartaoService;
import br.com.mastertech.aula.itau.cartoes.pagamento.model.Pagamento;
import br.com.mastertech.aula.itau.cartoes.pagamento.repository.PagamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PagamentoService {

    @Autowired
    private PagamentoRepository pagamentoRepository;

    @Autowired
    private CartaoService cartaoService;

    public Pagamento create(Pagamento pagamento) {
        Cartao cartao = cartaoService.getById(pagamento.getCartao().getId());
        pagamento.setCartao(cartao);

        return pagamentoRepository.save(pagamento);
    }

    public List<Pagamento> listPagamentoByCartaoId(Long id) {
        return pagamentoRepository.findAllByCartao_Id(id);
    }

}
