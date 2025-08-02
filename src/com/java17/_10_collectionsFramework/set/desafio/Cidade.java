package com.java17._10_collectionsFramework.set.desafio;

import java.util.Objects;

public class Cidade implements Comparable<Cidade>{

    private int codigoIbge;
    private String nome;
    private int totalHabitantes;

    public Cidade(int codigoIbge, String nome, int totalHabitantes) {
        this.codigoIbge = codigoIbge;
        this.nome = nome;
        this.totalHabitantes = totalHabitantes;
    }

    public int getCodigoIbge() {
        return codigoIbge;
    }

    public void setCodigoIbge(int codigoIbge) {
        this.codigoIbge = codigoIbge;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTotalHabitantes() {
        return totalHabitantes;
    }

    public void setTotalHabitantes(int totalHabitantes) {
        this.totalHabitantes = totalHabitantes;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cidade{");
        sb.append("codigoIbge=").append(codigoIbge);
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", totalHabitantes=").append(totalHabitantes);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Cidade cidade = (Cidade) object;
        return codigoIbge == cidade.codigoIbge;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigoIbge);
    }

    @Override
    public int compareTo(Cidade o) {
        return Integer.compare(getCodigoIbge(), o.getCodigoIbge());
    }
}
