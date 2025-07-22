package com.java17._7_boasPraticasDeHerancaEInterfaces.loja;

import com.java17._7_boasPraticasDeHerancaEInterfaces.loja.pagamento.MetodoPagamento;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

    private List<ItemCarrinho> itens = new ArrayList<>();

    public void adicionarItem(ItemCarrinho itemCarrinho){
        itens.add(itemCarrinho);
    }

    public double calcularValorTotal(){
        double valorTotal = 0;

        for (ItemCarrinho item : itens){
            valorTotal = valorTotal + item.getValor();
        }

        return valorTotal;
    }

//  referencie objetos por suas interfaces
    public void finalizar(MetodoPagamento metodoPagamento){
        double valorTotal = calcularValorTotal();

        metodoPagamento.pagar(valorTotal);

        System.out.printf("Pedido finalizado: R$%.2f", valorTotal);
    }
}
