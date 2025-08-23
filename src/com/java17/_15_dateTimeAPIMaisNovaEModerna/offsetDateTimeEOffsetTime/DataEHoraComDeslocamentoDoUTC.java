package com.java17._15_dateTimeAPIMaisNovaEModerna.offsetDateTimeEOffsetTime;

import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

public class DataEHoraComDeslocamentoDoUTC {

    public static void main(String[] args) {

        OffsetDateTime dataHora = OffsetDateTime.now();
        System.out.println("\nData e hora com deslocamento do UTC: " + dataHora);
        System.out.println("Extraindo o deslocamento(offset): " + dataHora.getOffset());

        dataHora = OffsetDateTime.now(ZoneId.of("America/Los_Angeles"));
        System.out.println("\nPassando o ZoneId para ser convertido para OffsetDateTime: " + dataHora);

        dataHora = OffsetDateTime.now(ZoneOffset.ofHours(5));
        System.out.println("\nAdicionando 5 horas a frente UTC: " + dataHora);

        dataHora = OffsetDateTime.parse("2023-09-13T20:00:00-03:00");
        System.out.println("\nConvertendo String para OffsetDateTime: " + dataHora);

        System.out.println("========================================================");

        OffsetTime hora = OffsetTime.now();
        System.out.println("\nHora com deslocamento(offset) do UTC: " + hora);
    }
}
