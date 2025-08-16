package com.java17._15_dateTimeAPIMaisNovaEModerna;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {

    public static void main(String[] args) {

        LocalDate data = LocalDate.of(1981, 9, 13);
        LocalTime hora = LocalTime.of(23, 54, 10);

        LocalDateTime dataEHora = LocalDateTime.of(data, hora);
        System.out.println("\nData e hora usando o LocalDate e Localtime: " + dataEHora);

        dataEHora = data.atTime(hora);
        System.out.println("Data e hora usando o atTime() do LocalDate: " + dataEHora);

        dataEHora = hora.atDate(data);
        System.out.println("Data e hora usando o atDate() do LocalTime: " + dataEHora);


        dataEHora = LocalDateTime.now();
        data = dataEHora.toLocalDate();
        System.out.println("\nExtraindo apenas a data do LocalDateTime: " + data);
        hora = dataEHora.toLocalTime();
        System.out.println("Extraindo apenas a hora do LocalDateTime: " + hora);


        data = LocalDate.from(dataEHora);
        System.out.println("\nExtraindo apenas a data do LocalDateTime usando o from() do LocalDate: " + data);
        hora = LocalTime.from(dataEHora);
        System.out.println("Extraindo apenas a hora do LocalDateTime usando o from() do LocalTime: " + hora);

    }
}
