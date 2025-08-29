package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.stream.Stream;

public class Stream_Filter {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();

        List<Produto> produtos = cadastroProduto.obterTodos();
        Stream<Produto> stream = produtos.stream();

        System.out.println("Predicate -> Operação intermediária(operação tardia - lazy)");

        Stream<Produto> produtosEmEstoque = stream.filter(Produto::temEstoque);

        Stream<Produto> produtosInativos = produtosEmEstoque.filter(Produto::isInativo);

    }
}
