package com.java17._1_gerenciamentoDeMemoria;

import java.util.ArrayList;
import java.util.List;

public class Main6 {
    public static void main(String[] args) {

        imprimirUsoMemoria();

        List<Cliente> cliente = new ArrayList<>();

        // Para esgotar a Memória Heap, lança - OutOfMemoryError
        while (true) {
            cliente.add(new Cliente());
            imprimirUsoMemoria();
        }
    }


    static void imprimirUsoMemoria() {

        System.out.printf("\nMemoria maxima que a JVM pode usar: %s%n", emMegaBytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("\nTotal de memoria que a JVM ja deixou reservado para ser usado: %s%n", emMegaBytes(Runtime.getRuntime().totalMemory()));

        System.out.printf("\nTotal de memoria disponivel que a JVM deixou reservado mas nao esta sendo usado: %s%n", emMegaBytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("\nTotal de memoria que a JVM esta usando: %s%n", emMegaBytes(memoriaUsada));

        System.out.println("------------------------");

    }


    static String emMegaBytes(long bytes) {
        return String.format("%.2fMB", bytes / 1024d / 1024d);
    }
}