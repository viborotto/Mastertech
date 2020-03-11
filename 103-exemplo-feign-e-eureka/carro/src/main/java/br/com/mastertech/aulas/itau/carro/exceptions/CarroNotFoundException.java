package br.com.mastertech.aulas.itau.carro.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Carro não encontrado")
public class CarroNotFoundException extends RuntimeException {
}
