package com.java17._4_heranca.desafio.entidades;

import java.io.Serializable;

public class Funcionario implements Serializable {

    private String nome;
    private double valorHora;

    public Funcionario(String nome, double valorHora) {
        this.nome = nome;
        this.valorHora = valorHora;
    }

    protected double calcularSalario(int horasTrabalhadas){
        System.out.println("Calculando as horas do " + this.getClass().getSimpleName());
        return valorHora * horasTrabalhadas;
    }

    public Holerite gerarHolerite(int horasTrabalhadas, String mesDoAno) {
        return new Holerite(this.getNome(), mesDoAno, calcularSalario(horasTrabalhadas));
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName() );
        sb.append("{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", valorHora=").append(valorHora);
        sb.append('}');
        return sb.toString();
    }
}
