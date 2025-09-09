package com.java17._21_manipulandoArquivosComNIO2;

import java.nio.ByteBuffer;
import java.util.Arrays;

public class _11_EntendendoOsBuffersEUsandoByteBuffer {

    public static void main(String[] args) {
        System.out.println();

        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB

        System.out.println("1. Limite do buffer: " + buffer.limit());
        System.out.println("\n2. Posição atual do array: " + buffer.position());

        System.out.println("3. Adicionando valor 10");
        buffer.put((byte) 10);

        System.out.println("4. Posição atual do array: " + buffer.position());

        System.out.println("5. Adicionando valor 20");
        buffer.put((byte) 20);

        System.out.println("6. Posição atual do array: " + buffer.position());

        System.out.println("\n7.Imprimindo array:");
        System.out.println(Arrays.toString(buffer.array()));

        System.out.println("\n8. Voltando o ponteiro para a posição inicial do array e alterando limite do buffer a partir da posição do ponteiro:");
        buffer.flip();

        System.out.println("9. Limite do buffer: " + buffer.limit());

        System.out.println("\n10. Posição atual do array: " + buffer.position());

        System.out.println("11. Adicionando valor 30");
        buffer.put((byte) 30);

        System.out.println("12. Posição atual do array: " + buffer.position());

        System.out.println("13. Adicionando valor 40");
        buffer.put((byte) 40);

        System.out.println("14. Posição atual do array: " + buffer.position());

//        buffer.put((byte) 50); // Solta exception BufferOverflowException, porque o limite do buffer foi alterado de 1024 para 2

        System.out.println("\n15. Imprimindo array:");
        System.out.println(Arrays.toString(buffer.array()));

        System.out.println("\n16. Limpando buffer, zerando a posição, e o limite é definido como a capacidade");
        buffer.clear();

        System.out.println("17. Limite do buffer: " + buffer.limit());

    }
}
