package com.java17._6_interfaces.contasPagar;

import com.java17._6_interfaces.contasPagar.pagamento.DocumentoPagavel;
import com.java17._6_interfaces.contasPagar.servico.ServicoContaPagar;

public class Principal {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();


        DocumentoPagavel documentoPagavel = null;

        servicoContaPagar.pagar(documentoPagavel);
    }


}
