package com.java17._3_encapsulamentoEJavaBeansERecords;

public class Cartao {


    public static final double TARIFA_DEPOSITO = 0.10;
    public static final double VALOR_MINIMO_DEPOSITO = 50;


    private String titular;
    private double saldo;

    public Cartao(String titular){
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void debitar(double valorDebito){

        if (getSaldo() < valorDebito){
            throw new RuntimeException("Saldo insuficiente para o pagamento");
        }

        saldo = saldo - valorDebito;
    }

    public  void depositar(double valorDeposito){

        if(valorDeposito < VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(
                    String.format("Valor de deposito nao pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }

        saldo = saldo + valorDeposito - TARIFA_DEPOSITO;
    }
}
