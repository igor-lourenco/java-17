package com.java17._15_dateTimeAPIMaisNovaEModerna.localDate;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatandoData {

    public static void main(String[] args) {

        LocalDate data = LocalDate.now();
        System.out.println("\nData: " + data);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE;
        System.out.println("\nFormatando LocalDate no formato padrao: " + formatter.format(data));

        System.out.println("Formatando LocalDate para apenas data passando o DateTimeFormatter: " + data.format(DateTimeFormatter.ISO_DATE));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println("\nFormatando LocalDate com enum FormatStyle SHORT na data: " + formatter.format(data));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        System.out.println("Formatando LocalDate com enum FormatStyle MEDIUM na data: " + formatter.format(data));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println("Formatando LocalDate com enum FormatStyle LONG na data: " + formatter.format(data));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        System.out.println("Formatando LocalDate com enum FormatStyle FULL na data: " + formatter.format(data));

        formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.US);
        System.out.println("Formatando LocalDate com enum FormatStyle FULL na data passando Locale: " + formatter.format(data));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        formatter = DateTimeFormatter.ofPattern("d/M/yy");
        System.out.println("\nFormatando LocalDate, criando padrao(sem os zeros a esquerda): " + formatter.format(data));

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Formatando LocalDate, criando padrao(com os zeros a esquerda): " + formatter.format(data));

        formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy");
        System.out.println("Formatando LocalDate, criando padrao com texto: " + formatter.format(data));
    }
}
