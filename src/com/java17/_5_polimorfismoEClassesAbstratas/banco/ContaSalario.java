package com.java17._5_polimorfismoEClassesAbstratas.banco;


public class ContaSalario extends Conta{

    private double salarioMensal;


    public ContaSalario(Titular titular, int agencia, int numero, double salarioMensal) {
        super(titular, agencia, numero);
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal() {
        return salarioMensal;
    }

    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("[");
        sb.append("titular=").append(getTitular());
        sb.append(", agencia=").append(getAgencia());
        sb.append(", numero=").append(getNumero());
        sb.append(", saldo=").append(getSaldo());
        sb.append(", salarioMensal=").append(getSalarioMensal());
        sb.append(']');
        return sb.toString();
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();

        System.out.printf("Salario mensal: %.2f", getSalarioMensal());
        System.out.println();
    }
}
