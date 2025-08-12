package com.java17._13_trabalhandoComNumeros.usandoBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Principal3 {

    public static void main(String[] args) {

        double a = 4_142_298.4238;
        float b = 0.3f;

        int c = 1;
        BigDecimal d = new BigDecimal("45.362");

        NumberFormat decimalFormat = new DecimalFormat("#.###"); // saída com 3 casas decimais, se não existir número depois do ponto não coloca nada

        System.out.println();
        System.out.println(">>> Usando o simbolo '#' de formatacao -> #.###");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); //4142298.424
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // 0.3
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // 1
        System.out.println("[" + d + "]: " + decimalFormat.format(d));    //45.362
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        decimalFormat = new DecimalFormat("000.000"); // saída com 3 casas decimais, se não existir número é colocado o '0'

        System.out.println();
        System.out.println(">>> Usando o simbolo '0' de formatacao -> 000.000");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); //4142298.424
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // 000.300
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // 001.000
        System.out.println("[" + d + "]: " + decimalFormat.format(d));    // 045.362


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        decimalFormat = new DecimalFormat("0.00"); // saída com 2 casas decimais, se não existir número é colocado o '0'

        System.out.println();
        System.out.println(">>> Usando o simbolo '0' de formatacao -> 0.00");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); //4142298.424
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // 0.30
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // 1.00
        System.out.println("[" + d + "]: " + decimalFormat.format(d));    // 45.36

        decimalFormat.setRoundingMode(RoundingMode.HALF_EVEN); // o arredondamento por padrão já é o HALF_EVEN


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        decimalFormat = new DecimalFormat("#,##0.00"); // saída com 2 casas decimais e usando separador monetário, se não existir número não coloca nada

        System.out.println();
        System.out.println(">>> Usando o simbolo '#' com '0' de formatacao e o separador monetario -> #,##0.00");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); //4,142,298.42
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // 0.30
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // 1.00
        System.out.println("[" + d + "]: " + decimalFormat.format(d));    // 45.36


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        decimalFormat = new DecimalFormat("\u00a4 #,##0.00"); // saída com 2 casas decimais e usando separador monetário, se não existir número não coloca nada

        System.out.println();
        System.out.println(">>> Usando o simbolo '#' com '0' de formatacao e o separador monetario com símbolo da moeda -> ¤ #,##0.00");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); // R$ 4,142,298.42
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // R$0.30
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // R$1.00
        System.out.println("[" + d + "]: " + decimalFormat.format(d));    // R$ 45.36


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        decimalFormat = new DecimalFormat("\u00a4 #,##0.00;\u00a4 -#,##0.00"); // saída com 2 casas decimais e usando separador monetário, se não existir número não coloca nada
        double e = -20.01;

        System.out.println();
        System.out.println(">>> Usando o simbolo '#' com '0' de formatacao e o separador monetario com símbolo da moeda e os simbolo de negativo  -> ¤ #,##0.00;¤ -#,##0.00 ");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); // R$ 4,142,298.42
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // R$ 0.30
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // R$ 1.00
        System.out.println("[" + d + "]: " + decimalFormat.format(d));    // R$ 45.36
        System.out.println("[" + e + "]: " + decimalFormat.format(e)); // R$ -20.01


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        decimalFormat = new DecimalFormat("O valor eh \u00a4 #,##0.00;O valor e \u00a4 -#,##0.00"); // saída com 2 casas decimais e usando separador monetário, se não existir número não coloca nada

        System.out.println();
        System.out.println(">>> Misturando texto com o formatador ");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); // O valor eh R$ 4,142,298.42
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // O valor eh R$ 0.30
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // O valor eh R$ 1.00
        System.out.println("[" + d + "]: " + decimalFormat.format(d));    // O valor eh R$ 45.36
        System.out.println("[" + e + "]: " + decimalFormat.format(e)); // O valor eh R$ -20.01


        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        decimalFormat = DecimalFormat.getCurrencyInstance(); // usando instancia de um formatador de moeda

        System.out.println();
        System.out.println(">>> Usando instancia padrao de um formatador de moeda ");
        System.out.println("[" + a + "]: " + decimalFormat.format(a)); // R$ 4,142,298.42
        System.out.println("[" + b + "]: " + decimalFormat.format(b)); // R$ 0.30
        System.out.println("[" + c + "]: " + decimalFormat.format(c)); // R$ 1.00
        System.out.println("[" + d + "]: " + decimalFormat.format(d));    // R$ 45.36
        System.out.println("[" + e + "]: " + decimalFormat.format(e)); // - R$ 20.01

    }
}
