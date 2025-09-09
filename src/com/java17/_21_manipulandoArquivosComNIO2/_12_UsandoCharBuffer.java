package com.java17._21_manipulandoArquivosComNIO2;

import java.nio.CharBuffer;
import java.util.Arrays;

public class _12_UsandoCharBuffer {

    public static void main(String[] args) {
        System.out.println();

        CharBuffer buffer = CharBuffer.allocate(1000); // 1000 caracteres

        System.out.println("1. Limite do buffer: " + buffer.limit());
        System.out.println("2. Posição atual do array: " + buffer.position());

        String olaText = "Olá";

        olaText.chars().forEach(ola -> buffer.put((char) ola));

//        buffer.put('O');
//        buffer.put('l');
//        buffer.put('á');

        System.out.println("\n3.Imprimindo array:");
        System.out.println(Arrays.toString(buffer.array()));

        System.out.println("\n4. Voltando o ponteiro para a posição inicial do array e alterando limite do buffer a partir da posição do ponteiro:");
        buffer.flip();

        System.out.println("5. Limite do buffer: " + buffer.limit());
        System.out.println("6. Posição atual do array: " + buffer.position());

        System.out.println("\n7.Imprimindo array com Stream:");
        buffer.chars().forEach(c -> System.out.print((char) c));

        System.out.println("\n8.Imprimindo array com toString:");
        System.out.println(buffer);
    }
}
