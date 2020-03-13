package com.mastertch.aula.itau.cliente.cliente.model;


import javax.persistence.*;

@Entity
@Table
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    //temos que colocar as annotations em ambos os relacionáveis
    //troquei List por String e @Column


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
}

