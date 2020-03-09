package com.mastertech.cartoesApi.repository;

import com.mastertech.cartoesApi.model.Cartao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartaoRepository extends JpaRepository<Cartao, Long> {

}
