package com.java17._16_classesAninhadas.classesAninhadasEstaticas.modificadoresdeAcesso;

import java.util.Comparator;
import java.util.List;

public class Cliente {

    private final String nome;
    private final int idade;

    public Cliente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder( "\n" + "Cliente{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", idade=").append(idade);
        sb.append('}');
        return sb.toString();
    }

    public static void ordenarPorIdade(List<? extends Cliente> clientes){
        clientes.sort(new IdadeComparator());

    }


    private static class IdadeComparator implements Comparator<Cliente>{
        @Override
        public int compare(Cliente o1, Cliente o2) {
            return Integer.compare(o1.idade, o2.idade);
        }
    }
}
