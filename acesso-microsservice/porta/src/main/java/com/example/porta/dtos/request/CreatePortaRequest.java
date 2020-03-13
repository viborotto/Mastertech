package com.example.porta.dtos.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

//quais dados vc vai passar para requisição?
//criar porta: precisa de sala e andar;
public class CreatePortaRequest {

    @NotBlank
    private int andar;

    @NotNull
    private String sala;

    public int getAndar() {
        return andar;
    }

    public void setAndar(int andar) {
        this.andar = andar;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }
}
