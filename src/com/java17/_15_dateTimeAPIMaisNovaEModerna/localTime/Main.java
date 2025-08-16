package com.java17._15_dateTimeAPIMaisNovaEModerna.localTime;

import java.time.Instant;
import java.time.LocalTime;
import java.time.ZoneId;

public class Main {

    public static void main(String[] args) {

//      Com precisão de nanossegundos
        LocalTime horario = LocalTime.now();
        System.out.println("\nHorario de agora: " + horario);

        horario = LocalTime.of(13, 05, 30);
        System.out.println("Horario especifico: " + horario);

        Instant instant = Instant.now();
        horario = LocalTime.ofInstant(instant, ZoneId.of("UTC"));
        System.out.println("Convertendo Instant em horario: " + horario);
    }
}
