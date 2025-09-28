package com.java17._25_concorrencia._9_Executor_Interface_Callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberCallable implements Callable<String> {

    @Override
    public String call() throws Exception {

        int count = ThreadLocalRandom.current().nextInt(1, 11);

        String thread = Thread.currentThread().getName();
        for (int i = 0; i < count; i++) {
            System.out.printf("%s executando uma tarefa callable...%n", thread);
        }

        return String.format("%s finalizando e retornando numero random: ", thread, count);
    }
}
