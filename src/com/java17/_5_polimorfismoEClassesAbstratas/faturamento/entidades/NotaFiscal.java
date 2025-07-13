package com.java17._5_polimorfismoEClassesAbstratas.faturamento.entidades;

public class NotaFiscal {

    private String descricao;
    private double valorTotal;

    public NotaFiscal(String descricao, double valorTotal) {
        this.descricao = descricao;
        this.valorTotal = valorTotal;
    }


    protected double calcularImpostos(){
        return 0.0;
    }

    public void emitirNotaFiscal(){

        System.out.println();
        System.out.printf("Emitindo nota fiscal para: %s%n", getDescricao());
        System.out.printf("Valor total: %.2f%n", getValorTotal());
        System.out.printf("Impostos: %.2f%n", calcularImpostos());
    }


    public String getDescricao() {
        return descricao;
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
