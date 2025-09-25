package com.java17._25_concorrencia._1_AtomicInteger;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Contador contador = new Contador();
        ContadorAtomico contadorAtomico = new ContadorAtomico();

        Runnable run = () -> {
            for (int i = 0; i < 10000; i++) {
                contador.incrementar();
            }
        };

        Runnable runAtomico = () -> {
            for (int i = 0; i < 10000; i++) {
                contadorAtomico.incrementar();
            }
        };


        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
        t1.join();
        t2.join();

        Thread t3 = new Thread(runAtomico);
        Thread t4 = new Thread(runAtomico);
        t3.start();
        t4.start();
        t3.join();
        t4.join();

//      Saída tem que ser 20000
        System.out.println("Contador: " + contador.getCount());
        System.out.println("Contador de forma atômica: " + contadorAtomico.getCount());

    }

    static class Contador {
        private int count;

        void incrementar() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    static class ContadorAtomico {
        private AtomicInteger count = new AtomicInteger();

        void incrementar() {
            count.incrementAndGet();
        }

        public int getCount() {
            return count.get();
        }
    }
}
