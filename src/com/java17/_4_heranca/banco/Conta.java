package com.java17._4_heranca.banco;

import java.io.Serializable;

public class Conta implements Serializable {

    private Titular titular;
    private int agencia;
    private int numero;
    private double saldo;


    public Conta(Titular titular, int agencia, int numero) {
        this.titular = titular;
        this.agencia = agencia;
        this.numero = numero;
    }

    public Titular getTitular() {
        return titular;
    }


    public int getAgencia() {
        return agencia;
    }


    public int getNumero() {
        return numero;
    }


    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valorSaque) {
        if (valorSaque <= 0) throw new IllegalArgumentException("Valor do saque nao pode ser maior que zero");


        validarSaldoParSaque(valorSaque);

        saldo = saldo - valorSaque;
    }

    protected void validarSaldoParSaque(double valorSaque) {
        if (getSaldo() < valorSaque) throw new RuntimeException("Saldo insuficiente para saque");
    }

    public void depositar(double valorDeposito) {
        if (valorDeposito <= 0) throw new IllegalArgumentException("Valor do saque nao pode ser maior que zero");

        saldo = saldo + valorDeposito;
    }

    public void imprimirDemonstrativo() {
        System.out.println();
        System.out.printf("Agencia: %d%n", getAgencia());
        System.out.printf("Conta: %d%n", getNumero());
        System.out.printf("Titular: %s%n", getTitular()!= null ? getTitular().getNome() : null);
        System.out.printf("Saldo: %.2f%n", getSaldo());
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("[");
        sb.append("titular=").append(titular);
        sb.append(", agencia=").append(agencia);
        sb.append(", numero=").append(numero);
        sb.append(", saldo=").append(saldo);
        sb.append(']');
        return sb.toString();
    }
}
