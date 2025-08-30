package com.java17._19_streamsAPI.estoque;

import java.util.List;

public class Stream_flatMap {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        System.out.println("\nSem achatar o Stream:");
        produtos.stream()
            .filter(Produto::temEstoque)
            .map(p -> p.getCategorias())
            .forEach(categoriaSet -> {
                System.out.println(categoriaSet.getClass().getSimpleName());
                categoriaSet.forEach(System.out::println);
            });


        System.out.println("\nAchatando o Stream:");
        produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(p -> p.getCategorias().stream())
            .forEach(System.out::println);


        System.out.println("\nAchatando o Stream evitando elementos duplicados:");
        produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(p -> p.getCategorias().stream())
            .distinct()
            .forEach(System.out::println);
    }
}
