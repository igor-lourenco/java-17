package com.java17._13_trabalhandoComNumeros;

public class Principal {

    public static void main(String[] args) {

        int x = 127;
        int y = 127;

        Integer a = 127;
        Integer b = 127;

        System.out.println(x == y);  // true
        System.out.println(a == b);  // true

        x = 128;
        y = 128;

        a = 128;
        b = 128;

        System.out.println();
        System.out.println(x == y);  // true
        System.out.println(a == b);  // false

//      Comparando números de classe Wrapper de forma correta
        System.out.println();
        System.out.println(x == y);  // true
        System.out.println(a.equals(b));  // false
    }
}
