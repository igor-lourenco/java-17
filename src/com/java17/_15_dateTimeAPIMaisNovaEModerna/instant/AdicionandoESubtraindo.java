package com.java17._15_dateTimeAPIMaisNovaEModerna.instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class AdicionandoESubtraindo {

    public static void main(String[] args) {

        ZoneId zona = ZoneId.of("America/Sao_Paulo");
        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSSSSSSS").withZone(zona);
        Instant instant = Instant.now();

        System.out.println("\nData e hora atual: " + f.format(instant));


        System.out.println("\nData e hora atual subtraindo 1 segundo: " + f.format(instant.minusSeconds(1)));
        System.out.println("Data e hora atual adicionando 1 segundo: " + f.format(instant.plusSeconds(1)));


        System.out.println("\nData e hora atual subtraindo 1 milissegundo: " + f.format(instant.minusMillis(1)));
        System.out.println("Data e hora atual adicionando 1 milissegundo: " + f.format(instant.plusMillis(1)));


        System.out.println("\nData e hora atual subtraindo 1 nanossegundo: " + f.format(instant.minusNanos(1)));
        System.out.println("Data e hora atual adicionando 1 nanossegundo: " + f.format(instant.plusNanos(1)));
    }
}
