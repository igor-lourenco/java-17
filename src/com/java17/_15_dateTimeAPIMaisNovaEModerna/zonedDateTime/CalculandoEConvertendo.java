package com.java17._15_dateTimeAPIMaisNovaEModerna.zonedDateTime;

import java.time.*;

public class CalculandoEConvertendo {

    public static void main(String[] args) {

        ZonedDateTime dataHoraFusoPadrao = ZonedDateTime.now();
        System.out.println("\nData e hora atual com fuso horário: " + dataHoraFusoPadrao);

        LocalDateTime dataHoraSemFuso = dataHoraFusoPadrao.toLocalDateTime();
        System.out.println("Obtendo o LocalDateTime(sem fuso horário): " + dataHoraSemFuso);


        System.out.println("\n====================================================\n");


        LocalDateTime dataLocal = LocalDateTime.parse("2023-09-13T20:00:00");
        System.out.println("Data hora local: " + dataLocal);

        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dataLocalFusoLosAngeles = ZonedDateTime.of(dataLocal, fusoLosAngeles);
        System.out.printf("\nAdicionando fuso horário no LocalDateTime[%s]: %s%n", dataLocal, dataLocalFusoLosAngeles);

        dataLocalFusoLosAngeles = dataLocal.atZone(fusoLosAngeles);
        System.out.printf("Outra forma de adicionar fuso horário no LocalDateTime[%s]: %s%n", dataLocal, dataLocalFusoLosAngeles);


        System.out.println("\n====================================================\n");


        ZonedDateTime dataHoraFusoSaoPaulo = ZonedDateTime
            .parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

        Instant instant = dataHoraFusoSaoPaulo.toInstant();
        System.out.printf("Obtendo o Instant do ZonedDateTime[%s]: %s%n",
            dataHoraFusoSaoPaulo, instant);


        LocalDateTime dateTimeLosAngeles = LocalDateTime.ofInstant(instant, fusoLosAngeles);
        System.out.printf("Obtendo o LocalDateTime já com o fuso horário de Los Angeles do Instant[%s]: %s%n",
            instant, dateTimeLosAngeles);


        System.out.println("\n====================================================\n");


        Duration duracaoVoo = Duration.parse("PT12H22M");

        ZonedDateTime dataHoraDecolagem = ZonedDateTime.parse("2022-11-20T20:00:00-03:00[America/Sao_Paulo]");

        ZonedDateTime dataHoraPousoPrevisto = dataHoraDecolagem
            .withZoneSameInstant(ZoneId.of("America/Los_Angeles"))
            .plus(duracaoVoo);

        System.out.printf("Data e hora de decolagem em São Paulo: %s%n", dataHoraDecolagem);
        System.out.printf("Duração do voo: %s hrs e %s min%n", duracaoVoo.toHoursPart(), duracaoVoo.toMinutesPart());
        System.out.printf("Data e hora de pouso previsto em Los Angeles: %s%n", dataHoraPousoPrevisto);



    }
}
