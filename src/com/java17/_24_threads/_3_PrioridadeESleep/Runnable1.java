package com.java17._24_threads._3_PrioridadeESleep;

public class Runnable1 implements Runnable {

    private final char c;

    public Runnable1(char c) {
        this.c = c;
    }

    public char getC() {
        return c;
    }

    @Override
    public void run() {
        System.out.println("\n>>>>> Executando a Thread: " + Thread.currentThread().getName() + " <<<<<");

        for (int i = 0; i < 200; i++){
            System.out.print(c);
            if(i % 10 == 0){
                System.out.println();

                try {
                    System.out.println("Thread: " + Thread.currentThread().getName() + ", Dormindo por 1 segundo...");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
