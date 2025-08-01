package com.java17._10_collectionsFramework.set.hashSet.modelo;

import java.util.Objects;

public class Contato {

    private String nome;
    private String email;
    private int idade;

    public Contato(String nome, String email, int idade) {
        Objects.requireNonNull(nome);
        Objects.requireNonNull(email);

        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Contato{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", idade=").append(idade);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object object) {
        System.out.printf("%s = %s%n", getEmail(),((Contato) object).getEmail());

        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Contato contato = (Contato) object;
        return Objects.equals(email, contato.email);
    }

    @Override
    public int hashCode() {
        return email.charAt(0);
    }
}
