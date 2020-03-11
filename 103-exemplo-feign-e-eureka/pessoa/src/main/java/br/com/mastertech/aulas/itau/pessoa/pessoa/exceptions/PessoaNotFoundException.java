package br.com.mastertech.aulas.itau.pessoa.pessoa.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Pessoa não encontrada")
public class PessoaNotFoundException extends RuntimeException {
}
