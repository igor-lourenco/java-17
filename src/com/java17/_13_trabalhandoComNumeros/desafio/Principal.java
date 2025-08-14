package com.java17._13_trabalhandoComNumeros.desafio;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) throws ParseException {

        System.out.println();
        System.out.println("Deixando o Locale.US");
        System.out.println();
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Preco do produto em Dolares: ");
        String dolares = sc.next();

        System.out.print("Preco de 1 Dolar em Reais: ");
        String reais = sc.next();

        System.out.println();

//      >>>>>>>>>>>>>

        Locale eua = new Locale("en", "US");
        DecimalFormatSymbols symbolsEUA = new DecimalFormatSymbols(eua);
        DecimalFormat numberFormatEUA = new DecimalFormat("#,##0.00", symbolsEUA);

        numberFormatEUA.setParseBigDecimal(true);

        BigDecimal valorEmDolares = (BigDecimal) numberFormatEUA.parse(dolares);
        System.out.println("Valor em Dolares convertido para BigDecimal: " + valorEmDolares);

//      >>>>>>>>>>>>>

        Locale br = new Locale("pt", "BR");
        DecimalFormatSymbols symbolsBR = new DecimalFormatSymbols(br);
        DecimalFormat numberFormatBR = new DecimalFormat("#,###.00", symbolsBR);

        numberFormatBR.setParseBigDecimal(true);

        BigDecimal valorEmReais = (BigDecimal) numberFormatBR.parse(reais);
        System.out.println("Valor em Reais convertido para BigDecimal: " + valorEmReais);

        BigDecimal resultado = valorEmDolares.multiply(valorEmReais);

        System.out.println();
        System.out.println("Resultado: " + resultado);

        numberFormatBR = new DecimalFormat("\u00a4 #,###.00", symbolsBR);

        System.out.println();
        System.out.println("Preco do produto em Reais: " + numberFormatBR.format(resultado));

        sc.close();
    }
}
