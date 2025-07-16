package com.java17._6_interfaces.contasPagar.servico;

import com.java17._6_interfaces.contasPagar.pagamento.DocumentoPagavel;
import com.java17._6_interfaces.contasPagar.pagamento.MetodoPagamento;

public class ServicoContaPagar {

    private MetodoPagamento metodoPagamento;

    public ServicoContaPagar(MetodoPagamento metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
    }

    public void pagar(DocumentoPagavel documento){

        /*
        Poderia ter outras regras de negócio aqui, por exemplo,
        registrar o pagamento no banco de dados,
        enviar uma notificação por e-mail, etc
        */

        metodoPagamento.pagar(documento);

    }
}
