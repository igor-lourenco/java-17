package com.java17._4_heranca.banco;

public class ContaEspecial extends ContaInvestimento{

    private double tarifaMensal;
    private double limiteChequeEspecial;


    public ContaEspecial(Titular titular, int agencia, int numero, double tarifaMensal) {
        super(titular, agencia, numero);
        this.tarifaMensal = tarifaMensal;
    }

    public double getTarifaMensal() {
        return tarifaMensal;
    }

    public void setTarifaMensal(double tarifaMensal) {
        this.tarifaMensal = tarifaMensal;
    }

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    public void debitarTarifaMensal(){
        sacar(getTarifaMensal());
    }

    public double getSaldoDisponivel(){
        return getSaldo() + this.limiteChequeEspecial;
    }

    @Override
    protected void validarSaldoParSaque(double valorSaque) {
        if(getSaldoDisponivel() < valorSaque) throw new RuntimeException("Saldo insuficiente para saque");
    }

    @Override
    public void imprimirDemonstrativo() {
        super.imprimirDemonstrativo();

        System.out.printf("Saldo disponivel: %.2f", getSaldoDisponivel());
        System.out.println();
    }
}
