package com.java17._15_dateTimeAPIMaisNovaEModerna.desafioPeriodo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate dataNascimento = null;

        do {
            try {
                System.out.print("Data de nascimento: ");
                String data = scanner.next();

                dataNascimento = LocalDate.parse(data, f);

            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente");
            }
        } while (null == dataNascimento);

        Period periodo = Period.between(dataNascimento, LocalDate.now());

        String ano = periodo.getYears() <= 1 ? "ano" : "anos";
        String mes = periodo.getMonths() <= 1 ? "mês" : "meses";
        String dia = periodo.getDays() <= 1 ? "dia" : "dias";

        String print = String.format("%nPaciente tem %d %s, %d %s e %d %s de vida",
            periodo.getYears(), ano, periodo.getMonths(), mes, periodo.getDays(), dia);

        System.out.printf(print);

        scanner.close();

    }
}
