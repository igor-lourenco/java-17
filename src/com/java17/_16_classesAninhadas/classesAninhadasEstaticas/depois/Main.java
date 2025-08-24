package com.java17._16_classesAninhadas.classesAninhadasEstaticas.depois;


public class Main {

    public static void main(String[] args) {

        System.out.println("Implementação usando classe aninhada:");

        ServicoEmail servicoEmail = new ServicoEmail();

        ServicoEmail.Mensagem msg = new ServicoEmail.Mensagem(
            "joao@google.com",
            "maria@google.com",
            "Olá, tudo bem?");

        servicoEmail.enviar(msg);

    }
}
