package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_collect_5_GerandoMapasAgupadosComCollector_groupingBy {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<Fabricante, List<Produto>> produtosPorFabricante = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.groupingBy(Produto::getFabricante));

        System.out.println();
        produtosPorFabricante.entrySet().forEach(entry -> { // percorre o map
            String produtosDoFabricante = entry.getValue().stream() // percorre a lista de produtos
                .map(produto -> produto.getNome())
                .collect(Collectors.joining(", "));
//                .reduce("", (x, y) -> x + y.concat(", "));

            System.out.printf("Fabricante: %s - Produtos: %s%n", entry.getKey().nome(), produtosDoFabricante);
        });

    }
}
