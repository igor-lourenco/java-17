package com.java17._15_dateTimeAPIMaisNovaEModerna.localDateTime;

import java.time.LocalDateTime;

public class Main {

    public static void main(String[] args) {

        LocalDateTime dataEHorario = LocalDateTime.now();
        System.out.println("\nData e hora atual: " + dataEHorario);

        dataEHorario = LocalDateTime.of(1981, 9, 13, 20, 55, 10);
        System.out.println("Data especifica: " + dataEHorario);
    }
}
