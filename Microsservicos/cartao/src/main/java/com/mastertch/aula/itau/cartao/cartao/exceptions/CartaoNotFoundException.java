package com.mastertch.aula.itau.cartao.cartao.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Cartão não encontrado")
public class CartaoNotFoundException extends RuntimeException {
}
