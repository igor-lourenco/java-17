package com.java17._17_expressoesLambdaEMethodReference.interface_Function;

import java.time.LocalDate;
import java.util.function.Function;
import java.util.function.IntFunction;

public class Main {

    public static void main(String[] args) {

        System.out.println("\nFunction: Recebe o primeiro objeto como parâmetro e retorna o segundo objeto");
        Function<String, LocalDate> function = str -> LocalDate.parse(str);

        String data = "2023-09-13";
        LocalDate localDate = function.apply(data);

        System.out.printf("\nConvertendo string %s para o tipo LocalDate: %s%n", data, localDate);


        System.out.println("---------------------------");
        System.out.println("Usando Function com tipo primitivo...");

        IntFunction<String> functionInt = num -> "Número: " + num;
        int numero = 5;
        String texto = functionInt.apply(numero);

        System.out.printf("Convertendo int para String: %s", texto);


        System.out.println("\n---------------------------");
        System.out.println("Referenciando construtores");
        Function<String, Produto> function1 = Produto::new;

        Produto produto1 = function1.apply("Arroz");
        System.out.println(produto1);


    }
}
