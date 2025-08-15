package com.java17._14_dateECalendarAsAPIsLegadas.Calendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Principal {

    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Calendar calendarAtual = Calendar.getInstance();

        Date dataAtual = calendarAtual.getTime();

        System.out.println("Data e hora atual: " + dateFormat.format(dataAtual));

        Calendar calendar = new GregorianCalendar(1996, Calendar.MAY, 10, 16,59, 30);

        Date date = calendar.getTime();

        System.out.println("Data e hora especifica: " + dateFormat.format(date));
    }
}
