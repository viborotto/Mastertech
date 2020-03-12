package com.mastertch.aula.itau.cliente.cliente.clients.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.SERVICE_UNAVAILABLE, reason = "")
public class CartaoOfflineException extends RuntimeException {
}
