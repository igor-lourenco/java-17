package com.java17._19_streamsAPI.estoque;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class Stream_reduce2 {

    public static void main(String[] args) {

        CadastroProduto cadastroProduto = new CadastroProduto();
        List<Produto> produtos = cadastroProduto.obterTodos();

        Function<Produto, BigDecimal> precoTotalDoProdutoEmEstoque = p ->
            p.getPreco().multiply(new BigDecimal(p.getQuantidade()));

        BinaryOperator<BigDecimal> somandoPrecoDeTodosOsProdutosEmEstoque = (subtotal, valor) -> {
            BigDecimal soma = subtotal.add(valor);
            System.out.printf("Soma de %s + %s = %s%n", subtotal, valor, soma);
            return soma;
        };

        BigDecimal somaTotal = produtos.stream()
            .map(precoTotalDoProdutoEmEstoque)
            .reduce(BigDecimal.ZERO, somandoPrecoDeTodosOsProdutosEmEstoque);

        NumberFormat numberFormat = new DecimalFormat("#.00");
        System.out.printf("\nSoma total de todos os produtos em estoque: R$%s%n", numberFormat.format(somaTotal));
        System.out.println("==============================================================");



        BigDecimal somaTotalSimplificado = produtos.stream()
            .map(p -> p.getPreco().multiply(new BigDecimal(p.getQuantidade())))
            .reduce(BigDecimal.ZERO, BigDecimal::add);

        System.out.println("Simplificando soma total de todos os produtos em estoque: " + somaTotalSimplificado);
        System.out.println("==============================================================");



        BiFunction<BigDecimal, Produto, BigDecimal> somandoPrecoDeTodosOsProdutosEmEstoque2 = (subtotal, produto) -> {
            BigDecimal valorTotalEmEstoque = produto.getPreco().multiply(new BigDecimal(produto.getQuantidade()));
            BigDecimal soma = subtotal.add(valorTotalEmEstoque);
            System.out.printf("Soma de %s + %s = %s%n", subtotal, produto.getQuantidade(), soma);
            return soma;
        };

        BigDecimal somaTotal2 = produtos.stream()
            .reduce(BigDecimal.ZERO,
                somandoPrecoDeTodosOsProdutosEmEstoque2,
                BigDecimal::add);

        System.out.printf("Outra forma da soma total de todos os produtos em estoque: %s%n", numberFormat.format(somaTotal2));
    }
}
