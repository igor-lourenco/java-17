package com.java17._6_interfaces.contasPagar.modelo;

import com.java17._6_interfaces.contasPagar.pagamento.Beneficiario;
import com.java17._6_interfaces.contasPagar.pagamento.DocumentoPagavel;

public class OrdemServico implements DocumentoPagavel {

    private Beneficiario fornecedor;
    private double valorTotal;

    public OrdemServico(Beneficiario fornecedor, double valorTotal) {
        this.fornecedor = fornecedor;
        this.valorTotal = valorTotal;
    }

    @Override
    public Beneficiario getBeneficiario() {
        return getFornecedor();
    }

    @Override
    public double getValorTotal() {
        return valorTotal;
    }


    public Beneficiario getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(Beneficiario fornecedor) {
        this.fornecedor = fornecedor;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
