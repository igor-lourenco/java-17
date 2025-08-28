package com.java17._18_optional.ciaaerea;

import java.util.Objects;

public class Passageiro {

    private String nome;

    public Passageiro(String nome) {
        Objects.requireNonNull(nome, () -> {
            throw new IllegalArgumentException("O nome não pode ser nulo");});

        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Passageiro{");
        sb.append("nome='").append(nome).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Passageiro that = (Passageiro) object;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
