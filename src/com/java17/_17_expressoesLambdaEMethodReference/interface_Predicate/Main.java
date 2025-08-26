package com.java17._17_expressoesLambdaEMethodReference.interface_Predicate;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nPredicate: Recebe objeto como parâmetro e retorna boolean");
        Predicate<String> predicate = str -> str.startsWith("T");

        String nome = "Thiago";
        boolean comecaComT = predicate.test(nome);

        System.out.printf("%nNome %s começa com T: %b%n", nome, comecaComT);

        System.out.println("---------------------------");
        System.out.println("Usando Predicate com tipo primitivo...");

        IntPredicate predicateInt = num -> num > 10;
        int numero = 5;
        boolean ehMaior = predicateInt.test(numero);
        System.out.printf("Número %d é maior que 10: %b%n", numero, ehMaior);
    }
}
