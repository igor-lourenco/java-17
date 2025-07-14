package com.java17._5_polimorfismoEClassesAbstratas.imposto.entidades;

import java.io.Serializable;

public abstract class Pessoa implements Serializable {

    private String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }

    public abstract double calcularImpostos();

    public String getNome() {
        return nome;
    }
}
