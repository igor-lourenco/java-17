package com.java17._25_concorrencia._11_CompletableFuture_getAndJoind;

import java.util.concurrent.*;

public class LojaService {

    private static final ExecutorService executorService = Executors.newCachedThreadPool();


    public double getPrecoSync(String nomeLoja){
        System.out.printf("Obtendo preco sync da loja %s%n", nomeLoja);
        return geradorPreco();
    }


    public Future<Double> getPrecoAsyncFuture(String nomeLoja){
        System.out.printf("Obtendo preco async da loja %s%n", nomeLoja);
        return executorService.submit(this::geradorPreco);
    }

//
    public CompletableFuture<Double> getPrecoAsyncCompletableFuture(String nomeLoja){
        System.out.printf("Obtendo preco async da loja %s%n", nomeLoja);
        return CompletableFuture.supplyAsync(this::geradorPreco);
    }

    private double geradorPreco(){
        System.out.printf("[%s] gerando preço...%n", Thread.currentThread().getName());

        delay();

        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay(){
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void shutdown(){
        executorService.shutdown();
    }
}
