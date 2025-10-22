import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CadastraProdutos.Produtos produtos = new CadastraProdutos.Produtos();

        System.out.printf("Quantida maxima de produtos: ");
        int tamanho = sc.nextInt();

        CadastraProdutos.Produtos.InicializarArray(tamanho);

        int opcao;
        do {
            System.out.println("=====Mercadinho=====");
            System.out.println("1-Cadastra Produtos.");
            System.out.println("2-Mostra Produtos.");
            System.out.println("3-Remover Produtos.");
            System.out.print("Opcao:");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    produtos.CadastraProdutos();
                    break;
                case 2:
                    produtos.MostraProdutos();
                    break;
                case 3:
                    RemoverProdutos.RemoverEstoque.removerDoEstoque();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida!");
                    break;
            }
        }while (opcao != 0);
    }
}