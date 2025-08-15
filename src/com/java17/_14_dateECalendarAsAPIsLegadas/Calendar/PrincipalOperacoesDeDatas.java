package com.java17._14_dateECalendarAsAPIsLegadas.Calendar;

import java.util.Calendar;

public class PrincipalOperacoesDeDatas {

    public static void main(String[] args) {


        Calendar calendar = Calendar.getInstance();
        System.out.println("\nData e hora atual: " + calendar.getTime());

        calendar.set(Calendar.DAY_OF_MONTH, 20);
        System.out.println("Alterando para o dia 20: " + calendar.getTime());

        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        System.out.println("Alterando o mes para Janeiro: " + calendar.getTime());

        int ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("\nExtraindo o ultimo dia do mes da data: " + ultimoDiaDoMes);

        calendar.set(Calendar.DAY_OF_MONTH, ultimoDiaDoMes);
        System.out.println("Alterando para o ultimo dia do mes: " + calendar.getTime());

        calendar.set(Calendar.MONTH, Calendar.FEBRUARY);
        System.out.println("Alterando o mes para Fevereiro: " + calendar.getTime()); // Vai pular pro mes de março porque nao tem dia 31 em fevereiro

        ultimoDiaDoMes = calendar.getActualMaximum(Calendar.DAY_OF_MONTH);
        System.out.println("\nExtraindo o ultimo dia do mes da data: " + ultimoDiaDoMes);

        calendar.add(Calendar.MONTH, 2);
        System.out.println("Acrescentando 2 meses: " + calendar.getTime());

        calendar.add(Calendar.MONTH, -1);
        System.out.println("Subtraindo 1 mes: " + calendar.getTime());
    }
}
