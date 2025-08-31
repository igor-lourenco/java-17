package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_collect_6_GerandoMapasAgupadosComValoresAgregados {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<String, Long> produtosPorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(
                Collectors.groupingBy(p -> p.getFabricante().nome(), Collectors.counting())
            );


        System.out.println();
        produtosPorFabricante.entrySet().forEach(entry -> {
            System.out.printf("Fabricante: %s, tem %d produtos cadastradas em estoque%n", entry.getKey(), entry.getValue());
        });


        System.out.println("==================================================================\n");


        Map<String, Integer> itensProdutoEmEstoquePorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(
                Collectors.groupingBy(p -> p.getFabricante().nome(), Collectors.summingInt(Produto::getQuantidade))
            );


        itensProdutoEmEstoquePorFabricante.entrySet().forEach(entry -> {
            System.out.printf("Fabricante: %s, tem %d itens de produtos em estoque%n", entry.getKey(), entry.getValue());
        });

    }
}
