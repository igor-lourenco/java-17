package com.java17._14_dateECalendarAsAPIsLegadas.Date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrincipalFormatandoStringParaDate {

    public static void main(String[] args) {
        System.out.println();
        try {
            String dataTexto = "10/05/1996";

            DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            Date date = format.parse(dataTexto);
            System.out.println("Dia, mes e ano: " + date);

            dataTexto = "10/05/1996 16:59";
            format = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            date = format.parse(dataTexto);
            System.out.println("Dia, mes, ano, hora e min: " + date);

        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
