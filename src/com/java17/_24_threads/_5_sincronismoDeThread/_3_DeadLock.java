package com.java17._24_threads._5_sincronismoDeThread;

public class _3_DeadLock {

    public static void main(String[] args) {

        Object lock1 = new Object();
        Object lock2 = new Object();

        Runnable run1 = () -> {
            synchronized (lock1){
                System.out.println("Thread1: Segurando lock1");
                System.out.println("Thread1: Esperando lock2");
                synchronized (lock2){
                    System.out.println("Thread1: Segurando lock2");
                }
            }
        };

        Runnable run2 = () -> {
            synchronized (lock2){
                System.out.println("Thread2: Segurando lock2");
                System.out.println("Thread2: Esperando lock1");
                synchronized (lock1){
                    System.out.println("Thread2: Segurando lock1");
                }
            }
        };

//      As threads ficam bloqueadas indefinidamente, esperando cada uma por um recurso que está
//      sendo mantido por outra thread na mesma situação

        new Thread(run1).start();
        new Thread(run2).start();
    }
}
