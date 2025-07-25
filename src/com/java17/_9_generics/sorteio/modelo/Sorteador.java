package com.java17._9_generics.sorteio.modelo;

import java.util.Random;

public class Sorteador {

    private static final Random RANDOM = new Random();


    public static <T> T sortear(T... objetos){
        if(objetos.length == 0){
            throw new IllegalArgumentException("Minimo de um objeto requerido");
        }

        int posicao = RANDOM.nextInt(objetos.length);
        return objetos[posicao];
    }
}
