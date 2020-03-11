package br.com.mastertech.aulas.itau.pessoa.pessoa.service;

import br.com.mastertech.aulas.itau.pessoa.pessoa.clients.CarroClient;
import br.com.mastertech.aulas.itau.pessoa.pessoa.clients.CarroNotFoundException;
import br.com.mastertech.aulas.itau.pessoa.pessoa.clients.dto.CarroDTO;
import br.com.mastertech.aulas.itau.pessoa.pessoa.exceptions.PessoaNotFoundException;
import br.com.mastertech.aulas.itau.pessoa.pessoa.model.Pessoa;
import br.com.mastertech.aulas.itau.pessoa.pessoa.repository.PessoaRepository;
import feign.FeignException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {

    @Autowired
    private CarroClient carroClient;

    @Autowired
    private PessoaRepository pessoaRepository;

    public Pessoa create(Pessoa pessoa) {
        CarroDTO byPlaca = null;
        try {
            byPlaca = carroClient.getCarroByPlaca(pessoa.getCarroPlaca());
        } catch (FeignException.FeignClientException.NotFound e) {
            throw new CarroNotFoundException();
        }

        return pessoaRepository.save(pessoa);
    }

    public Pessoa getById(Long id) {
        Optional<Pessoa> pessoaOptional = pessoaRepository.findById(id);

        if(!pessoaOptional.isPresent()) {
            throw new PessoaNotFoundException();
        }

        return pessoaOptional.get();
    }


}
