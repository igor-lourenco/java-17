package com.java17._25_concorrencia._8_Executors_ScheduledExecutorService;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.concurrent.TimeUnit;

public class Run implements Runnable {
    private static DateTimeFormatter formatter = DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM);

    @Override
    public void run() {
        System.out.println(LocalTime.now().format(formatter) + " beep");

        try {
            System.out.printf("Interrompendo a thread [%s] por 3 seg...%n", Thread.currentThread().getName());
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
