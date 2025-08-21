package com.java17._15_dateTimeAPIMaisNovaEModerna.desafioTemporalAdjuster;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("\nQual ano: ");
        Year ano = Year.parse(scanner.next());

        System.out.print("Qual o mês inicial: ");
        Month mes = Month.of(scanner.nextInt());

        YearMonth mesEAnoAtual = YearMonth.of(ano.getValue(), mes);

        DateTimeFormatter formatadorAnoEMes = DateTimeFormatter.ofPattern("MMMM 'de' yyyy'...'");
        System.out.println("\nGerando agenda anual de reuniões a partir de " + formatadorAnoEMes.format(mesEAnoAtual));

        for (int i = 0; i <=12; i++){
            YearMonth mesEAno = mesEAnoAtual.with(ChronoField.MONTH_OF_YEAR, mesEAnoAtual.getMonthValue() + i);

            LocalDate data = LocalDate.from(mesEAno.atDay(1));
            LocalDate primeiraSegundaFeiraDoMes = data.with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

            System.out.println(primeiraSegundaFeiraDoMes.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL)));

            if(mesEAno.getMonth().equals(Month.DECEMBER)) break;
        }

        scanner.close();

    }
}
