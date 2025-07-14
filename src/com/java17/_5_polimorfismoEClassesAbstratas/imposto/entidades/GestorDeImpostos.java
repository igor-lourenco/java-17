package com.java17._5_polimorfismoEClassesAbstratas.imposto.entidades;

public class GestorDeImpostos {

    private double valorTotalImpostos;

    public void adicionar(Pessoa pessoa){

        System.out.println();
        System.out.printf("Impostos devidos de %s: %.2f", pessoa.getNome(), pessoa.calcularImpostos());
        this.valorTotalImpostos = this.valorTotalImpostos + pessoa.calcularImpostos();
    }

    public double getValorTotalImpostos() {
        return valorTotalImpostos;
    }
}
