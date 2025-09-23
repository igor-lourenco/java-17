package com.java17._24_threads._3_prioridadeESleep;

public class Main {

    public static void main(String[] args) {


        System.out.println("\n1. Executa em uma nova thread usando interface Runnable");
        Thread t1 = new Thread(new Runnable1('E'), "T1");
        Thread t2 = new Thread(new Runnable1('F'), "T2");
        Thread t3 = new Thread(new Runnable1('G'), "T3");
        Thread t4 = new Thread(new Runnable1('H'), "T4");

        t4.setPriority(Thread.MAX_PRIORITY); // não é certeza que essa thread vai ter prioridade máxima, é apenas uma indicação para a JVM
        t1.setPriority(Thread.MIN_PRIORITY); // não é certeza que essa thread vai ter prioridade máxima, é apenas uma indicação para a JVM

        t1.start();
//        t1.start(); // Depois do 1° start não pode dar start de novo em uma mesma thread
        t2.start();
        t3.start();
        t4.start();

        System.out.println("\n>>>>> Finalizando a Thread principal: " + Thread.currentThread().getName() + " <<<<<");
    }
}
