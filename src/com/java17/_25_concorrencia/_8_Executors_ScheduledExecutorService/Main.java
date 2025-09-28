package com.java17._25_concorrencia._8_Executors_ScheduledExecutorService;

import java.time.Instant;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {

//  Cria um pool de threads que pode agendar comandos para serem executados após um determinado atraso ou para serem executados periodicamente.
    private static final ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);


    public static void main(String[] args) {
        System.out.println(LocalTime.now().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
        beeper();
    }


    private static void beeper() {
        Instant tempoInicial = Instant.now();
        int delay = 10; // tempo atraso para iniciar a execução do scheduler
        TimeUnit unidadeDeTempo = TimeUnit.SECONDS; // unidade de tempo de atraso

        ScheduledFuture<?> scheduledFuture = agendaBaseadoNoTerminoDaExecucaoAnteriorMaisDelay(); // Executa indefinidamente
//        ScheduledFuture<?> scheduledFuture = agendaBaseadoNoTempoInicialFixo(); // Executa indefinidamente

        executorService.schedule(() -> { // Executa apenas uma vez

            System.out.printf(">>> [%s] Cancelando o agendador...%n", Thread.currentThread().getName());
            scheduledFuture.cancel(false);

            executorService.shutdown(); // inicia o desligamento das threads

            long segundos = Instant.now().minusMillis(tempoInicial.toEpochMilli()).getEpochSecond();
            System.out.printf("%nTempo: %d seg...%n", segundos);

        }, delay, unidadeDeTempo);

    }

/*  Agenda baseado no término da execução anterior + delay.
    Nunca sobrepõe execuções.*/
    private static ScheduledFuture<?> agendaBaseadoNoTerminoDaExecucaoAnteriorMaisDelay() {
        int delayInicial = 1;
        int periodo = 1;

        System.out.printf(">>> [%s] Executando agenda baseado no termino da execucao anterio + delay%n", Thread.currentThread().getName());
        return executorService.scheduleWithFixedDelay(new Run(),
            delayInicial, periodo, TimeUnit.SECONDS); // Executa indefinidamente
    }


/*  Agenda baseado no tempo inicial fixo (ex.: a cada 1s, independente de quanto demorou a tarefa).
    Se a tarefa demora mais do que o período, as execuções podem acabar encavalando (executadas em sequência, sem respeitar exatamente a taxa).*/
    private static ScheduledFuture<?> agendaBaseadoNoTempoInicialFixo() {
        int delayInicial = 1;
        int periodo = 1;

        System.out.printf(">>> [%s] Executando agenda baseado no tempo inicial fixo%n", Thread.currentThread().getName());
        return executorService.scheduleAtFixedRate(new Run(),
            delayInicial, periodo, TimeUnit.SECONDS); // Executa indefinidamente

    }
}
