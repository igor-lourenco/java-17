package com.java17._15_dateTimeAPIMaisNovaEModerna.localTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class ObtendoCamposEoEnumChronoField {

    public static void main(String[] args) {

        LocalTime hora = LocalTime.parse("14:10:04");

        System.out.println("\nHora: [14:10:04]: " + hora.getHour());
        System.out.println("Hora passando ChronoField [14:10:04]: " + hora.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Hora usando método do ChronoField [14:10:04]: " + ChronoField.HOUR_OF_DAY.getFrom(hora));
        System.out.println("Hora usando método do ChronoField AM/PM [14:10:04]: " + ChronoField.HOUR_OF_AMPM.getFrom(hora));


        System.out.println("\nMinuto [14:10:04]: " + hora.getMinute());
        System.out.println("Minuto da hora passando ChronoField [14:10:04]: " + hora.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("Minuto da hora usando método do ChronoField [14:10:04]: " + ChronoField.MINUTE_OF_HOUR.getFrom(hora));
        System.out.println("Minuto do dia usando método do ChronoField [14:10:04]: " + ChronoField.MINUTE_OF_DAY.getFrom(hora));


        System.out.println("\nSegundo [14:10:04]: " + hora.getSecond());
        System.out.println("Segundo passando ChronoField [14:10:04]: " + hora.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("Segundo usando método do ChronoField [14:10:04]: " + ChronoField.SECOND_OF_MINUTE.getFrom(hora));
        System.out.println("Segundo do dia usando método do ChronoField [14:10:04]: " + ChronoField.SECOND_OF_DAY.getFrom(hora));


        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        System.out.println("Enums do ChronoField que o LocalDate suporta:");

        ChronoField[] values = ChronoField.values();

        for (ChronoField value : values) {
            if(value.isSupportedBy(hora))
                System.out.println(value.name() + ": " + value.isSupportedBy(hora));
        }
    }
}
