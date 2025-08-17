package com.java17._15_dateTimeAPIMaisNovaEModerna.localDateTime;

import java.nio.charset.Charset;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatandoTextoParaDataEHora {

    public static void main(String[] args) {

        System.out.println("Encoding padrão da JVM: " + Charset.defaultCharset());

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;

        System.out.println("\nConvertendo String para data e hora (padrao): [2026-10-03T21:03:19]");
        LocalDateTime dataEHora = LocalDateTime.parse("2026-10-03T21:03:19");
        System.out.println(dataEHora);


        System.out.println("\nConvertendo String para data e hora usando ISO_DATE_TIME: [2026-10-03T21:03:19]");
        dataEHora = LocalDateTime.parse("2026-10-03T21:03:19", formatter);
        System.out.println(dataEHora);


        System.out.println("\nConvertendo String para data e hora usando enum FormatStyle.SHORT e FormatStyle.MEDIUM: [03/10/2026 21:03:19]");
        dataEHora = LocalDateTime.parse("03/10/2026 21:03:19", formatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM));
        System.out.println(dataEHora);


        System.out.println("\nConvertendo String para data e hora usando enum FormatStyle.LONG e FormatStyle.MEDIUM: [03 de outubro de 2026 21:03:19]");
        dataEHora = LocalDateTime.parse("03 de outubro de 2026 21:03:19", formatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.MEDIUM));
        System.out.println(dataEHora);


        System.out.println("\nConvertendo String para data e hora usando enum FormatStyle.FULL e FormatStyle.MEDIUM: [sábado, 03 de outubro de 2026 21:03:19]");
        dataEHora = LocalDateTime.parse("sábado, 16 de agosto de 2025 16:45:05", formatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM));
        System.out.println(dataEHora);


        System.out.println("\nConvertendo String para data e hora usando enum FormatStyle.FULL e FormatStyle.MEDIUM com Locale: [Saturday, October 03, 2026, 9:03:19 PM]");
        dataEHora = LocalDateTime.parse("Saturday, October 03, 2026, 9:03:19 PM", formatter.ofLocalizedDateTime(FormatStyle.FULL,FormatStyle.MEDIUM).withLocale(Locale.US));
        System.out.println(dataEHora);


        System.out.println("\nConvertendo String para data e hora usando padrao(sem os zeros a esquerda): [9/10/26 9:3:19]");
        dataEHora = LocalDateTime.parse("9/10/26 9:3:19", formatter.ofPattern("d/M/yy H:m:s"));
        System.out.println(dataEHora);


        System.out.println("\nConvertendo String para data e hora usando padrao(com os zeros a esquerda): [09/10/2026 09:03:19]");
        dataEHora = LocalDateTime.parse("09/10/2026 09:03:19", formatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
        System.out.println(dataEHora);


        System.out.println("\nConvertendo String para data e hora usando padrao com texto: [sábado, 03 de outubro de 2026 as 21hrs 03min e 19seg]");
        dataEHora = LocalDateTime.parse("sábado, 03 de outubro de 2026 as 21hrs 03min e 19seg", formatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'as' HH'hrs' mm'min' 'e' ss'seg'"));
        System.out.println(dataEHora);

    }
}
