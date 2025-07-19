package com.java17._6_interfaces.desafio;

import com.java17._6_interfaces.desafio.modelo.Caminhao;
import com.java17._6_interfaces.desafio.modelo.CarroParticular;
import com.java17._6_interfaces.desafio.modelo.ImovelResidencial;
import com.java17._6_interfaces.desafio.servico.ServicoPropostaSeguro;

public class Principal {

    public static void main(String[] args) {

        ServicoPropostaSeguro servicoPropostaSeguro = new ServicoPropostaSeguro();

        ImovelResidencial imovel = new ImovelResidencial(2_300_000, 320);

        CarroParticular carroParticular = new CarroParticular("HR-V", 150_000, 2022);
        Caminhao caminhao = new Caminhao("Actros", 780_000, 2021, 4);

        servicoPropostaSeguro.emitir(imovel);
        servicoPropostaSeguro.emitir(carroParticular);
        servicoPropostaSeguro.emitir(caminhao);
    }
}
