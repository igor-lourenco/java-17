package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

        List<Produto> produtos = cadastroProduto.obterTodos();
        Stream<Produto> stream = produtos.stream();

        System.out.println();
        for (Produto produto : produtos) {
            produto.ativar();
            System.out.println(produto);
        }

        System.out.println("\nUsando Stream:");
        stream.forEach(produto -> {
//            produto.ativar();
            System.out.println("produto = " + produto);
        });
    }
}
