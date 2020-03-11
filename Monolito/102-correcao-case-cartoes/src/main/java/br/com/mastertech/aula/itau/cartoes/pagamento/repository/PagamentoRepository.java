package br.com.mastertech.aula.itau.cartoes.pagamento.repository;

import br.com.mastertech.aula.itau.cartoes.pagamento.model.Pagamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {

    List<Pagamento> findAllByCartao_Id(Long id);

}
