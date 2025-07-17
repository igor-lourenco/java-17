package com.java17._6_interfaces.financeira.modelo;

public class Funcionario extends EmpresaFinanciavel {

    public static final int QUANTIDADE_SALARIO_LIMITE_CREDITO = 5;

    private double salarioMensal;

    public Funcionario(String nome, double salarioMensal) {
        super(nome, 0.0);
        this.salarioMensal = salarioMensal;
    }


    public double getSalarioMensal() {
        return salarioMensal;
    }

    @Override
    public double calcularLimiteAprovado() {
        return getSalarioMensal() * QUANTIDADE_SALARIO_LIMITE_CREDITO;
    }
}
