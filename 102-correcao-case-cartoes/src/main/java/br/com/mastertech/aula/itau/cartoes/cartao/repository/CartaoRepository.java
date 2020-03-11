package br.com.mastertech.aula.itau.cartoes.cartao.repository;

import br.com.mastertech.aula.itau.cartoes.cartao.model.Cartao;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CartaoRepository extends CrudRepository<Cartao, Long> {

    Optional<Cartao> getByNumero(String numero);

}
