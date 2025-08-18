package com.java17._15_dateTimeAPIMaisNovaEModerna.localTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculandoObjetosTemporaisComChronoUnit {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS");
        LocalTime hora = LocalTime.now();

        System.out.println("\nHora atual: " + f.format(hora));


        System.out.println("\nHora atual subtraindo 1 hora: " + f.format(hora.minus(1, ChronoUnit.HOURS)));
        System.out.println("Hora atual subtraindo 1 hora: " + f.format(ChronoUnit.HOURS.addTo(hora, -1)));

        System.out.println("\nHora atual adicionando 1 hora: " + f.format(hora.plus(1, ChronoUnit.HOURS)));
        System.out.println("Hora atual adicionando 1 hora: " + f.format(ChronoUnit.HOURS.addTo(hora, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nHora atual subtraindo 1 minuto: " + f.format(hora.minus(1, ChronoUnit.MINUTES)));
        System.out.println("Hora atual subtraindo 1 minuto: " + f.format(ChronoUnit.MINUTES.addTo(hora, -1)));

        System.out.println("\nHora atual adicionando 1 minuto: " + f.format(hora.plus(1, ChronoUnit.MINUTES)));
        System.out.println("Hora atual adicionando 1 minuto: " + f.format(ChronoUnit.MINUTES.addTo(hora, 1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nHora atual subtraindo 1 segundo: " + f.format(hora.minus(1, ChronoUnit.SECONDS)));
        System.out.println("Hora atual subtraindo 1 segundo: " + f.format(ChronoUnit.SECONDS.addTo(hora, -1)));

        System.out.println("\nHora atual adicionando 1 segundo: " + f.format(hora.plus(1, ChronoUnit.SECONDS)));
        System.out.println("Hora atual adicionando 1 segundo: " + f.format(ChronoUnit.SECONDS.addTo(hora,1)));

        System.out.println("\n=========================================================================");

        System.out.println("\nHora atual subtraindo 1 nanossegundo: " + f.format(hora.minus(1, ChronoUnit.NANOS)));
        System.out.println("Hora atual subtraindo 1 nanossegundo: " + f.format(ChronoUnit.NANOS.addTo(hora,-1)));

        System.out.println("\nHora atual adicionando 1 nanossegundo: " + f.format(hora.plus(1, ChronoUnit.NANOS)));
        System.out.println("Hora atual adicionando 1 nanossegundo: " + f.format(ChronoUnit.NANOS.addTo(hora, 1)));


    }
}
