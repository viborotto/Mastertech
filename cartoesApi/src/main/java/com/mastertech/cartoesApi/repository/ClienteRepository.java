package com.mastertech.cartoesApi.repository;

import com.mastertech.cartoesApi.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {

    List<Cliente> findByNome(String s);

    // SELECT * FROM cliente WHERE cpf
    List<Cliente> findByCpf(String s);

    // SELECT * FROM cliente WHERE nome AND cpf
    List<Cliente> findByNomeAndCpf(String s, String d);

    @Modifying
    @Transactional
    @Query("UPDATE Cliente c SET c.nome = :nome WHERE c.id = :id")
    void updateNomeById(@Param("nomeCompleto") String nomeCompleto, @Param("id") Long id);

    @Modifying
    @Transactional
    void deleteByIdAndNome(Long id, String nomeCompleto);
}
