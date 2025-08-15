package com.java17._14_dateECalendarAsAPIsLegadas.desafio;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Data da primeira parcela: ");
            String parcelaInicial = scanner.next();

            System.out.print("Quantidade de parcelas: ");
            int quantidadeParcelas = scanner.nextInt();

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            Date date = dateFormat.parse(parcelaInicial); // converte para Date

            Calendar calendar = new GregorianCalendar();
            calendar.setTime(date); // atribui o date inserido pelo usuario para o tipo Calendar

            System.out.println();

            int diaDaParcela = calendar.get(Calendar.DAY_OF_MONTH);

            for (int i = 1; i <= quantidadeParcelas; i++) {

                System.out.printf("Parcela #%d - %s%n", i, dateFormat.format(calendar.getTime()));

                int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);

                calendar.add(Calendar.MONTH, 1);

                if(ultimoDiaDoMes < diaDaParcela){
                    int diasDeDiferenca = diaDaParcela - ultimoDiaDoMes;
                    calendar.add(Calendar.DAY_OF_MONTH, diasDeDiferenca);
                }
            }

            System.out.println();
            System.out.println("Fim! :)");

        } catch (ParseException e) {
            throw new RuntimeException(e);
        } finally {

            scanner.close();
        }
    }
}
