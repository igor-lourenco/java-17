package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.OptionalDouble;

public class Stream_sum_avegare_e_count {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
//        List<Produto> produtos = new ArrayList<>();

        int soma = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .sum();

        System.out.println("\nSoma total de todos os produtos em estoque: " + soma);

        OptionalDouble media = produtos.stream()
            .mapToDouble(Produto::getQuantidade)
            .average();

        System.out.println("\nMédia da quantidade dos produtos em estoque: " + media.orElseThrow(() ->
            new RuntimeException("Não há produtos para calcular a média")));


        System.out.println("\nProdutos em estoque:");
        long totalDeProdutosComEstoque = produtos.stream()
            .filter(Produto::temEstoque)
            .peek(System.out::println)
            .count();


        System.out.println("\nQuantos produtos tem em estoque: " + totalDeProdutosComEstoque);

    }

}
