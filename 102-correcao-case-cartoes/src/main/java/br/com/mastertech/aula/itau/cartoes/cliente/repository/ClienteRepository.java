package br.com.mastertech.aula.itau.cartoes.cliente.repository;

import br.com.mastertech.aula.itau.cartoes.cliente.model.Cliente;
import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
