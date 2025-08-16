package com.java17._15_dateTimeAPIMaisNovaEModerna.localDate;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        System.out.println("\nData de hoje: " + data);

        data = LocalDate.of(1996, 5, 10);
        System.out.println("Data de nascimento: " + data);

        data = LocalDate.ofYearDay(2025, 256);
        System.out.println("Dia do programador: " + data);

    }
}
