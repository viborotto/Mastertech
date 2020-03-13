package com.example.porta.dtos.response;

//de acordo com o contrato retorna só id, andar, sala
public class CreatePortaResponse {

    private Long id;

    private int andar;

    private String sala;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
