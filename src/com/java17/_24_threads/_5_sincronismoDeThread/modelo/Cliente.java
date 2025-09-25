package com.java17._24_threads._5_sincronismoDeThread.modelo;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Cliente {

    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean aberto = true;

    public boolean isAberto() {
        return aberto;
    }

    public int emailsPendentes() {
        synchronized (this.emails) {
            return this.emails.size();
        }
    }

    public void adicionarEmail(String email) {
        synchronized (this.emails) {
            String thread = Thread.currentThread().getName();
            System.out.println(thread + " adicionou e-mail na lista");

            this.emails.add(email);

//          Ativa todas as threads que estão aguardando desbloquear este objeto.
            this.emails.notifyAll();
        }
    }


    public String getEmail() throws InterruptedException {
        System.out.println(Thread.currentThread().getName() + " verificando se tem e-mails...");

        synchronized (this.emails){
            while (this.emails.isEmpty()){

                if (!aberto) return null;

                System.out.println(Thread.currentThread().getName() + " não tem e-mail na lista, "
                    + "entrando em modo de espera...");

//              Faz com que a thread atual aguarde até ser despertada, normalmente por notificação ou interrupção.
//              Obs: Só pode usar o wait quando o objeto tiver o lock, ou seja, o objeto tem que está dentro do bloco synchronized
                this.emails.wait();
            }

            return this.emails.poll(); // Recupera e remove objeto, ou null se estiver vazio.
        }
    }


    public void fechar(){
        aberto = false;

        synchronized (this.emails){
            System.out.println(Thread.currentThread().getName() + " notificando todo mundo que não estamos pegando mais e-mails");
        }
    }
}
