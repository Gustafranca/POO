public class ItemDeProduto {
    private Produto produto;
    private double quantidade;
    private double preco_total;


    public ItemDeProduto(Produto produto, double quantidade, double preco_total){
        this.produto = produto;
        this.quantidade = quantidade;
        this.preco_total = preco_total;
    }

    public void setPreco_total(double preco_total) {
        this.preco_total = preco_total;
    }public double getPreco_total() {
        return preco_total;
    }public void setProduto(Produto produto) {
        this.produto = produto;
    }public Produto getProduto() {
        return produto;
    }public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }public double getQuantidade() {
        return quantidade;
    }
}
