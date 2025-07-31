package com.java17._10_collectionsFramework.list.desafio;

import java.util.List;

public class Principal {

    public static void main(String[] args) throws Exception {

        CadastroPacoteViagem<PacoteViagem> cadastro = new CadastroPacoteViagem<>();
        cadastro.adicionar(new PacoteViagem("Istambul e Capadocia (20 noites)", 18_000d));
        cadastro.adicionar(new PacoteViagem("Neve de Bariloche (10 noites)", 11_000d));
        cadastro.adicionar(new PacoteViagem("Disney (10 noites)", 20_000d));
        cadastro.adicionar(new PacoteViagem("Natal Luz em Gramado (5 noites)", 8_500d));
        cadastro.adicionar(new PacoteViagem("Foz do Iguacu (20 noites)", 20_000d));

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

        Pacote pacoteViagemEncontrado = cadastro.buscarPorDescricao("Foz do Iguacu (20 noites)");
        System.out.println();
        System.out.println("Buscando Pacote de Viagem por descricao:");
        System.out.println(pacoteViagemEncontrado);

    }

    private static void imprimirPacotesViagem(List<? extends Pacote> pacoteViagems) {
        for (Pacote pacoteViagem : pacoteViagems) {
            System.out.println(pacoteViagem);
        }
    }
}
