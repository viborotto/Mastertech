package br.com.mastertech.aulas.itau.pessoa.pessoa.controller;

import br.com.mastertech.aulas.itau.pessoa.pessoa.model.Pessoa;
import br.com.mastertech.aulas.itau.pessoa.pessoa.service.PessoaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaService pessoaService;

    @PostMapping
    public Pessoa create(@Valid @RequestBody Pessoa pessoa) {
        return pessoaService.create(pessoa);
    }

    @GetMapping("/{id}")
    public Pessoa getById(@PathVariable Long id) {
        return pessoaService.getById(id);
    }

}
