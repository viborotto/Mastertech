package com.mastertch.aula.itau.cliente.cliente.repository;

import com.mastertch.aula.itau.cliente.cliente.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
