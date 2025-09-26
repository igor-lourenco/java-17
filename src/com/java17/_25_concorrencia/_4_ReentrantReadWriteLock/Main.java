package com.java17._25_concorrencia._4_ReentrantReadWriteLock;

import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Main {

    public static void main(String[] args) {

        ReentrantReadWriteLock rwl = new ReentrantReadWriteLock();
        MapReadWrite mapReadWrite = new MapReadWrite(rwl);


        Runnable escrita = () -> {
            for (int i = 0; i < 10; i++) {
                mapReadWrite.put("" + i, "" + i);
            }
        };

        Runnable leitura = () -> {
            try {
                Thread.sleep(1000);

                if (rwl.isWriteLocked()) {
                    System.out.println("ESCRITA LOCKED! Não pode ler enquanto estiver escrevendo...");
                }

                rwl.readLock().lock();
                System.out.println("Finalmente consegui a maldita fechadura");

                System.out.println(Thread.currentThread().getName() + " " + mapReadWrite.getAllKeys());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                rwl.readLock().unlock();
            }
        };


        Thread t1 = new Thread(escrita);
        Thread t2 = new Thread(leitura);
        Thread t3 = new Thread(leitura);


        t1.start();
        t2.start();
        t3.start();
    }
}
