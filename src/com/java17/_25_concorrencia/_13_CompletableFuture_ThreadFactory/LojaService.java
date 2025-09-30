package com.java17._25_concorrencia._13_CompletableFuture_ThreadFactory;

import java.util.concurrent.*;

public class LojaService {


    public double getPrecoSync(String nomeLoja) {
        System.out.printf("Obtendo preco sync da loja %s%n", nomeLoja);
        return geradorPreco();
    }

    private double geradorPreco() {
        System.out.printf("[%s] gerando preço...%n", Thread.currentThread().getName());

        delay();

        return ThreadLocalRandom.current().nextInt(1, 500) * 10;
    }

    private void delay() {
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

