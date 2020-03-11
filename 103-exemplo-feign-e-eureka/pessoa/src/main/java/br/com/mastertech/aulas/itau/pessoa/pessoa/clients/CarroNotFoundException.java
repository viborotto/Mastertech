package br.com.mastertech.aulas.itau.pessoa.pessoa.clients;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.BAD_REQUEST, reason = "O carro especificado não foi encontrado :c")
public class CarroNotFoundException extends RuntimeException {
}
