package com.java17._24_threads.introducao;

public class Main {

    public static void main(String[] args) {

        Thread1 thread1 = new Thread1('A');
        Thread1 thread2 = new Thread1('B');
        Thread1 thread3 = new Thread1('C');
        Thread1 thread4 = new Thread1('D');

        System.out.println("\n1. Executa na mesma thread principal(main), ou seja no mesmo processo");
        thread1.run();
        thread2.run();
        thread3.run();
        thread4.run();

        System.out.println("\n2. Executa em uma nova thread, ou seja em um novo processo");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


        System.out.println("\n3. Executa em uma nova thread usando interface Runnable");
        Thread t1 = new Thread(new Runnable1('E'));
        Thread t2 = new Thread(new Runnable1('F'));
        Thread t3 = new Thread(new Runnable1('G'));
        Thread t4 = new Thread(new Runnable1('H'));
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
