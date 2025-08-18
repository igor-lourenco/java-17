package com.java17._15_dateTimeAPIMaisNovaEModerna.localTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class AdicionandoESubtraindo {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS");
        LocalTime hora = LocalTime.now();

        System.out.println("\nHora atual: " + f.format(hora));


        System.out.println("\nHora atual subtraindo 1 hora: " + f.format(hora.minusHours(1)));
        System.out.println("Hora atual adicionando 1 hora: " + f.format(hora.plusHours(1)));


        System.out.println("\nHora atual subtraindo 1 minuto: " + f.format(hora.minusMinutes(1)));
        System.out.println("Hora atual adicionando 1 minuto: " + f.format(hora.plusMinutes(1)));


        System.out.println("\nHora atual subtraindo 1 segundo: " + f.format(hora.minusSeconds(1)));
        System.out.println("Hora atual adicionando 1 segundo: " + f.format(hora.plusSeconds(1)));


        System.out.println("\nHora atual subtraindo 1 nanossegundo: " + f.format(hora.minusNanos(1)));
        System.out.println("Hora atual adicionando 1 nanossegundo: " + f.format(hora.plusNanos(1)));

    }
}
