package com.java17._8_excecoes.estoque;

import com.java17._8_excecoes.estoque.exceptions.ProdutoException;
import com.java17._8_excecoes.estoque.exceptions.ProdutoInativoException;
import com.java17._8_excecoes.estoque.exceptions.ProdutoSemEstoqueException;
import com.java17._8_excecoes.estoque.modelo.Produto;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Produto produto = new Produto("Apple Watch");
        produto.adicionarEstoque(10);

//        produto.ativar();

        comprar(produto);
    }

    private static void comprar(Produto produto) {
        Scanner scanner = new Scanner(System.in);

        do {
            try {
                System.out.print("Quantidade: ");
                int quantidade = scanner.nextInt();

                efetuarBaixaEstoque(produto, quantidade);
                System.out.println("Compra realizada!");

                break;
            } catch (IllegalArgumentException e) {
//                e.printStackTrace(System.out); // Usando a saida padrão em vez da saida de erro
                System.out.println("Erro na compra: " + e.getMessage());
            } catch (ProdutoSemEstoqueException e){
                System.out.printf("Erro na compra: %s . Estoque disponivel: %d. Estoque necessario: %d%n",
                        e.getMessage(), e.getEstoqueDisponivel(), e.getEstoqueNecessario());
            } catch (ProdutoInativoException e) {
//                e.printStackTrace(System.out); // Usando a saida padrão em vez da saida de erro
                System.out.println("Erro na compra: " + e.getMessage());
                System.out.print("Deseja ativar o produto? ");

                if(scanner.nextBoolean()){
                    produto.ativar();
                    System.out.println("Ok, produto ativado");
                }else{
                    System.out.println("Ok. Compra nao pode ser realizada");
                    break;
                }
            }catch (ProdutoException e){
                System.out.println(e.getClass().getName());
                System.out.println("Erro na compra: " + e.getMessage());
            }

        } while (true);

    }

    private static void efetuarBaixaEstoque(Produto produto, int quantidade) throws ProdutoSemEstoqueException, ProdutoInativoException {
//        try {
            produto.retirarEstoque(quantidade);
            System.out.printf("%d unidades retiradas do estoque. Estoque atual: %d%n",quantidade, produto.getQuantidadeEstoque());
//        } catch (IllegalArgumentException e) {
//            System.out.println("Erro ao efetuar baixa no estoque: " + e.getMessage());
//            throw e;
//        }
    }
}
