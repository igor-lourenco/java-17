package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_collect_7_GerandoMapasParticionadosComCollectors_partitioningBy {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<Boolean, List<Produto>> produtosSeparadosPorQuantidadeEmEstoque = produtos.stream()
            .collect(Collectors.partitioningBy(Produto::temEstoque));


        produtosSeparadosPorQuantidadeEmEstoque.forEach((key, value) -> {
            String temOuNao = key ? "tem": "não tem";
            System.out.printf("\nProdutos que %s em estoque:%n", temOuNao);
            value.forEach(System.out::println);
        });
    }
}
