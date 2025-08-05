package com.java17._10_collectionsFramework.comercial.modelo;

public class Cliente {

    private String nome;
    private double limiteCompras;

    public Cliente(String nome, double limiteCompras) {
        this.nome = nome;
        this.limiteCompras = limiteCompras;
    }

    public String getNome() {
        return nome;
    }

    public double getLimiteCompras() {
        return limiteCompras;
    }
}
