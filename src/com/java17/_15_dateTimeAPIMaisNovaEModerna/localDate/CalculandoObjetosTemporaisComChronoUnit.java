package com.java17._15_dateTimeAPIMaisNovaEModerna.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculandoObjetosTemporaisComChronoUnit {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();

        System.out.println("\nData atual: " + f.format(data));

        System.out.println("\nData atual subtraindo 1 ano : " + f.format(data.minus(1, ChronoUnit.YEARS)));
        System.out.println("Data atual subtraindo 1 ano : " + f.format(ChronoUnit.YEARS.addTo(data,-1)));

        System.out.println("\nData atual adicionando 1 ano : " + f.format(data.plus(1, ChronoUnit.YEARS)));
        System.out.println("Data atual adicionando 1 ano : " + f.format(ChronoUnit.YEARS.addTo(data,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData atual subtraindo 1 mês : " + f.format(data.minus(1, ChronoUnit.MONTHS)));
        System.out.println("Data atual subtraindo 1 mês : " + f.format(ChronoUnit.MONTHS.addTo(data, -1)));

        System.out.println("\nData atual adicionando 1 mês : " + f.format(data.plus(1, ChronoUnit.MONTHS)));
        System.out.println("Data atual adicionando 1 mês : " + f.format(ChronoUnit.MONTHS.addTo(data,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData atual subtraindo 1 semana : " + f.format(data.minus(1, ChronoUnit.WEEKS)));
        System.out.println("Data atual subtraindo 1 semana : " + f.format(ChronoUnit.WEEKS.addTo(data, -1)));

        System.out.println("\nData atual adicionando 1 semana : " + f.format(data.plus(1, ChronoUnit.WEEKS)));
        System.out.println("Data atual adicionando 1 semana : " + f.format(ChronoUnit.WEEKS.addTo(data,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData atual subtraindo 1 dia: " + f.format(data.minus(1, ChronoUnit.DAYS)));
        System.out.println("Data atual subtraindo 1 dia: " + f.format(ChronoUnit.DAYS.addTo(data, -1)));

        System.out.println("\nData atual adicionando 1 dia: " + f.format(data.plus(1, ChronoUnit.DAYS)));
        System.out.println("Data atual adicionando 1 dia: " + f.format(ChronoUnit.DAYS.addTo(data, 1)));

    }
}
