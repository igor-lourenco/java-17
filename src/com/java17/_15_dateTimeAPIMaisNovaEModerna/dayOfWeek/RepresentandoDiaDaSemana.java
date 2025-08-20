package com.java17._15_dateTimeAPIMaisNovaEModerna.dayOfWeek;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;

public class RepresentandoDiaDaSemana {

    public static void main(String[] args) {

        DayOfWeek diaDaSemana = DayOfWeek.FRIDAY;
        System.out.println("\nDia da semana: " + diaDaSemana);

        diaDaSemana = DayOfWeek.of(5);
        System.out.println("Dia 5 da semana: " + diaDaSemana);


        diaDaSemana = DayOfWeek.from(LocalDate.now());
        System.out.println("\nDia da semana a partir do LocalDate: " + diaDaSemana);

        diaDaSemana = LocalDate.now().getDayOfWeek();
        System.out.println("Dia da semana a partir do LocalDate: " + diaDaSemana);


        Locale br = new Locale("pt", "BR");
        System.out.println("\nQual o dia da semana: " + diaDaSemana.getDisplayName(TextStyle.FULL, br));

        System.out.println("Qual o dia da semana: " + DateTimeFormatter.ofPattern("EEEE")
            .withLocale(br)
            .format(diaDaSemana));

        System.out.println("\n=============================================");

        DayOfWeek hoje = LocalDate.now().getDayOfWeek();

        System.out.println("Dia da semana hoje: " + hoje.getDisplayName(TextStyle.FULL, br));
        System.out.println("Dia da semana daqui 15 dias: " + hoje.plus(15).getDisplayName(TextStyle.FULL, br));

    }
}
