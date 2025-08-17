package com.java17._15_dateTimeAPIMaisNovaEModerna.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatandoTextoparaData {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;

        System.out.println("\nConvertendo String para data (padrao): [2026-10-03]");
        LocalDate data = LocalDate.parse("2026-10-03");
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando ISO_DATE: [2026-10-03]");
        data = LocalDate.parse("2026-10-03", formatter);
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando enum FormatStyle.SHORT: [03/10/2026]");
        data = LocalDate.parse("03/10/2026", formatter.ofLocalizedDate(FormatStyle.SHORT));
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando enum FormatStyle.MEDIUM: [03 de out. de 2026]");
        data = LocalDate.parse("03 de out. de 2026", formatter.ofLocalizedDate(FormatStyle.MEDIUM));
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando enum FormatStyle.LONG: [03 de outubro de 2026]");
        data = LocalDate.parse("03 de outubro de 2026", formatter.ofLocalizedDate(FormatStyle.LONG));
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando enum FormatStyle.FULL: [sábado, 03 de outubro de 2026]");
        data = LocalDate.parse("sábado, 03 de outubro de 2026", formatter.ofLocalizedDate(FormatStyle.FULL));
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando enum FormatStyle.FULL com Locale: [Saturday, October 03, 2026]");
        data = LocalDate.parse("Saturday, October 03, 2026", formatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US));
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando padrao(sem os zeros a esquerda): [9/10/26]");
        data = LocalDate.parse("9/10/26", formatter.ofPattern("d/M/yy"));
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando padrao(com os zeros a esquerda): [09/10/2026]");
        data = LocalDate.parse("09/10/2026", formatter.ofPattern("dd/MM/yyyy"));
        System.out.println(data);


        System.out.println("\nConvertendo String para data usando padrao com texto: [sábado, 03 de outubro de 2026]");
        data = LocalDate.parse("sábado, 03 de outubro de 2026", formatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy"));
        System.out.println(data);

    }
}
