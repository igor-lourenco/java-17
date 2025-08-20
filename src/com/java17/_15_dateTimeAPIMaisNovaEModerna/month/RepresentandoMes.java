package com.java17._15_dateTimeAPIMaisNovaEModerna.month;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class RepresentandoMes {

    public static void main(String[] args) {

        LocalDate data = LocalDate.of(1981, Month.SEPTEMBER, 8);

        Month mes = Month.DECEMBER;
        System.out.println("\nMês: " + mes);

        mes = Month.of(12);
        System.out.println("Especificando o mês 12: " + mes);

        mes = Month.from(data);
        System.out.println("Especificando o mês pelo LocalDate: " + mes);

        System.out.println("Outra forma de obter o mês pelo LocalDate: " + data.getMonth());

        Locale br = new Locale("pt", "BR");
        System.out.println("\nFormatando o mês para Brasil: " + data.getMonth().getDisplayName(TextStyle.FULL, br));

        System.out.println("Formatando o mês para Brasil usando o DateTimeFormatter: " + DateTimeFormatter.ofPattern("MMMM")
            .withLocale(br)
            .format(mes));

        System.out.println("\n======================================================================\n");

        Month mesAtual = LocalDate.now().getMonth();
        Month mesCalculado = mesAtual.plus(10);
        System.out.printf("Somando 10 meses a partir do mês %s: %s%n", mesAtual, mesCalculado);

        mes = Month.DECEMBER;
        System.out.printf("%nDia do ano do primeiro dia do mês de %s(ano não bissexto): %s%n", mes, mes.firstDayOfYear(true));
        System.out.printf("Dia do ano do primeiro dia do mês de %s(ano não bissexto): %s%n", mes, mes.firstDayOfYear(false));


        mes = Month.FEBRUARY;
        System.out.printf("%nQuantos dias tem o mês %s(ano bissexto): %s%n", mes, mes.length(true));
        System.out.printf("Quantos dias tem o mês %s(ano não bissexto): %s%n", mes, mes.length(false));


        System.out.println("\n======================================================================\n");


        System.out.printf("%nQual é o primeiro mês do trimestre que está o mês %s: %s%n", mes, mes.firstMonthOfQuarter());

        mes = Month.SEPTEMBER;
        System.out.printf("Qual é o primeiro mês do trimestre que está o mês %s: %s%n", mes, mes.firstMonthOfQuarter());

    }
}
