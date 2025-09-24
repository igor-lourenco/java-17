package com.java17._24_threads._5_sincronismoDeThread;

import com.java17._24_threads._5_sincronismoDeThread.modelo.Conta;

public class Main implements Runnable {

    private Conta conta = new Conta();

    public static void main(String[] args) throws InterruptedException {

        Main threadMain = new Main();

        Thread t1 = new Thread(threadMain, "T1");
        Thread t2 = new Thread(threadMain, "T2");

        t1.start();
        t2.start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            saqueDaConta(10);

            if(conta.getSaldo() < 0){
                System.out.println("ERRO: Saldo da conta menor que zero: " + conta.getSaldo());
            }
        }
    }

    private void saqueDaConta(int valor) {
        if (conta.getSaldo() >= valor) {
            System.out.println(Thread.currentThread().getName() + " está indo sacar o dinheiro");
            conta.saque(valor);
            System.out.println(Thread.currentThread().getName() + " completou o saque, valor atual da conta: " + conta.getSaldo());
        } else {
            System.out.println("Sem dinheiro para " + Thread.currentThread().getName() + " efetuar o saque " + conta.getSaldo());
        }
    }
}
