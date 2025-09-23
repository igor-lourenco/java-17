package com.java17._24_threads._2_estadosDaThread;

public class Main {

    public static void main(String[] args) {


        System.out.println("\n1. Executa em uma nova thread usando interface Runnable");
        Thread t1 = new Thread(new Runnable1('E'));
        Thread t2 = new Thread(new Runnable1('F'));
        Thread t3 = new Thread(new Runnable1('G'));
        Thread t4 = new Thread(new Runnable1('H'));
        t1.start();
//        t1.start(); // Depois do 1° start não pode dar start de novo em uma mesma thread
        t2.start();
        t3.start();
        t4.start();

        System.out.println("\n>>>>> Finalizando a Thread principal: " + Thread.currentThread().getName() + " <<<<<");
    }
}
