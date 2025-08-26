package com.java17._17_expressoesLambdaEMethodReference.interface_Supplier;

import java.time.LocalDateTime;
import java.util.function.IntSupplier;
import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nSupplier: Não recebe nenhum parâmetro e retorna objeto");
        Supplier<LocalDateTime> supplier = () -> LocalDateTime.now();
        LocalDateTime dateTime = supplier.get();

        System.out.printf("%nData e hora: %s%n ", dateTime);

        System.out.println("---------------------------");
        System.out.println("Usando Supplier com tipo primitivo...");

        IntSupplier supplierInt = () -> Integer.valueOf("10");
        int numero = supplierInt.getAsInt();

        System.out.printf("Convertendo String para String: %s", numero);
    }
}
