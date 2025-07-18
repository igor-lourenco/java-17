package com.java17._6_interfaces.financeira.modelo;

public class Funcionario  implements ClienteFinanciavel, Bonificacao {

    public static final int QUANTIDADE_SALARIO_LIMITE_CREDITO = 5;

    private String nome;
    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        this.nome = nome;
        this.salarioMensal = salarioMensal;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIO_LIMITE_CREDITO;
    }

    @Override
    public double calcularBonus(double percentualMetaAlcancavel) {
        return getSalarioMensal() * percentualMetaAlcancavel / 100;
    }
}
