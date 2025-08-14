package com.java17._13_trabalhandoComNumeros;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class PrincipalDecimalFormatComString {

    public static void main(String[] args) throws ParseException {

        String texto1 = "1.000,43";
        String texto2 = "1,000.43";

        NumberFormat numberFormat1 = new DecimalFormat("#,##0.00");
        Number valor1 = numberFormat1.parse(texto1);

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("en", "US")); // EUA
        NumberFormat numberFormat2 = new DecimalFormat("#,##0.00", symbols);

        Number valor2 = numberFormat2.parse(texto2);

        System.out.println();
        System.out.println(">>> Convertendo String [" + texto1 + "] padrao BR para Number: ");
        System.out.println(valor1.getClass());
        System.out.println("Number: " + valor1);

        System.out.println();
        System.out.println(">>> Convertendo [" + texto2 + "] padrao EUA para Number: ");
        System.out.println(valor2.getClass());
        System.out.println("Number: " + valor2);


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        double valor3 = numberFormat1.parse(texto1).doubleValue();
        double valor4 = numberFormat2.parse(texto2).doubleValue();

        System.out.println();
        System.out.println(">>> Convertendo [" + texto1 + "] padrao BR para Double: ");
        System.out.println(">>> Convertendo [" + texto2 + "] padrao EUA para Double: ");
        System.out.println(valor3);
        System.out.println(valor4);


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


        Locale br = new Locale("pt", "BR");
        Locale eua = new Locale("en", "US");
        DecimalFormatSymbols symbolsBR = new DecimalFormatSymbols(br);
        DecimalFormatSymbols symbolsEUA = new DecimalFormatSymbols(eua);

        texto1 = "1.000,43";
        texto2 = "1,000.43";

        DecimalFormat decimalFormat1 = new DecimalFormat("#,##0.00", symbolsBR);
        DecimalFormat decimalFormat2 = new DecimalFormat("#,##0.00", symbolsEUA);


        // para sempre quando for fazer o parse retornar BigDecimal
        decimalFormat1.setParseBigDecimal(true);
        decimalFormat2.setParseBigDecimal(true);

        BigDecimal valor5 = (BigDecimal) decimalFormat1.parse(texto1);
        BigDecimal total1 = valor5.add(new BigDecimal("1000"));

        BigDecimal valor6 = (BigDecimal) decimalFormat2.parse(texto2);
        BigDecimal total2 = valor6.add(new BigDecimal("1000"));

        System.out.println();
        System.out.println(">>> Convertendo [" + texto1 + "] padrao BR para BigDecimal: ");
        System.out.println(">>> Convertendo [" + texto2 + "] padrao EUA para BigDecimal: ");
        System.out.println(total1);
        System.out.println(total2);
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


    }
}
