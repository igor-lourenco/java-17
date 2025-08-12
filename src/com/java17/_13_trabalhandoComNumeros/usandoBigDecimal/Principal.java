package com.java17._13_trabalhandoComNumeros.usandoBigDecimal;


import java.math.BigDecimal;

public class Principal {

    public static void main(String[] args) {
        double valorTotal = 2.05;
        double valorPago = 1.05;

        double valorDevido = valorTotal - valorPago;

//        System.out.println("Valor devido: " + valorDevido); // 0.9999999999999998

//        ContaCorrente contaCorrente = new ContaCorrente();
//        contaCorrente.depositar(1.0);

//        contaCorrente.sacar(0.10);
//        contaCorrente.sacar(0.20);
//        contaCorrente.sacar(0.30);
//        contaCorrente.sacar(0.40);

//        System.out.println("Saldo: " + contaCorrente.getSaldo()); // 0.39999999999999997


//      TODO: Usando BigDecimal
        BigDecimal valorTotal2 = new BigDecimal("2.05");
        BigDecimal valorPago2 = new BigDecimal("1.05");

        BigDecimal valorDevido2 = valorTotal2.subtract(valorPago2);

        System.out.println(valorDevido2);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(new BigDecimal("1.0"));

        contaCorrente.sacar(new BigDecimal("0.10"));
        contaCorrente.sacar(new BigDecimal("0.20"));
        contaCorrente.sacar(new BigDecimal("0.30"));
        contaCorrente.sacar(new BigDecimal("0.40"));

        System.out.println("Saldo: " + contaCorrente.getSaldo());





    }
}
