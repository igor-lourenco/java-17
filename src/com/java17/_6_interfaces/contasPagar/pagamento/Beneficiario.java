package com.java17._6_interfaces.contasPagar.pagamento;

import java.io.Serializable;

public class Beneficiario implements Serializable {

    private String nome;
    private String chavePix;
    private String contaBancaria;

    public Beneficiario(String nome, String chavePix, String contaBancaria) {
        this.nome = nome;
        this.chavePix = chavePix;
        this.contaBancaria = contaBancaria;
    }

    public boolean naoPossuiChavePix(){
        return getChavePix() != null && getChavePix().isEmpty();
    }

    public boolean naoPossuiContaBancaria(){
        return getContaBancaria() != null && getContaBancaria().isEmpty();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChavePix() {
        return chavePix;
    }

    public void setChavePix(String chavePix) {
        this.chavePix = chavePix;
    }

    public String getContaBancaria() {
        return contaBancaria;
    }

    public void setContaBancaria(String contaBancaria) {
        this.contaBancaria = contaBancaria;
    }
}
