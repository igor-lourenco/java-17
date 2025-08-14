package com.java17._14_dateECalendarAsAPIsLegadas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PrincipalFormatandoDateParaString {

    public static void main(String[] args) {

//        Locale.setDefault(Locale.US);

        Date hoje = new Date();

        System.out.println(">>>>>>>>>>>>>>>>>>");
        DateFormat formatador = DateFormat.getDateInstance();
        System.out.println("Data: " + formatador.format(hoje));

        System.out.println(">>>>>>>>>>>>>>>>>>");
        formatador = DateFormat.getDateTimeInstance();
        System.out.println("Data e hora: " + formatador.format(hoje));

        System.out.println(">>>>>>>>>>>>>>>>>>");
        formatador = DateFormat.getTimeInstance();
        System.out.println("Hora: " + formatador.format(hoje));

        System.out.println(">>>>>>>>>>>>>>>>>>");
        formatador = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG);
        System.out.println("Data e Hora completa: " + formatador.format(hoje));

        System.out.println(">>>>>>>>>>>>>>>>>>");
        formatador = DateFormat.getDateTimeInstance(DateFormat.SHORT, DateFormat.SHORT);
        System.out.println("Data e Hora curto: " + formatador.format(hoje));

        System.out.println(">>>>>>>>>>>>>>>>>>");
        formatador = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM);
        System.out.println("Data e Hora com tamanho mesclado: " + formatador.format(hoje));

        System.out.println(">>>>>>>>>>>>>>>>>>");
        formatador = DateFormat.getDateTimeInstance(DateFormat.FULL, DateFormat.FULL);
        System.out.println("Data e Hora completo com fuso horario: " + formatador.format(hoje));

        System.out.println();
        System.out.println("----- Usando SimpleDateFormat ------");
        System.out.println();
//      https://docs.oracle.com/javase/8/docs/api/java/text/SimpleDateFormat.html

        formatador = new SimpleDateFormat("dd"); // com 2 caracter = preenche com zero
        System.out.println("Dia : " + formatador.format(hoje));
        System.out.println(">>>>>>>>>>>>>>>>>>");

        formatador = new SimpleDateFormat("MM"); // com 2 caracter = preenche com zero
        System.out.println("Mes : " + formatador.format(hoje));
        System.out.println(">>>>>>>>>>>>>>>>>>");

        formatador = new SimpleDateFormat("yyyy");
        System.out.println("Ano : " + formatador.format(hoje));
        System.out.println(">>>>>>>>>>>>>>>>>>");

        formatador = new SimpleDateFormat("dd/MM"); // com 2 'd', e 2 'M' = preenche com zero
        System.out.println("Dia e mes: " + formatador.format(hoje));
        System.out.println(">>>>>>>>>>>>>>>>>>");

        formatador = new SimpleDateFormat("dd/MM/yyyy"); // com 2 caracter = preenche com zero
        System.out.println("Dia, mes e ano: " + formatador.format(hoje));
        System.out.println(">>>>>>>>>>>>>>>>>>");

        formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm"); // com 2 caracter = preenche com zero
        System.out.println("Dia, mes, ano, hora e min: " + formatador.format(hoje));
        System.out.println(">>>>>>>>>>>>>>>>>>");

        formatador = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss"); // com 2 caracter = preenche com zero
        System.out.println("Dia, mes, ano, hora, min, seg: " + formatador.format(hoje));
        System.out.println(">>>>>>>>>>>>>>>>>>");

    }
}
