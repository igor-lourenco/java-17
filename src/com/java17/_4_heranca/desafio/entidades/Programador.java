package com.java17._4_heranca.desafio.entidades;

public final class Programador extends Funcionario{

    private double valorBonus;

    public Programador(String nome, double valorHora) {
        super(nome, valorHora);
    }

    @Override
    protected double calcularSalario(int horasTrabalhadas) {
        return super.calcularSalario(horasTrabalhadas) + valorBonus;
    }

    public double getValorBonus() {
        return valorBonus;
    }

    public void setValorBonus(double valorBonus) {
        this.valorBonus = valorBonus;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("{");
        sb.append("nome='").append(super.getNome()).append('\'');
        sb.append(", valorHora=").append(super.getValorHora());
        sb.append(", valorBonus=").append(valorBonus);
        sb.append('}');
        return sb.toString();
    }
}
