package com.java17._25_concorrencia._13_CompletableFuture_ThreadFactory;


import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        ExecutorService executorServiceComThreadFactory = Executors.newCachedThreadPool(runnable -> { // Criando um Thread Factory
            Thread thread = new Thread(runnable);
            thread.setName("USANDO-THREADFACTORY-" + thread.getId());
            thread.setDaemon(true); // Threads daemon não impedem o encerramento da JVM, asim não precisa usar o shutdown() para encerrar
            return thread;
        });

        LojaService lojaService = new LojaService();

        System.out.println("\n1. Executando método síncrono de forma assíncrona: ");
        consultaPrecoAsyncCompletableFuture(lojaService);

        System.out.println("\n2. Executando método síncrono de forma assíncrona passando um ExecutorService: ");
        consultaPrecoAsyncCompletableFuture(lojaService, executorService);
        executorService.shutdown();

        System.out.println("\n3. Executando método síncrono de forma assíncrona passando um ExecutorService com ThreadFactory: ");
        consultaPrecoAsyncCompletableFuture(lojaService, executorServiceComThreadFactory);
    }


    private static void consultaPrecoAsyncCompletableFuture(LojaService lojaService) {
        long start = System.currentTimeMillis();

        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");

        try {

//          Criando um CompletableFuture e executando método síncrono de forma assíncrona
            List<CompletableFuture<Double>> completableFutures = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(() -> lojaService.getPrecoSync(loja)))
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

    private static void consultaPrecoAsyncCompletableFuture(LojaService lojaService, ExecutorService executorService) {
        long start = System.currentTimeMillis();

        List<String> lojas = List.of("Loja 1", "Loja 2", "Loja 3", "Loja 4");

        try {

//          Criando um CompletableFuture e executando método síncrono de forma assíncrona
            List<CompletableFuture<Double>> completableFutures = lojas.stream()
                .map(loja -> CompletableFuture.supplyAsync(() -> lojaService.getPrecoSync(loja), executorService))
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
