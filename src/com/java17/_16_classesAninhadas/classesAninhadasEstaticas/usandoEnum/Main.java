package com.java17._16_classesAninhadas.classesAninhadasEstaticas.usandoEnum;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("Sebastião", 27);

        System.out.println();
        System.out.println("Cliente: " + cliente);

        cliente.setStatus(Cliente.Status.BLOQUEADO);

        System.out.println("Alterando status do cliente: " + cliente);
    }
}
