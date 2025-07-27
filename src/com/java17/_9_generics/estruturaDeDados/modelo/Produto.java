package com.java17._9_generics.estruturaDeDados.modelo;

public class Produto {

    private String descricao;

    public Produto(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("descricao='").append(descricao).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
