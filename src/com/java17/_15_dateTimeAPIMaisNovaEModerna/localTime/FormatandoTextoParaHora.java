package com.java17._15_dateTimeAPIMaisNovaEModerna.localTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatandoTextoParaHora {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;

        System.out.println("\nConvertendo String para hora (padrao): [21:03:19]");
        LocalTime hora = LocalTime.parse("21:03:19");
        System.out.println(hora);


        System.out.println("\nConvertendo String para hora usando ISO_TIME: [21:03:01]");
        hora = LocalTime.parse("21:03:01", formatter);
        System.out.println(hora);


        System.out.println("\nConvertendo String para hora usando enum FormatStyle.SHORT: [21:03]");
        hora = LocalTime.parse("21:03", formatter.ofLocalizedTime(FormatStyle.SHORT));
        System.out.println(hora);


        System.out.println("\nConvertendo String para hora usando enum FormatStyle.MEDIUM: [21:03:19]");
        hora = LocalTime.parse("21:03:19", formatter.ofLocalizedTime(FormatStyle.MEDIUM));
        System.out.println(hora);


        System.out.println("\nConvertendo String para hora usando enum FormatStyle.MEDIUM e Locale: [09:03:19 PM]");
        hora = LocalTime.parse("09:03:19 PM", formatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.US));
        System.out.println(hora);


        System.out.println("\nConvertendo String para hora usando padrao(sem os zeros a esquerda): [9:3:19]");
        hora = LocalTime.parse("9:3:19", formatter.ofPattern("H:m:s"));
        System.out.println(hora);


        System.out.println("\nConvertendo String para hora usando padrao(com os zeros a esquerda): [09:03:19]");
        hora = LocalTime.parse("09:03:19", formatter.ofPattern("HH:mm:ss"));
        System.out.println(hora);


        System.out.println("\nConvertendo String para hora usando padrao com texto: [21 horas 03 minutos 19 segundos e 702812200 nanossegundos]");
        hora = LocalTime.parse("21 horas 03 minutos 19 segundos e 702812200 nanossegundos", formatter.ofPattern("HH' horas' mm 'minutos' ss 'segundos e' SSSSSSSSS 'nanossegundos'"));
        System.out.println(hora);

    }
}
