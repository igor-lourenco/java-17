package com.java17._9_generics.estruturaDeDados;

import com.java17._9_generics.estruturaDeDados.estrutura.Colecao;
import com.java17._9_generics.estruturaDeDados.estrutura.Fila;
import com.java17._9_generics.estruturaDeDados.estrutura.Pilha;
import com.java17._9_generics.estruturaDeDados.modelo.Produto;

public class Principal {

    public static void main(String[] args) {

        Colecao<Produto> colecao = new Pilha<>();

//        pilha.colocar("A");
//        pilha.colocar("B");

        colecao.colocar(new Produto("Arroz"));
        colecao.colocar(new Produto("Feijao"));
        colecao.colocar(new Produto("Frango"));


//        Produto produto = (Produto) pilha.retirar();
//        System.out.println(produto.getDescricao());
//
//        produto = (Produto) pilha.retirar();
//        System.out.println(produto.getDescricao());
//
//        produto = (Produto) pilha.retirar();
//        System.out.println(produto.getDescricao());
//
//        produto = (Produto) pilha.retirar();
//        System.out.println(produto.getDescricao());

        retirarTodos(colecao);

        Colecao<String> nomes = new Fila<>();
        nomes.colocar("Joao");
        nomes.colocar("Maria");
        nomes.colocar("Jose");

        retirarTodos(nomes);
    }


    public static void retirarTodos(Colecao<?> objetos) {

        try {
            int i = 1;
            while (true) {
                Object objeto = objetos.retirar();
                System.out.printf("%d. %s%n", i, objeto);
                i++;
            }

        } catch (IllegalArgumentException e) {
            System.out.println("Colecao de produtos esgotada");
        }
    }
}
