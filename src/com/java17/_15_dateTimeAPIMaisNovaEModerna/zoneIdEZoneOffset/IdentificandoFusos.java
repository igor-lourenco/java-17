package com.java17._15_dateTimeAPIMaisNovaEModerna.zoneIdEZoneOffset;

import java.time.*;

public class IdentificandoFusos {

    public static void main(String[] args) {

//      ZoneOffset -> Representa o deslocamento de tempo do UTC, não representa uma região específica.
//      ZoneId -> Classe abstrata que representa as regras de conversão de data/hora entre as regiões geográficas, toda região tem um offset.

        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println("\nFuso horário(time-zone) padrão do sistema: " + zoneId);
        System.out.println("Classe : [" + zoneId.getClass() + "]");

        zoneId = ZoneId.of("America/Los_Angeles");
        System.out.println("\nFuso horário(time-zone) de Los Angeles: " + zoneId);
        System.out.println("Classe : [" + zoneId.getClass() + "]");

//        System.out.println("\n----- Lista de Fusos horários(time-zone) que o ZoneId aceita -----\n");
//        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
//
//        for (String zone : availableZoneIds) {
//            System.out.println(zone);
//
//        }

        System.out.println("\n======================================================");

        zoneId = ZoneId.of("-03:00");
        System.out.println("\nOffset(deslocamento) [-03:00]: " + zoneId);
        System.out.println("Classe : [" + zoneId.getClass() + "]");

        zoneId = ZoneOffset.of("-03:00");
        System.out.println("\nOutra forma de Offset(deslocamento) [-03:00]: " + zoneId);
        System.out.println("Classe : [" + zoneId.getClass() + "]");

        zoneId = ZoneOffset.UTC;
        System.out.println("\nOffset(deslocamento) UTC: " + zoneId);
        System.out.println("Classe : [" + zoneId.getClass() + "]");

        zoneId = ZoneOffset.ofHours(-3);
        System.out.println("\nOffset(deslocamento) usando ofHours(-3): " + zoneId);
        System.out.println("Classe : [" + zoneId.getClass() + "]");


        System.out.println("\n======================================================");

        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        LocalDateTime dataEHora = LocalDateTime.parse("2018-02-17T00:00:00");
        ZoneOffset offSaoPaulo = fusoSaoPaulo.getRules().getOffset(dataEHora);

        System.out.printf("Offset(deslocamento) na data %s(nessa data tinha horário de verão) no fuso horário [America/Sao_Paulo]: %s%n", dataEHora, offSaoPaulo);

        dataEHora = LocalDateTime.parse("2018-02-18T00:00:00");
        offSaoPaulo = fusoSaoPaulo.getRules().getOffset(dataEHora);
        System.out.printf("%nOffset(deslocamento) na data %s(nessa data não tinha horário de verão) no fuso horário [America/Sao_Paulo]: %s%n", dataEHora, offSaoPaulo);


        System.out.println("\n======================================================");

        Instant instant = Instant.now();
        System.out.println("\nInstante atual(instante trabalha com UTC): " + instant);

        zoneId = ZoneId.of("America/Sao_Paulo");
        LocalDateTime dateTime = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println("\nInstante atual no fuso horário [America/Sao_Paulo]: " + dateTime);

    }
}
