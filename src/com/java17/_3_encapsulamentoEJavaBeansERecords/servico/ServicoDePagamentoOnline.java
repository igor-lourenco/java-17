package com.java17._3_encapsulamentoEJavaBeansERecords.servico;

import com.java17._3_encapsulamentoEJavaBeansERecords.Cartao;
import com.java17._3_encapsulamentoEJavaBeansERecords.Estabelecimento;
import com.java17._3_encapsulamentoEJavaBeansERecords.Recibo;

public class ServicoDePagamentoOnline {


    public Recibo efetuaPagamento(Estabelecimento estabelecimento, Cartao cartao, double valor){
        //TODO: por exemplo, realiza outras lógicas para efetuar o pagamento ao estabelecimento


        cartao.debitar(valor);

        return new Recibo(cartao.getTitular(), "Pagamento", valor);
    }
}
