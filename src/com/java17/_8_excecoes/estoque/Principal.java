package com.java17._8_excecoes.estoque;

import com.java17._8_excecoes.estoque.modelo.Produto;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);

        produto.ativar();

        comprar(produto);
    }

    private static void comprar(Produto produto){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantidade: ");
        int quantidade = scanner.nextInt();

        efetuarBaixaEstoque(produto, quantidade);
        System.out.println("Compra realizada!");
    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) {
        produto.retirarEstoque(quantidade);
        System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",
                quantidade, produto.getQuantidadeEstoque());
    }
}
