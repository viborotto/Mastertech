package com.mastertch.aula.itau.cartao.cartao.repository;


import com.mastertch.aula.itau.cartao.cartao.model.Cartao;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface CartaoRepository extends CrudRepository<Cartao, Long> {

    Optional<Cartao> getByNumero(String numero);

    Optional<Cartao> findById(Long id);

}
