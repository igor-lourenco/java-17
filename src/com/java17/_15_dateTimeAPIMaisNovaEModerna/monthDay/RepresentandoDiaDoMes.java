package com.java17._15_dateTimeAPIMaisNovaEModerna.monthDay;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.Year;

public class RepresentandoDiaDoMes {

    public static void main(String[] args) {

        MonthDay diaMes = MonthDay.now();
        System.out.println("\nDia do mês atual: " + diaMes);

        diaMes = MonthDay.of(Month.SEPTEMBER, 13);
        System.out.println("Especificando o dia do mês: " + diaMes);

        diaMes = MonthDay.from(LocalDate.now());
        System.out.println("Especificando o dia do mês usando LocalDate: " + diaMes);

        diaMes = MonthDay.parse("--09-13");
        System.out.println("Especificando o dia do mês usando String: " + diaMes);


        LocalDate localDate = diaMes.atYear(2025);
        System.out.println("\nObtendo LocalDate usando o MontDay: " + localDate);

        localDate = Year.now().atMonthDay(diaMes);
        System.out.println("Obtendo LocalDate usando as classes MontDay e Year: " + localDate);


        System.out.println("\n===============================================================");


        diaMes = MonthDay.of(Month.FEBRUARY, 29);
        Year ano = Year.of(2024);
        System.out.printf("O ano %s(bissexto) é válido para data %s: %b%n", ano, diaMes, ano.isValidMonthDay(diaMes));

        ano = Year.of(2025);
        System.out.printf("O ano %s(não bissexto) é válido para data %s: %b%n", ano, diaMes, ano.isValidMonthDay(diaMes));

    }
}
