package com.java17._11_enumeracoes.antes;

public class Pedido {

    private String nomeCliente;
    private double valorTotal;
    private StatusPedido status = StatusPedido.RASCUNHO;
    private OrigemPedido origem = OrigemPedido.BALCAO;


    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public OrigemPedido getOrigem() {
        return origem;
    }

    public void setOrigem(OrigemPedido origem) {
        this.origem = origem;
    }

    public int getTempoEntregaEmHoras() {
        try {
            return this.status.getTempoEntregaEmHoras();
        }catch (NullPointerException e){
            System.out.println("DEBUG: Pedido nao tem tempo de entrega");
            return 0;
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public void cancelar() {
        if (getStatus().podeMudarParaCancelado(getValorTotal())) {
            this.status = StatusPedido.CANCELADO;
        }else{
            throw new IllegalStateException("Pedido nao pode ser cancelado");
        }
    }
}
