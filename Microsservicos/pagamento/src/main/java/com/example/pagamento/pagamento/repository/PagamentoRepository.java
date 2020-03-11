package com.example.pagamento.pagamento.repository;


import com.example.pagamento.pagamento.model.Pagamento;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PagamentoRepository extends CrudRepository<Pagamento, Long> {

    List<Pagamento> findAllByCartao_Id(Long id);

}
