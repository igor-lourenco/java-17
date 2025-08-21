package com.java17._15_dateTimeAPIMaisNovaEModerna.temporalAdjusters;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

public class AlterandoCamposDeObjetosTemporais {

    public static void main(String[] args) {

        LocalDate dataHoje = LocalDate.now();
        System.out.println("\nData de hoje: " + dataHoje);
        System.out.println("===========================================================================");

        LocalDate primeiraSegundaFeiraDoMes = dataHoje
            .with(TemporalAdjusters.firstInMonth(DayOfWeek.MONDAY));

        System.out.printf("%n1. Data da primeira segunda-feira do mês atual [%s]: %s%n", dataHoje, primeiraSegundaFeiraDoMes);
        System.out.println("===========================================================================");

        LocalDate ultimoDiaDoMes = dataHoje
            .with(TemporalAdjusters.lastDayOfMonth());

        System.out.printf("%n2. Data do último dia do mês atual [%s]: %s%n", dataHoje, ultimoDiaDoMes);
        System.out.println("===========================================================================");

        LocalDate proximaSextaFeiraDoMes = dataHoje
            .with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.printf("%n3. Data da próxima sexta-feira a partir da data atual [%s]: %s%n", dataHoje, proximaSextaFeiraDoMes);
        System.out.println("===========================================================================");


        LocalDate segundaFeiraDaPrimeiraSemanaDoMes = dataHoje.with(TemporalAdjusters.dayOfWeekInMonth(1, DayOfWeek.FRIDAY));

        System.out.printf("%n4. Data da sexta-feira da primeira semana do mês atual [%s]: %s%n", dataHoje, segundaFeiraDaPrimeiraSemanaDoMes);
        System.out.println("===========================================================================");

        LocalDate primeiraDiaDomes = dataHoje
            .with(TemporalAdjusters.firstDayOfMonth());

        System.out.printf("%n5. Data do primeiro dia do mês atual [%s]: %s%n", dataHoje, primeiraDiaDomes);
        System.out.println("===========================================================================");

        LocalDate primeiroDiaDoProximoMes = dataHoje
            .with(TemporalAdjusters.firstDayOfNextMonth());

        System.out.printf("%n5. Data do primeiro dia do próximo mês a partir do mês atual [%s]: %s%n", dataHoje, primeiroDiaDoProximoMes);
        System.out.println("===========================================================================");

        LocalDate primeiroDiaDoAno = dataHoje
            .with(TemporalAdjusters.firstDayOfYear());

        System.out.printf("%n6. Data do primeiro dia do ano do ano atual [%s]: %s%n", dataHoje, primeiroDiaDoAno);
        System.out.println("===========================================================================");

        LocalDate ultimoDiaDoAno = dataHoje
            .with(TemporalAdjusters.lastDayOfYear());

        System.out.printf("%n7. Data do último dia do ano do ano atual [%s]: %s%n", dataHoje, ultimoDiaDoAno);
        System.out.println("===========================================================================");

        LocalDate ultimaTercaFeiraDoMes = dataHoje
            .with(TemporalAdjusters.lastInMonth(DayOfWeek.TUESDAY));

        System.out.printf("%n8. Data do último terça-feira do mês atual [%s]: %s%n", dataHoje, ultimaTercaFeiraDoMes);
        System.out.println("===========================================================================");

        LocalDate proximaSextaFeiraDoMesOuSextaAtual = dataHoje
            .with(TemporalAdjusters.next(DayOfWeek.FRIDAY));

        System.out.printf("%n9. Data da próxima sexta-feira a partir da data atual ou hoje se a data atual for sexta-feira [%s]: %s%n", dataHoje, proximaSextaFeiraDoMesOuSextaAtual);
        System.out.println("===========================================================================");

        LocalDate segundaFeiraDaSemanaAtual = dataHoje
            .with(TemporalAdjusters.previous(DayOfWeek.MONDAY));

        System.out.printf("%n10. Data da segunda-feira da semana atual [%s]: %s%n", dataHoje, segundaFeiraDaSemanaAtual);
        System.out.println("===========================================================================");

        LocalDate segundaFeiraDaSemanaAtualOuSegundaAtual = dataHoje
            .with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));

        System.out.printf("%n11. Data da segunda-feira da semana atual ou hoje se a data atual for segunda-feira [%s]: %s%n", dataHoje, segundaFeiraDaSemanaAtualOuSegundaAtual);

    }
}
