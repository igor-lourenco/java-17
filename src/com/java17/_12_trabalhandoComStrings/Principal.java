package com.java17._12_trabalhandoComStrings;

public class Principal {

    public static void main(String[] args) {

        String nome1 = "Joao";
        String nome2 = new String("Joao");

        System.out.println();
        System.out.printf("Comparando endereco de memoria: %b%n", nome1 == nome2); // compara o endereço de mémoria das Strings
        System.out.println("Comparando conteudo: " + nome1.equals(nome2)); // compara o conteúdo das Strings


//      TODO: método equalsIgnoreCase
        String nome3 = "Joao";
        String nome4 = new String("JOAO");

        System.out.println();
        System.out.println(">>> equalsIgnoreCase");
        System.out.println("Comparando maiuscula e minuscula: " + nome3.equalsIgnoreCase(nome4));


//      TODO: método isEmpty
        String nome5 = "";

        System.out.println();
        System.out.println(">>> isEmpty");
        System.out.println("Comparando string vazia: " + nome5.isEmpty());

//      TODO: método isBlank
        String nome6 = "         ";

        System.out.println();
        System.out.println(">>> isBlank");
        System.out.println("Comparando string em branco(com espacos): " + nome6.isBlank());


//      TODO: método startsWith
        String nome7 = "Joao";

        System.out.println();
        System.out.println(">>> startsWith");
        System.out.println("Verifica se a string comeca com caractere especifico(J): " + nome7.startsWith("J"));

//      TODO: método endsWith
        String nome8 = "Joao";

        System.out.println();
        System.out.println(">>> endsWith");
        System.out.println("Verifica se a string termina com caractere especifico(o): " + nome8.startsWith("o"));

//      TODO: método contains
        String nome9 = "Joao";

        System.out.println();
        System.out.println(">>> contains");
        System.out.println("Verifica se a string contem caractere especifico(ao): " + nome9.contains("ao"));



    }
}
