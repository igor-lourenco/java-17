package com.java17._3_encapsulamentoEJavaBeansERecords;

import java.io.Serializable;

public class Estabelecimento implements Serializable {

    public String nome;
    public double saldo;

    public Estabelecimento() {
    }

    public Estabelecimento(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return this.saldo;
    }
}
