package com.java17._15_dateTimeAPIMaisNovaEModerna.instant;

import java.time.Instant;

public class FormatandoTextoParaInstant {

    public static void main(String[] args) {

        Instant instant = Instant.parse("2010-08-20T19:45:20-00:00");
        System.out.println("\nInstante: " + instant);

        instant = Instant.parse("2010-08-20T19:45:20Z");
        System.out.println("Instante de outra forma mas resultado igual: " + instant);

        instant = Instant.parse("2010-08-20T19:45:20-03:00");
        System.out.println("Instante com OffSet -03:00: " + instant);

    }
}
