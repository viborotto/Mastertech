package com.mastertech.cartoesApi.model;

import javax.persistence.*;

@Entity
@Table(name = "cartoes")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "numeroCartao")
    private String numeroCartao;

    @Column(name = "tipoCartao")
    private String tipoCartao;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn
    private Cliente cliente;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String getTipoCartao() {
        return tipoCartao;
    }

    public void setTipoCartao(String tipoCartao) {
        this.tipoCartao = tipoCartao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
