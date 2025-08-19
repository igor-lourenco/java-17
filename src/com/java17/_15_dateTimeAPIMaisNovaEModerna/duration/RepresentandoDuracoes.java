package com.java17._15_dateTimeAPIMaisNovaEModerna.duration;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class RepresentandoDuracoes {

    public static void main(String[] args) {

        Duration duration = Duration.ofHours(45);
        System.out.println("\nDuração em horas [H]: " + duration);

        duration = Duration.ofDays(2);
        System.out.println("\nDuração em dias (converte em horas) [H]: " + duration);

        duration = Duration.ofMinutes(3);
        System.out.println("Duração em minutos [M]: " + duration);

        duration = Duration.ofSeconds(3);
        System.out.println("Duração em segundos [S]: " + duration);

        duration = Duration.of(100, ChronoUnit.HOURS);
        System.out.println("Duração usando ChronoUnit [PT H]: " + duration);


        duration = Duration.parse("PT2H5M10S");
        System.out.println("\nDuração completa convertendo String para Duration [PT2H5M10S]: " + duration);

        duration = Duration.parse("P2DT5H");
        System.out.println("Duração completa convertendo String para Duration [P2DT5H]: " + duration);


        Duration duracaoCalculada = duration.minus(Duration.ofHours(1));
        System.out.println("\nSubtraindo Duração: " + duracaoCalculada);

        duracaoCalculada = duration.minusHours(1);
        System.out.println("Subtraindo Duração: " + duracaoCalculada);


        duracaoCalculada = duration.plus(Duration.ofMinutes(30));
        System.out.println("\nSomando Duração: " + duracaoCalculada);

        duracaoCalculada = duration.plusMinutes(30);
        System.out.println("Somando Duração: " + duracaoCalculada);


        duracaoCalculada = duration.multipliedBy(3);
        System.out.println("\nMultiplicando por 3 Duração [PT53H]: " + duracaoCalculada);

        duracaoCalculada = duration.dividedBy(3);
        System.out.println("Dividindo por 3 Duração [PT53H]: " + duracaoCalculada);


        System.out.println("\nConvertendo Duração para minutos [PT53H]: " + duration.toMinutes() + " minutos");

        System.out.println("Convertendo Duração para horas [PT53H]: " + duration.toHours() + " horas");


        String duracaoFormatado = String.format("%Extraindo as durações de: [%s] para: %d horas, %d minutos e %d segundos",
            duracaoCalculada, duracaoCalculada.toHoursPart(), duracaoCalculada.toMinutesPart(), duracaoCalculada.toSecondsPart());

        System.out.println(duracaoFormatado);

    }
}
