package com.java17._10_collectionsFramework.list.desafio;

import java.util.Objects;

public abstract class Pacote implements Comparable<Pacote>{

    private String descricao;
    private Double precoPorPessoa;

    public Pacote(){}

    public Pacote(String descricao, Double precoPorPessoa) {
        Objects.nonNull(descricao);

        if(precoPorPessoa < 0){
            throw new IllegalArgumentException("Preço por pessoa não pode ser negativo");
        }

        this.descricao = descricao;
        this.precoPorPessoa = precoPorPessoa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPrecoPorPessoa() {
        return precoPorPessoa;
    }

    public void setPrecoPorPessoa(double precoPorPessoa) {
        this.precoPorPessoa = precoPorPessoa;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("descricao='").append(descricao).append('\'');
        sb.append(", precoPorPessoa=").append(precoPorPessoa);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Pacote obj) {
        return this.descricao.compareTo(obj.getDescricao());
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Pacote that = (Pacote) object;
        return Objects.equals(descricao, that.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(descricao);
    }

}
