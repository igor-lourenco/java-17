package com.java17._15_dateTimeAPIMaisNovaEModerna.localTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class AlterandoCamposComWith {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS");
        LocalTime hora = LocalTime.now();

        System.out.println("\nHora atual: " + f.format(hora));


        System.out.println("\nHora atual alterando a hora: " + f.format(hora.withHour(12)));
        System.out.println("Hora atual alterando a hora usando ChronoField: " + f.format(hora.with(ChronoField.HOUR_OF_DAY, 12)));


        System.out.println("\nHora atual alterando o minuto: " + f.format(hora.withMinute(59)));
        System.out.println("Hora atual alterando o minuto usando ChronoField: " + f.format(hora.with(ChronoField.MINUTE_OF_HOUR, 59)));


        System.out.println("\nHora atual alterando o segundo: " + f.format(hora.withSecond(59)));
        System.out.println("Hora atual alterando o segundo usando ChronoField: " + f.format(hora.with(ChronoField.SECOND_OF_MINUTE, 59)));


        System.out.println("\nHora atual alterando o nanossegundo: " + f.format(hora.withNano(999_999_999)));
        System.out.println("Hora atual alterando o nanossegundo usando ChronoField: " + f.format(hora.with(ChronoField.NANO_OF_SECOND, 999_999_999)));
    }
}
