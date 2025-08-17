package com.java17._15_dateTimeAPIMaisNovaEModerna.instant;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormatandoInstant {

    public static void main(String[] args) {

        Instant instant = Instant.now();
        System.out.println("\nInstante atual:" + instant);

        ZoneId zona = ZoneId.of("America/Sao_Paulo");

        DateTimeFormatter formatter = DateTimeFormatter.ISO_INSTANT;
        System.out.println("\nFormatando Instant no formato padrao: " + formatter.format(instant));

        formatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME.withZone(zona);
        System.out.println("Formatando Instant para data e hora: " + formatter.format(instant));

        formatter = DateTimeFormatter.ISO_DATE.withZone(zona);
        System.out.println("Formatando Instant para apenas data: " + formatter.format(instant));

        formatter = DateTimeFormatter.ISO_TIME.withZone(zona);
        System.out.println("Formatando Instant para apenas hora: " + formatter.format(instant));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("\nFormatando Instant no formato padrao passando o DateTimeFormatter  : " + instant.atZone(zona).format(DateTimeFormatter.ISO_INSTANT));
        System.out.println("Formatando Instant no formato data e hora passando o DateTimeFormatter  : " + instant.atZone(zona).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
        System.out.println("Formatando Instant no formato apenas data passando o DateTimeFormatter  : " + instant.atZone(zona).format(DateTimeFormatter.ISO_DATE));
        System.out.println("Formatando Instant no formato apenas hora passando o DateTimeFormatter  : " + instant.atZone(zona).format(DateTimeFormatter.ISO_TIME));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        formatter = DateTimeFormatter.ofPattern("d/M/yy H:m:s").withZone(zona);
        System.out.println("\nFormatando Instant, criando padrao(sem os zeros a esquerda): " + formatter.format(instant));

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss").withZone(zona);
        System.out.println("Formatando Instant, criando padrao(com os zeros a esquerda): " + formatter.format(instant));

        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy 'as' HH:mm:ss", Locale.US).withZone(zona);
        System.out.println("Formatando Instant, criando padrao(com os zeros a esquerda) e string literal: " + formatter.format(instant));

        formatter = DateTimeFormatter.ofPattern("EEEE, dd 'de' MMMM 'de' yyyy 'as' HH'hrs' mm'min' 'e' ss'seg' '['VV']'").withZone(zona);
        System.out.println("Formatando Instant, criando padrao com texto: " + formatter.format(instant));
    }
}
