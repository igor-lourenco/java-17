package com.java17._13_trabalhandoComNumeros.usandoBigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Principal2 {

    public static void main(String[] args) {

        BigDecimal x = new BigDecimal("10.0");
        BigDecimal y = new BigDecimal("3.0");

//        BigDecimal z = x.divide(y, 4, RoundingMode.UP); // arredonda pra cima
//        BigDecimal z = x.divide(y, 4, RoundingMode.DOWN); // arredonda pra baixo

        BigDecimal z = x.divide(y, 4, RoundingMode.HALF_EVEN);

        System.out.println(z); // 3.3333

//      TODO: Usando o RoundingMode.HALF_EVEN
//      2.524 = 2.52 -> se o ultimo decimal '4' for entre 0 até 4, arredonda para baixo
//      2.526 = 2.53 -> se o ultimo decimal '6' for entre 6 até 9, arredonda para cima
//      2.525 = 2.53 -> se o ultimo decimal '5' for 5, verifica se o numero a esquerda '5' for impar, se sim arredonda para cima
//      2.425 = 2.42 -> se o ultimo decimal '5' for 5, verifica se o numero a esquerda '4' for par, se sim arredonda para baixo

    }
}
