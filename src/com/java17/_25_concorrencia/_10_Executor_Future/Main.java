package com.java17._25_concorrencia._10_Executor_Future;

import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        try {
            Future<Double> cotacaoDolar = executorService.submit(new CotacaoDolar());

//          faz a thread esperar a execução(conclusão do cálculo) do Callable e em seguida, recupera o resultado.
            Double dolar = cotacaoDolar.get(3, TimeUnit.SECONDS);

            System.out.printf("[%s] - Soma: %d%n", Thread.currentThread().getName(), fazAlgumaCoisa());
            System.out.printf("[%s] - Dólar: $ %.2f%n", Thread.currentThread().getName(), dolar);

        } catch (TimeoutException e) {
            System.out.println(">>> TIMEOUT");
        } finally {

            executorService.shutdown();
        }
    }

    private static long fazAlgumaCoisa() {
        System.out.printf("[%s] chamando método fazAlgumaCoisa%n", Thread.currentThread().getName());

        long soma = 0;
        for (int i = 0; i < 1_000_000; i++) {
            soma = soma + i;
        }

        return soma;
    }
}
