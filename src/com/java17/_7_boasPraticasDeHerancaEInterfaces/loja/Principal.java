package com.java17._7_boasPraticasDeHerancaEInterfaces.loja;

import com.java17._7_boasPraticasDeHerancaEInterfaces.loja.pagamento.MetodoPagamento;
import com.java17._7_boasPraticasDeHerancaEInterfaces.loja.pagamento.Transferencia;

public class Principal {

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();
        carrinho.adicionarItem(new ItemCarrinho("AirPods", 2_000));
        carrinho.adicionarItem(new ItemCarrinho("Apple Watch", 5_100));
        carrinho.adicionarItem(new ItemCarrinho("Magic Mouse", 600));

//      referencie objetos por suas interfaces
        MetodoPagamento metodoPagamento = new Transferencia("9991231231231231", "999");

        carrinho.finalizar(metodoPagamento);

    }
}
