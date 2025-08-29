package com.java17._18_optional;

import java.util.Optional;
import java.util.OptionalInt;

public class TiposEspeciaisDeOptionalParaTiposPrimitivos {

    public static void main(String[] args) {

        System.out.println("\nUsando Optional com classe wrapper Integer");
        Optional<Integer> resultadoOpt1 = dividirInteger(10, 0);

        resultadoOpt1.ifPresentOrElse(
            resultado -> imprimir(resultado),
            () -> System.out.println("Sem resultado."));


        System.out.println("-------------------------------------------");
        System.out.println("Usando Optional com tipo primitivo int");
        OptionalInt resultadoOpt2 = dividirInt(10, 0);

        resultadoOpt2.ifPresentOrElse(
            resultado -> imprimir(resultado),
            () -> System.out.println("Sem resultado."));
    }


    private static void imprimir(Integer resultado) {
        System.out.println("Resultado: " + resultado);
    }

    private static Optional<Integer> dividirInteger(int x, int y) {
        if (y == 0) return Optional.empty();
        return Optional.of(x / y);
    }

    private static OptionalInt dividirInt(int x, int y) {
        if (y == 0) return OptionalInt.empty();
        return OptionalInt.of(x / y);
    }
}
