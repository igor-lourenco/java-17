package com.java17._9_generics.estruturaDeDados;

import com.java17._9_generics.estruturaDeDados.estrutura.Pilha;
import com.java17._9_generics.estruturaDeDados.modelo.Produto;

public class Principal {

    public static void main(String[] args) {

        Pilha<Produto> pilha = new Pilha<>();

//        pilha.colocar("A");
//        pilha.colocar("B");

        pilha.colocar(new Produto("Arroz"));
        pilha.colocar(new Produto("Feijao"));
        pilha.colocar(new Produto("Frango"));


        Produto produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());

        produto = (Produto) pilha.retirar();
        System.out.println(produto.getDescricao());
    }
}
