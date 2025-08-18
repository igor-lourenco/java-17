package com.java17._15_dateTimeAPIMaisNovaEModerna.instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculandoObjetosTemporaisComChronoUnit {

    public static void main(String[] args) {

        ZoneId zona = ZoneId.of("America/Sao_Paulo");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSSSSSSS").withZone(zona);
        Instant instant = Instant.now();

        System.out.println("\nData e hora atual: " + f.format(instant));

        System.out.println("\nData e hora atual subtraindo 1 dia: " + f.format(instant.minus(1, ChronoUnit.DAYS)));
        System.out.println("Data e hora atual subtraindo 1 dia: " + f.format(ChronoUnit.DAYS.addTo(instant, -1)));

        System.out.println("\nData e hora atual adicionando 1 dia: " + f.format(instant.plus(1, ChronoUnit.DAYS)));
        System.out.println("Data e hora atual adicionando 1 dia: " + f.format(ChronoUnit.DAYS.addTo(instant, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 hora: " + f.format(instant.minus(1, ChronoUnit.HOURS)));
        System.out.println("Data e hora atual subtraindo 1 hora: " + f.format(ChronoUnit.HOURS.addTo(instant, -1)));

        System.out.println("\nData e hora atual adicionando 1 hora: " + f.format(instant.plus(1, ChronoUnit.HOURS)));
        System.out.println("Data e hora atual adicionando 1 hora: " + f.format(ChronoUnit.HOURS.addTo(instant, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 minuto: " + f.format(instant.minus(1, ChronoUnit.MINUTES)));
        System.out.println("Data e hora atual subtraindo 1 minuto: " + f.format(ChronoUnit.MINUTES.addTo(instant, -1)));

        System.out.println("\nData e hora atual adicionando 1 minuto: " + f.format(instant.plus(1, ChronoUnit.MINUTES)));
        System.out.println("Data e hora atual adicionando 1 minuto: " + f.format(ChronoUnit.MINUTES.addTo(instant, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 segundo: " + f.format(instant.minus(1, ChronoUnit.SECONDS)));
        System.out.println("Data e hora atual subtraindo 1 segundo: " + f.format(ChronoUnit.SECONDS.addTo(instant, -1)));

        System.out.println("\nData e hora atual adicionando 1 segundo: " + f.format(instant.plus(1, ChronoUnit.SECONDS)));
        System.out.println("Data e hora atual adicionando 1 segundo: " + f.format(ChronoUnit.SECONDS.addTo(instant,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 milissegundo: " + f.format(instant.minus(1, ChronoUnit.MILLIS)));
        System.out.println("Data e hora atual subtraindo 1 milissegundo: " + f.format(ChronoUnit.MILLIS.addTo(instant,-1)));

        System.out.println("\nData e hora atual adicionando 1 milissegundo: " + f.format(instant.plus(1, ChronoUnit.MILLIS)));
        System.out.println("Data e hora atual adicionando 1 milissegundo: " + f.format(ChronoUnit.MILLIS.addTo(instant, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nData e hora atual subtraindo 1 nanossegundo: " + f.format(instant.minus(1, ChronoUnit.NANOS)));
        System.out.println("Data e hora atual subtraindo 1 nanossegundo: " + f.format(ChronoUnit.NANOS.addTo(instant,-1)));

        System.out.println("\nData e hora atual adicionando 1 nanossegundo: " + f.format(instant.plus(1, ChronoUnit.NANOS)));
        System.out.println("Data e hora atual adicionando 1 nanossegundo: " + f.format(ChronoUnit.NANOS.addTo(instant, 1)));

    }
}
