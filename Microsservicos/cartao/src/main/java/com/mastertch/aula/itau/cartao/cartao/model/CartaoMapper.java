package com.mastertch.aula.itau.cartao.cartao.model;


import com.mastertch.aula.itau.cartao.cartao.model.dto.request.AtivaCartaoRequest;
import com.mastertch.aula.itau.cartao.cartao.model.dto.request.CreateCartaoRequest;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.AtivaCartaoResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.ConsultaCartaoPorIdResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.ConsultaCartaoResponse;
import com.mastertch.aula.itau.cartao.cartao.model.dto.response.CreateCartaoResponse;
import org.springframework.stereotype.Component;

//porque ta retornando cartaoId: null??
@Component
public class CartaoMapper {

    public Cartao fromCreateCartaoRequestToCartao(CreateCartaoRequest createCartaoRequest) {
        Cartao cartao = new Cartao();
        cartao.setNumero(createCartaoRequest.getNumero());
        cartao.setClientId(createCartaoRequest.getClienteId());

        return cartao;
    }

    public Cartao fromAtivaCartaoRequestToCartao(AtivaCartaoRequest ativaCartaoRequest) {
        Cartao cartao = new Cartao();
        cartao.setAtivo(ativaCartaoRequest.isAtivo());
        return cartao;
    }

    public CreateCartaoResponse toCreateCartaoResponse(Cartao cartao) {
        CreateCartaoResponse createCartaoResponse = new CreateCartaoResponse();

        createCartaoResponse.setId(cartao.getId());
        createCartaoResponse.setNumero(cartao.getNumero());
        createCartaoResponse.setClienteId(cartao.getClientId());
        createCartaoResponse.setAtivo(cartao.getAtivo());

        return createCartaoResponse;
    }

    public AtivaCartaoResponse toAtivaCartaoResponse(Cartao cartao) {
        AtivaCartaoResponse ativaCartaoResponse = new AtivaCartaoResponse();

        ativaCartaoResponse.setId(cartao.getId());
        ativaCartaoResponse.setNumero(cartao.getNumero());
        ativaCartaoResponse.setClienteId(cartao.getClientId());
        ativaCartaoResponse.setAtivo(cartao.getAtivo());

        return ativaCartaoResponse;
    }

    public ConsultaCartaoResponse toConsultaCartaoResponse(Cartao cartao) {
        ConsultaCartaoResponse consultaCartaoReponse = new ConsultaCartaoResponse();
        consultaCartaoReponse.setId(cartao.getId());
        consultaCartaoReponse.setNumero(cartao.getNumero());
        consultaCartaoReponse.setClienteId(cartao.getClientId());
        return consultaCartaoReponse;
    }

    public ConsultaCartaoPorIdResponse toConsultaCartaoPorIdResponse(Cartao cartao) {
        ConsultaCartaoPorIdResponse consultaCartaoPorIdResponse = new ConsultaCartaoPorIdResponse();

        consultaCartaoPorIdResponse.setId(cartao.getId());
        consultaCartaoPorIdResponse.setNumero(cartao.getNumero());
        consultaCartaoPorIdResponse.setClienteId(cartao.getClientId());
        consultaCartaoPorIdResponse.setAtivo(cartao.getAtivo());

        return consultaCartaoPorIdResponse;
    }
}
