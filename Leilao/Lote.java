import java.util.ArrayList;
public class Lote {
    private ArrayList<Produto> produtos;

    public Lote(){
        this.produtos = new ArrayList<>();
    }

    public void inserirProduto(Produto produto){
        this.produtos.add(produto);
    }
    public void setProdutos(ArrayList<Produto> produtos) {
        this.produtos = produtos;
    }public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
