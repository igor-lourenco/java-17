package com.java17._3_encapsulamentoEJavaBeansERecords;

import com.java17._3_encapsulamentoEJavaBeansERecords.servico.ServicoDeDepositoPix;
import com.java17._3_encapsulamentoEJavaBeansERecords.servico.ServicoDePagamentoOnline;

public class Main {

    public static void main(String[] args) {

        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Joao Green");


        var servicoDeDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuaDeposito(cartao, 500);

        reciboDeposito.imprimir();

        var servicoDePagamentoOnline = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamentoOnline.efetuaPagamento(supermercado, cartao, 100);

        reciboPagamento.imprimir();


        System.out.println();
        System.out.printf("Titular: %s%n", cartao.getTitular());
        System.out.printf("Saldo: R$%.2f%n", cartao.getSaldo());

    }
}
