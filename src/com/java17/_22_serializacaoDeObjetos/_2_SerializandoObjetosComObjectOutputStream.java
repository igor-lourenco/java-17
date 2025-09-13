package com.java17._22_serializacaoDeObjetos;

import com.java17._22_serializacaoDeObjetos.modelo.Funcionario;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class _2_SerializandoObjetosComObjectOutputStream {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
            "João",
            LocalDate.parse("1990-01-01"),
            new BigDecimal("100.0"));


        System.out.println();
        System.out.println(funcionario);


        Path pastaBase = Path.of("src\\com\\java17\\_22_serializacaoDeObjetos");
        Path pastaObjetos = pastaBase.resolve(Path.of("objetos"));

        Path arquivoObjetoSerializado = pastaObjetos.resolve(Path.of("joao.ser"));


//      ========================= USANDO A API CLASSICA ================================================================
//        try(var outputStream = new ObjectOutputStream(new FileOutputStream(arquivoObjetoSerializado.toFile()))){
//
//            outputStream.writeObject(funcionario);
//            System.out.printf("Objeto Serializado para o arquivo: %s  :-)%n", arquivoObjetoSerializado);
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }



//      ========================= USANDO A API NIO ================================================================
        try(var outputStream = new ObjectOutputStream(Files.newOutputStream(arquivoObjetoSerializado,
            StandardOpenOption.WRITE, StandardOpenOption.CREATE))){

            outputStream.writeObject(funcionario);
            System.out.printf("Objeto Serializado para o arquivo: %s  :-)%n", arquivoObjetoSerializado);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
