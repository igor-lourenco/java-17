package com.java17._2_construtoresPacotesEVisibilidade.Principal;


import com.java17._2_construtoresPacotesEVisibilidade.comercial.Pedido;
import com.java17._2_construtoresPacotesEVisibilidade.estoque.Produto;

public class Main {

    public static void main(String[] args) {

        Pedido pedido = new Pedido();

        Produto p1 = new Produto("Mouse", 100);

//        p1.nome = "Teste";

        System.out.println("\nCodigo: " + p1.codigo + ", Produto: " + p1.nome + ", Quantidade no estoque: " + p1.quantidadeEstoque);

    }
}
