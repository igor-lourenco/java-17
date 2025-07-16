package com.java17._6_interfaces.financeira;

import com.java17._6_interfaces.financeira.modelo.Fazenda;
import com.java17._6_interfaces.financeira.modelo.Industria;
import com.java17._6_interfaces.financeira.servico.ServicoFinanciamento;

public class Principal {

    public static void main(String[] args) {

        ServicoFinanciamento servicoFinanciamento = new ServicoFinanciamento();

        Fazenda fazenda = new Fazenda("Fazenda Dona Benedita", 5_000_000, 4.0);
        Industria industria = new Industria("Alimentos d Vovó", 900_000, true);

//        servicoFinanciamento.solicitarFinanciamento(fazenda, 3_000_001);
        servicoFinanciamento.solicitarFinanciamento(industria, 540_000);
    }
}
