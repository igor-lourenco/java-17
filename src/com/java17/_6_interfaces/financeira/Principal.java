package com.java17._6_interfaces.financeira;

import com.java17._6_interfaces.financeira.modelo.*;
import com.java17._6_interfaces.financeira.servico.ServicoFinanciamento;

public class Principal {

    public static void main(String[] args) {

        ServicoFinanciamento servicoFinanciamento = new ServicoFinanciamento();

        Fazenda fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 5.0);
        Industria industria = new Industria("Alimentos d Vovó", 900_000, true);

        ParceiroFinanceiro parceiroFinanceiro = new ParceiroFinanceiro("Capital ABC", 2_000_000);

        Funcionario funcionario = new Funcionario("Joao da Silva", 18_000);

        System.out.println();

        System.out.println("Financiamento e de grande valor: " + ClienteFinanciavel.isFinanciamentoGrandeValor(500_000));

        servicoFinanciamento.solicitarFinanciamento(fazenda, 3_000_000);
        servicoFinanciamento.solicitarFinanciamento(industria, 540_000);
        servicoFinanciamento.solicitarFinanciamento(funcionario, 90_000);
    }
}
