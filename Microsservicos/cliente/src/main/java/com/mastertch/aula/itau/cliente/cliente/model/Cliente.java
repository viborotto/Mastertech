package com.mastertch.aula.itau.cliente.cliente.model;

import br.com.mastertech.aula.itau.cartoes.cartao.model.Cartao;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    //temos que colocar as annotations em ambos os relacionáveis
    @OneToMany
    private List<Cartao> cartaoList;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Cartao> getCartaoList() {
        return cartaoList;
    }

    public void setCartaoList(List<Cartao> cartaoList) {
        this.cartaoList = cartaoList;
    }
}
