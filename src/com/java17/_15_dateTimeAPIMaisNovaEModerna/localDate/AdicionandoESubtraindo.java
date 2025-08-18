package com.java17._15_dateTimeAPIMaisNovaEModerna.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AdicionandoESubtraindo {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.now();

        System.out.println("\nData atual: " + f.format(data));

        System.out.println("\nData atual subtraindo 1 ano : " + f.format(data.minusYears(1)));
        System.out.println("Data atual adicionando 1 ano : " + f.format(data.plusYears(1)));


        System.out.println("\nData atual subtraindo 1 mês : " + f.format(data.minusMonths(1)));
        System.out.println("Data atual adicionando 1 mês : " + f.format(data.plusMonths(1)));

        System.out.println("\nData atual subtraindo 1 semana : " + f.format(data.minusWeeks(1)));
        System.out.println("Data atual adicionando 1 semana : " + f.format(data.plusWeeks(1)));


        System.out.println("\nData atual subtraindo 1 dia: " + f.format(data.minusDays(1)));
        System.out.println("Data atual adicionando 1 dia: " + f.format(data.plusDays(1)));

    }
}
