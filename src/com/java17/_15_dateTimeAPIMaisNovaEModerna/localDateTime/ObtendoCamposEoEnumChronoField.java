package com.java17._15_dateTimeAPIMaisNovaEModerna.localDateTime;

import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class ObtendoCamposEoEnumChronoField {

    public static void main(String[] args) {

        LocalDateTime dataEhora = LocalDateTime.parse("2023-10-04T14:10:04");
        Locale br = new Locale("pt", "BR");

        System.out.println("\nDia do mês: [2023-10-04T14:10:04]: " + dataEhora.getDayOfMonth());
        System.out.println("Dia do mês passando ChronoField [2023-10-04T14:10:04]: " + dataEhora.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Dia do mês usando método do ChronoField [2023-10-04T14:10:04]: " + ChronoField.DAY_OF_MONTH.getFrom(dataEhora));


        System.out.println("\nNúmero do dia da semana [2023-10-04T14:10:04]: " + dataEhora.getDayOfWeek().getValue());
        System.out.println("Número do dia da semana passando ChronoField [2023-10-04T14:10:04]: " + dataEhora.get(ChronoField.DAY_OF_WEEK));
        System.out.println("Número do dia da semana usando método do ChronoField [2023-10-04T14:10:04]: " + ChronoField.DAY_OF_WEEK.getFrom(dataEhora));
        System.out.println("Nome do dia da semana [2023-10-04T14:10:04]: " + dataEhora.getDayOfWeek().getDisplayName(TextStyle.FULL, br));


        System.out.println("\nDia do ano [2023-10-04T14:10:04]: " + dataEhora.getDayOfYear());
        System.out.println("Dia do ano passando ChronoField [2023-10-04T14:10:04]: " + dataEhora.get(ChronoField.DAY_OF_YEAR));
        System.out.println("Dia do ano usando método do ChronoField [2023-10-04T14:10:04]: " + ChronoField.DAY_OF_YEAR.getFrom(dataEhora));


        System.out.println("\nNúmero do mês [2023-10-04T14:10:04]: " + dataEhora.getMonth().getValue());
        System.out.println("Número do mês passando ChronoField [2023-10-04T14:10:04]: " + dataEhora.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Número do mês usando método do ChronoField [2023-10-04T14:10:04]: " + ChronoField.MONTH_OF_YEAR.getFrom(dataEhora));
        System.out.println("Nome do mês [2023-10-04]: " + dataEhora.getMonth().getDisplayName(TextStyle.FULL, br));


        System.out.println("\nAno [2023-10-04T14:10:04]: " + dataEhora.getYear());
        System.out.println("Ano passando ChronoField[2023-10-04T14:10:04]: " + dataEhora.get(ChronoField.YEAR));
        System.out.println("Ano usando método do ChronoField[2023-10-04T14:10:04]: " + ChronoField.YEAR.getFrom(dataEhora));

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("\nHora: [14:10:04]: " + dataEhora.getHour());
        System.out.println("Hora passando ChronoField [14:10:04]: " + dataEhora.get(ChronoField.HOUR_OF_DAY));
        System.out.println("Hora usando método do ChronoField [14:10:04]: " + ChronoField.HOUR_OF_DAY.getFrom(dataEhora));
        System.out.println("Hora usando método do ChronoField AM/PM [14:10:04]: " + ChronoField.HOUR_OF_AMPM.getFrom(dataEhora));


        System.out.println("\nMinuto [14:10:04]: " + dataEhora.getMinute());
        System.out.println("Minuto da hora passando ChronoField [14:10:04]: " + dataEhora.get(ChronoField.MINUTE_OF_HOUR));
        System.out.println("Minuto da hora usando método do ChronoField [14:10:04]: " + ChronoField.MINUTE_OF_HOUR.getFrom(dataEhora));
        System.out.println("Minuto do dia usando método do ChronoField [14:10:04]: " + ChronoField.MINUTE_OF_DAY.getFrom(dataEhora));


        System.out.println("\nSegundo [14:10:04]: " + dataEhora.getSecond());
        System.out.println("Segundo passando ChronoField [14:10:04]: " + dataEhora.get(ChronoField.SECOND_OF_MINUTE));
        System.out.println("Segundo usando método do ChronoField [14:10:04]: " + ChronoField.SECOND_OF_MINUTE.getFrom(dataEhora));
        System.out.println("Segundo do dia usando método do ChronoField [14:10:04]: " + ChronoField.SECOND_OF_DAY.getFrom(dataEhora));

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        System.out.println("Enums do ChronoField que o LocalDateTime suporta:");

        ChronoField[] values = ChronoField.values();

        for (ChronoField value : values) {
            if(value.isSupportedBy(dataEhora))
                System.out.println(value.name() + ": " + value.isSupportedBy(dataEhora));
        }
    }
}
