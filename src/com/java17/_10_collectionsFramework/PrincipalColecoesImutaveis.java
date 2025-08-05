package com.java17._10_collectionsFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PrincipalColecoesImutaveis {

    public static void main(String[] args) {

//      TODO: usando o copyOf()
        List<Integer> numeros1 = new ArrayList<>();
        numeros1.add(1);
        numeros1.add(2);
        numeros1.add(3);
        numeros1.add(4);
        numeros1.add(5);
        List<Integer> numeros2 = List.copyOf(numeros1);
        numeros1.add(6);
        System.out.println(numeros1);
//      Solta exception porque está sendo retornado uma Collection imutável ao invés da nova instância da lista copiada
//      numeros2.add(6);
        System.out.println(numeros2);


//      TODO: usando o of()
        List<Integer> numeros3 = List.of(1,2,3,4,5);
//      Solta exception porque está sendo retornado uma Collection imutável ao invés de uma instância da lista
//      numeros3.add(6);
        System.out.println(numeros3);


//      TODO: usando o emptyList() para listas vazias imutáveis
        List<Integer> numeros4 = Collections.emptyList();
        System.out.println(numeros4);


//      TODO: usando o singletonList() para listas imutáveis com apenas um elemento
        List<Integer> numeros5 = Collections.singletonList(1);
        System.out.println(numeros5);



    }
}
