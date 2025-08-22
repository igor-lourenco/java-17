package com.java17._15_dateTimeAPIMaisNovaEModerna;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.chrono.ThaiBuddhistDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {

    public static void main(String[] args) {

        DateTimeFormatter formatarData = DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        DateTimeFormatter formatarDataEHora = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss.SSSSSSSSS");
        DateTimeFormatter formatarHora = DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS");

        LocalDate data = LocalDate.of(1981, 9, 13);
        LocalTime hora = LocalTime.of(23, 54, 10);

        LocalDateTime dataEHora = LocalDateTime.of(data, hora);
        System.out.println("\nData e hora usando o LocalDate e Localtime: " + dataEHora);

        dataEHora = data.atTime(hora);
        System.out.println("Data e hora usando o atTime() do LocalDate: " + dataEHora);

        dataEHora = hora.atDate(data);
        System.out.println("Data e hora usando o atDate() do LocalTime: " + dataEHora);


        dataEHora = LocalDateTime.now();
        data = dataEHora.toLocalDate();
        System.out.println("\nExtraindo apenas a data do LocalDateTime: " + data);
        hora = dataEHora.toLocalTime();
        System.out.println("Extraindo apenas a hora do LocalDateTime: " + hora);


        data = LocalDate.from(dataEHora);
        System.out.println("\nExtraindo apenas a data do LocalDateTime usando o from() do LocalDate: " + data);
        hora = LocalTime.from(dataEHora);
        System.out.println("Extraindo apenas a hora do LocalDateTime usando o from() do LocalTime: " + hora);

        System.out.println("===========================================================================");

        LocalDateTime dataDepoisDeAmanha = dataEHora.plusDays(2);
        boolean ehMaior = dataDepoisDeAmanha.isAfter(dataEHora);
        System.out.printf("%n1. Data [%s] é maior que a data [%s]: %b%n", dataDepoisDeAmanha, dataEHora, ehMaior);

        LocalDateTime dataAntesDeOntem = dataEHora.minusDays(2);
        boolean ehMenor = dataAntesDeOntem.isBefore(dataEHora);
        System.out.printf("%n2. Data [%s] é menor que a data [%s]: %b%n", dataAntesDeOntem, dataEHora, ehMenor);

        boolean ehIgual = dataAntesDeOntem.isEqual(dataDepoisDeAmanha);
        System.out.printf("%n3. Data [%s] é igual que a data [%s]: %b%n", dataAntesDeOntem, dataDepoisDeAmanha, ehIgual);

        ThaiBuddhistDate hojeThai = ThaiBuddhistDate.now();
        System.out.printf("%n4. Data atual do calendário budista: %s%n", hojeThai);

        boolean dataAtualEhIgualAoCalendarioBudista = data.isEqual(hojeThai);
        System.out.printf("%n5. Data atual [%s] é igual a data atual do calendário budista [%s]: %b%n",
            data, hojeThai, dataAtualEhIgualAoCalendarioBudista);

        System.out.println("===========================================================================");
        System.out.println("Obs: LocalDate LocalTime e LocalDateTime não armazenam o fuso horário");

        ZoneId fusoSaoPaulo = ZoneId.of("America/Sao_Paulo");
        ZoneId fusoLosAngeles = ZoneId.of("America/Los_Angeles");
        ZoneId fusoJapao = ZoneId.of("Japan");

        LocalDate dataSaoPaulo = LocalDate.now(fusoSaoPaulo);
        LocalDate dataLosAngeles = LocalDate.now(fusoLosAngeles);
        LocalDate dataJapao = LocalDate.now(fusoJapao);

        System.out.println("\n1. Data atual no fuso horário de São Paulo: " + formatarData.format(dataSaoPaulo));
        System.out.println("2. Data atual no fuso horário de Los Angeles: " + formatarData.format(dataLosAngeles));
        System.out.println("3. Data atual no fuso horário de Japão: " + formatarData.format(dataJapao));


        LocalDateTime dataHoraSaoPaulo = LocalDateTime.now(fusoSaoPaulo);
        LocalDateTime dataHoraLosAngeles = LocalDateTime.now(fusoLosAngeles);
        LocalDateTime dataHoraJapao = LocalDateTime.now(fusoJapao);

        System.out.println("\n4. Data e hora atual no fuso horário de São Paulo: " + formatarDataEHora.format(dataHoraSaoPaulo));
        System.out.println("5. Data e hora atual no fuso horário de Los Angeles: " + formatarDataEHora.format(dataHoraLosAngeles));
        System.out.println("6. Data e hora atual no fuso horário de Japão: " + formatarDataEHora.format(dataHoraJapao));


        LocalTime horaSaoPaulo = LocalTime.now(fusoSaoPaulo);
        LocalTime horaLosAngeles = LocalTime.now(fusoLosAngeles);
        LocalTime horaJapao = LocalTime.now(fusoJapao);

        System.out.println("\n7. Hora atual no fuso horário de São Paulo: " + formatarHora.format(horaSaoPaulo));
        System.out.println("8. Hora atual no fuso horário de Los Angeles: " + formatarHora.format(horaLosAngeles));
        System.out.println("9. Hora atual no fuso horário de Japão: " + formatarHora.format(horaJapao));

    }
}
