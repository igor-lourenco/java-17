package com.java17._6_interfaces.contasPagar;

import com.java17._6_interfaces.contasPagar.modelo.Holerite;
import com.java17._6_interfaces.contasPagar.modelo.OrdemServico;
import com.java17._6_interfaces.contasPagar.pagamento.Beneficiario;
import com.java17._6_interfaces.contasPagar.servico.ServicoContaPagar;

public class Principal {

    public static void main(String[] args) {

        ServicoContaPagar servicoContaPagar = new ServicoContaPagar();

        Beneficiario beneficiario = new Beneficiario("Joao", "12345678900", "987654");
        Holerite holerite = new Holerite(beneficiario, 100, 168);

        Beneficiario fornecedor = new Beneficiario("Consultoria CodeX", "987654321009876", "123456");
        OrdemServico ordemServico = new OrdemServico(fornecedor, 65_500);


        servicoContaPagar.pagar(holerite);
        servicoContaPagar.pagar(ordemServico);
    }


}
