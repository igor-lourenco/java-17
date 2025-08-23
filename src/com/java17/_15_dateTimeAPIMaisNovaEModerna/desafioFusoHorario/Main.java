package com.java17._15_dateTimeAPIMaisNovaEModerna.desafioFusoHorario;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        LocalDate data = null;
        LocalTime hora = null;

        do {
            try {

                if (data == null) data = getLocalDate(scanner);

                hora = getLocalTime(scanner);

            } catch (ErroFormatacaoException e) {
                System.out.println(e.getMessage());
            }

        } while (null == data || null == hora);

        ZonedDateTime dataEHoraBrasilia = ZonedDateTime.of(data, hora, ZoneId.of("America/Sao_Paulo"));
        ZonedDateTime dataEHoraLosAngeles =  ZonedDateTime.of(data, hora, ZoneId.of("America/Los_Angeles"));
        ZonedDateTime dataEHoraJapao=  ZonedDateTime.of(data, hora, ZoneId.of("Japan"));

        DateTimeFormatter f = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy 'às' HH:mm ");

        System.out.println(f.format(dataEHoraBrasilia) + textoHorario(dataEHoraBrasilia));
        System.out.println(f.format(dataEHoraLosAngeles) + textoHorario(dataEHoraLosAngeles));
        System.out.println(f.format(dataEHoraJapao) + textoHorario(dataEHoraJapao));

        scanner.close();
    }

    private static String textoHorario(ZonedDateTime dateTime){
        String regiao = switch (dateTime.getZone().getId()){
          case "America/Sao_Paulo" -> "Brasília";
          case "America/Los_Angeles" -> "Pacífico";
          case "Japan" -> "Japão";
            default -> throw new IllegalArgumentException("Nenhum região encontrada");
        };

        boolean emHorarioDeVerao = dateTime.getZone()
            .getRules().isDaylightSavings(dateTime.toInstant());

        return "(Horário " + (emHorarioDeVerao ? "de Verão ": "Padrão ") + regiao + ")";
    }

    private static LocalDate getLocalDate(Scanner scanner) {
        try {
            System.out.print("Data local da festa: ");
            return LocalDate.parse(scanner.next(),
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT));
        } catch (DateTimeParseException e) {
            throw new ErroFormatacaoException("Data inválida. Tente novamente");
        }
    }

    private static LocalTime getLocalTime(Scanner scanner) {
        try {
            System.out.print("Horário local da festa: ");
            return LocalTime.parse(scanner.next(),
                DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT));
        } catch (DateTimeParseException e) {
            throw new ErroFormatacaoException("Hora inválida. Tente novamente");
        }
    }
}
