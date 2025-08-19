package com.java17._15_dateTimeAPIMaisNovaEModerna.period;

import java.time.Period;

public class RepresentandoPeriodos {

    public static void main(String[] args) {

        Period periodo = Period.ofDays(45);
        System.out.println("\nPeríodo de dias [D]: " + periodo);

        periodo = Period.ofWeeks(15);
        System.out.println("Período de semandas [D]: " + periodo);

        periodo = Period.ofMonths(3);
        System.out.println("Período de meses [M]: " + periodo);

        periodo = Period.ofYears(3);
        System.out.println("Período de anos [Y]: " + periodo);

        periodo = Period.of(1, 5, 10);
        System.out.println("Período completo [PY M D]: " + periodo);


        periodo = Period.parse("P2Y5M10D");
        System.out.println("\nPeríodo completo convertendo String para Period [P2Y5M10D]: " + periodo);


        Period periodoCalculado = periodo.minus(Period.ofYears(1));
        System.out.println("\nSubtraindo Períodos: " + periodoCalculado);

        periodoCalculado = periodo.minusYears(1);
        System.out.println("Subtraindo Períodos: " + periodoCalculado);


        periodoCalculado = periodo.plus(Period.ofYears(10));
        System.out.println("\nSomando Períodos: " + periodoCalculado);

        periodoCalculado = periodo.plusYears(10);
        System.out.println("Somando Períodos: " + periodoCalculado);


        periodoCalculado = periodo.multipliedBy(3);
        System.out.println("\nMultiplicando por 3 Período [P2Y5M10D]: " + periodoCalculado);

        periodoCalculado = periodoCalculado.normalized();
        System.out.println("Período com os anos e meses normalizados [P6Y15M30D]: " + periodoCalculado);

        String periodoFormatado = String.format("%d anos, %d meses e %d dias",
            periodoCalculado.getYears(), periodoCalculado.getMonths(), periodoCalculado.getDays());

        System.out.println("Período formatado [P7Y3M30D]: " + periodoFormatado);
    }
}
