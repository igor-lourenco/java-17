package com.java17._19_streamsAPI.estoque;

import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;
import java.util.function.BinaryOperator;

public class Stream_reduce3 {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();
//        List<Produto> produtos = new ArrayList<>();

        Integer maiorQuantidadeDeUmProdutoNoEstoque = produtos.stream()
                .map(Produto::getQuantidade)
                .reduce(0, Integer::max);

        System.out.println("\nMaior quantidade de um produto no estoque: " + maiorQuantidadeDeUmProdutoNoEstoque);
        System.out.println("======================================================");


        System.out.println("Usando OptionalInt:");

        OptionalInt maiorQuantidadeDeUmProdutoNoEstoqueOpt = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(Integer::max);

        int maiorQuantidade = maiorQuantidadeDeUmProdutoNoEstoqueOpt.orElseThrow(() ->
            new RuntimeException("Quantidade não encontrada"));

        System.out.println("Maior quantidade: " + maiorQuantidade);
        System.out.println("======================================================");


        System.out.println("Retornando os dados do produto com maior quantidade no estoque:");

        Comparator<Produto> comparaPorQuantidade = Comparator.comparingInt(Produto::getQuantidade);

        Produto produto = produtos.stream()
            .reduce(BinaryOperator.maxBy(comparaPorQuantidade))
            .orElseThrow(() -> new RuntimeException("Nenhum produto com quantidade encontrado"));

        System.out.println(produto);
    }
}
