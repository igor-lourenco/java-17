package com.java17._9_generics.pesquisa.modelo;

public class Pesquisador {

//  public static <T extends Nomeavel & PessoaJuridica> T obterPorNome(String nome, T... itens){ // Exemplo com mais de um delimitador
    public static <T extends Nomeavel> T obterPorNome(String nome, T... itens){

        for (T item : itens){
            if(item.getNome().equals(nome))
                return item;
        }

        throw new RuntimeException("Item nao encontrado pelo nome");
    }
}
