package com.java17._10_collectionsFramework.map.desafio.modelo;

import java.util.Objects;

public class Estado implements Comparable<Estado>{

    private String sigla;
    private String nome;

    public Estado(String sigla, String nome) {
        this.sigla = sigla;
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Estado estado = (Estado) object;
        return Objects.equals(sigla, estado.sigla);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sigla);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Estado{");
        sb.append("sigla='").append(sigla).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Estado o) {
        return getSigla().compareTo(o.getSigla());
    }
}
