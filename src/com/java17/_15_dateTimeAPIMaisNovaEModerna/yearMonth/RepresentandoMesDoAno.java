package com.java17._15_dateTimeAPIMaisNovaEModerna.yearMonth;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.YearMonth;
import java.time.temporal.ChronoUnit;

public class RepresentandoMesDoAno {

    public static void main(String[] args) {

        YearMonth anoDoMes = YearMonth.now();
        System.out.println("\nMes do ano atual: " + anoDoMes);

        anoDoMes = YearMonth.of(2022, Month.SEPTEMBER);
        System.out.println("Especificando o mês do ano: " + anoDoMes);

        anoDoMes = YearMonth.from(LocalDate.now());
        System.out.println("Obtendo mês do ano usando o LocalDate: " + anoDoMes);

        anoDoMes = YearMonth.parse("2022-09");
        System.out.println("Obtendo mês do ano usando String: " + anoDoMes);


        LocalDate data = anoDoMes.atDay(01);
        System.out.println("\nObtendo LocalDate usando o YearMonth: " + data);

        data = anoDoMes.atEndOfMonth();
        System.out.printf("Último dia do mês %s: %s%n", anoDoMes.getMonth(), data);


        System.out.println("\n===============================================================\n");


        anoDoMes = YearMonth.parse("2023-09");
        YearMonth futuro = anoDoMes.plus(Period.parse("P10M"));

        System.out.printf("Adicionando 10 meses na data %s: %s%n", anoDoMes, futuro);

        futuro = anoDoMes.plus(2, ChronoUnit.YEARS);
        System.out.printf("Adicionando 2 anos na data %s: %s%n", anoDoMes, futuro);


        long tempoEmMeses = anoDoMes.until(futuro, ChronoUnit.MONTHS);
        System.out.printf("Diferença de tempo entre as datas (%s) e (%s) em meses: %d meses %n", anoDoMes, futuro, tempoEmMeses);

        tempoEmMeses = anoDoMes.until(LocalDate.parse("2020-10-15"), ChronoUnit.MONTHS);
        System.out.printf("Diferença de tempo entre as datas (%s) e (2020-10-15) em meses: %d meses %n", anoDoMes,  tempoEmMeses);




    }
}
