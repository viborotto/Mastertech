package com.example.porta.repositories;

import com.example.porta.models.Porta;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//ok, quando vai ter: findBy's?
public interface PortaRepository extends CrudRepository<Porta, Long> {

    Optional<Porta> findBySala(String sala);

    Optional<Porta> findByAndar(String andar);

    Optional<Porta> findById(Long id);
}
