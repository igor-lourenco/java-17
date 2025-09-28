package com.java17._25_concorrencia._7_Executors_ThreadPools;

import java.util.concurrent.TimeUnit;

public class Printer implements Runnable {

    private final int numero;

    public Printer(int numero) {
        this.numero = numero;
    }

    @Override
    public void run() {
        if(numero < 10) System.out.printf("%s  - iniciou:  %d%n", Thread.currentThread().getName(), numero);
        else if(numero < 100) System.out.printf("%s   - iniciou:  %d%n", Thread.currentThread().getName(), numero);
        else System.out.printf("%s - iniciou: %d%n", Thread.currentThread().getName(), numero);

        try {
            TimeUnit.SECONDS.sleep(10);

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if(numero < 10) System.out.printf("%s  - finalizando  %d...%n", Thread.currentThread().getName(), numero);
        else if(numero < 10) System.out.printf("%s   - finalizando  %d...%n", Thread.currentThread().getName(), numero);
        else System.out.printf("%s - finalizando %d...%n", Thread.currentThread().getName(), numero);
    }
}
