package com.java17._23_arquivosJAReApacheMaven;

import com.works.crm.api.CadastroCliente;
import com.works.crm.api.Cliente;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public class _1_ImportandoArquivosJARnoProjeto {

    public static void main(String[] args) {

        CadastroCliente cadastroCliente = new CadastroCliente();

        cadastroCliente.adicionar(new Cliente("João da Silva", 30));
        cadastroCliente.adicionar(new Cliente("Maria Conceição", 90));
        cadastroCliente.adicionar(new Cliente("Sebastião das Couves", 50));
        cadastroCliente.adicionar(new Cliente("Joaquina de Jesus", 45));
        cadastroCliente.adicionar(new Cliente("Josefina Amaral", 25));

        List<Cliente> clientes = cadastroCliente.consultar(c -> c.getIdade() > 40);

        for (Cliente cliente : clientes) {
            System.out.printf("%s - %d%n", StringUtils.abbreviate(cliente.getNome(), 15), cliente.getIdade());
        }

    }
}
