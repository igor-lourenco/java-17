package com.java17._25_concorrencia._3_Condition;


import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        EmailService emailService = new EmailService(cliente);

        Thread thread1 = new Thread(emailService, "THREAD-1");
        Thread thread2 = new Thread(emailService, "THREAD-2");

        thread1.start();
        thread2.start();


        while (true) {
            String email = JOptionPane.showInputDialog("Digitem e-mail: ");

            if (email == null || email.isEmpty()) {
                cliente.fechar();
                break;
            }

            cliente.adicionarEmail(email);

        }
    }
}
