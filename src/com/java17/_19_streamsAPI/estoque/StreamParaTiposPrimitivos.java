package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class StreamParaTiposPrimitivos {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        IntStream intStream = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToInt(p -> p.getQuantidade());

        System.out.println("\nUsando tipos primitivos:");

        intStream
            .forEach(q -> System.out.printf("Quantidade: %d, multiplicando por 2: %d%n", q, q * 2));

        System.out.println("\n===============================================================");

        DoubleStream doubleStream = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToDouble(p -> (double) p.getQuantidade() / 3);

        System.out.println("\nUsando tipos primitivos:");

        doubleStream
            .forEach(q -> {
                System.out.printf("Dividindo a quantidade por 3: %.2f%n", q);
            });

    }
}
