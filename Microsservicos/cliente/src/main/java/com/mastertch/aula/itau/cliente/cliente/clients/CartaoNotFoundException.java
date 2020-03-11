package com.mastertch.aula.itau.cliente.cliente.clients;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

//igual o Exception do Cartao Monolito
@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Cartão não encontrado")
public class CartaoNotFoundException extends RuntimeException {
}