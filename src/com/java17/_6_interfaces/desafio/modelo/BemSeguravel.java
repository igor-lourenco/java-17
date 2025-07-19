package com.java17._6_interfaces.desafio.modelo;

import java.io.Serializable;

public interface BemSeguravel extends Serializable {

    double calcularValorPremio();

    String descrever();
}
