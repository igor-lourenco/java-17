package com.java17._13_trabalhandoComNumeros;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;

public class PrincipalUsandoLocale {

    public static void main(String[] args) {

        double a = 4_142_298.4238;
        float b = 0.3f;
        int c = 1;
        BigDecimal d = new BigDecimal("45.362");
        double e = -20.01;
//
//        NumberFormat decimalFormat = new DecimalFormat(" \u00a4 #,##0.00; \u00a4 -#,##0.00"); // saída com 3 casas decimais, se não existir número depois do ponto não coloca nada
//
//        Locale.setDefault(Locale.US); // usando a localização EUA

//        System.out.println();
//        System.out.println(">>> >>> Usando o simbolo '#' com '0' de formatacao e o separador monetario com smbolo da moeda e os simbolo de negativo  -> ¤ #,##0.00;¤ -#,##0.00 ");
//        System.out.println("[" + a + "]: " + decimalFormat.format(a)); // $ 4,142,298.42
//        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // $ 0.30
//        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // $ 1.00
//        System.out.println("[" + d + "]: " + decimalFormat.format(d));    // $ 45.36
//        System.out.println("[" + e + "]: " + decimalFormat.format(e)); // $ -20.01

//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
//        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");


//        >>> usando a localização Brasil
//        Locale.setDefault(new Locale("pt", "BR"));
//        NumberFormat decimalFormat = new DecimalFormat(" \u00a4 #,##0.00; \u00a4 -#,##0.00"); // saída com 3 casas decimais, se não existir número depois do ponto não coloca nada


//        >>> usando localização para ser usado apenas na formatação
//        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("pt", "BR")); // Brasil
//        DecimalFormatSymbols symbols = new DecimalFormatSymbols(new Locale("en", "US")); // EUA
//        NumberFormat decimalFormat = new DecimalFormat(" \u00a4 #,##0.00; \u00a4 -#,##0.00", symbols); // saída com 3 casas decimais, se não existir número depois do ponto não coloca nada


        // outro exemplo usando formatador pré-definido de moeda com localização
        NumberFormat decimalFormat = NumberFormat.getCurrencyInstance(new Locale("en", "US"));


        System.out.println();
        System.out.println(">>> >>> Usando o simbolo '#' com '0' de formatacao e o separador monetario com símbolo da moeda e os simbolo de negativo  -> ¤ #,##0.00;¤ -#,##0.00 ");
        System.out.println("[" + a + "]: " + decimalFormat.format(a));
        System.out.println("[" + b + "]: " + decimalFormat.format(b));
        System.out.println("[" + c + "]: " + decimalFormat.format(c));
        System.out.println("[" + d + "]: " + decimalFormat.format(d));
        System.out.println("[" + e + "]: " + decimalFormat.format(e));
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
    }
}
