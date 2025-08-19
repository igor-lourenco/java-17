package com.java17._15_dateTimeAPIMaisNovaEModerna.duration;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class CalculandoDuracoes {

    public static void main(String[] args) {

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        LocalDateTime dataHoraCompra = LocalDateTime.parse("12/11/2022 21:30:00", f);

        LocalDateTime dataHoraEntrega = LocalDateTime.parse("2022-11-12T22:10:10");

        Duration tempoEntrega = Duration.between(dataHoraCompra, dataHoraEntrega);
        System.out.println("\nCalculando tempo entrega: " + tempoEntrega);


        long tempoEntregaSegundos = dataHoraCompra.until(dataHoraEntrega, ChronoUnit.SECONDS);
        System.out.println("\nCalculando tempo entrega usando ChronoUnit: " + tempoEntregaSegundos + " segundos");

        tempoEntregaSegundos = ChronoUnit.SECONDS.between(dataHoraCompra,dataHoraEntrega);
        System.out.println("Outra forma de calcular tempo entrega usando ChronoUnit: " + tempoEntregaSegundos + " segundos");


        long tempoEntregaMinutos = dataHoraCompra.until(dataHoraEntrega, ChronoUnit.MINUTES);
        System.out.println("\nCalculando tempo entrega usando ChronoUnit: " + tempoEntregaMinutos + " minutos");

        tempoEntregaMinutos = ChronoUnit.MINUTES.between(dataHoraCompra, dataHoraEntrega);
        System.out.println("Outra forma de calcular tempo entrega usando ChronoUnit: " + tempoEntregaMinutos + " minutos");

        System.out.println("\n=====================================================");
        System.out.println("Usando o LocalDateTime:");

        Duration tempoMedioEntrega = Duration.parse("PT45M");
        LocalDateTime hoje = LocalDateTime.now();

        LocalDateTime dataHoraPrevistaEntrega = hoje.plus(tempoMedioEntrega)
            .truncatedTo(ChronoUnit.MINUTES); // trunca em minutos, eliminando os segundos.

        System.out.println("\nTempo médio de entrega: " + tempoMedioEntrega);
        System.out.println("Data atual: " + f.format(hoje.truncatedTo(ChronoUnit.MINUTES)));
        System.out.println("Somando a data atual com o tempo médio de entrega: " + f.format(dataHoraPrevistaEntrega));


        System.out.println("\n=====================================================");
        System.out.println("Usando o LocalTime:");

        tempoMedioEntrega = Duration.parse("PT45M");
        LocalTime agora = LocalTime.now();

        LocalTime horaPrevistaEntrega = agora.plus(tempoMedioEntrega)
            .truncatedTo(ChronoUnit.MINUTES); // trunca em minutos, eliminando os segundos.

        System.out.println("\nTempo médio de entrega: " + tempoMedioEntrega);
        System.out.println("Hora atual: " + agora.truncatedTo(ChronoUnit.MINUTES));
        System.out.println("Somando a hora atual com o tempo médio de entrega: " + horaPrevistaEntrega);

    }
}
