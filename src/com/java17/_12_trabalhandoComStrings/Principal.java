package com.java17._12_trabalhandoComStrings;

public class Principal {

    public static void main(String[] args) {

        String nome1 = "Joao";
        String nome2 = new String("Joao");

        System.out.println(nome1 == nome2); // compara o endereço de mémoria das Strings
        System.out.println(nome1.equals(nome2)); // compara o conteúdo das Strings
    }

}
