package com.java17._25_concorrencia._12_CompletableFuture_Streams;


import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

public class Main {

    public static void main(String[] args) {

        LojaService lojaService = new LojaService();
        consultaPrecoAsyncCompletableFuture(lojaService);
    }

    private static void consultaPrecoAsyncCompletableFuture(LojaService lojaService) {
        long start = System.currentTimeMillis();

        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");

        try {
            List<CompletableFuture<Double>> completableFutures = lojas.stream()
                .map(lojaService::getPrecoAsyncCompletableFuture)
                .toList();

            List<Double> precos = completableFutures.stream()
                .map(CompletableFuture::join)
                .toList();

            System.out.println("Preços: " + precos);

        } catch (CancellationException e) {
            System.out.println("Cálculo foi cancelado: " + e.getMessage());
        } catch (CompletionException e) {
            throw new RuntimeException("Foi concluído excepcionalmente ou cálculo de conclusão lançou exceção: " + e.getMessage());
        } finally {
            long end = System.currentTimeMillis();

            System.out.printf("Tempo: %dms%n", (end - start));

        }
    }
}
