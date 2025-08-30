package com.java17._19_streamsAPI.estoque;

import java.util.List;

public class Stream_map {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        produtos.stream()
            .peek(p -> System.out.println("------------------------------------------------------"))
            .peek(p -> System.out.printf("Produto: %s, Fabricante: %s, tem estoque? %b%n", p.getNome(), p.getFabricante().nome(), p.temEstoque()))
            .filter(Produto::temEstoque)
            .map(Produto::getFabricante)
            .forEach(System.out::println);
    }
}
