package com.java17._25_concorrencia._11_Executor_CompletableFuture_getAndJoind;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) {

        LojaService lojaService = new LojaService();
//        consultaPrecoSync(lojaService);
//        consultaPrecoAsyncFuture(lojaService);
        consultaPrecoAsyncCompletableFuture(lojaService);
    }

    private static void consultaPrecoSync(LojaService lojaService) {
        long start = System.currentTimeMillis();
        System.out.println(lojaService.getPrecoSync("Loja 1"));
        System.out.println(lojaService.getPrecoSync("Loja 2"));
        System.out.println(lojaService.getPrecoSync("Loja 3"));
        System.out.println(lojaService.getPrecoSync("Loja 4"));
        long end = System.currentTimeMillis();

        System.out.printf("Tempo: %d%n", (end - start));
    }

    private static void consultaPrecoAsyncFuture(LojaService lojaService) {
        long start = System.currentTimeMillis();

        Future<Double> precoAsyncFuture = lojaService.getPrecoAsyncFuture("Loja 1");
        Future<Double> precoAsyncFuture2 = lojaService.getPrecoAsyncFuture("Loja 2");
        Future<Double> precoAsyncFuture3 = lojaService.getPrecoAsyncFuture("Loja 3");
        Future<Double> precoAsyncFuture4 = lojaService.getPrecoAsyncFuture("Loja 4");

        try {
            System.out.println(precoAsyncFuture.get());
            System.out.println(precoAsyncFuture2.get());
            System.out.println(precoAsyncFuture3.get());
            System.out.println(precoAsyncFuture4.get());

        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        } finally {
            long end = System.currentTimeMillis();

            System.out.printf("Tempo: %dms%n", (end - start));
            lojaService.shutdown();

        }
    }

    private static void consultaPrecoAsyncCompletableFuture(LojaService lojaService) {
        long start = System.currentTimeMillis();

        CompletableFuture<Double> precoAsyncFuture = lojaService.getPrecoAsyncCompletableFuture("Loja 1");
        CompletableFuture<Double> precoAsyncFuture2 = lojaService.getPrecoAsyncCompletableFuture("Loja 2");
        CompletableFuture<Double> precoAsyncFuture3 = lojaService.getPrecoAsyncCompletableFuture("Loja 3");
        CompletableFuture<Double> precoAsyncFuture4 = lojaService.getPrecoAsyncCompletableFuture("Loja 4");

        try {
            System.out.println(precoAsyncFuture.join());
            System.out.println(precoAsyncFuture2.join());
            System.out.println(precoAsyncFuture3.join());
            System.out.println(precoAsyncFuture4.join());

        } catch (CancellationException e) {
            System.out.println("Cálculo foi cancelado: " + e.getMessage());
        } catch (CompletionException e) {
            throw new RuntimeException("Foi concluído excepcionalmente ou cálculo de conclusão lançou exceção: " + e.getMessage());
        } finally {
            long end = System.currentTimeMillis();

            System.out.printf("Tempo: %dms%n", (end - start));
            lojaService.shutdown();

        }
    }
}
