package com.java17._19_streamsAPI.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Supplier;

public class Stream_collect {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Supplier<ArrayList<Categoria>> tipoDaColecao = () -> new ArrayList<>();
        BiConsumer<ArrayList<Categoria>, Categoria> adicionaElementoNaLista = (lista, elemento) -> lista.add(elemento);
        BiConsumer<ArrayList<Categoria>, ArrayList<Categoria>> combinaAsListas = (lista1, lista2) -> lista1.addAll(lista2);

        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()
            .collect(tipoDaColecao,
                adicionaElementoNaLista,
                combinaAsListas);

        System.out.println();
        categorias.forEach(c -> System.out.println("Categoria: " + c.nome()));

    }
}
