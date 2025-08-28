package com.java17._17_expressoesLambdaEMethodReference.desafio;

import java.math.BigDecimal;

public class Funcionario {

    private final String nome;
    private final BigDecimal salario;
    private final boolean ativo;

    public Funcionario(String nome, BigDecimal salario, boolean ativo) {
        this.nome = nome;
        this.salario = salario;
        this.ativo = ativo;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public boolean isAtivo(){
        return ativo;
    }

    public boolean isInativo(){
        return !isAtivo();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Funcionario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", salario=").append(salario);
        sb.append(", ativo=").append(ativo);
        sb.append('}');
        return sb.toString();
    }
}
