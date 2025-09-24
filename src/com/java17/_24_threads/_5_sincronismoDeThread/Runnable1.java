package com.java17._24_threads._5_sincronismoDeThread;

public class Runnable1 implements Runnable {

    private final String c;

    public Runnable1(String c) {
        this.c = c;
    }

    public String getC() {
        return c;
    }

    @Override
    public void run() {
        System.out.println("\n>>>>> Executando a Thread: " + Thread.currentThread().getName() + " <<<<<");

        for (int i = 0; i < 200; i++){
            System.out.print(c);
            if(i % 10 == 0){
                System.out.println();
            }

            Thread.yield(); //Uma indicação de que a thread atual está disposta a ceder seu uso atual do processador para outro
        }
        System.out.println("\n>>>>> Finalizando a Thread: " + Thread.currentThread().getName() + " <<<<<");
    }
}
