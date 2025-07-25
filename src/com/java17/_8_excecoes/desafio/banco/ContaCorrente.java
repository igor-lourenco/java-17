package com.java17._8_excecoes.desafio.banco;

import com.java17._8_excecoes.desafio.banco.exceptions.ContaInativaException;
import com.java17._8_excecoes.desafio.banco.exceptions.ValorMaiorQueSaldoException;
import com.java17._8_excecoes.desafio.banco.exceptions.ValorMenorQueZeroException;

public class ContaCorrente {

    private String numero;
    private double saldo;
    private boolean ativa;

    public ContaCorrente(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public boolean isInativa() {
        return !isAtiva();
    }

    public void ativar() {
        this.ativa = true;
    }

    public void inativar() {
        this.ativa = false;
    }

    public boolean sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser maior que zero");
            throw new ValorMenorQueZeroException("Valor de saque deve ser maior que zero: " + valor);
        }

        if (valor > this.saldo) {
            System.out.println("Valor maior que o saldo da conta");
            throw new ValorMaiorQueSaldoException(String.format("Valor: %.2f maior que o saldo: %.2f", valor, this.saldo));
        }

        if (isInativa()) {
            System.out.println("Conta inativa");
            throw new ContaInativaException("Conta inativa");
        }

        this.saldo = this.saldo - valor;
        return true;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor de saque deve ser maior que zero");
            throw new ValorMenorQueZeroException("Valor de saque deve ser maior que zero: " + valor);
        }

        if (isInativa()) {
            System.out.println("Conta inativa");
            throw new ContaInativaException("Conta inativa");
        }

        this.saldo = this.saldo + valor;
        return true;
    }

    public boolean transferir(double valor, ContaCorrente contaDestino) {
        if (contaDestino.isInativa()) {
            System.out.println("Conta inativa");
            throw new ContaInativaException("Conta inativa");
        }

        if (sacar(valor)) {
            contaDestino.depositar(valor);
            return true;
        }

        return false;
    }
}
