package com.java17._19_streamsAPI;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class OutrasFormasDeObterInstanciasDeStream {

    public static void main(String[] args) {

        String[] nomes = {"Maria", "Sebastião", "João"};

        System.out.println("\nUsando Arrays.stream:");

        Arrays.stream(nomes)
            .map(String::toUpperCase)
            .sorted()
            .forEach(System.out::println);


        System.out.println("\nUsando Stream.iterate:");
        Stream.iterate(new BigDecimal("1000"),
            valor -> valor.compareTo(BigDecimal.ZERO) >= 0,
            valor -> valor.subtract(new BigDecimal("100")))
            .forEach(System.out::println);


        System.out.println("\nUsando Stream.of:");
        Stream.of(nomes)
            .map(String::toLowerCase)
            .sorted()
            .forEach(System.out::println);


        System.out.println("\nUsando IntStream.of:");
        int sum = IntStream.of(1, 2, 3, 4, 5)
            .sum();

        System.out.println("Soma de: ");
        IntStream.of(1, 2, 3, 4, 5).forEach(System.out::print);
        System.out.println(": " + sum);


        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 5, 6);
        Stream<Integer> stream2 = Stream.of(7,8,9);


        System.out.println("\nConcatenando duas Stream com Stream.concat:");
        Stream.concat(stream1, stream2).forEach(System.out::print);


        System.out.println("\n\nUsando IntStream.range para gerar Stream em um intervalo de 0 a 9");
        IntStream.range(0, 9).forEach(System.out::print);

        System.out.println("\n\nUsando IntStream.range para gerar Stream em um intervalo de 0 a 9, incluindo o 9");
        IntStream.rangeClosed(0, 9).forEach(System.out::print);

        System.out.println("\n\nUsando IntStream.range para gerar Stream em um intervalo de 0 a 9, apenas o números pares");
        IntStream.rangeClosed(0, 9).filter(i -> i % 2 == 0).forEach(System.out::print);


        System.out.println("\n\nGerando números aleatórios com Stream.generate:");
        Random random = new Random();
        Stream.generate(() -> random.nextInt(59) + 1)
            .distinct()
            .limit(6)
            .forEach(i -> System.out.print(i + " "));


    }
}
