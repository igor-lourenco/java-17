package com.java17._12_trabalhandoComStrings.desafio;

public class Principal2 {

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
            if (!validar(email)) {
                throw new RuntimeException(String.format("E-mail %s e valido, mas retornou false", email));
            }
        }


        for (String email : emailsInvalidos) {
            if (validar(email)) {
                throw new RuntimeException(String.format("E-mail %s e invalido, mas retornou true", email));
            }
        }
        System.out.println("Fim :)");
    }

    private static boolean validar(String email) {

//      ===== Primeira parte(nome do usuário)
//      [] = agrupamento
//      \  = escapa
//      \w = qualquer dígito ou caracter(maiúscula ou minúsculo) e também o '_'
//      .  = dentro do agrupamento'[]' significa o próprio ponto '.'
//      -  = dentro do agrupamento'[]' significa o próprio hífen '-'
//      +  = uma ou mais vezes

//      @  = significa o próprio arroba '@'

//      ===== Segunda parte(nome do domínio)
//      [] = agrupamento
//      a-z = qualquer caracter entre 'a' e 'z'
//      \d  = qualquer dígito
//      +  = uma ou mais vezes
//      \  = escapa
//      \. = como está fora do agrupamento'[]', usa em conjunto com '\' para significar o próprio ponto '.'
//      [] = agrupamento
//      a-z = qualquer caracter entre 'a' e 'z'
//      {}  = para limitar o tamanho entre 2 até 3
        return email.matches("[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}");
    }
}
