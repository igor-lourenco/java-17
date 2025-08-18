package com.java17._15_dateTimeAPIMaisNovaEModerna.localDate;

import java.time.LocalDate;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.util.Locale;

public class ObtendoCamposEoEnumChronoField {

    public static void main(String[] args) {

        LocalDate data = LocalDate.parse("2023-10-04");
        Locale br = new Locale("pt", "BR");

        System.out.println("\nDia do mês: [2023-10-04]: " + data.getDayOfMonth());
        System.out.println("Dia do mês passando ChronoField [2023-10-04]: " + data.get(ChronoField.DAY_OF_MONTH));
        System.out.println("Dia do mês usando método do ChronoField [2023-10-04]: " + ChronoField.DAY_OF_MONTH.getFrom(data));


        System.out.println("\nNúmero do dia da semana [2023-10-04]: " + data.getDayOfWeek().getValue());
        System.out.println("Número do dia da semana passando ChronoField [2023-10-04]: " + data.get(ChronoField.DAY_OF_WEEK));
        System.out.println("Número do dia da semana usando método do ChronoField [2023-10-04]: " + ChronoField.DAY_OF_WEEK.getFrom(data));
        System.out.println("Nome do dia da semana [2023-10-04]: " + data.getDayOfWeek().getDisplayName(TextStyle.FULL, br));


        System.out.println("\nDia do ano [2023-10-04]: " + data.getDayOfYear());
        System.out.println("Dia do ano passando ChronoField [2023-10-04]: " + data.get(ChronoField.DAY_OF_YEAR));
        System.out.println("Dia do ano usando método do ChronoField [2023-10-04]: " + ChronoField.DAY_OF_YEAR.getFrom(data));


        System.out.println("\nNúmero do mês [2023-10-04]: " + data.getMonth().getValue());
        System.out.println("Número do mês passando ChronoField [2023-10-04]: " + data.get(ChronoField.MONTH_OF_YEAR));
        System.out.println("Número do mês usando método do ChronoField [2023-10-04]: " + ChronoField.MONTH_OF_YEAR.getFrom(data));
        System.out.println("Nome do mês [2023-10-04]: " + data.getMonth().getDisplayName(TextStyle.FULL, br));


        System.out.println("\nAno [2023-10-04]: " + data.getYear());
        System.out.println("Ano passando ChronoField[2023-10-04]: " + data.get(ChronoField.YEAR));
        System.out.println("Ano usando método do ChronoField[2023-10-04]: " + ChronoField.YEAR.getFrom(data));

        System.out.println("\n>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n");

        System.out.println("Enums do ChronoField que o LocalDate suporta:");

        ChronoField[] values = ChronoField.values();

        for (ChronoField value : values) {
            if(value.isSupportedBy(data))
                System.out.println(value.name() + ": " + value.isSupportedBy(data));
        }

    }
}
