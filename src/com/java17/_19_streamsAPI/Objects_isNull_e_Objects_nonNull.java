package com.java17._19_streamsAPI;

import java.util.Arrays;
import java.util.Objects;

public class Objects_isNull_e_Objects_nonNull {

    public static void main(String[] args) {

        String[] nomes = {"João", null, "Maria", null, "José"};


        System.out.println("\nImprimindo todos os nomes:");
        Arrays.stream(nomes)
            .forEach(System.out::println);

        System.out.println("\nImprimindo todos os nomes excluindo os nulos:");
        Arrays.stream(nomes)
            .filter(Objects::nonNull)
            .forEach(System.out::println);
    }
}
