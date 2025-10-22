import java.util.*;

public class RemoverProdutos {

    static Scanner sc = new Scanner(System.in);

    //classe principal
    public static class RemoverEstoque{


        //Encontra o item pelo nome.
        public static int  EncontraPorNome(String nome){
            for (int i = 0; i < CadastraProdutos.quantidadeProdutos; i++){
                if (CadastraProdutos.produtos[i].getNome().equalsIgnoreCase(nome)){
                    return i;
                }
            }
            return -1; //Retorna: Nao encontrado;
        }

        //Remover um produto especifico do estoque
        public static void removerDoEstoque(){
            if(CadastraProdutos.quantidadeProdutos == 0){
                System.out.println("Nenhum produto Cadastrado!");
                return;
            }
            System.out.print("Digite o nome do produto para resolver: ");
            String nomeProduto = sc.nextLine();

            int i = EncontraPorNome(nomeProduto);

            if(i == -1 ){
                System.out.println("Produtos nao encontrado!");
               return;
            }
            System.out.println("Digite a quantidade que deseja remover: ");
            int quantidadeRemover= sc.nextInt();

            boolean sucesso = CadastraProdutos.produtos[i].removerDoEstoque(quantidadeRemover);
            if (sucesso){
                System.out.println("Quantidade Removida com sucesso!");
                System.out.println("Estoque Atualizado!");
                CadastraProdutos.produtos[i].MostraProdutos();
            }

        }
    }
}
