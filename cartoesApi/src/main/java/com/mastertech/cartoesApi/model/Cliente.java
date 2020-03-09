package com.mastertech.cartoesApi.model;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "nome", nullable = false)
    private String nomeCompleto;

    @Column(name = "cpf", nullable = false)
    private String cpf;

    @Column(name = "email", nullable = false)
    private String email;

    //Entender chave estrangeira
    @Column(name = "cartao")
    private Cartao cartao;

    //chave estrangeira entra aqui, e getters and setters??
    public Cliente(String nomeCompleto, String cpf, String email) {
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmail() {
        return email;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }
}
