package com.java17._3_encapsulamentoEJavaBeansERecords.agenda;

public class Principal {


    public static void main(String[] args) {

        Horario horario = new Horario(10, 55);

        System.out.printf(horario.formata());
    }
}
