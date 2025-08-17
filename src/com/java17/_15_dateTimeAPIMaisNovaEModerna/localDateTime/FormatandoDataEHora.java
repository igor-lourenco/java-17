package com.java17._15_dateTimeAPIMaisNovaEModerna.localDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatandoDataEHora {

    public static void main(String[] args) {

        LocalDateTime dataEHora = LocalDateTime.now();
        System.out.println("\nData e hora atual:" + dataEHora);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println("\nFormatando LocalDateTime no formato padrao: " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ISO_DATE;
        System.out.println("Formatando LocalDateTime para apenas data: " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ISO_TIME;
        System.out.println("Formatando LocalDateTime para apenas hora: " + formatter.format(dataEHora));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("\nFormatando LocalDateTime no formato padrao passando o DateTimeFormatter  : " + dataEHora.format(DateTimeFormatter.ISO_DATE_TIME));
        System.out.println("Formatando LocalDateTime para apenas data passando o DateTimeFormatter: " + dataEHora.format(DateTimeFormatter.ISO_DATE));
        System.out.println("Formatando LocalDateTime para apenas hora passando o DateTimeFormatter: " + dataEHora.format(DateTimeFormatter.ISO_TIME));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT, FormatStyle.MEDIUM);
        System.out.println("\nFormatando LocalDateTime com enum FormatStyle SHORT na data: " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM, FormatStyle.MEDIUM);
        System.out.println("Formatando LocalDateTime com enum FormatStyle MEDIUM na data: " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG, FormatStyle.MEDIUM);
        System.out.println("Formatando LocalDateTime com enum FormatStyle LONG na data: " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM);
        System.out.println("Formatando LocalDateTime com enum FormatStyle FULL na data: " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.MEDIUM).withLocale(Locale.US);
        System.out.println("Formatando LocalDateTime com enum FormatStyle FULL na data passando Locale: " + formatter.format(dataEHora));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        formatter = DateTimeFormatter.ofPattern("d/M/yy H:m:s");
        System.out.println("\nFormatando LocalDateTime, criando padrao(sem os zeros a esquerda): " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Formatando LocalDateTime, criando padrao(com os zeros a esquerda): " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH:mm:ss");
        System.out.println("Formatando LocalDateTime, criando padrao(com os zeros a esquerda) e string literal: " + formatter.format(dataEHora));

        formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'as' HH'hrs' mm'min' 'e' ss'seg'");
        System.out.println("Formatando LocalDateTime, criando padrao com texto: " + formatter.format(dataEHora));
    }
}
