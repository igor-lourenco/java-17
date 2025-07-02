package com.java17._3_encapsulamentoEJavaBeansERecords.servico;

import com.java17._3_encapsulamentoEJavaBeansERecords.Cartao;
import com.java17._3_encapsulamentoEJavaBeansERecords.Recibo;

public class ServicoDeDepositoPix {


    public Recibo efetuaDeposito(Cartao cartao, double valorDeposito){
        // TODO: por exemplo, faz cobrança do valor do Pix


        cartao.depositar(valorDeposito);

        return new Recibo(cartao.getTitular(), "Deposito", valorDeposito);
    }
}
