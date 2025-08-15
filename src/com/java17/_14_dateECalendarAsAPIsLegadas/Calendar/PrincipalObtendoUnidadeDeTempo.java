package com.java17._14_dateECalendarAsAPIsLegadas.Calendar;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class PrincipalObtendoUnidadeDeTempo {

    public static void main(String[] args) {
        try {

            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            Scanner scanner = new Scanner(System.in);

            System.out.println();
            System.out.print("Data de nascimento: ");
            String dataNascimentoTexto = scanner.next();

            Date dataNascimento = dateFormat.parse(dataNascimentoTexto);

            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dataNascimento);

            System.out.println("Data: " + calendar.getTime());

            int mesExtraido = calendar.get(Calendar.MONTH);
            int diaDoMesExtraido = calendar.get(Calendar.DAY_OF_MONTH);
            int diaDoAnoExtraido = calendar.get(Calendar.DAY_OF_YEAR);

            if (mesExtraido == Calendar.DECEMBER && diaDoMesExtraido == 25) {
                System.out.println("Voce nasceu no Natal! Ho ho ho :)");
            } else {
                if (diaDoAnoExtraido == 256) {
                    System.out.println("Voce nasceu no dia do programador! Hello world :)");
                }
            }

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
