package com.java17._15_dateTimeAPIMaisNovaEModerna.localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class AlterandoCamposComWith {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSSSSSSS");
        LocalDateTime dataEhora = LocalDateTime.now();

        System.out.println("\nData e hora atual: " + f.format(dataEhora));

        System.out.println("\nData e hora atual alterando o ano : " + f.format(dataEhora.withYear(2026)));
        System.out.println("Data e hora atual alterando o ano usando ChronoField: " + f.format(dataEhora.with(ChronoField.YEAR, 2026)));


        System.out.println("\nData e hora atual alterando o mês : " + f.format(dataEhora.withMonth(12)));
        System.out.println("Data e hora atual alterando o mês usando ChronoField: " + f.format(dataEhora.with(ChronoField.MONTH_OF_YEAR, 12)));


        System.out.println("\nData e hora atual alterando o dia do mês: " + f.format(dataEhora.withDayOfMonth(1)));
        System.out.println("Data e hora atual alterando o dia mês usando ChronoField: " + f.format(dataEhora.with(ChronoField.DAY_OF_MONTH, 1)));


        System.out.println("\nData e hora atual alterando o dia do ano: " + f.format(dataEhora.withDayOfYear(50)));
        System.out.println("Data e hora atual alterando o dia ano usando ChronoField: " + f.format(dataEhora.with(ChronoField.DAY_OF_YEAR, 50)));


        System.out.println("\nData e hora atual alterando o dia ada semana usando ChronoField: " + f.format(dataEhora.with(ChronoField.DAY_OF_WEEK, 2)));


        System.out.println("\nData e hora atual alterando a hora: " + f.format(dataEhora.withHour(12)));
        System.out.println("Data e hora atual alterando a hora usando ChronoField: " + f.format(dataEhora.with(ChronoField.HOUR_OF_DAY, 12)));


        System.out.println("\nData e hora atual alterando o minuto: " + f.format(dataEhora.withMinute(59)));
        System.out.println("Data e hora atual alterando o minuto usando ChronoField: " + f.format(dataEhora.with(ChronoField.MINUTE_OF_HOUR, 59)));


        System.out.println("\nData e hora atual alterando o segundo: " + f.format(dataEhora.withSecond(59)));
        System.out.println("Data e hora atual alterando o segundo usando ChronoField: " + f.format(dataEhora.with(ChronoField.SECOND_OF_MINUTE, 59)));


        System.out.println("\nData e hora atual alterando o nanossegundo: " + f.format(dataEhora.withNano(999_999_999)));
        System.out.println("Data e hora atual alterando o nanossegundo usando ChronoField: " + f.format(dataEhora.with(ChronoField.NANO_OF_SECOND, 999_999_999)));


    }
}
