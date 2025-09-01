package com.java17._19_streamsAPI.desafio.comercial;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ServicoDeVenda {

    private final List<Venda> vendas = new ArrayList<>();

    public ServicoDeVenda(){
        Venda venda1 = new Venda(gerarProximoCodigo(), new Cliente("João da Silva"));
        venda1.adicionarItem(new Venda.Item("Ar condicionado", 2, new BigDecimal("3400.5")));
        venda1.adicionarItem(new Venda.Item("Ventilador", 5, new BigDecimal("289")));
        vendas.add(venda1);


        Venda venda2 = new Venda(gerarProximoCodigo(), new Cliente("Maria de Souza"));
        venda2.adicionarItem(new Venda.Item("Ar condicionado", 1, new BigDecimal("3340")));
        venda2.adicionarItem(new Venda.Item("Máquina de lavar", 10, new BigDecimal("2400")));
        venda2.adicionarItem(new Venda.Item("Panela de pressão", 3, new BigDecimal("146.2")));
        vendas.add(venda2);


        Venda venda3 = new Venda(gerarProximoCodigo(), new Cliente("Ana Aparecida"));
        venda3.adicionarItem(new Venda.Item("Frigideira", 4, new BigDecimal("98")));
        venda3.adicionarItem(new Venda.Item("Panela de pressão", 12, new BigDecimal("142")));
        vendas.add(venda3);


        Venda venda4 = new Venda(gerarProximoCodigo(), new Cliente("Sebastião Pereira"));
        venda4.adicionarItem(new Venda.Item("Purificador de água", 8, new BigDecimal("98")));
        venda4.adicionarItem(new Venda.Item("Panela de pressão", 6, new BigDecimal("142")));
        venda4.adicionarItem(new Venda.Item("Ventilador", 1, new BigDecimal("142")));
        vendas.add(venda4);


        Venda venda5 = new Venda(gerarProximoCodigo(), new Cliente("João da Silva"));
        venda5.adicionarItem(new Venda.Item("Purificador de água", 8, new BigDecimal("98")));
        venda5.adicionarItem(new Venda.Item("Ventilador", 7, new BigDecimal("142")));
        vendas.add(venda5);

        venda1.fechar();
        venda2.cancelar();
        venda3.fechar();
        venda5.fechar();

    }

    private Integer gerarProximoCodigo() {
        return vendas.stream()
            .mapToInt(Venda::getCodigo)
            .reduce(1, (x, y) -> x + 1);
    }

    public List<Venda> obterTodos(){
        return Collections.unmodifiableList(vendas);
    }
}
