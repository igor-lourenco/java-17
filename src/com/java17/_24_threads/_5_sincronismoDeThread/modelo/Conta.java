package com.java17._24_threads._5_sincronismoDeThread.modelo;

public class Conta {

    private int saldo = 50;


    public void saque(int valor){
        this.saldo = this.saldo - valor;
    }


    public int getSaldo() {
        return saldo;
    }
}
