package com.java17._12_trabalhandoComStrings.webScraper;

public class Principal2 {

    public static void main(String[] args) {

        String html = "<a href=\"mailto:joao@gmail.com\">\n    joao@gmail.com</a>\n" +
            "<a>\n    abc@google.com</a>\n<a>xyz@google.com\n</a>\n" +
            "<strong>maria@gmail.com</strong>\n" +
            "<strong>jose@gmail.com</strong>\n" +
            "<strong>jose@Gmail.com</strong>" + // email invalido
            "<strong>rose@gmail.com</strong>";

        System.out.println();
        System.out.println("-------------");
        System.out.println("----- ANTES --------");
        System.out.println();
        System.out.println(html);
        System.out.println("-------------");

//      apenas email válidos
        String regex = "[\\w.-]+@[a-z\\d.-]+\\.[a-z]{2,3}";

        String novoHtml = html.replaceFirst(regex, "email@anonimo.com");

        System.out.println("-------------");
        System.out.println("-----  ALTERANDO APENAS O PRIMEIRO EMAIL --------");
        System.out.println();
        System.out.println(novoHtml);
        System.out.println("-------------");

        String novoHtml2 = html.replaceAll(regex, "email@anonimo.com");

        System.out.println("-------------");
        System.out.println("-----  ALTERANDO TODOS OS EMAIL --------");
        System.out.println();
        System.out.println(novoHtml2);
        System.out.println("-------------");
    }
}
