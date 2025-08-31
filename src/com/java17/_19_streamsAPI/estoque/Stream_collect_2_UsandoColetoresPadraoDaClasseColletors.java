package com.java17._19_streamsAPI.estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_collect_2_UsandoColetoresPadraoDaClasseColletors {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        List<Categoria> categorias = produtos.stream()
            .filter(Produto::temEstoque)
            .flatMap(produto -> produto.getCategorias().stream())
            .distinct()

//             forma padrão
//            .collect(ArrayList::new,ArrayList::add, ArrayList::addAll)

//             forma mais utilizada, mas não há garantias quanto ao tipo, mutabilidade, serialização ou segurança de thread da Lista retornada;
//            .collect(Collectors.toList())

//             mais controle sobre qual tipo de Lista retornada
            .collect(Collectors.toCollection(ArrayList::new))
            ;

        System.out.println();
        categorias.forEach(c -> System.out.println("Categoria: " + c.nome()));

    }
}
