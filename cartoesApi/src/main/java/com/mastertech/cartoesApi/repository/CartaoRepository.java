package com.mastertech.cartoesApi.repository;

import com.mastertech.cartoesApi.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

    List<Cartao> findByNumeroCartao(String s);

    List<Cartao> findByTipoCartao(String s);

    List<Cartao> findByNumeroAndTipo(String s, String d);


    @Modifying
    @Transactional
    void deleteByIdAndNumeroCartao(Long id, String nomeCompleto);

    @Modifying
    @Transactional
    void deleteById(Long id);
}
