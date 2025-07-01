package com.java17._3_encapsulamentoEJavaBeansERecords;

import com.java17._3_encapsulamentoEJavaBeansERecords.servico.ServicoDeDepositoPix;
import com.java17._3_encapsulamentoEJavaBeansERecords.servico.ServicoDePagamentoOnline;

public class Main {

    public static void main(String[] args) {

        /* Problemas da falta de encapsulamento:
        *
        * - Violação do princípio de responsabilidade única
        * - Exposição de detalhes internos
        * - Falta de controle na modificação dos dados
        * - Dificuldade em aplicar validações e lógica
        * - entre outros
        * */

        var supermercado = new Estabelecimento("Supermercado do Zé");
        var cartao = new Cartao("Joao Green");

        var servicoDeDeposito = new ServicoDeDepositoPix();
        Recibo reciboDeposito = servicoDeDeposito.efetuaDeposito(cartao, 500);

        reciboDeposito.imprimir();

        var servicoDePagamentoOnline = new ServicoDePagamentoOnline();
        Recibo reciboPagamento = servicoDePagamentoOnline.efetuaPagamento(supermercado, cartao, 100);

        reciboPagamento.imprimir();


        System.out.println();
        System.out.printf("Titular: %s%n", cartao.titular);
        System.out.printf("Saldo: R$%.2f%n", cartao.saldo);

    }
}
