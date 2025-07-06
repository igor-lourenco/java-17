package com.java17._4_heranca.banco;

import java.io.Serializable;
import java.util.Objects;

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

    public final Titular getTitular() {
        return titular;
    }


    public final int getAgencia() {
        return agencia;
    }


    public final int getNumero() {
        return numero;
    }


    public final double getSaldo() {
        return saldo;
    }

    public final void sacar(double valorSaque) {
        if (valorSaque <= 0) throw new IllegalArgumentException("Valor do saque nao pode ser maior que zero");


        validarSaldoParSaque(valorSaque);

        saldo = saldo - valorSaque;
    }

    protected void validarSaldoParSaque(double valorSaque) {
        if (getSaldo() < valorSaque) throw new RuntimeException("Saldo insuficiente para saque");
    }

    public final void depositar(double valorDeposito) {
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Conta conta = (Conta) object;
        return agencia == conta.agencia && numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return Objects.hash(agencia, numero);
    }
}
