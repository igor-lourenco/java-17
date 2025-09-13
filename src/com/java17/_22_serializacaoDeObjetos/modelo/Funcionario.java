package com.java17._22_serializacaoDeObjetos.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;

public class Funcionario implements Serializable {

    private String nome;
    private LocalDate dataNascimento;
    private BigDecimal salario;

    public Funcionario(String nome, LocalDate dataNascimento, BigDecimal salario) {
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Funcionario{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", dataNascimento=").append(dataNascimento);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }
}
