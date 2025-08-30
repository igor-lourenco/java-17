package com.java17._19_streamsAPI.estoque;

import java.util.List;
import java.util.function.IntBinaryOperator;

public class Stream_reduce {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        IntBinaryOperator operacaoSoma = (subtotal, valor) -> {
            int resultado = subtotal + valor;
            System.out.println(subtotal + " + " + valor + " = " + resultado);
            return resultado;
        };

        int valorInicial = 0;

        int totalEstoque = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(valorInicial, operacaoSoma);

        System.out.println("\nTotal no estoque: " + totalEstoque);
        System.out.println("====================================");


        int totalEstoque2 = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(0, Integer::sum);

        System.out.println("Simplificando: " + totalEstoque2);
        System.out.println("====================================");


        IntBinaryOperator operacaoMaximo = (subtotal, valor) -> {
            int resultado = Integer.max(subtotal, valor);
            System.out.println("Maior entre " + subtotal + " e " + valor + " = " + resultado);
            return resultado;
        };


        int maior = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(0, operacaoMaximo);

        System.out.println("\nMaior quantidade no estoque: " + maior);
        System.out.println("====================================");


        int maior2 = produtos.stream()
            .mapToInt(Produto::getQuantidade)
            .reduce(valorInicial, Integer::max);

        System.out.println("\nSimplificando maior quantidade no estoque: " + maior2);
        System.out.println("====================================");

    }
}
