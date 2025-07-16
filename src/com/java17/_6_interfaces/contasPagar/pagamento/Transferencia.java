package com.java17._6_interfaces.contasPagar.pagamento;

public class Transferencia implements MetodoPagamento{


    @Override
    public void pagar(DocumentoPagavel documento) {
        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiContaBancaria()){
            throw new RuntimeException("Beneficiario nao possui conta bancaria");
        }

        System.out.printf("%nDEBUG: Efetuando transferencia para %s no valor de %.2f na conta %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getContaBancaria());
    }
}
