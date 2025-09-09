package com.java17._21_manipulandoArquivosComNIO2;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _14_LendoArquivosComByteChannel {

    public static void main(String[] args) {
        System.out.println();

        Path pastaBase = Path.of("src\\com\\java17\\_21_manipulandoArquivosComNIO2");
        Path pastaDocs1 = pastaBase.resolve(Path.of("docs1"));

        Path arquivo = pastaDocs1.resolve(Path.of("arquivo.txt"));

        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB


        try (ByteChannel channel = Files.newByteChannel(arquivo, StandardOpenOption.READ)) {

            System.out.println("1. Limite do buffer: " + buffer.limit());
            System.out.println("2. Posição atual do array: " + buffer.position());

            System.out.println("\n3. Lendo arquivo e adicionando no buffer");
            channel.read(buffer);

            System.out.println("\n4. Limite do buffer: " + buffer.limit());
            System.out.println("5. Posição atual do array: " + buffer.position());

            System.out.println("\n6. Voltando o ponteiro para a posição inicial do array e alterando limite do buffer a partir da posição do ponteiro");
            buffer.flip();

            System.out.println("\n7. Limite do buffer: " + buffer.limit());
            System.out.println("8. Posição atual do array: " + buffer.position());

            Charset utf8 = StandardCharsets.UTF_8;
            CharBuffer charBuffer = utf8.decode(buffer);

            System.out.println("\n9. Atribuindo o ByteBuffer para CharBuffer: " + charBuffer);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
