package br.com.mastertech.aula.itau.cartoes.cartao.controller;

import br.com.mastertech.aula.itau.cartoes.cartao.model.Cartao;
import br.com.mastertech.aula.itau.cartoes.cartao.model.CartaoMapper;
import br.com.mastertech.aula.itau.cartoes.cartao.model.dto.request.CartaoChangeAtivoRequest;
import br.com.mastertech.aula.itau.cartoes.cartao.model.dto.request.CreateCartaoRequest;
import br.com.mastertech.aula.itau.cartoes.cartao.model.dto.response.CartaoAtivoChangedResponse;
import br.com.mastertech.aula.itau.cartoes.cartao.model.dto.response.CartaoCreatedResponse;
import br.com.mastertech.aula.itau.cartoes.cartao.model.dto.response.CartaoDetailsResponse;
import br.com.mastertech.aula.itau.cartoes.cartao.service.CartaoService;
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
    public CartaoAtivoChangedResponse changeCartaoAtivo(@PathVariable String numero, @Valid  @RequestBody CartaoChangeAtivoRequest cartaoChangeAtivoRequest) {
        Cartao cartao = cartaoService.changeAtivo(numero, cartaoChangeAtivoRequest.getAtivo());
        return cartaoMapper.toCartaoAtivoChangedResponse(cartao);
    }

    @GetMapping("/{numero}")
    public CartaoDetailsResponse getByNumero(@PathVariable String numero) {
        Cartao cartao = cartaoService.getByNumero(numero);
        return cartaoMapper.toCartaoDetailsResponse(cartao);
    }

}
