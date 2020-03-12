package com.mastertch.aula.itau.cartao.cartao.controller;


import com.mastertch.aula.itau.cartao.cartao.model.Cartao;
import com.mastertch.aula.itau.cartao.cartao.model.CartaoMapper;
import com.mastertch.aula.itau.cartao.cartao.model.dto.request.CartaoChangeAtivoRequest;
import com.mastertch.aula.itau.cartao.cartao.model.dto.request.CreateCartaoRequest;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.CartaoAtivoChangedResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.CartaoCreatedResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.CartaoDetailsResponse;
import com.mastertch.aula.itau.cartao.cartao.service.CartaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/cartao")
public class CartaoController {

    @Autowired
    private CartaoService cartaoService;

    @Autowired
    private CartaoMapper cartaoMapper;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public CartaoCreatedResponse create(@Valid @RequestBody CreateCartaoRequest createCartaoRequest) {
        Cartao cartao = cartaoMapper.toCartao(createCartaoRequest);

        cartao = cartaoService.create(cartao);

        return cartaoMapper.toCartaoCreatedResponse(cartao);
    }

    @PatchMapping("/{numero}")
    public CartaoAtivoChangedResponse changeCartaoAtivo(@PathVariable String numero, @Valid @RequestBody CartaoChangeAtivoRequest cartaoChangeAtivoRequest) {
        Cartao cartao = cartaoService.changeAtivo(numero, cartaoChangeAtivoRequest.getAtivo());
        return cartaoMapper.toCartaoAtivoChangedResponse(cartao);
    }

    @GetMapping("/{numero}")
    public CartaoDetailsResponse getByNumero(@PathVariable String numero) {
        Cartao cartao = cartaoService.getByNumero(numero);
        return cartaoMapper.toCartaoDetailsResponse(cartao);
    }

    @GetMapping("/{id}")
    public CartaoDetailsResponse getById(@PathVariable Long id) {
        Cartao cartao = cartaoService.getById(id);
        return cartaoMapper.toCartaoDetailsResponse(cartao);
    }

}
