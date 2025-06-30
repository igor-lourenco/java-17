package com.java17._1_gerenciamentoDeMemoria;

public class Main2 {
    public static void main(String[] args) {

        imprimirUsoMemoria();

        byte[] x = new byte[500 * 1024 * 1024]; // 500MB
        byte[] y = new byte[500 * 1024 * 1024]; // 500MB

        imprimirUsoMemoria();

        x = y; // associa o 2° objeto referenciado pela variável "y" a "x", deixando o 1° objeto inalcançável e elegível para ser coletado pelo Garbage Collector

        System.gc(); // Sugere que JVM se esforce para reciclar objetos não utilizados, a fim de disponibilizar a memória que eles ocupam para reutilização da JVM.

        imprimirUsoMemoria();
    }


    static void imprimirUsoMemoria(){

        System.out.printf("\nMemoria maxima que a JVM pode usar: %s%n", emMegaBytes(Runtime.getRuntime().maxMemory()));

        System.out.printf("\nTotal de memoria que a JVM ja deixou reservado para ser usado: %s%n", emMegaBytes(Runtime.getRuntime().totalMemory()));

        System.out.printf("\nTotal de memoria disponivel que a JVM deixou reservado mas nao esta sendo usado: %s%n", emMegaBytes(Runtime.getRuntime().freeMemory()));

        long memoriaUsada = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.printf("\nTotal de memoria que a JVM esta usando: %s%n", emMegaBytes(memoriaUsada));

        System.out.println("------------------------");

    }


    static String emMegaBytes(long bytes){
        return String.format("%.2fMB", bytes / 1024d / 1024d );
    }
}