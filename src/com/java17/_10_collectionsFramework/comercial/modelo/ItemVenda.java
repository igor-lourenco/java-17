package com.java17._10_collectionsFramework.comercial.modelo;

import java.util.Objects;

public class ItemVenda {

    private final String descricao;
    private final double valor;

    public ItemVenda(String descricao, double valor) {
        Objects.nonNull(descricao);

        if(valor < 0) throw new IllegalArgumentException("Valor do item deve ser positivo");

        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ItemVenda{");
        sb.append("descricao='").append(descricao).append('\'');
        sb.append(", valor=").append(valor);
        sb.append('}');
        return sb.toString();
    }
}
