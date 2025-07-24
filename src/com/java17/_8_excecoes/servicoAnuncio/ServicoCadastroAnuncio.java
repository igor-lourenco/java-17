package com.java17._8_excecoes.servicoAnuncio;

import com.java17._8_excecoes.servicoAnuncio.exception.CadastroAnuncioException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ServicoCadastroAnuncio {

    public void cadastrar(String codigo, String descricao){
        Path arquivo = Path.of("C:\\temp\\especialista-java\\abc\\java-17", codigo + ".txt");

        try {
            Files.writeString(arquivo, descricao);
        } catch (IOException e) {
            System.out.println("Erro ao criar arquivo: " + arquivo);
            throw new CadastroAnuncioException("Erro ao criar ou escrever arquivo: " + arquivo, e);
        }
    }
}
