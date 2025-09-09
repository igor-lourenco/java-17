package com.java17._21_manipulandoArquivosComNIO2;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class _13_DecodificandoByteBufferEmCharBuffer {

    public static void main(String[] args) {
        System.out.println();

        ByteBuffer buffer = ByteBuffer.allocate(1024); // 1KB

        buffer.put((byte) 79);
        buffer.put((byte) 108);
        buffer.put((byte) -61);
        buffer.put((byte) -95);

//      Voltando o ponteiro para a posição inicial do array e alterando limite do buffer a
//      partir da posição do ponteiro
        buffer.flip();

        Charset utf8 = StandardCharsets.UTF_8;
        CharBuffer charBuffer =  utf8.decode(buffer);
        System.out.println(charBuffer);

    }
}
