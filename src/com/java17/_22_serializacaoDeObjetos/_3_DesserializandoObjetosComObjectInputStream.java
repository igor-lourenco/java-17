package com.java17._22_serializacaoDeObjetos;

import com.java17._22_serializacaoDeObjetos.modelo.Funcionario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class _3_DesserializandoObjetosComObjectInputStream {

    public static void main(String[] args) {

        Path pastaBase = Path.of("src\\com\\java17\\_22_serializacaoDeObjetos");
        Path pastaObjetos = pastaBase.resolve(Path.of("objetos"));

        Path arquivoObjetoSerializado = pastaObjetos.resolve(Path.of("joao.ser"));


//      ========================= USANDO A API CLASSICA ================================================================
        try (var outputStream = new ObjectInputStream(new FileInputStream(arquivoObjetoSerializado.toFile()))) {

//          Funcionario funcionario = (Funcionario) outputStream.readObject();
            if (outputStream.readObject() instanceof Funcionario funcionario) {
                System.out.println("USANDO A API CLASSICA");
                System.out.println("Objeto desserializado:");
                System.out.println(funcionario);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println("======================================================");
//      ========================= USANDO A API NIO ================================================================
        try (var outputStream = new ObjectInputStream(Files.newInputStream(arquivoObjetoSerializado,
            StandardOpenOption.READ))) {

//          Funcionario funcionario = (Funcionario) outputStream.readObject();
            if (outputStream.readObject() instanceof Funcionario funcionario) {
                System.out.println("USANDO A API NIO");
                System.out.println("Objeto desserializado:");
                System.out.println(funcionario);
            }

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
