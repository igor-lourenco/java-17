package com.java17._25_concorrencia;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        AtomicInteger a = new AtomicInteger(0);

        ExecutorService executorService = getExecutorService(a);

        CompletableFuture<String> f1 = CompletableFuture.supplyAsync(() -> {
            System.out.printf("[%s] Olá%n", Thread.currentThread().getName());
            delay();
            return "Olá";
        }, executorService);

        CompletableFuture<String> f2 = CompletableFuture.supplyAsync(() -> {
            System.out.printf("[%s] Mundo%n", Thread.currentThread().getName());
            delay();
            return "Mundo";
        }, executorService);

        CompletableFuture<String> combinado = f1.thenCombine(f2, (s1, s2) -> s1 + " " + s2);

        combinado.thenAccept(s -> {
            System.out.printf("[%s] Finalizando...%n", Thread.currentThread().getName());
        });


        for (int i = 0; i < 5; i++) {
            System.out.printf("[%s] Trabalhando... %d%n", Thread.currentThread().getName(), i);
            TimeUnit.SECONDS.sleep(1);
        }


        System.out.printf("[%s] Aguardando...%n", Thread.currentThread().getName());
        String join = combinado.join();
        System.out.printf("[%s] Retorno: %s", Thread.currentThread().getName(), join);

    }


    private static void delay() {
        System.out.printf("[%s] simulando tarefa assíncrona...%n", Thread.currentThread().getName());
        try {
            for (int i = 0; i < 10; i++) {
                System.out.printf("[%s] Trabalhando...%d%n", Thread.currentThread().getName(), i);
                TimeUnit.SECONDS.sleep(1);
            }

            System.out.printf("[%s] Fim dda tarefa... %n", Thread.currentThread().getName());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    private static ExecutorService getExecutorService(AtomicInteger a) {
        return Executors.newCachedThreadPool(r -> {
            Thread t = new Thread(r);
            t.setName("TH-" + a.incrementAndGet());
            t.setDaemon(true);
            return t;
        });
    }

}