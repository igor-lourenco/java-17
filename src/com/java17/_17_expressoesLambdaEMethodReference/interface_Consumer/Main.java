package com.java17._17_expressoesLambdaEMethodReference.interface_Consumer;

import java.util.function.Consumer;
import java.util.function.IntConsumer;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nConsumer: Recebe objeto como parâmetro e não retorna nada(void) ");
        Consumer<String> consumer = str -> System.out.println(str);

        String texto = "\nOlá :)";
        consumer.accept(texto);

        System.out.println("---------------------------");
        System.out.println("Usando Consumer com tipo primitivo...");

        IntConsumer consumerInt = num -> System.out.println("Número : " + num);

        consumerInt.accept(10);

    }
}
