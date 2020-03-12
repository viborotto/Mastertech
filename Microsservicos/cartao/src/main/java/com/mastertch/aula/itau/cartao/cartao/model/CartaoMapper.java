package com.mastertch.aula.itau.cartao.cartao.model;


import com.mastertch.aula.itau.cartao.cartao.model.dto.request.CreateCartaoRequest;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.CartaoAtivoChangedResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.CartaoCreatedResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.CartaoDetailsResponse;
import org.springframework.stereotype.Component;

@Component
public class CartaoMapper {

    public Cartao toCartao(CreateCartaoRequest createCartaoRequest) {
        Cartao cartao = new Cartao();
        cartao.setNumero(createCartaoRequest.getNumero());
        cartao.setClientId(createCartaoRequest.getClienteId());

//        Cliente cliente = new Cliente();
//        cliente.setId(createCartaoRequest.getClienteId());
//
//
//        cartao.setCliente(cliente);
        return cartao;
    }

    public CartaoCreatedResponse toCartaoCreatedResponse(Cartao cartao) {
        CartaoCreatedResponse cartaoCreatedResponse = new CartaoCreatedResponse();
        
        cartaoCreatedResponse.setId(cartao.getId());
        cartaoCreatedResponse.setNumero(cartao.getNumero());
        cartaoCreatedResponse.setClienteId(cartao.setClientId().getId());
        cartaoCreatedResponse.setAtivo(cartao.getAtivo());

        return cartaoCreatedResponse;
    }

    public CartaoAtivoChangedResponse toCartaoAtivoChangedResponse(Cartao cartao) {
        CartaoAtivoChangedResponse cartaoAtivoChangedResponse = new CartaoAtivoChangedResponse();

        cartaoAtivoChangedResponse.setId(cartao.getId());
        cartaoAtivoChangedResponse.setNumero(cartao.getNumero());
//        cartaoAtivoChangedResponse.setClienteId(cartao.getCliente().getId());
        cartaoAtivoChangedResponse.setAtivo(cartao.getAtivo());

        return cartaoAtivoChangedResponse;
    }

    public CartaoDetailsResponse toCartaoDetailsResponse(Cartao cartao) {
        CartaoDetailsResponse cartaoDetailsResponse = new CartaoDetailsResponse();

        cartaoDetailsResponse.setId(cartao.getId());
        cartaoDetailsResponse.setNumero(cartao.getNumero());
//        cartaoDetailsResponse.setClienteId(cartao.getCliente().getId());
        cartaoDetailsResponse.setAtivo(cartao.getAtivo());

        return cartaoDetailsResponse;
    }
}
