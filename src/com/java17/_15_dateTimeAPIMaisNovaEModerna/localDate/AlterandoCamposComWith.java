package com.java17._15_dateTimeAPIMaisNovaEModerna.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;

public class AlterandoCamposComWith {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();

        System.out.println("\nData atual: " + f.format(data));

        System.out.println("\nData atual alterando o ano : " + f.format(data.withYear(2026)));
        System.out.println("Data atual alterando o ano usando ChronoField: " + f.format(data.with(ChronoField.YEAR, 2026)));


        System.out.println("\nData atual alterando o mês : " + f.format(data.withMonth(12)));
        System.out.println("Data atual alterando o mês usando ChronoField: " + f.format(data.with(ChronoField.MONTH_OF_YEAR, 12)));


        System.out.println("\nData atual alterando o dia do mês: " + f.format(data.withDayOfMonth(1)));
        System.out.println("Data atual alterando o dia mês usando ChronoField: " + f.format(data.with(ChronoField.DAY_OF_MONTH, 1)));


        System.out.println("\nData atual alterando o dia do ano: " + f.format(data.withDayOfYear(50)));
        System.out.println("Data atual alterando o dia ano usando ChronoField: " + f.format(data.with(ChronoField.DAY_OF_YEAR, 50)));


        System.out.println("\nData atual alterando o dia ada semana usando ChronoField: " + f.format(data.with(ChronoField.DAY_OF_WEEK, 2)));
    }
}
