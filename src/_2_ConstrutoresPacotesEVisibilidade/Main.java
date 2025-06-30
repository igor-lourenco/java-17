package _2_ConstrutoresPacotesEVisibilidade;

public class Main {

    public static void main(String[] args) {

        Produto p1 = new Produto("Teste");

//        p1.nome = "Teste";

        System.out.println("\nProduto: " + p1.nome + ", Quantidade no estoque: " + p1.quantidadeEstoque);



    }
}
