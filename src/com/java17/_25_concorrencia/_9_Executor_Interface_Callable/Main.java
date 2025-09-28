package com.java17._25_concorrencia._9_Executor_Interface_Callable;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        RandomNumberCallable randomNumberCallable = new RandomNumberCallable();
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Future<String> future = executorService.submit(randomNumberCallable);

        // faz a thread esperar a execução(conclusão do cálculo) do Callable e em seguida, recupera o resultado.
        String s = future.get();

        System.out.printf("Programa finalizado: %s%n", s);
        executorService.shutdown();


    }
}
