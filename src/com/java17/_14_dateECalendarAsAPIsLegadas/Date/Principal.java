package com.java17._14_dateECalendarAsAPIsLegadas.Date;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        int dia = 24 * 60 * 60 * 1000;

        Date data = new Date(System.currentTimeMillis() - dia);

        System.out.println("Data de ontem: " + data);

//      >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
//      >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>

        Date hoje = new Date();
        Date ontem = new Date(System.currentTimeMillis() - dia);

        System.out.println();
        System.out.println("Hoje em milissegundos: " + hoje.getTime());
        System.out.println("Ontem em milissegundos: " + ontem.getTime());

        long diferencaDeOntemParaHojeEmMilis = hoje.getTime() - ontem.getTime();

        double diferencaDeOntemParaHojeEmHoras = diferencaDeOntemParaHojeEmMilis / 1000 / 60 / 60;

        System.out.println("Diferenca em milissegundos: " + diferencaDeOntemParaHojeEmMilis);
        System.out.printf("Diferenca em horas: %.2f%n", diferencaDeOntemParaHojeEmHoras);

        System.out.printf("Hoje eh depois de ontem: %b%n", hoje.after(ontem));
        System.out.printf("Hoje eh antes de ontem: %b%n", hoje.before(ontem));
        System.out.printf("Comparacao: %d%n", hoje.compareTo(ontem));

    }
}
