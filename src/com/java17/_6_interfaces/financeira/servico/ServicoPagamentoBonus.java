package com.java17._6_interfaces.financeira.servico;

import com.java17._6_interfaces.financeira.modelo.Bonificacao;

public class ServicoPagamentoBonus {

    public void pagar(Bonificacao bonificacao, double percentualMetaAlcancada){

        double valorBonus = bonificacao.calcularBonus(percentualMetaAlcancada);


        // Aqui teria a implementação da lógica de pagamento


        System.out.printf("%nDEBUG: Bonus pago no valor de %.2f", valorBonus);
    }
}
