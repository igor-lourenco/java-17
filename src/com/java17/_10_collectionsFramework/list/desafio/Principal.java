package com.java17._10_collectionsFramework.list.desafio;

import java.util.List;

public class Principal {

    public static void main(String[] args) {

        CadastroPacoteViagem cadastro = new CadastroPacoteViagem();
        cadastro.adicionar("Istambul e Capadocia (20 noites)", 18_000);
        cadastro.adicionar("Neve de Bariloche (10 noites)", 11_000);
        cadastro.adicionar("Disney (10 noites)", 20_000);
        cadastro.adicionar("Natal Luz em Gramado (5 noites)", 8_500);
        cadastro.adicionar("Foz do Iguacu (20 noites)", 20_000);
        
        System.out.println();
        System.out.println("Removendo por descricao:");
        cadastro.removerPorDescricao("Disney (10 noites)");
        imprimirPacotesViagem(cadastro.obterTodos());

        System.out.println();
        System.out.println("Ordenando por ordem natural:");
        cadastro.ordenar();
        imprimirPacotesViagem(cadastro.obterTodos());


        System.out.println();
        System.out.println("Ordenando por preco decrescente(maior para o menor):");
        cadastro.ordenarPorPrecoDecrescente();
        imprimirPacotesViagem(cadastro.obterTodos());

        PacoteViagem pacoteViagemEncontrado = cadastro.buscarPorDescricao("Foz do Iguacu (20 noites)");
        System.out.println();
        System.out.println("Buscando Pacote de Viagem por descricao:");
        System.out.println(pacoteViagemEncontrado);

    }

    private static void imprimirPacotesViagem(List<PacoteViagem> pacoteViagems) {
        for (PacoteViagem pacoteViagem : pacoteViagems) {
            System.out.println(pacoteViagem);
        }
    }
}
