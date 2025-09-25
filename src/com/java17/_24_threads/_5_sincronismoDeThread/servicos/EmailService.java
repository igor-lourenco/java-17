package com.java17._24_threads._5_sincronismoDeThread.servicos;

import com.java17._24_threads._5_sincronismoDeThread.modelo.Cliente;

public class EmailService implements Runnable{

    private final Cliente cliente;

    public EmailService(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void run() {
        String thread = Thread.currentThread().getName();
        System.out.println(thread + " começando a entregar e-mails...");

        while (cliente.isAberto() || cliente.emailsPendentes() > 0){

            try {

                String email = cliente.getEmail();

                if (email == null) continue;

                System.out.println(thread + " enviando e-mail para " + email);
                Thread.sleep(2000);
                System.out.println(thread + " e-mail enviado com sucesso para " + email);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        System.out.println("Todos os e-mails foram enviados com sucesso!");
    }
}
