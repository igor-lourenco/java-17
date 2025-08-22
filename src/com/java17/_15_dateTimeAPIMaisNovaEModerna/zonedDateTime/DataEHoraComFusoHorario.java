package com.java17._15_dateTimeAPIMaisNovaEModerna.zonedDateTime;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DataEHoraComFusoHorario {

    public static void main(String[] args) {


//      ZonedDateTime -> Representa um instante específico na linha do tempo com fuso horário e com precisão de nanossegundos

        ZonedDateTime dataHorafusoPadrao = ZonedDateTime.now();
        System.out.println("\nData e hora atual com deslocamento(offset) e fuso horário(timeZone): "
            + dataHorafusoPadrao);

        System.out.println("Obtendo o Offset(deslocamento): " + dataHorafusoPadrao.getOffset());
        System.out.println("Obtendo o time zone(fuso horário): " + dataHorafusoPadrao.getZone());

        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZonedDateTime dataHoraLosAngeles = ZonedDateTime.now(fusoLosAngeles);
        System.out.println("\nData e hora atual em Los Angeles com deslocamento(offset) e fuso horário(timeZone): "
            + dataHoraLosAngeles);


        System.out.println("==========================================================\n");

        ZonedDateTime dataEHoraSaoPaulo = ZonedDateTime.parse("2023-09-13T20:00:00-03:00[America/Sao_Paulo]");
        System.out.println("Data e hora em São Paulo: " + dataEHoraSaoPaulo);

        ZonedDateTime dataEHoraLosAngeles = dataEHoraSaoPaulo.withZoneSameInstant(fusoLosAngeles);
        System.out.println("Data e hora em Los Angeles: " + dataEHoraLosAngeles);


        System.out.printf("%nObjeto [%s] é igual ao objeto [%s]: %b",
            dataEHoraSaoPaulo, dataEHoraLosAngeles, dataEHoraSaoPaulo.equals(dataEHoraLosAngeles));

        System.out.printf("%nInstante [%s] é igual ao instante [%s]: %b",
            dataEHoraSaoPaulo, dataEHoraLosAngeles, dataEHoraSaoPaulo.isEqual(dataEHoraLosAngeles));

        System.out.println("\n==========================================================\n");
    }
}
