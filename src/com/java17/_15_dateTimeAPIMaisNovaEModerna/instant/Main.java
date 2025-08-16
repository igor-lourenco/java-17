package com.java17._15_dateTimeAPIMaisNovaEModerna.instant;

import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class Main {

    public static void main(String[] args) {

//      Representa um instante no tempo, com precisão em nanossegundos
        Instant instante = Instant.now();

        System.out.println("\nMilissegundos usando o System: " + System.currentTimeMillis());

        System.out.println("\nInstante no tempo: " + instante);
        System.out.println("Quantos segundos ja se passaram desde 1970 em UTC: " + instante.getEpochSecond());
        System.out.println("Parte fracionaria do segundo em nanossegundos.: " + instante.getNano());
        System.out.println("Quantos milissegundos ja se passaram desde 1970 em UTC: " + instante.toEpochMilli());


        Date data1 = Date.from(instante);
        System.out.println("\nConvertendo Instant em Date: " + data1);

        Date data2 = new Date();
        System.out.println("\nDate: " + data2);
        System.out.println("Convertendo Date em Instant: " + data2.toInstant());

        Calendar calendar = Calendar.getInstance();
        System.out.println("\nCalendar: " + calendar.getTime());
        System.out.println("Convertendo Calendar em Instant: " + calendar.toInstant());
    }
}
