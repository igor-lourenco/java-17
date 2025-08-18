package com.java17._15_dateTimeAPIMaisNovaEModerna.localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class AdicionandoESubtraindo {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSSSSSSS");
        LocalDateTime dataEhora = LocalDateTime.now();

        System.out.println("\nData e hora atual: " + f.format(dataEhora));

        System.out.println("\nData e hora atual subtraindo 1 ano : " + f.format(dataEhora.minusYears(1)));
        System.out.println("Data e hora atual adicionando 1 ano : " + f.format(dataEhora.plusYears(1)));


        System.out.println("\nData e hora atual subtraindo 1 mês : " + f.format(dataEhora.minusMonths(1)));
        System.out.println("Data e hora atual adicionando 1 mês : " + f.format(dataEhora.plusMonths(1)));

        System.out.println("\nData e hora atual subtraindo 1 semana : " + f.format(dataEhora.minusWeeks(1)));
        System.out.println("Data e hora atual adicionando 1 semana : " + f.format(dataEhora.plusWeeks(1)));


        System.out.println("\nData e hora atual subtraindo 1 dia: " + f.format(dataEhora.minusDays(1)));
        System.out.println("Data e hora atual adicionando 1 dia: " + f.format(dataEhora.plusDays(1)));


        System.out.println("\nData e hora atual subtraindo 1 hora: " + f.format(dataEhora.minusHours(1)));
        System.out.println("Data e hora atual adicionando 1 hora: " + f.format(dataEhora.plusHours(1)));


        System.out.println("\nData e hora atual subtraindo 1 minuto: " + f.format(dataEhora.minusMinutes(1)));
        System.out.println("Data e hora atual adicionando 1 minuto: " + f.format(dataEhora.plusMinutes(1)));


        System.out.println("\nData e hora atual subtraindo 1 segundo: " + f.format(dataEhora.minusSeconds(1)));
        System.out.println("Data e hora atual adicionando 1 segundo: " + f.format(dataEhora.plusSeconds(1)));


        System.out.println("\nData e hora atual subtraindo 1 nanossegundo: " + f.format(dataEhora.minusNanos(1)));
        System.out.println("Data e hora atual adicionando 1 nanossegundo: " + f.format(dataEhora.plusNanos(1)));


    }
}
