package com.java17._15_dateTimeAPIMaisNovaEModerna.desafioLocalTimeLocalDateELocalDateTime;

import com.java17._15_dateTimeAPIMaisNovaEModerna.desafioLocalTimeLocalDateELocalDateTime.exceptions.DataInvalidaException;
import com.java17._15_dateTimeAPIMaisNovaEModerna.desafioLocalTimeLocalDateELocalDateTime.exceptions.HorarioInvalidoException;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\nEntre com os dados para agendar evento:");
        LocalDate dataDoEvento = null;
        LocalTime horarioDoEvento = null;

        do {
            try {
                if (null == dataDoEvento) dataDoEvento = getDataDoEvento(scanner);

                horarioDoEvento = getHorarioDoEvento(scanner);

            } catch (DataInvalidaException e) {
                System.out.println("Data inválida. Tente novamente");
            } catch (HorarioInvalidoException e) {
                System.out.println("Horário inválido. Tente novamente");
            }
        } while (null == dataDoEvento || null == horarioDoEvento);


        DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.FULL, FormatStyle.SHORT);
        LocalDateTime dataEHorarioDoAgendamento = LocalDateTime.of(dataDoEvento, horarioDoEvento);

        System.out.println("\nEvento agendado para " + formatter.format(dataEHorarioDoAgendamento));
        System.out.println("Fim! :)");
    }

    private static LocalDate getDataDoEvento(Scanner scanner) {
        try {
            System.out.print("Data do evento: ");
            return LocalDate.parse(scanner.next(), DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT)); //dd/MM/yyyy
        } catch (DateTimeParseException e) {
            throw new DataInvalidaException(e.getMessage(), e.getParsedString(), e.getErrorIndex());
        }
    }

    private static LocalTime getHorarioDoEvento(Scanner scanner) {
        try {
            System.out.print("Horário do evento: ");
            return LocalTime.parse(scanner.next(), DateTimeFormatter.ofLocalizedTime(FormatStyle.SHORT)); //HH:mm
        } catch (DateTimeParseException e) {
            throw new HorarioInvalidoException(e.getMessage(), e.getParsedString(), e.getErrorIndex());

        }
    }
}
