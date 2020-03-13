package com.mastertch.aula.itau.cartao.cartao.controller;


import com.mastertch.aula.itau.cartao.cartao.model.Cartao;
import com.mastertch.aula.itau.cartao.cartao.model.CartaoMapper;
import com.mastertch.aula.itau.cartao.cartao.model.dto.request.AtivaCartaoRequest;
import com.mastertch.aula.itau.cartao.cartao.model.dto.request.CreateCartaoRequest;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.AtivaCartaoResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.ConsultaCartaoPorIdResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.ConsultaCartaoResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.CreateCartaoResponse;
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
    public CreateCartaoResponse create(@Valid @RequestBody CreateCartaoRequest createCartaoRequest) {
        Cartao cartao = cartaoMapper.fromCreateCartaoRequestToCartao(createCartaoRequest);

        cartao = cartaoService.create(cartao);

        return cartaoMapper.toCreateCartaoResponse(cartao);
    }

    @PatchMapping("/{numero}")
    @ResponseStatus(HttpStatus.OK)
    public AtivaCartaoResponse changeCartaoAtivo(@PathVariable String numero, @Valid @RequestBody AtivaCartaoRequest ativaCartaoRequest) {
        Cartao cartao = cartaoMapper.fromAtivaCartaoRequestToCartao(ativaCartaoRequest);
        return cartaoMapper.toAtivaCartaoResponse(cartaoService.changeAtivo(numero, cartao));
    }

    @GetMapping("/{numero}")
    @ResponseStatus(HttpStatus.OK)
    public ConsultaCartaoResponse getByNumero(@PathVariable String numero) {
        Cartao cartao = cartaoService.getByNumero(numero);
        return cartaoMapper.toConsultaCartaoResponse(cartao);
    }

    @GetMapping("/id/{cartaoId}")
    @ResponseStatus(HttpStatus.OK)
    public ConsultaCartaoPorIdResponse getById(@PathVariable Long cartaoId) {
        return cartaoMapper.toConsultaCartaoPorIdResponse(cartaoService.getById(cartaoId));
    }

}
