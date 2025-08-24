package com.java17._16_classesAninhadas.classesAninhadasEstaticas.antes;

public class Main {

    public static void main(String[] args) {

        System.out.println("Implementação sem usar classe aninhada:");

        ServicoEmail servicoEmail = new ServicoEmail();

        Mensagem msg = new Mensagem(
            "joao@google.com",
            "maria@google.com",
            "Olá, tudo bem?");

        servicoEmail.enviar(msg);

    }
}
