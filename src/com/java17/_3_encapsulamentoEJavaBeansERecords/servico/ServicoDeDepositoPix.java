package com.java17._3_encapsulamentoEJavaBeansERecords.servico;

import com.java17._3_encapsulamentoEJavaBeansERecords.Cartao;
import com.java17._3_encapsulamentoEJavaBeansERecords.Recibo;

public class ServicoDeDepositoPix {


    public Recibo efetuaDeposito(Cartao cartao, double valorDeposito){
        // TODO: por exemplo, faz cobrança do valor do Pix


        if(valorDeposito < Cartao.VALOR_MINIMO_DEPOSITO){
            throw new IllegalArgumentException(
                String.format("Valor de deposito nao pode ser menor que %.2f", Cartao.VALOR_MINIMO_DEPOSITO));
        }


        cartao.saldo = cartao.saldo + valorDeposito - Cartao.TARIFA_DEPOSITO;

        return new Recibo(cartao.titular, "Deposito", valorDeposito);

    }
}
