import java.util.*;

public class CadastraProdutos {
    static Scanner sc = new Scanner(System.in);
   public  static Produtos produtos [];
   public static int quantidadeProdutos = 0;
    //classes
    public static class Produtos{
       private String nome;
       private double preco;
       private int quantidade;
       private double valorTotalEstoque;

       public Produtos(){

       }
       public Produtos(String nome, double preco, int quantidade, int valorTotalEstoque ){
           this.nome = nome;
           this.preco= preco;
           this.quantidade = quantidade;
           this.valorTotalEstoque = valorTotalEstoque;
       }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome){
            this.nome = nome;
        }

        public double getPreco() {
            return preco;
        }

        public void setPreco(double preco) {
            this.preco = preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setQuantidade(int quantidade) {
            this.quantidade = quantidade;
        }

        public double getValorTotalEstoque() {
            return valorTotalEstoque;
        }

        public void setValorTotalEstoque(double valorTotalEstoque) {
            this.valorTotalEstoque = valorTotalEstoque;
        }
        public void CalculartotalEstoque(){
           this.valorTotalEstoque = this.preco * this.quantidade;
        }

        public void CadastraProdutos(){
            System.out.println("=====Cadastra produtos=====");

            System.out.printf("Digite o nome do produto: ");
            this.nome = sc.nextLine();
            sc.nextLine();

            System.out.printf("Digite o preço do produto: ");
            this.preco = sc.nextDouble();

            System.out.printf("Digite a quantidade: ");
            this.quantidade = sc.nextInt();
            System.out.println("Produtos Cadastrado Com Sucesso");

            this.CalculartotalEstoque();
        }
        public boolean removerDoEstoque(int quantidadeRemover) {
            if (quantidadeRemover <= this.quantidade && quantidadeRemover > 0) {
                this.quantidade -= quantidadeRemover;
                this.CalculartotalEstoque();
                return true;
            } else {
                System.out.println("Quantidade insuficiente em estoque!");
                return false;
            }
        }

        public void MostraProdutos(){
            System.out.println("=====Produtos no Estoque=====");
            System.out.println("Nome do Produtos:" + getNome());
            System.out.println("Preco do produto:" +getPreco());
            System.out.println("Quantidade: " + getQuantidade());
            System.out.println("Valor total em estoque:" + getValorTotalEstoque() );
            System.out.println("--------");
        }
        public static void InicializarArray(int tamanho){
           produtos = new Produtos[tamanho];
        }
        public static void cadastrarNovoProduto() {
            if (quantidadeProdutos < produtos.length) {
                produtos[quantidadeProdutos] = new Produtos();
                produtos[quantidadeProdutos].CadastraProdutos();
                quantidadeProdutos++;
                System.out.println("Produto cadastrado com sucesso!");
            } else {
                System.out.println("Array cheio! Não é possível cadastrar mais produtos.");
            }
        }
        public void MostraTodosProdutos(){
            if (quantidadeProdutos == 0){
                System.out.println("Nenhum produto cadastrado!");
                return;
            }
           for (int i = 0; i < quantidadeProdutos; i++){
               System.out.printf("Produtos " +(i +1) +":");
               produtos[i].MostraProdutos();
           }
        }
    }
}
