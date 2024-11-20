import java.util.Scanner;

public class Caixa{
    public static void main(String[] args) {
        

        Estoque estoque = new Estoque();
        Scanner input = new Scanner(System.in);
        Venda venda = new Venda();
        System.out.println("Bem vindo ao supermercado Carrefour!");
        boolean continuar = true;
        while(continuar){
            System.out.println("Por favor informe o codigo do produto a ser inserido");
            int cod = input.nextInt();
            System.out.println("Por favor informe a descricao do produto a ser inserido");
            String descricao = input.next();
            System.out.println("Por favor informe o preço unitário do produto a ser inserido");
            double preco = input.nextDouble();
            System.out.println("Por favor informe a quantidade do produto a ser inserido");
            double quantidade = input.nextDouble();
            ItemDeProduto item = new ItemDeProduto(new Produto(cod, descricao, preco),quantidade,preco*quantidade);
            
            estoque.inserirProduto(item);
            venda.adicionarItem(item);

            System.out.println("Deseja adcionar outro produto?");
            String resposta = input.next();
            continuar = (resposta == "S" || resposta == "s") ? true: false;
        }
           
        System.out.println("Quantidade de itens vendidos: " + venda.getItensVendidos().size());
        System.out.println("Valor total da compra: R$ " + venda.calcularValorTotal());

        // Escolher a forma de pagamento
        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Dinheiro");
        System.out.println("2 - Cartão de Débito");
        System.out.println("3 - Cartão de Crédito");
        String opcaoPagamento = input.next();
        System.out.println("Compra finalizada!");
        System.out.println("Forma de pagamento: " + opcaoPagamento);
        System.out.println("Resumo da compra:");
        venda.mostrarItensVendidos();
        System.out.println("Valor total a pagar: R$ " + venda.getValorTotal());

        input.close();
    }
}