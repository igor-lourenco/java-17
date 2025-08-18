package com.java17._15_dateTimeAPIMaisNovaEModerna.localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculandoObjetosTemporaisComChronoUnit {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSSSSSSS");
        LocalDateTime dataEhora = LocalDateTime.now();

        System.out.println("\nData e hora atual: " + f.format(dataEhora));

        System.out.println("\nData e hora atual subtraindo 1 ano : " + f.format(dataEhora.minus(1, ChronoUnit.YEARS)));
        System.out.println("Data e hora atual subtraindo 1 ano : " + f.format(ChronoUnit.YEARS.addTo(dataEhora,-1)));

        System.out.println("\nData e hora atual adicionando 1 ano : " + f.format(dataEhora.plus(1, ChronoUnit.YEARS)));
        System.out.println("Data e hora atual adicionando 1 ano : " + f.format(ChronoUnit.YEARS.addTo(dataEhora,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 mês : " + f.format(dataEhora.minus(1, ChronoUnit.MONTHS)));
        System.out.println("Data e hora atual subtraindo 1 mês : " + f.format(ChronoUnit.MONTHS.addTo(dataEhora, -1)));

        System.out.println("\nData e hora atual adicionando 1 mês : " + f.format(dataEhora.plus(1, ChronoUnit.MONTHS)));
        System.out.println("Data e hora atual adicionando 1 mês : " + f.format(ChronoUnit.MONTHS.addTo(dataEhora,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 semana : " + f.format(dataEhora.minus(1, ChronoUnit.WEEKS)));
        System.out.println("Data e hora atual subtraindo 1 semana : " + f.format(ChronoUnit.WEEKS.addTo(dataEhora, -1)));

        System.out.println("\nData e hora atual adicionando 1 semana : " + f.format(dataEhora.plus(1, ChronoUnit.WEEKS)));
        System.out.println("Data e hora atual adicionando 1 semana : " + f.format(ChronoUnit.WEEKS.addTo(dataEhora,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 dia: " + f.format(dataEhora.minus(1, ChronoUnit.DAYS)));
        System.out.println("Data e hora atual subtraindo 1 dia: " + f.format(ChronoUnit.DAYS.addTo(dataEhora, -1)));

        System.out.println("\nData e hora atual adicionando 1 dia: " + f.format(dataEhora.plus(1, ChronoUnit.DAYS)));
        System.out.println("Data e hora atual adicionando 1 dia: " + f.format(ChronoUnit.DAYS.addTo(dataEhora, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 hora: " + f.format(dataEhora.minus(1, ChronoUnit.HOURS)));
        System.out.println("Data e hora atual subtraindo 1 hora: " + f.format(ChronoUnit.HOURS.addTo(dataEhora, -1)));

        System.out.println("\nData e hora atual adicionando 1 hora: " + f.format(dataEhora.plus(1, ChronoUnit.HOURS)));
        System.out.println("Data e hora atual adicionando 1 hora: " + f.format(ChronoUnit.HOURS.addTo(dataEhora, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 minuto: " + f.format(dataEhora.minus(1, ChronoUnit.MINUTES)));
        System.out.println("Data e hora atual subtraindo 1 minuto: " + f.format(ChronoUnit.MINUTES.addTo(dataEhora, -1)));

        System.out.println("\nData e hora atual adicionando 1 minuto: " + f.format(dataEhora.plus(1, ChronoUnit.MINUTES)));
        System.out.println("Data e hora atual adicionando 1 minuto: " + f.format(ChronoUnit.MINUTES.addTo(dataEhora, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 segundo: " + f.format(dataEhora.minus(1, ChronoUnit.SECONDS)));
        System.out.println("Data e hora atual subtraindo 1 segundo: " + f.format(ChronoUnit.SECONDS.addTo(dataEhora, -1)));

        System.out.println("\nData e hora atual adicionando 1 segundo: " + f.format(dataEhora.plus(1, ChronoUnit.SECONDS)));
        System.out.println("Data e hora atual adicionando 1 segundo: " + f.format(ChronoUnit.SECONDS.addTo(dataEhora,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 nanossegundo: " + f.format(dataEhora.minus(1, ChronoUnit.NANOS)));
        System.out.println("Data e hora atual subtraindo 1 nanossegundo: " + f.format(ChronoUnit.NANOS.addTo(dataEhora,-1)));

        System.out.println("\nData e hora atual adicionando 1 nanossegundo: " + f.format(dataEhora.plus(1, ChronoUnit.NANOS)));
        System.out.println("Data e hora atual adicionando 1 nanossegundo: " + f.format(ChronoUnit.NANOS.addTo(dataEhora, 1)));


    }
}
