package com.java17._15_dateTimeAPIMaisNovaEModerna.localTime;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class FormatandoHora {

    public static void main(String[] args) {

        LocalTime hora = LocalTime.now();
        System.out.println("\nData: " + hora);

        DateTimeFormatter formatter = DateTimeFormatter.ISO_TIME;
        System.out.println("\nFormatando LocalTime no formato padrao: " + formatter.format(hora));

        System.out.println("Formatando LocalTime para apenas data passando o DateTimeFormatter: " + hora.format(DateTimeFormatter.ISO_TIME));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT);
        System.out.println("\nFormatando LocalTime com enum FormatStyle SHORT na data: " + formatter.format(hora));

        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);
        System.out.println("Formatando LocalTime com enum FormatStyle MEDIUM na data: " + formatter.format(hora));

//      ========================================================================================================================
//        Observação: O LocalTime com FormatStyle.LONG e FormatStyle.FULL tem que ter especificar o ZoneId, senão solta exceção

//        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.LONG);
//        System.out.println("Formatando LocalTime com enum FormatStyle LONG na data: " + formatter.format(hora));
//
//        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.FULL);
//        System.out.println("Formatando LocalTime com enum FormatStyle FULL na data: " + formatter.format(data));
//      ========================================================================================================================

        formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM).withLocale(Locale.US);
        System.out.println("Formatando LocalDateTime com enum FormatStyle MEDIUM na data passando Locale: " + formatter.format(hora));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        formatter = DateTimeFormatter.ofPattern("H:m:s");
        System.out.println("\nFormatando LocalTime, criando padrao(sem os zeros a esquerda): " + formatter.format(hora));

        formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Formatando LocalTime, criando padrao(com os zeros a esquerda): " + formatter.format(hora));

        formatter = DateTimeFormatter.ofPattern("HH' horas' mm 'minutos' ss 'segundos e' SSSSSSSSS 'nanossegundos'");
        System.out.println("Formatando LocalTime, criando padrao com texto: " + formatter.format(hora));

    }
}
