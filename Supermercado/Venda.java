import java.util.ArrayList;
import java.util.List;

public class Venda {
    private List<ItemDeProduto> itensVendidos;
    private double valorTotal;

    public Venda() {
        this.itensVendidos = new ArrayList<>();
        this.valorTotal = 0.0;
    }

    public void adicionarItem(ItemDeProduto item) {
        itensVendidos.add(item);
        valorTotal += item.getPreco_total();
    }

    public double calcularValorTotal() {
        valorTotal = 0.0;
        for (ItemDeProduto item : itensVendidos) {
            valorTotal += item.getPreco_total();
        }
        return valorTotal;
    }

    public List<ItemDeProduto> getItensVendidos() {
        return itensVendidos;
    }

    public void mostrarItensVendidos() {
        for (ItemDeProduto item : itensVendidos) {
            Produto produto = item.getProduto();
            System.out.println("Código: " + produto.getCodigo() +
                               ", Descrição: " + produto.getDescricao() +
                               ", Quantidade: " + item.getQuantidade() +
                               ", Preço Total: " + item.getPreco_total());
        }
    }

    public double getValorTotal() {
        return valorTotal;
    }
}
