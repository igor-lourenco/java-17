package com.java17._14_dateECalendarAsAPIsLegadas;

import java.util.Date;

public class Principal {

    public static void main(String[] args) {

        int dia = 24 * 60 * 60 * 1000;

        Date data = new Date(System.currentTimeMillis() - dia);

        System.out.println("Data de ontem: " + data);
    }
}
