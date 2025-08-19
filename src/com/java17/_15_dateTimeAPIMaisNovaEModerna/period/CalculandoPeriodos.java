package com.java17._15_dateTimeAPIMaisNovaEModerna.period;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculandoPeriodos {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate dataCompra = LocalDate.parse("15/09/2022", f);

        LocalDate dataEntrega = LocalDate.parse("2022-11-12");

        Period tempoEntrega = Period.between(dataCompra, dataEntrega);
        System.out.println("\nCalculando tempo entrega: " + tempoEntrega);

        tempoEntrega = dataCompra.until(dataEntrega);
        System.out.println("Outra forma de calcular tempo entrega: " + tempoEntrega);


        long tempoEntregaDays = dataCompra.until(dataEntrega, ChronoUnit.DAYS);
        System.out.println("\nCalculando tempo entrega usando ChronoUnit: " + tempoEntregaDays + " dias");

        tempoEntregaDays = ChronoUnit.DAYS.between(dataCompra,dataEntrega);
        System.out.println("Outra forma de calcular tempo entrega usando ChronoUnit: " + tempoEntregaDays + " dias");


        long tempoEntregaWeeks = dataCompra.until(dataEntrega, ChronoUnit.WEEKS);
        System.out.println("\nCalculando tempo entrega usando ChronoUnit: " + tempoEntregaWeeks + " semanas");

        tempoEntregaWeeks = ChronoUnit.WEEKS.between(dataCompra, dataEntrega);
        System.out.println("Outra forma de calcular tempo entrega usando ChronoUnit: " + tempoEntregaWeeks + " semanas");

        System.out.println("=====================================================");

        Period tempoMedioEntrega = Period.parse("P1M5D");
        LocalDate hoje = LocalDate.now();

        LocalDate dataPrevistaEntrega = hoje.plus(tempoMedioEntrega);

        System.out.println("\nTempo médio de entrega: " + tempoMedioEntrega);
        System.out.println("Data atual: " + hoje);
        System.out.println("Somando a data atual com o tempo médi de entrega: " + dataPrevistaEntrega);

    }
}
