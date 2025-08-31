package com.java17._19_streamsAPI.estoque;

import java.util.List;

public class Stream_collect_3_UsandoColetoresDeListasNaoModificaveis {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()

//            .collect(Collectors.toUnmodifiableList()) // lista não-modificável
            .toList() // outra forma mais simplificada de retorna não-modificável
            ;

        System.out.println();
        categorias.forEach(c -> System.out.println("Categoria: " + c.nome()));

    }
}
