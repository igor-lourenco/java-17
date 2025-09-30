package com.java17._25_concorrencia._14_CompletableFuture_EncadeandoChamadas;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class Main {

    public static void main(String[] args) {
        LojaService lojaService = new LojaService();

        System.out.println("\n1. Executando método de forma síncrona: ");
        pesquisaPrecosComDescontoSync(lojaService);

        System.out.println("\n2. Executando método de forma assíncrona: ");
        pesquisaPrecosComDescontoAsync(lojaService);
    }

    private static void pesquisaPrecosComDescontoSync(LojaService lojaService) {
        long start = System.currentTimeMillis();
        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");

        lojas.stream()
            .map(lojaService::getPrecoSync)
            .map(Orcamento::novoOrcamento)
            .map(lojaService::aplicaDesconto)
            .forEach(x -> System.out.println(x + "\n"));

        long end = System.currentTimeMillis();

        System.out.printf("Tempo: %dms%n", (end - start));
    }

    private static void pesquisaPrecosComDescontoAsync(LojaService lojaService) {
        long start = System.currentTimeMillis();
        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");

        List<CompletableFuture<String>> completableFutures = lojas.stream()
            .map(loja -> CompletableFuture.supplyAsync(() -> lojaService.getPrecoSync(loja)))
            .map(completableFuture -> completableFuture.thenApply(Orcamento::novoOrcamento))
            .map(completableFuture -> completableFuture.thenCompose(orcamento ->
                CompletableFuture.supplyAsync(() -> lojaService.aplicaDesconto(orcamento))))
            .toList();

        completableFutures.stream()
            .map(CompletableFuture::join)
            .forEach(System.out::println);

        long end = System.currentTimeMillis();
        System.out.printf("Tempo: %dms%n", (end - start));
    }
}
