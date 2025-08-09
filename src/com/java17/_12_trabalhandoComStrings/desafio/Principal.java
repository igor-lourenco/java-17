package com.java17._12_trabalhandoComStrings.desafio;

public class Principal {

    public static void main(String[] args) {

        String[] emailsValidos = {"joao@google.com", "joao_silva@google.com",
            "joao.silva@google.com", "joao-silva@google.com",
            "joao123@google.com", "joao@google123.com",
            "joao@java.google.com", "joao@goo-gle.com", "joao@email.me",
            "Joao@google.com"};


        String[] emailsInvalidos = {"", " joao@google.com", "joao@google.com ",
            "joao @google.com", "joao@ google.com", "joao@google .com",
            "joao@google. com", "joaogoogle.com", "@google.com",
            "joao@google", "joao@google.abcdef", "joao@agoo@gle.com",
            "joao@google.co1", "joao@Google.com", "joao@google.Com",
            "joao.com@google", "joao@.com", "joao@google.",
            "jo#o@google.com", "joao@goo#gle.com"};


        for (String email : emailsValidos) {
            if (!ValidadorEmail.validar(email)) {
                throw new RuntimeException(String.format("E-mail %s e valido, mas retornou false", email));
            }
        }


        for (String email : emailsInvalidos) {
            if (ValidadorEmail.validar(email)) {
                throw new RuntimeException(String.format("E-mail %s e invalido, mas retornou true", email));
            }
        }
        System.out.println("Fim :)");
    }
}
