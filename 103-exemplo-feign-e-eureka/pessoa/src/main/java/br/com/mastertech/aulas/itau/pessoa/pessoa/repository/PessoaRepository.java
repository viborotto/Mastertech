package br.com.mastertech.aulas.itau.pessoa.pessoa.repository;


import br.com.mastertech.aulas.itau.pessoa.pessoa.model.Pessoa;
import org.springframework.data.repository.CrudRepository;

public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
