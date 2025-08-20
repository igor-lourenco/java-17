package com.java17._15_dateTimeAPIMaisNovaEModerna.year;

import java.time.LocalDate;
import java.time.Period;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;

public class RepresentandoAno {

    public static void main(String[] args) {

        Year ano = Year.now();
        System.out.println("\nQual o ano atual: " + ano);

        ano = Year.of(2023);
        System.out.println("Especificando o ano: " + ano);

        ano = Year.from(LocalDate.of(2021, 10, 8));
        System.out.println("Ano a partir de um LocalDate: " + ano);

        ano = Year.parse("2020");
        System.out.println("Ano a partir de uma String: " + ano);


        System.out.println("\n==========================================================\n");

        ano = Year.of(2023);
        System.out.printf("Ano %s é bissexto: %b%n", ano, ano.isLeap());

        ano = Year.of(2024);
        System.out.printf("Ano %s é bissexto: %b%n", ano, ano.isLeap());

        System.out.println("\n==========================================================\n");

        ano = Year.of(2023);
        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate diaDoProgramador = ano.atDay(256);

        System.out.printf("Dia do programador é no dia %d do ano %s e cai na data %s%n", 256, ano, diaDoProgramador.format(f));


        ano = Year.of(2024);
        diaDoProgramador = ano.atDay(256);

        System.out.printf("Dia do programador é no dia %d do ano bissexto %s e cai na data %s%n", 256, ano, diaDoProgramador.format(f));


        System.out.println("\n==========================================================\n");

        Year anoFuturo = ano.plus(Period.parse("P10Y"));
        System.out.printf("Ano %s, adicionando 10 anos: %s%n", ano, anoFuturo);

        anoFuturo = ano.plus(10, ChronoUnit.CENTURIES);
        System.out.printf("Ano %s, adicionando 10 séculos: %s%n", ano, anoFuturo);

        anoFuturo = ano.plusYears(10);
        System.out.printf("Ano %s, adicionando 10 anos: %s%n", ano, anoFuturo);


    }
}
