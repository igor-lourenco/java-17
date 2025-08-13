package com.java17._13_trabalhandoComNumeros;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class PrincipalFormatacaoNumericaCompacta {

    public static void main(String[] args) {

        BigDecimal a = new BigDecimal("245.36");
        BigDecimal b = new BigDecimal("14398.44");
        BigDecimal c = new BigDecimal("201469.34");
        BigDecimal d = new BigDecimal("4142298.98");
        BigDecimal e = new BigDecimal("8044142245.20");


//        Locale.setDefault(Locale.US); // usando a localização EUA
        NumberFormat decimalFormat = NumberFormat.getCompactNumberInstance(
            new Locale("pt", "BR"), NumberFormat.Style.LONG);


        System.out.println();
        System.out.println(">>> ");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); // 245
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // 14 mil
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // 201 mil
        System.out.println("[" + d + "]: " + decimalFormat.format(d)); // 4 milhões
        System.out.println("[" + e + "]: " + decimalFormat.format(e)); // 8 bilhões

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

    }
}
