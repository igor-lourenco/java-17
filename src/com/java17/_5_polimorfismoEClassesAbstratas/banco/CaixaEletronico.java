package com.java17._5_polimorfismoEClassesAbstratas.banco;

public class CaixaEletronico {


    public static final double TARIFA_TRANSFERENCIA = 10.0;
    public static final double TARIFA_IMPRESSAO_DEMONSTRATIVO = 5.0;

    public void transferir(Conta contaOrigem, Conta contaDestino, double valorTransferencia){

        System.out.println();
        System.out.printf("Transferindo R$%.2f da conta %d/%d para %d/%d%n",
                valorTransferencia, contaOrigem.getAgencia(), contaOrigem.getNumero(),
                contaDestino.getAgencia(), contaDestino.getNumero());


        contaOrigem.sacar(valorTransferencia + TARIFA_TRANSFERENCIA);
        contaDestino.depositar(valorTransferencia);
    }


    public void imprimirDemonstrativo(Conta conta) {

//          instanceof pode ser o mesmo que = é uma
//          conta é uma ContaInvestimento
//        if (conta instanceof ContaInvestimento contaInvestimento
//                && contaInvestimento.getValorTotalRendimentos() > 0) {
//
//            System.out.println("Impressao do demonstrativo e gratuita para conta investimento que tenha rendimentos");
//
//        } else {
//
//            System.out.println();
//            System.out.printf("Custo da impressao: R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
//            conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
//        }


//      Evitando o uso do instanceof
        if (conta.possuiGratuidadeDeImpressao()) {
            System.out.println("Impressao do demonstrativo e gratuita para conta investimento que tenha rendimentos");

        } else {
            System.out.println();
            System.out.printf("Custo da impressao: R$%.2f%n", TARIFA_IMPRESSAO_DEMONSTRATIVO);
            conta.sacar(TARIFA_IMPRESSAO_DEMONSTRATIVO);
        }

        conta.imprimirDemonstrativo();
    }
}
