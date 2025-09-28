package com.java17._25_concorrencia._7_Executors_ThreadPools;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {

        int processadores = Runtime.getRuntime().availableProcessors();
        System.out.println("\nProcessadores disponíveis para a JVM: " + processadores);
        System.out.println();

//      ExecutorService executorService = Executors.newFixedThreadPool(50); // Cria número de threads fixas
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 1; i <= 2000; i++) {
            executorService.execute(new Printer(i));
        }

        executorService.shutdown(); // inicia o desligamento das threads

        while (!executorService.isTerminated()) {} // Segurando a thread main até as outras threads terem sidos finalizadas
        System.out.println("Programa finalizado!!");
    }
}
