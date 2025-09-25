package com.java17._25_concorrencia._2_Lock_e_ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {

    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();

        new Thread(new Processo("T1", lock)).start();
        new Thread(new Processo("T2", lock)).start();
        new Thread(new Processo("T3", lock)).start();
        new Thread(new Processo("T4", lock)).start();
        new Thread(new Processo("T5", lock)).start();
        new Thread(new Processo("T6", lock)).start();
        new Thread(new Processo("T7", lock)).start();

    }


    static class Processo implements Runnable {

        private String nome;
        private ReentrantLock lock;

        public Processo(String nome, ReentrantLock lock) {
            this.nome = nome;
            this.lock = lock;
        }

        @Override
        public void run() {
            lock.lock(); // bloqueia trecho do código para ser executado por apenas uma thread por vez
            try {

                System.out.printf("%nThread: %s entrou em uma sessão crítica%n%n", nome);

                System.out.printf(">>> Tem %d Threads esperando na fila%n", lock.getQueueLength());
                System.out.printf("Thread: %s vai esperar 2seg...%n", nome);
                Thread.sleep(2000);
                System.out.printf("Thread: %s finalizou a espera, saindo...%n", nome);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock(); // desbloqueia
            }
        }
    }
}
