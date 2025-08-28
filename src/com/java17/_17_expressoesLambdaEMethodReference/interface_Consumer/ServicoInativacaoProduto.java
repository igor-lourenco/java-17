package com.java17._17_expressoesLambdaEMethodReference.interface_Consumer;

public class ServicoInativacaoProduto {

    public void inativar(Produto produto){
        System.out.println("Inativando: " + produto.getNome());
        produto.inativar();
    }

    public static void processar(Produto produto){
        System.out.println("Ativando: " + produto.getNome());
        produto.ativar();
    }
}
