package com.java17._22_serializacaoDeObjetos;

import com.java17._22_serializacaoDeObjetos.modelo.Funcionario;

import java.math.BigDecimal;
import java.time.LocalDate;

public class TornandoClassesSerializaveis {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario(
            "João",
            LocalDate.parse("1990-01-01"),
                new BigDecimal("100.0"));


        System.out.println(funcionario);
    }
}
