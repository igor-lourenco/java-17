package com.java17._6_interfaces.contasPagar.pagamento;

public class Pix implements MetodoPagamento{



    @Override
    public void pagar(DocumentoPagavel documento) {

        Beneficiario beneficiario = documento.getBeneficiario();

        if(beneficiario.naoPossuiChavePix()){
            throw new RuntimeException("Beneficiario nao possui chave pix");
        }

        System.out.printf("%nDEBUG: Efetuando PIX para %s no valor de %.2f com chave %s%n",
                beneficiario.getNome(), documento.getValorTotal(), beneficiario.getChavePix());
    }
}
