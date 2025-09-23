package com.java17._24_threads._4_yieldEJoin;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("\n1. Executa em uma nova thread usando interface Runnable");
        Thread t1 = new Thread(new Runnable1("A1"), "T1");
        Thread t2 = new Thread(new Runnable1("B2"), "T2");

        t1.start();
//      t1.start(); // Depois do 1° start não pode dar start de novo em uma mesma thread

        System.out.println("\nJuntando a thread principal a thread: T1, ou seja, thread principal não pode prosseguir enquanto a thread1 não finalizar");
        t1.join(); // thread principal não pode prosseguir enquanto a thread1 não finalizar

        System.out.println("Iniciando a thread: T2");
        t2.start();

        System.out.println("\n>>>>> Finalizando a Thread principal: " + Thread.currentThread().getName() + " <<<<<");
    }
}
