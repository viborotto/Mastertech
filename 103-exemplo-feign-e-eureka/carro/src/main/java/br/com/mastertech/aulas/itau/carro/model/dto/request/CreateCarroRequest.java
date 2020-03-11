package br.com.mastertech.aulas.itau.carro.model.dto.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class CreateCarroRequest {

    @NotBlank
    @Size(min = 3, max = 255)
    private String modelo;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
