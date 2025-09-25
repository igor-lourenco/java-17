package com.java17._25_concorrencia._3_Condition;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Cliente {

    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private final ReentrantLock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition();
    private boolean aberto = true;

    public boolean isAberto() {
        return aberto;
    }

    public int emailsPendentes() {
        lock.lock();
        try {
            return this.emails.size();
        } finally {
            lock.unlock();
        }
    }

    public void adicionarEmail(String email) {
        lock.lock();
        try {
            String thread = Thread.currentThread().getName();
            System.out.println(thread + " adicionou e-mail na lista");

            this.emails.add(email);

//          Ativa todas as threads que estão aguardando desbloquear este objeto.
            this.condition.signalAll();
        } finally {
            lock.unlock();
        }
    }


    public String getEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " verificando se tem e-mails...");

        lock.lock();
        try {
            while (this.emails.isEmpty()) {

                if (!aberto) return null;

                System.out.println(Thread.currentThread().getName() + " não tem e-mail na lista, "
                    + "entrando em modo de espera...");

//              Faz com que a thread atual aguarde até ser despertada, normalmente por notificação ou interrupção.
//              Obs: Só pode usar o wait quando o objeto tiver o lock, ou seja, o objeto tem que está dentro do bloco
                this.condition.await();
            }

            return this.emails.poll(); // Recupera e remove objeto, ou null se estiver vazio.
        } finally {
            lock.unlock();
        }
    }


    public void fechar() {
        aberto = false;

        lock.lock();
        try {
            System.out.println(Thread.currentThread().getName() + " notificando todo mundo que não estamos pegando mais e-mails");
            this.condition.signalAll();
        } finally {
            lock.unlock();
        }
    }
}
