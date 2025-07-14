package com.java17._5_polimorfismoEClassesAbstratas.imposto.entidades;

public final class PessoaFisica extends Pessoa{

    public static final double RECEITA_ANUAL_ISENCAO = 50_000.00;
    public static final double ALIQUOTA_IMPOSTO_RENDA = 0.20;

    private double receitaAnual;

    public PessoaFisica(String nome, double receitaAnual) {
        super(nome);
        this.receitaAnual = receitaAnual;
    }

    @Override
    public double calcularImpostos() {
        if(getReceitaAnual() < RECEITA_ANUAL_ISENCAO){
            return 0.0;
        }

        return getReceitaAnual() * ALIQUOTA_IMPOSTO_RENDA;
    }

    public double getReceitaAnual() {
        return receitaAnual;
    }
}
