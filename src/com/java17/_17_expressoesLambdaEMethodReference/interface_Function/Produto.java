package com.java17._17_expressoesLambdaEMethodReference.interface_Function;

import java.math.BigDecimal;
import java.util.Objects;

public class Produto {

    public Produto(String nome) {
        this.nome = nome;
    }

    public enum Status{
        ATIVO, INATIVO
    }

    private String nome;
    private BigDecimal valor;
    private int quantidade;
    private Status status = Status.ATIVO;

    public Produto(String nome, BigDecimal valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }

    public Produto(String nome, BigDecimal valor, int quantidade, Status status) {
        this(nome, valor, quantidade);
        this.status = status;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getNome() {
        return nome;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Produto produto = (Produto) object;
        return Objects.equals(nome, produto.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", valor=").append(valor);
        sb.append(", quantidade=").append(quantidade);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
}
