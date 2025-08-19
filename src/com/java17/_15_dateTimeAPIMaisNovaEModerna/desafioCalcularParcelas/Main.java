package com.java17._15_dateTimeAPIMaisNovaEModerna.desafioCalcularParcelas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter f = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        LocalDate dataInicial = null;

        do {
            System.out.print("Data da primeira parcela: ");
            String parcela = scanner.next();

            try {
                dataInicial = LocalDate.parse(parcela, f);
            } catch (DateTimeParseException e) {
                System.out.println("Data inválida. Tente novamente!");
            }

        } while (null == dataInicial);

        System.out.print("Quantidade de parcelas: ");
        int quantidadeParcelas = scanner.nextInt();

        LocalDate dataParcelamento = dataInicial;

        for (int i = 1; i <= quantidadeParcelas; i++) {
            System.out.println("Parcela #" + i + " - " + f.format(dataParcelamento));
            dataParcelamento = dataInicial.plusMonths(i);
        }

        scanner.close();
    }
}
