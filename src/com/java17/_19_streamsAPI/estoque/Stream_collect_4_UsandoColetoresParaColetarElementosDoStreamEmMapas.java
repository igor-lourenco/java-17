package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Stream_collect_4_UsandoColetoresParaColetarElementosDoStreamEmMapas {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Map<String, Integer> estoque = produtos.stream()
            .filter(Produto::temEstoque)
            .collect(Collectors.toMap(
                Produto::getNome, p -> p.getQuantidade()));

        System.out.println();

        estoque.entrySet().forEach(entry ->
            System.out.printf("Chave: %s - Valor: %d%n", entry.getKey(), entry.getValue()));

//        for (Map.Entry<String, Integer> entry : estoque.entrySet()) {
//            System.out.printf("Chave: %s - Valor: %d%n", entry.getKey(), entry.getValue());
//        }
    }
}
