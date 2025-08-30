package com.java17._19_streamsAPI.estoque;

import java.util.Comparator;
import java.util.List;

public class Stream_min_e_max {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        int min = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToInt(Produto::getQuantidade)
            .min()
            .orElseThrow(() -> new RuntimeException("Menor quantidade não encontrado"));

        System.out.println("\nQual a menor quantidade de um produto que tem no estoque: " + min);
        System.out.println("============================================================================");


        int max = produtos.stream()
            .filter(Produto::temEstoque)
            .mapToInt(Produto::getQuantidade)
            .max()
            .orElseThrow(() -> new RuntimeException("Maior quantidade não encontrado"));

        System.out.println("Qual a maior quantidade de um produto que tem no estoque: " + max);
        System.out.println("============================================================================");


        Produto produtoComMenorQuantidade = produtos.stream()
            .filter(Produto::temEstoque)
            .min(Comparator.comparing(Produto::getQuantidade))
            .orElseThrow(() -> new RuntimeException("Produto com menor quantidade não encontrado"));

        System.out.printf("Produto com menor quantidade que tem estoque: %s, %d itens%n",
            produtoComMenorQuantidade.getNome(), produtoComMenorQuantidade.getQuantidade());
        System.out.println("============================================================================");


        Produto produtoComMaiorQuantidade = produtos.stream()
            .filter(Produto::temEstoque)
            .max(Comparator.comparingInt(Produto::getQuantidade))
            .orElseThrow(() -> new RuntimeException("Produto com maior quantidade não encontrado"));

        System.out.printf("Produto com maior quantidade que tem estoque: %s, %d itens%n",
            produtoComMaiorQuantidade.getNome(), produtoComMaiorQuantidade.getQuantidade());
        System.out.println("============================================================================");


        Produto produtoMaisBarato = produtos.stream()
            .filter(Produto::temEstoque)
            .min(Comparator.comparing(Produto::getPreco))
            .orElseThrow(() -> new RuntimeException("Produto mais barato não encontrado"));

        System.out.printf("Produto mais barato que tem no estoque: %s, R$%s%n ",
            produtoMaisBarato.getNome(), produtoMaisBarato.getPreco());

    }
}
