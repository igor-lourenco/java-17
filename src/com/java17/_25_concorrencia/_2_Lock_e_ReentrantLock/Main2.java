package com.java17._25_concorrencia._2_Lock_e_ReentrantLock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

public class Main2 {

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
            try {
                lock.tryLock(2, TimeUnit.SECONDS); // tenta obter o bloqueio por 2 segundos, para executar trecho do código apenas uma thread por vez

                if (lock.isHeldByCurrentThread()) {
                    System.out.printf("%nThread: %s pegou o LOCK%n%n", nome);

                }

                System.out.printf("%nThread: %s entrou em uma sessão crítica%n%n", nome);
                System.out.printf(">>> Tem %d Threads esperando na fila%n", lock.getQueueLength());
                System.out.printf("Thread: %s vai esperar 2seg...%n", nome);
                Thread.sleep(2000);
                System.out.printf("Thread: %s finalizou a espera, saindo...%n", nome);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                if (lock.isHeldByCurrentThread()) {
                    lock.unlock(); // desbloqueia
                }
            }
        }
    }
}
