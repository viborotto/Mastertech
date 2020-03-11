package com.mastertech.cartoesApi.controller;

import com.mastertech.cartoesApi.model.Cartao;
import com.mastertech.cartoesApi.repository.CartaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/cartoes")
public class CartaoController {

    @Autowired
    private CartaoRepository cartaoRepository;

    // INSERIR NOVO REGISTRO
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("")
    public Cartao criarNovoCartao(@RequestBody Cartao cartao) {
        return cartaoRepository.save(cartao);
    }


    // GET  ALL
    @GetMapping
    public List<Cartao> buscarCartoes() {
        return cartaoRepository.findAll();
    }

    // BUSCAR UM REGISTRO PELO ID
    @GetMapping("/{id}")
    public Cartao buscarPorId(@PathVariable("id") Long id) {
        return cartaoRepository.findById(id).get();
    }

    // FAZER BUSCA POR Numero
    @GetMapping("/{numero}")
    public List<Cartao> buscarPeloNome(@PathVariable("numero") String numero) {
        return cartaoRepository.findByNumeroCartao(numero);
    }

    @GetMapping("/filter/tipo")
    public List<Cartao> buscarPorTipo(@RequestParam String tipo) {
        return cartaoRepository.findByTipoCartao(tipo);
    }

    @GetMapping("/filter/numero&tipo") // ?preco=10.00
    public List<Cartao> buscarPorNumeroAndTipo(@RequestParam String numero, String tipo) {
        return cartaoRepository.findByNumeroAndTipo(numero, tipo);
    }


    // DELETAR REGISTRO PELO ID
    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable("id") Long id) {
        cartaoRepository.deleteById(id);
    }

    @DeleteMapping("/delete-by")
    public void deleteByIdAndNumeroCartao(@RequestParam Long id, String nome) {
        cartaoRepository.deleteByIdAndNumeroCartao(id, nome);
    }
}

